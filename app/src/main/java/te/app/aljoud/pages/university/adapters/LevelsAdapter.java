package te.app.aljoud.pages.university.adapters;

import android.content.Context;
import android.content.res.ColorStateList;
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

import te.app.aljoud.R;
import te.app.aljoud.databinding.ItemLevelsBinding;
import te.app.aljoud.pages.university.models.levels.LevelsData;
import te.app.aljoud.pages.university.viewModel.ItemLevelsViewModel;
import te.app.aljoud.utils.helper.MovementHelper;
import te.app.aljoud.utils.resources.ResourceManager;


public class LevelsAdapter extends RecyclerView.Adapter<LevelsAdapter.ViewHolder> {
    List<LevelsData> levelsDataList;
    Context context;
    public MutableLiveData<Integer> liveData = new MutableLiveData<>();

    public LevelsAdapter() {
        this.levelsDataList = new ArrayList<>();
    }

    public int lastSelected = 0;

    public List<LevelsData> getLevelsDataList() {
        return levelsDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_levels,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        LevelsData categoriesData = levelsDataList.get(position);
        ItemLevelsViewModel itemMenuViewModel = new ItemLevelsViewModel(categoriesData);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            lastSelected = categoriesData.getId();
            liveData.setValue(categoriesData.getId());
            notifyDataSetChanged();
        });
        if (lastSelected == categoriesData.getId())
            holder.itemMenuBinding.btLevel.setBackgroundTintList(ColorStateList.valueOf(ResourceManager.getColor(R.color.colorPrimary)));
        else
            holder.itemMenuBinding.btLevel.setBackgroundTintList(ColorStateList.valueOf(ResourceManager.getColor(R.color.white)));
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<LevelsData> dataList) {
        dataList.add(0, new LevelsData(ResourceManager.getString(R.string.all), 0));
        this.levelsDataList.clear();
        levelsDataList.addAll(dataList);
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
        return levelsDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemLevelsBinding itemMenuBinding;

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

        void setViewModel(ItemLevelsViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
