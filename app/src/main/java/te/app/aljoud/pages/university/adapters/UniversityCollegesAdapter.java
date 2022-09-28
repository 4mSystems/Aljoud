package te.app.aljoud.pages.university.adapters;

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

import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.databinding.ItemHomeBinding;
import te.app.aljoud.databinding.ItemUniversitySectionBinding;
import te.app.aljoud.pages.home.models.home.University;
import te.app.aljoud.pages.home.viewModels.ItemUniversityViewModel;
import te.app.aljoud.pages.university.FragmentCategorySections;
import te.app.aljoud.pages.university.models.SpecialistsItem;
import te.app.aljoud.pages.university.viewModel.ItemCollegesViewModel;
import te.app.aljoud.utils.helper.MovementHelper;


public class UniversityCollegesAdapter extends RecyclerView.Adapter<UniversityCollegesAdapter.ViewHolder> {
    List<SpecialistsItem> categoriesDataList;
    Context context;

    public UniversityCollegesAdapter() {
        this.categoriesDataList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_university_section,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        SpecialistsItem categoriesData = categoriesDataList.get(position);
        ItemCollegesViewModel itemMenuViewModel = new ItemCollegesViewModel(categoriesData);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            MovementHelper.startActivityWithBundle(context, new PassingObject(categoriesData.getId()), categoriesData.getName(), FragmentCategorySections.class.getName(), null);
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<SpecialistsItem> dataList) {
        this.categoriesDataList.clear();
        categoriesDataList.addAll(dataList);
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
        return categoriesDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemUniversitySectionBinding itemMenuBinding;

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

        void setViewModel(ItemCollegesViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
