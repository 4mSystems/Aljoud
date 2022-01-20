package te.app.aljoud.pages.profile;

import android.text.TextUtils;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.connection.FileObject;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.auth.models.RegisterRequest;
import te.app.aljoud.pages.auth.models.UserData;
import te.app.aljoud.repository.AuthRepository;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.session.UserHelper;
import te.app.aljoud.utils.validation.Validate;
import io.reactivex.disposables.CompositeDisposable;

public class ProfileViewModel extends BaseViewModel {
    MutableLiveData<Mutable> liveData;
    List<FileObject> fileObject = new ArrayList<>();
    @Inject
    AuthRepository repository;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    public RegisterRequest request;

    @Inject
    public ProfileViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
        request = new RegisterRequest();
        if (UserHelper.getInstance(MyApplication.getInstance()).getUserData() != null) {
            UserData user = UserHelper.getInstance(MyApplication.getInstance()).getUserData();
            request.setName(user.getName());
            request.setPhone(user.getPhone());
            request.setEmail(user.getEmail());
            request.setUser_image(user.getImage());

        }
    }

    public void submit() {
        if (request.isUpdateValid()) {
            if (!TextUtils.isEmpty(request.getPassword()) || !TextUtils.isEmpty(request.getConfirmPassword()))
                if (Validate.isMatchPassword(request.getPassword(), request.getConfirmPassword())) {
                    setMessage(Constants.SHOW_PROGRESS);
                    compositeDisposable.add(repository.updateProfile(request, fileObject));
                } else
                    liveData.setValue(new Mutable(Constants.NOT_MATCH_PASSWORD));
            else {
                setMessage(Constants.SHOW_PROGRESS);
                compositeDisposable.add(repository.updateProfile(request, fileObject));
            }
        }
    }

    public void imageSubmit() {
        liveData.setValue(new Mutable(Constants.IMAGE));
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

}
