package te.app.aljoud.pages.courseDetails.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import te.app.aljoud.R;
import te.app.aljoud.databinding.ItemPickFileBinding;
import te.app.aljoud.model.File;

public class pickFilesAdapter extends RecyclerView.Adapter<pickFilesAdapter.ViewHolder> {
    List<File> files;
    Context context;
    public MutableLiveData<Integer> liveData = new MutableLiveData<>();
    public int position;

    public pickFilesAdapter() {
        this.files = new ArrayList<>();
    }

    public List<File> getFiles() {
        return files;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pick_file,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        File categoriesData = files.get(position);
        Picasso.get().load(new java.io.File(categoriesData.getFile())).placeholder(R.drawable.ic_pdf).into(holder.itemMenuBinding.catImage);
        holder.itemMenuBinding.icRemove.setOnClickListener(view -> {
            liveData.setValue(position);
            this.position = position;
            files.remove(position);
            notifyDataSetChanged();
        });
    }

    public void update(List<File> dataList) {
        this.files.clear();
        files.addAll(dataList);
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
        return files.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemPickFileBinding itemMenuBinding;

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

    }
}
