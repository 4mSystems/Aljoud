package te.app.aljoud.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.aljoud.connection.ConnectionHelper;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.settings.models.AboutResponse;
import te.app.aljoud.pages.settings.models.ContactRequest;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.URLS;

@Singleton
public class SettingsRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public SettingsRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }


    public Disposable sendContact(ContactRequest contactRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CONTACT, contactRequest, StatusMessage.class,
                Constants.CONTACT, true);
    }


    public Disposable getAbout() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.ABOUT, new Object(), AboutResponse.class,
                Constants.ABOUT, true);
    }

}