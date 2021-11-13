package te.app.aljoud.pages.auth.register;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;
import javax.inject.Inject;
import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.auth.models.RegisterRequest;
import te.app.aljoud.repository.AuthRepository;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.AppHelper;
import te.app.aljoud.utils.session.UserHelper;

public class RegisterViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RegisterRequest request;

    @Inject
    public RegisterViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);

    }

    public void register() {
        getRequest().setToken(UserHelper.getInstance(MyApplication.getInstance()).getToken());
        getRequest().setMacAddress(AppHelper.getMacAddress());
        if (getRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.register(request));
        }
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

    @Bindable
    public RegisterRequest getRequest() {
        return this.request == null ? this.request = new RegisterRequest() : this.request;
    }

}
