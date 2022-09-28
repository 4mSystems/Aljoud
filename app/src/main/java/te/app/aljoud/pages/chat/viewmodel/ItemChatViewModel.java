package te.app.aljoud.pages.chat.viewmodel;


import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.chat.adapter.ChatMediaAdapter;
import te.app.aljoud.pages.conversations.models.ConversationsData;
import te.app.aljoud.utils.session.UserHelper;

public class ItemChatViewModel extends BaseViewModel {
    ConversationsData chat;
    ChatMediaAdapter chatMediaAdapter;

    public ItemChatViewModel(ConversationsData chat) {
        if (chat.getVideoData().size() > 0) {
            getChatMediaAdapter().update(chat.getVideoData());
            notifyChange(BR.chatMediaAdapter);
        }
        this.chat = chat;
    }

    @Bindable
    public ConversationsData getChat() {
        return chat;
    }

    @BindingAdapter("android:layoutDirection")
    public static void chatAdminDirection(ConstraintLayout constraintLayout, int senderId) {
        if (senderId == UserHelper.getInstance(constraintLayout.getContext()).getUserData().getId()) {
            constraintLayout.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        } else
            constraintLayout.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
    }

    @Bindable
    public ChatMediaAdapter getChatMediaAdapter() {
        return this.chatMediaAdapter == null ? this.chatMediaAdapter = new ChatMediaAdapter() : this.chatMediaAdapter;
    }
}
