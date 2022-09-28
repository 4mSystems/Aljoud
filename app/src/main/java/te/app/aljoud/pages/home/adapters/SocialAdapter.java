package te.app.aljoud.pages.home.adapters;

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
import te.app.aljoud.databinding.ItemSocialBinding;
import te.app.aljoud.pages.home.models.social.SocialModel;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.AppHelper;


public class SocialAdapter extends RecyclerView.Adapter<SocialAdapter.ViewHolder> {
    List<SocialModel> socialModelList;
    Context context;

    public SocialAdapter() {
        this.socialModelList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_social,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        SocialModel socialModel = socialModelList.get(position);
        holder.itemMenuBinding.icSocial.setOnClickListener(view -> {
            if (socialModel.getUrl().equals(Constants.EMAIL_APP))
                AppHelper.openEmail(context, socialModel.getUrl());
            else
                AppHelper.openBrowser(context, socialModel.getUrl());
        });
        holder.setModel(socialModel);
    }


    public void update(List<SocialModel> dataList) {
        this.socialModelList.clear();
        socialModelList.addAll(dataList);
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
        return socialModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemSocialBinding itemMenuBinding;

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

        void setModel(SocialModel socialModel) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setModel(socialModel);
            }
        }

    }
}
