package te.app.aljoud.pages.home.adapters;

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
import te.app.aljoud.pages.home.models.home.University;
import te.app.aljoud.pages.home.viewModels.ItemUniversityViewModel;
import te.app.aljoud.pages.university.FragmentUniversityDetails;
import te.app.aljoud.utils.helper.MovementHelper;


public class UniversityAdapter extends RecyclerView.Adapter<UniversityAdapter.ViewHolder> {
    List<University> universities;
    Context context;

    public UniversityAdapter() {
        this.universities = new ArrayList<>();
    }

    public List<University> getUniversities() {
        return universities;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        University categoriesData = universities.get(position);
        ItemUniversityViewModel itemMenuViewModel = new ItemUniversityViewModel(categoriesData);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            MovementHelper.startActivityWithBundle(context, new PassingObject(categoriesData.getId()), categoriesData.getName(), FragmentUniversityDetails.class.getName(), null);
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<University> dataList) {
        this.universities.clear();
        universities.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<University> dataList) {
        int start = universities.size();
        universities.addAll(dataList);
        notifyItemRangeInserted(start, dataList.size());
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
        return universities.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemHomeBinding itemMenuBinding;

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

        void setViewModel(ItemUniversityViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
