package te.app.aljoud.pages.courseDetails.adapters;

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
import te.app.aljoud.databinding.ItemCourseLessonBinding;
import te.app.aljoud.pages.courseDetails.FragmentCourseDetails;
import te.app.aljoud.pages.courseDetails.FragmentLessonDetails;
import te.app.aljoud.pages.courseDetails.models.lessons.LessonsItem;
import te.app.aljoud.pages.courseDetails.viewModels.ItemLessonViewModel;
import te.app.aljoud.utils.helper.MovementHelper;


public class LessonsAdapter extends RecyclerView.Adapter<LessonsAdapter.ViewHolder> {
    List<LessonsItem> lessonsItemList;
    Context context;

    public LessonsAdapter() {
        this.lessonsItemList = new ArrayList<>();
    }

    public List<LessonsItem> getLessonsItemList() {
        return lessonsItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_course_lesson,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        LessonsItem categoriesData = lessonsItemList.get(position);
        ItemLessonViewModel itemMenuViewModel = new ItemLessonViewModel(categoriesData, position);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            if (position == 0 || !categoriesData.isIsLock())
                MovementHelper.startActivityWithBundle(context, new PassingObject(categoriesData.getId()), categoriesData.getName(), FragmentLessonDetails.class.getName(), null);
        });
        holder.itemMenuBinding.tvCount.setText(String.valueOf(position + 1));
        holder.setViewModel(itemMenuViewModel);
    }

    public void update(List<LessonsItem> dataList) {
        this.lessonsItemList.clear();
        lessonsItemList.addAll(dataList);
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
        return lessonsItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemCourseLessonBinding itemMenuBinding;

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

        void setViewModel(ItemLessonViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
