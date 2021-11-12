package te.app.aljoud.pages.auth.register;

import android.util.Log;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.connection.FileObject;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.auth.models.RegisterRequest;
import te.app.aljoud.repository.AuthRepository;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.AppHelper;
import te.app.aljoud.utils.session.UserHelper;

public class RegisterViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    List<FileObject> fileObject;
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    RegisterRequest request;

    @Inject
    public RegisterViewModel(AuthRepository repository) {
        fileObject = new ArrayList<>();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);

    }

    public void register() {
        getRequest().setToken(UserHelper.getInstance(MyApplication.getInstance()).getToken());
        getRequest().setMacAddress(AppHelper.getMacAddress());
        if (getRequest().isValid()) {
//            if (Validate.isMatchPassword(getRequest().getPassword(), getRequest().getConfirmPassword())) {
                setMessage(Constants.SHOW_PROGRESS);
                compositeDisposable.add(repository.register(request));
//            } else
//                liveData.setValue(new Mutable(Constants.ERROR_TOAST, ResourceManager.getString(R.string.password_not_match)));
        }
    }

    public void updateProfile() {
        if (getRequest().isUpdateValid()) {
            setMessage(Constants.SHOW_PROGRESS);
            compositeDisposable.add(repository.updateProfile(request, getFileObject()));
        }
    }

    public void changeAccountType(String type) {
        Log.e("changeAccountType", "changeAccountType: "+type );
        getRequest().setType(type);
        notifyChange(BR.request);
    }

    public void action(String action) {
        liveData.setValue(new Mutable(action));
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

    public List<FileObject> getFileObject() {
        return fileObject;
    }

}
