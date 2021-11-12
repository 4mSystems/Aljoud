package te.app.aljoud.pages.splash;

import android.os.Handler;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.repository.HomeRepository;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.utils.Constants;
import io.reactivex.disposables.CompositeDisposable;


public class SplashViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository repository;

    @Inject
    public SplashViewModel(HomeRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void splashStart() {
        new Handler().postDelayed(() -> liveData.setValue(new Mutable(Constants.HOME)), 3000);
    }

    public HomeRepository getRepository() {
        return repository;
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
