package te.app.aljoud.pages.auth.changePassword;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.auth.models.RegisterRequest;
import te.app.aljoud.repository.AuthRepository;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.session.UserHelper;
import te.app.aljoud.utils.validation.Validate;

public class ChangePasswordViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RegisterRequest request;

    @Inject
    public ChangePasswordViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new RegisterRequest();
    }

    public void submit() {
        if (UserHelper.getInstance(MyApplication.getInstance()).getUserData() == null) {
            getRequest().setEmail(getPassingObject().getObject());
            if (request.isPasswordsValid()) {
                if (Validate.isMatchPassword(getRequest().getPassword(), getRequest().getConfirmPassword())) {
                    setMessage(Constants.SHOW_PROGRESS);
                    compositeDisposable.add(repository.changePassword(getRequest()));
                } else
                    liveData.setValue(new Mutable(Constants.NOT_MATCH_PASSWORD));
            }
        } else {
            if (request.isUpdatePasswordsValid()) {
                if (Validate.isMatchPassword(getRequest().getPassword(), getRequest().getConfirmPassword())) {
                    setMessage(Constants.SHOW_PROGRESS);
                    compositeDisposable.add(repository.changeProfilePassword(getRequest()));
                } else
                    liveData.setValue(new Mutable(Constants.NOT_MATCH_PASSWORD));
            }
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

    public RegisterRequest getRequest() {
        return request;
    }

}
