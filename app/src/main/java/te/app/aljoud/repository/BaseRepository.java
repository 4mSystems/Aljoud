package te.app.aljoud.repository;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;
import te.app.aljoud.connection.ConnectionHelper;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.model.govs.GovsResponse;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.URLS;


public class BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;
    MutableLiveData<Mutable> liveData;

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getGovs() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GOVS, new Object(), GovsResponse.class,
                Constants.GOVS, true);
    }

    public Disposable getCountries() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GET_COUNTRY_CITIES, new Object(), GovsResponse.class,
                Constants.GOVS, true);
    }

}
