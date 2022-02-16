package te.app.aljoud.pages.university.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.aljoud.R;
import te.app.aljoud.databinding.ItemCourseOfferBinding;
import te.app.aljoud.pages.university.models.course.Course;
import te.app.aljoud.pages.university.viewModel.ItemSectionCategoryViewModel;


public class CourseOffersAdapter extends RecyclerView.Adapter<CourseOffersAdapter.ViewHolder> {
    List<Course> courseList;
    Context context;

    public CourseOffersAdapter() {
        this.courseList = new ArrayList<>();
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_course_offer,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Course categoriesData = courseList.get(position);
        ItemSectionCategoryViewModel itemMenuViewModel = new ItemSectionCategoryViewModel(categoriesData);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<Course> dataList) {
        this.courseList.clear();
        courseList.addAll(dataList);
        notifyDataSetChanged();
    }
    public void loadMore(@NotNull List<Course> dataList) {
        int start = courseList.size();
        courseList.addAll(dataList);
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
        return courseList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemCourseOfferBinding itemMenuBinding;

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

        void setViewModel(ItemSectionCategoryViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
