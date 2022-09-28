package te.app.aljoud.repository;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.aljoud.connection.ConnectionHelper;
import te.app.aljoud.connection.FileObject;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.auth.models.ConfirmCodeRequest;
import te.app.aljoud.pages.auth.models.ForgetPasswordRequest;
import te.app.aljoud.pages.auth.models.LoginRequest;
import te.app.aljoud.pages.auth.models.RegisterRequest;
import te.app.aljoud.pages.auth.models.UsersResponse;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.URLS;

import androidx.lifecycle.MutableLiveData;

@Singleton
public class AuthRepository extends BaseRepository {

    @Inject
    public ConnectionHelper connectionHelper;

    protected MutableLiveData<Mutable> liveData;

    @Inject
    public AuthRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }


    public Disposable loginPassword(LoginRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.LOGIN_PASSWORD, request, UsersResponse.class,
                Constants.LOGIN, false);
    }


    public Disposable register(RegisterRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.REGISTER, request, StatusMessage.class,
                Constants.REGISTER, false);
    }

    public Disposable confirmCode(ConfirmCodeRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CONFIRM_CODE, request, UsersResponse.class,
                Constants.CONFIRM_CODE, false);
    }


    public Disposable updateProfile(RegisterRequest request, List<FileObject> fileObjects) {
        if (fileObjects == null) {
            return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.UPDATE_PROFILE, request, UsersResponse.class,
                    Constants.UPDATE_PROFILE, false);
        } else {
            return connectionHelper.requestApi(URLS.UPDATE_PROFILE, request, fileObjects, UsersResponse.class,
                    Constants.UPDATE_PROFILE, false);
        }

    }


    public Disposable forgetPassword(ForgetPasswordRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.FORGET_PASSWORD, request, StatusMessage.class,
                Constants.FORGET_PASSWORD, false);
    }

    public Disposable changePassword(RegisterRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CHANGE_PASSWORD, request, StatusMessage.class,
                Constants.CHANGE_PASSWORD, false);
    }

    public Disposable changeProfilePassword(RegisterRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CHANGE_PROFILE_PASSWORD, request, StatusMessage.class,
                Constants.CHANGE_PASSWORD, false);
    }


}