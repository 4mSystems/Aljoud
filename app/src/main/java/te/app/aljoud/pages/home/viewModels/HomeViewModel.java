package te.app.aljoud.pages.home.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;
import javax.inject.Inject;
import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.home.adapters.UniversityAdapter;
import te.app.aljoud.pages.home.models.home.HomeMainData;
import te.app.aljoud.repository.HomeRepository;

public class HomeViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    UniversityAdapter universityAdapter;
    HomeMainData homeMainData;

    @Inject
    public HomeViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void homeData(int page, boolean showProgress) {
        compositeDisposable.add(homeRepository.universities(page, showProgress));
    }

    @Bindable
    public HomeMainData getHomeMainData() {
        return this.homeMainData == null ? this.homeMainData = new HomeMainData() : this.homeMainData;
    }

    @Bindable
    public void setHomeMainData(HomeMainData homeMainData) {
        getUniversityAdapter().update(homeMainData.getUniversityList());
        notifyChange(BR.homeMainData);
        this.homeMainData = homeMainData;
    }

    @Bindable
    public UniversityAdapter getUniversityAdapter() {
        return this.universityAdapter == null ? this.universityAdapter = new UniversityAdapter() : this.universityAdapter;
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
