package te.app.aljoud.pages.cart.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.aljoud.R;
import te.app.aljoud.databinding.ItemCartBinding;
import te.app.aljoud.pages.cart.models.cart_items.CartItem;
import te.app.aljoud.pages.cart.viewModels.ItemCartViewModel;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.session.UserHelper;


public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    List<CartItem> cartItemList;
    public MutableLiveData<Integer> cartLiveData = new MutableLiveData<>();
    private int lastPosition = -1;
    Context context;
    public int hasInstallment = Constants.installment;

    public CartAdapter() {
        this.cartItemList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        CartItem cartItem = cartItemList.get(position);
        ItemCartViewModel itemMenuViewModel = new ItemCartViewModel(cartItem);
        itemMenuViewModel.getLiveData().observeForever(o -> {
            lastPosition = position;
            cartLiveData.setValue(cartItem.getId());
        });
        if (cartItem.getCourse().getIsInstallment() == Constants.cash)
            hasInstallment = Constants.cash;
        holder.setModel(itemMenuViewModel);
    }


    public void update(List<CartItem> dataList) {
        this.cartItemList.clear();
        cartItemList.addAll(dataList);
        notifyDataSetChanged();
    }


    @Override
    public void onViewAttachedToWindow(@NotNull ViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.bind();
    }

    @Override
    public void onViewDetachedFromWindow(@NotNull ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.unbind();
    }

    @Override
    public int getItemCount() {
        return cartItemList.size();
    }

    public void removeItem() {
        cartItemList.remove(lastPosition);
        notifyDataSetChanged();
        // reduce cart by one
        int cartCount = Integer.parseInt(UserHelper.getInstance(context).getCartCount()) - 1;
        UserHelper.getInstance(context).addCartCount(String.valueOf(cartCount));
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemCartBinding itemMenuBinding;

        ViewHolder(View itemView) {
            super(itemView);
            bind();
        }


        void bind() {
            if (itemMenuBinding == null) {
                itemMenuBinding = DataBindingUtil.bind(itemView);
            }
        }

        void unbind() {
            if (itemMenuBinding != null) {
                itemMenuBinding.unbind();
            }
        }

        void setModel(ItemCartViewModel itemCartViewModel) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemCartViewModel);
            }
        }

    }
}
