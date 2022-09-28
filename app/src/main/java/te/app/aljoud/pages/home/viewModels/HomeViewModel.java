package te.app.aljoud.pages.home.viewModels;

import android.view.View;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.home.adapters.SocialAdapter;
import te.app.aljoud.pages.home.adapters.UniversityAdapter;
import te.app.aljoud.pages.home.models.home.HomeMainData;
import te.app.aljoud.pages.home.models.social.SocialModel;
import te.app.aljoud.repository.CartRepository;
import te.app.aljoud.repository.HomeRepository;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.AppHelper;

public class HomeViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    @Inject
    CartRepository cartRepository;
    UniversityAdapter universityAdapter;
    SocialAdapter socialAdapter;
    HomeMainData homeMainData;

    @Inject
    public HomeViewModel(HomeRepository homeRepository, CartRepository cartRepository) {
        this.homeRepository = homeRepository;
        this.cartRepository = cartRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void homeData(int page, boolean showProgress) {
        compositeDisposable.add(homeRepository.universities(page, showProgress));
    }

    public void getCartCount() {
        compositeDisposable.add(cartRepository.getCartCount());
    }

    @Bindable
    public HomeMainData getHomeMainData() {
        return this.homeMainData == null ? this.homeMainData = new HomeMainData() : this.homeMainData;
    }

    @Bindable
    public void setHomeMainData(HomeMainData homeMainData) {
        if (homeMainData.getCurrentPage() > 1) {
            getUniversityAdapter().loadMore(homeMainData.getUniversityList());
        } else {
            getUniversityAdapter().update(homeMainData.getUniversityList());
            notifyChange(BR.universityAdapter);
        }
        setSearchProgressVisible(View.GONE);
        notifyChange(BR.homeMainData);
        this.homeMainData = homeMainData;
    }

    @Bindable
    public UniversityAdapter getUniversityAdapter() {
        return this.universityAdapter == null ? this.universityAdapter = new UniversityAdapter() : this.universityAdapter;
    }

    @Bindable
    public SocialAdapter getSocialAdapter() {
        return this.socialAdapter == null ? this.socialAdapter = new SocialAdapter() : this.socialAdapter;
    }


    public HomeRepository getHomeRepository() {
        return homeRepository;
    }

    public CartRepository getCartRepository() {
        return cartRepository;
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

    public void setUpSocial() {
        // preparing list
        List<SocialModel> socialModels = new ArrayList<>();
        socialModels.add(new SocialModel(R.drawable.ic_facebook, Constants.FACEBOOK));
        socialModels.add(new SocialModel(R.drawable.ic_twitter, Constants.TWITTER));
        socialModels.add(new SocialModel(R.drawable.ic_instagram, Constants.INSTA));
        socialModels.add(new SocialModel(R.drawable.ic_whatsapp, Constants.WHATS));
        socialModels.add(new SocialModel(R.drawable.ic_youtube, Constants.YOUTUBE));
        socialModels.add(new SocialModel(R.drawable.ic_snapchat, Constants.SNAP));
        socialModels.add(new SocialModel(R.drawable.ic_telegram, Constants.TELEGRAM));
        socialModels.add(new SocialModel(R.drawable.ic_tiktok, Constants.TIKTOK));
        socialModels.add(new SocialModel(R.drawable.ic_app_email, Constants.EMAIL_APP));
        socialModels.add(new SocialModel(R.drawable.ic_play_store, AppHelper.getPlayStoreLink(MyApplication.getInstance())));
        getSocialAdapter().update(socialModels);
        notifyChange(BR.socialAdapter);
    }

}
