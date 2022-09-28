package te.app.aljoud.pages.offers.viewModel;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.offers.adapters.OffersAdapter;
import te.app.aljoud.pages.offers.models.OffersMainData;
import te.app.aljoud.repository.HomeRepository;

public class OffersViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    OffersAdapter offersAdapter;
    OffersMainData offersMainData;

    @Inject
    public OffersViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void offers(int page, boolean showProgress) {
        compositeDisposable.add(homeRepository.offers(page, showProgress));
    }

    public void buyOffer(int offerId) {
        compositeDisposable.add(homeRepository.buyOffer(offerId));
    }

    @Bindable
    public OffersMainData getOffersMainData() {
        return this.offersMainData == null ? this.offersMainData = new OffersMainData() : this.offersMainData;
    }

    @Bindable
    public void setOffersMainData(OffersMainData offersMainData) {
        getOffersAdapter().update(offersMainData.getOfferItemList());
        notifyChange(BR.offersMainData);
        this.offersMainData = offersMainData;
    }

    @Bindable
    public OffersAdapter getOffersAdapter() {
        return this.offersAdapter == null ? this.offersAdapter = new OffersAdapter() : this.offersAdapter;
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
