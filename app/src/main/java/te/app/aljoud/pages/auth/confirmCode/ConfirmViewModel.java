package te.app.aljoud.pages.auth.confirmCode;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.auth.models.ConfirmCodeRequest;
import te.app.aljoud.pages.auth.models.ForgetPasswordRequest;
import te.app.aljoud.repository.AuthRepository;
import te.app.aljoud.utils.Constants;

public class ConfirmViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    ConfirmCodeRequest request;

    @Inject
    public ConfirmViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new ConfirmCodeRequest();
    }

    public void confirmCode() {
        getRequest().setEmail(getPassingObject().getObject());
        if (request.isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.confirmCode(request));
        }
    }

    public void resendCode() {
        setMessage(Constants.SHOW_PROGRESS);
        compositeDisposable.add(repository.forgetPassword(new ForgetPasswordRequest(getPassingObject().getObject())));
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

    public ConfirmCodeRequest getRequest() {
        return request;
    }
}
