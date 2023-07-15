package te.app.aljoud.pages.request_to_buy.view_model;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.request_to_buy.models.RequestToBuy;
import te.app.aljoud.repository.HomeRepository;

public class RequestBuyViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    RequestToBuy requestToBuy;

    @Inject
    public RequestBuyViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void requestToBuy() {
        if (!getRequestToBuy().getMessage().isEmpty()) {
            getRequestToBuy().setCourseId(getPassingObject().getId());
            compositeDisposable.add(homeRepository.requestToBuy(getRequestToBuy()));
        }
    }

    @Bindable
    public RequestToBuy getRequestToBuy() {
        return this.requestToBuy == null ? this.requestToBuy = new RequestToBuy() : this.requestToBuy;
    }

    public HomeRepository getHomeRepository() {
        return homeRepository;
    }


    protected void unSubscribeFromObservable() {
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
