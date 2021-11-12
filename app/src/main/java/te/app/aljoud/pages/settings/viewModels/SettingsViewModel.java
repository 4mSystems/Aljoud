package te.app.aljoud.pages.settings.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;


import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.settings.models.AboutMain;
import te.app.aljoud.pages.settings.models.ContactRequest;
import te.app.aljoud.repository.SettingsRepository;
import te.app.aljoud.utils.Constants;

public class SettingsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;
    ContactRequest contactRequest;
    AboutMain aboutMain;

    @Inject
    public SettingsViewModel(SettingsRepository repository) {
        aboutMain = new AboutMain();
        contactRequest = new ContactRequest();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void sendContact() {
        if (getContactRequest().isValid())
            compositeDisposable.add(repository.sendContact(getContactRequest()));
    }

    public void about() {
        compositeDisposable.add(repository.getAbout());
    }

    public void toFacebook() {
        liveData.setValue(new Mutable(Constants.FACEBOOK));
    }

    public void toYoutube() {
        liveData.setValue(new Mutable(Constants.YOUTUBE));
    }

    public void toWhats() {
        liveData.setValue(new Mutable(Constants.WHATS));
    }

    public ContactRequest getContactRequest() {
        return contactRequest;
    }

    @Bindable
    public AboutMain getAboutMain() {
        return aboutMain;
    }

    @Bindable
    public void setAboutMain(AboutMain aboutMain) {
        notifyChange(BR.aboutMain);
        this.aboutMain = aboutMain;
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

    public SettingsRepository getRepository() {
        return repository;
    }

}
