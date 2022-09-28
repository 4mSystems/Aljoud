package te.app.aljoud.pages.chat.adapter;

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
import te.app.aljoud.activity.ExoPlayerActivity;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.ItemFilesBinding;
import te.app.aljoud.databinding.ItemLessonVideoBinding;
import te.app.aljoud.pages.courseDetails.models.videos.VideoData;
import te.app.aljoud.pages.courseDetails.viewModels.ItemLessonVideoViewModel;
import te.app.aljoud.utils.helper.MovementHelper;


public class ChatMediaAdapter extends RecyclerView.Adapter<ChatMediaAdapter.ViewHolder> {
    List<VideoData> mediaList;
    Context context;

    public ChatMediaAdapter() {
        this.mediaList = new ArrayList<>();
    }

    public List<VideoData> getMediaList() {
        return mediaList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_files,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        VideoData categoriesData = mediaList.get(position);
        ItemLessonVideoViewModel itemMenuViewModel = new ItemLessonVideoViewModel(categoriesData);
        itemMenuViewModel.getLiveData().observe((LifecycleOwner) MovementHelper.unwrap(context), o -> {

        });
        holder.setViewModel(itemMenuViewModel);
    }

    public void update(List<VideoData> dataList) {
        this.mediaList.clear();
        mediaList.addAll(dataList);
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
        return mediaList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemFilesBinding itemMenuBinding;

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

        void setViewModel(ItemLessonVideoViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
