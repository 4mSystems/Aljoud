package te.app.aljoud.pages.offers.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.databinding.ItemHomeBinding;
import te.app.aljoud.databinding.ItemOfferBinding;
import te.app.aljoud.pages.fawaterkPayment.FawterkMethodFragment;
import te.app.aljoud.pages.home.models.home.University;
import te.app.aljoud.pages.home.viewModels.ItemUniversityViewModel;
import te.app.aljoud.pages.offers.models.OfferItem;
import te.app.aljoud.pages.offers.viewModel.ItemOfferViewModel;
import te.app.aljoud.pages.university.FragmentUniversityDetails;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.MovementHelper;


public class OffersAdapter extends RecyclerView.Adapter<OffersAdapter.ViewHolder> {
    List<OfferItem> offerItemList;
    Context context;
    public MutableLiveData<Integer> liveData = new MutableLiveData<>();

    public OffersAdapter() {
        this.offerItemList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_offer,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        OfferItem categoriesData = offerItemList.get(position);
        ItemOfferViewModel itemMenuViewModel = new ItemOfferViewModel(categoriesData);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
//            liveData.setValue(categoriesData.getId());
            MovementHelper.startActivityWithBundle(context, new PassingObject(categoriesData.getId(), Constants.OFFERS), categoriesData.getName(), FawterkMethodFragment.class.getName(), null);
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<OfferItem> dataList) {
        this.offerItemList.clear();
        offerItemList.addAll(dataList);
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
        return offerItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemOfferBinding itemMenuBinding;

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

        void setViewModel(ItemOfferViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
