package te.app.aljoud.pages.fawaterkPayment.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.aljoud.R;
import te.app.aljoud.databinding.ItemPaymentMethodBinding;
import te.app.aljoud.pages.fawaterkPayment.models.PaymentMethod;
import te.app.aljoud.pages.fawaterkPayment.viewModels.ItemPaymentMethodsViewModel;

public class PaymentMethodsAdapter extends RecyclerView.Adapter<PaymentMethodsAdapter.ViewHolder> {
    public List<PaymentMethod> paymentMethodList;
    private Context context;
    public int lastSelected = -1;

    public PaymentMethodsAdapter() {
        this.paymentMethodList = new ArrayList<>();
    }

    public List<PaymentMethod> getPaymentMethodList() {
        return paymentMethodList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_payment_method,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        PaymentMethod paymentMethod = paymentMethodList.get(position);
        ItemPaymentMethodsViewModel itemMenuViewModel = new ItemPaymentMethodsViewModel(paymentMethod);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) context), o -> {
            lastSelected = position;
            notifyDataSetChanged();
        });
        if (lastSelected == position)
            holder.binding.checked.setImageResource(R.drawable.ic_check);
        else {
            holder.binding.checked.setImageResource(R.drawable.ic_check_white);
        }
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(@NotNull List<PaymentMethod> dataList) {
        this.paymentMethodList.clear();
        paymentMethodList.addAll(dataList);
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
        return paymentMethodList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemPaymentMethodBinding binding;

        ViewHolder(View itemView) {
            super(itemView);
            bind();
        }


        void bind() {
            if (binding == null) {
                binding = DataBindingUtil.bind(itemView);
            }
        }

        void unbind() {
            if (binding != null) {
                binding.unbind();
            }
        }

        void setViewModel(ItemPaymentMethodsViewModel itemViewModels) {
            if (binding != null) {
                binding.setItemViewModel(itemViewModels);
            }
        }
    }
}
