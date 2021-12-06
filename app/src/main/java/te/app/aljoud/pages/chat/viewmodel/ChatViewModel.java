
package te.app.aljoud.pages.chat.viewmodel;

import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.connection.FileObject;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.auth.models.UserData;
import te.app.aljoud.pages.chat.adapter.ChatAdapter;
import te.app.aljoud.pages.chat.model.ChatRequest;
import te.app.aljoud.pages.conversations.models.ConversationsData;
import te.app.aljoud.pages.conversations.models.ConversationsMain;
import te.app.aljoud.repository.ChatRepository;
import te.app.aljoud.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class ChatViewModel extends BaseViewModel {
    public
    MutableLiveData<Mutable> liveData;
    @Inject
    public ChatRepository repository;
    ChatAdapter adapter;
    public ChatRequest request = new ChatRequest();
    public List<FileObject> fileObjectList = new ArrayList<>();
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    ConversationsData conversationsData;
    ConversationsMain conversationsMain;

    @Inject
    public ChatViewModel(ChatRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void chat() {
//        compositeDisposable.add(repository.getChat(getConversationsData().getId()));
    }

    @Bindable
    public ConversationsMain getConversationsMain() {
        return this.conversationsMain == null ? this.conversationsMain = new ConversationsMain() : this.conversationsMain;
    }

    @Bindable
    public void setConversationsMain(ConversationsMain conversationsMain) {
        if (getAdapter().getChatList().size() > 0) {
            getAdapter().loadMore(conversationsMain.getData());
        } else {
            getAdapter().update(conversationsMain.getData());
            notifyChange(BR.adapter);
        }
//        searchProgressVisible.set(false);
        notifyChange(BR.conversationsMain);
        this.conversationsMain = conversationsMain;
    }

    @Bindable
    public ConversationsData getConversationsData() {
        return this.conversationsData == null ? this.conversationsData = new ConversationsData() : this.conversationsData;
    }

    @Bindable
    public ChatAdapter getAdapter() {
        return this.adapter == null ? this.adapter = new ChatAdapter() : this.adapter;
    }

    @Bindable
    public void setConversationsData(ConversationsData conversationsData) {
        notifyChange(BR.conversationsData);
        this.conversationsData = conversationsData;
        chat();
    }

    private void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public void select() {
        liveData.setValue(new Mutable(Constants.IMAGE));
    }

    public void sendMessage() {
        request.setListing_id(String.valueOf(getPassingObject().getId()));
        request.setUserId(String.valueOf(getConversationsData().getId()));
        if (fileObjectList.size() > 0 || !TextUtils.isEmpty(request.getMessage())) {
            setMessage(Constants.SHOW_PROGRESS);
//            repository.sendChat(request, fileObjectList);
        }
    }
}
