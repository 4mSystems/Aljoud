package te.app.aljoud.pages.splash;

import android.os.Handler;
import android.util.Log;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import te.app.aljoud.BR;
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
    private int progress = 0;

    @Inject
    public SplashViewModel(HomeRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void splashStart() {
//        new Handler().postDelayed(() -> liveData.setValue(new Mutable(Constants.HOME)), 3000);
        Handler handler = new Handler();
        new Thread(() -> {
            while (getProgress() < 100) {
                setProgress(getProgress()+10);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                handler.post(() -> {
                    if (getProgress() >= 100) {
//                        liveData.setValue(new Mutable(Constants.HOME));
                    }
                });
            }
        }).start();
    }

    public int getProgress() {
        return progress;
    }

    @Bindable
    public void setProgress(int progress) {
        Log.e("setProgress", "setProgress: "+progress );
        notifyChange(BR.progress);
        this.progress = progress;
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
