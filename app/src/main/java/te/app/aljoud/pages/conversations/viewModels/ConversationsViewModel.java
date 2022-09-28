package te.app.aljoud.pages.conversations.viewModels;

import android.view.View;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.conversations.adapters.ConversationsAdapter;
import te.app.aljoud.pages.conversations.models.ConversationsMain;
import te.app.aljoud.repository.ChatRepository;
import io.reactivex.disposables.CompositeDisposable;

public class ConversationsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    ChatRepository repository;
    ConversationsAdapter conversationsAdapter;
    ConversationsMain conversationsMain;

    @Inject
    public ConversationsViewModel(ChatRepository repository) {
        conversationsAdapter = new ConversationsAdapter();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void getConversations(int page, boolean showProgress) {
        compositeDisposable.add(repository.getConversations(page, showProgress));
    }

    @Bindable
    public ConversationsMain getConversationsMain() {
        return this.conversationsMain == null ? this.conversationsMain = new ConversationsMain() : this.conversationsMain;
    }

    @Bindable
    public void setConversationsMain(ConversationsMain conversationsMain) {
        if (conversationsMain.getCurrentPage() > 1) {
            getConversationsAdapter().loadMore(conversationsMain.getData());
        } else {
            getConversationsAdapter().update(conversationsMain.getData());
            notifyChange(BR.conversationsAdapter);
        }
        setSearchProgressVisible(View.GONE);
        notifyChange(BR.conversationsMain);
        this.conversationsMain = conversationsMain;
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public ChatRepository getRepository() {
        return repository;
    }

    @Bindable
    public ConversationsAdapter getConversationsAdapter() {
        return this.conversationsAdapter == null ? this.conversationsAdapter = new ConversationsAdapter() : this.conversationsAdapter;
    }
}
