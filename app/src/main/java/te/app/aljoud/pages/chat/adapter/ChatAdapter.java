package te.app.aljoud.pages.chat.adapter;

import android.annotation.SuppressLint;
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
import te.app.aljoud.databinding.ItemChatBinding;
import te.app.aljoud.pages.chat.viewmodel.ItemChatViewModel;
import te.app.aljoud.pages.conversations.models.ConversationsData;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {
    List<ConversationsData> chatList;
    Context context;

    public ChatAdapter() {
        this.chatList = new ArrayList<>();
    }

    public List<ConversationsData> getChatList() {
        return chatList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat,
                parent, false);
        this.context = parent.getContext();
        return new ViewHolder(itemView);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        ConversationsData dataModel = chatList.get(position);
        ItemChatViewModel itemMenuViewModel = new ItemChatViewModel(dataModel);
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<ConversationsData> dataList) {
        this.chatList.clear();
        chatList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<ConversationsData> dataList) {
        int start = chatList.size();
        chatList.addAll(dataList);
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
        return chatList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ItemChatBinding itemMenuBinding;

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

        void setViewModel(ItemChatViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemChatViewModel(itemViewModels);
            }
        }
    }
}
