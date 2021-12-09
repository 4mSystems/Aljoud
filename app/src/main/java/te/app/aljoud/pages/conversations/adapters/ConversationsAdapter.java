package te.app.aljoud.pages.conversations.adapters;

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
import te.app.aljoud.databinding.ItemConversationBinding;
import te.app.aljoud.pages.chat.view.ChatFragment;
import te.app.aljoud.pages.conversations.models.ConversationsData;
import te.app.aljoud.pages.conversations.viewModels.ItemConversationsViewModel;
import te.app.aljoud.utils.helper.MovementHelper;
import te.app.aljoud.utils.resources.ResourceManager;


public class ConversationsAdapter extends RecyclerView.Adapter<ConversationsAdapter.MenuView> {
    List<ConversationsData> conversationsDataList;
    private Context context;

    public ConversationsAdapter() {
        this.conversationsDataList = new ArrayList<>();
    }

    public List<ConversationsData> getConversationsDataList() {
        return conversationsDataList;
    }

    @NonNull
    @Override
    public MenuView onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_conversation,
                parent, false);
        this.context = parent.getContext();
        return new MenuView(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull final MenuView holder, final int position) {
        ConversationsData menuModel = conversationsDataList.get(position);
        ItemConversationsViewModel itemMenuViewModel = new ItemConversationsViewModel(menuModel);
        itemMenuViewModel.getLiveData().observe(((LifecycleOwner) MovementHelper.unwrap(context)), o -> {
            if (menuModel.getIs_lock() == 0)
                MovementHelper.startActivityWithBundle(context, new PassingObject(menuModel.getId()), ResourceManager.getString(R.string.inbox), ChatFragment.class.getName(), null);
        });
        holder.setViewModel(itemMenuViewModel);
    }


    public void update(List<ConversationsData> dataList) {
        this.conversationsDataList.clear();
        conversationsDataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public void loadMore(@NotNull List<ConversationsData> dataList) {
        int start = conversationsDataList.size();
        conversationsDataList.addAll(dataList);
        notifyItemRangeInserted(start, dataList.size());
    }

    @Override
    public void onViewAttachedToWindow(@NotNull MenuView holder) {
        super.onViewAttachedToWindow(holder);
        holder.bind();
    }

    @Override
    public void onViewDetachedFromWindow(@NotNull MenuView holder) {
        super.onViewDetachedFromWindow(holder);
        holder.unbind();
    }

    @Override
    public int getItemCount() {
        return conversationsDataList.size();
    }

    public class MenuView extends RecyclerView.ViewHolder {
        public ItemConversationBinding itemMenuBinding;

        MenuView(View itemView) {
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

        void setViewModel(ItemConversationsViewModel itemViewModels) {
            if (itemMenuBinding != null) {
                itemMenuBinding.setItemViewModel(itemViewModels);
            }
        }
    }
}
