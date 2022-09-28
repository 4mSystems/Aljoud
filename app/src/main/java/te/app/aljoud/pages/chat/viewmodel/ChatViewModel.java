
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
import te.app.aljoud.pages.chat.adapter.ChatAdapter;
import te.app.aljoud.pages.chat.model.ChatMain;
import te.app.aljoud.pages.courseDetails.adapters.pickFilesAdapter;
import te.app.aljoud.pages.courseDetails.models.AskRequest;
import te.app.aljoud.repository.ChatRepository;
import te.app.aljoud.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;

public class ChatViewModel extends BaseViewModel {
    public
    MutableLiveData<Mutable> liveData;
    @Inject
    public ChatRepository repository;
    ChatAdapter adapter;
    public AskRequest request = new AskRequest();
    public List<FileObject> fileObjectList = new ArrayList<>();
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    ChatMain chatMain;
    pickFilesAdapter filesAdapter;

    @Inject
    public ChatViewModel(ChatRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void chat() {
        compositeDisposable.add(repository.getChat(getPassingObject().getId()));
    }

    public void action(String action) {
        liveData.setValue(new Mutable(action));
    }

    @Bindable
    public ChatMain getChatMain() {
        return this.chatMain == null ? this.chatMain = new ChatMain() : this.chatMain;
    }

    @Bindable
    public void setChatMain(ChatMain chatMain) {
        getAdapter().update(chatMain.getConversationsDataList());
        notifyChange(BR.adapter);
        notifyChange(BR.chatMain);
        this.chatMain = chatMain;
    }


    @Bindable
    public ChatAdapter getAdapter() {
        return this.adapter == null ? this.adapter = new ChatAdapter() : this.adapter;
    }

    @Bindable
    public pickFilesAdapter getFilesAdapter() {
        return this.filesAdapter == null ? this.filesAdapter = new pickFilesAdapter() : this.filesAdapter;
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
        request.setParentId(String.valueOf(getPassingObject().getId()));
        repository.sendChat(request, fileObjectList);
    }
}
