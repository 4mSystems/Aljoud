package te.app.aljoud.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.aljoud.connection.ConnectionHelper;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.home.models.HomeResponse;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.URLS;

@Singleton
public class HomeRepository extends BaseRepository {
    @Inject
    public ConnectionHelper connectionHelper;
    protected MutableLiveData<Mutable> liveData;

    @Inject
    public HomeRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getHomeData() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.HOME, new Object(), HomeResponse.class,
                Constants.HOME, true);
    }



}