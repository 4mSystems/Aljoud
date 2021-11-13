package te.app.aljoud.pages.university.viewModel;

import androidx.databinding.Bindable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.home.adapters.UniversityAdapter;
import te.app.aljoud.repository.HomeRepository;

public class UniversityViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    UniversityAdapter universityAdapter;
    LiveData<String> cartCount;

    @Inject
    public UniversityViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void homeData() {
        compositeDisposable.add(homeRepository.getHomeData());
    }

    @Bindable
    public UniversityAdapter getCategoriesAdapter() {
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
