package te.app.aljoud.pages.courseDetails.adapters;

import android.content.Context;
import android.content.Intent;
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
import te.app.aljoud.activity.RemotePDFActivity;
import te.app.aljoud.databinding.ItemLessonArticleBinding;
import te.app.aljoud.pages.courseDetails.models.videos.VideoData;
import te.app.aljoud.pages.courseDetails.viewModels.ItemLessonArticleViewModel;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.MovementHelper;


public class LessonArticlesAdapter extends RecyclerView.Adapter<LessonArticlesAdapter.ViewHolder> {
    List<VideoData> lessonsItemList;
    Context context;

    public LessonArticlesAdapter() {
        this.lessonsItemList = new ArrayList<>();
    }

    public List<VideoData> getLessonsItemList() {
        return lessonsItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lesson_article,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        VideoData categoriesData = lessonsItemList.get(position);
        ItemLessonArticleViewModel itemMenuViewModel = new ItemLessonArticleViewModel(categoriesData);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {
            Intent intent = new Intent(context, RemotePDFActivity.class);
            intent.putExtra(Constants.BUNDLE, categoriesData.getFile());
            context.startActivity(intent);
        });
        holder.itemMenuBinding.tvCount.setText(String.valueOf(position + 1));
        holder.setViewModel(itemMenuViewModel);
    }

    public void update(List<VideoData> dataList) {
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
        public ItemLessonArticleBinding itemMenuBinding;

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

        void setViewModel(ItemLessonArticleViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
