package te.app.aljoud.pages.auth.login;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BuildConfig;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.auth.models.LoginRequest;
import te.app.aljoud.repository.AuthRepository;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.AppHelper;
import te.app.aljoud.utils.session.UserHelper;

public class LoginViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    LoginRequest loginRequest;

    @Inject
    public LoginViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        loginRequest = new LoginRequest();
    }


    public void loginPassword() {
        getLoginRequest().setToken(UserHelper.getInstance(MyApplication.getInstance()).getToken());
        if (BuildConfig.DEBUG)
            getLoginRequest().setMacAddress("asd123456");
        else
            getLoginRequest().setMacAddress(AppHelper.getMacAddress());
        if (getLoginRequest().isValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.loginPassword(loginRequest));
        }
    }

    public void settings(String action) {
        liveData.setValue(new Mutable(action));
    }

    public void register() {
        liveData.setValue(new Mutable(Constants.REGISTER));
    }

    public void forgetPassword() {
        liveData.setValue(new Mutable(Constants.FORGET_PASSWORD));
    }

    public void skip() {
        liveData.setValue(new Mutable(Constants.HOME));
    }

    public void changeLang() {
        liveData.setValue(new Mutable(Constants.LANGUAGE));
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

    public LoginRequest getLoginRequest() {
        return loginRequest;
    }

}
