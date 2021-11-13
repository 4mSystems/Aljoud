package te.app.aljoud.pages.conversations.viewModels;

import androidx.databinding.Bindable;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.conversations.models.ConversationsData;
import te.app.aljoud.utils.Constants;

public class ItemConversationsViewModel extends BaseViewModel {
    public ConversationsData conversationsData;

    public ItemConversationsViewModel(ConversationsData conversationsData) {
        this.conversationsData = conversationsData;

    }

    @Bindable
    public ConversationsData getConversationsData() {
        return conversationsData;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }

}
