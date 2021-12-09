package te.app.aljoud.pages.settings.viewModels;

import android.text.TextUtils;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;


import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.connection.FileObject;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.courseDetails.adapters.pickFilesAdapter;
import te.app.aljoud.pages.courseDetails.models.AskRequest;
import te.app.aljoud.pages.settings.models.AboutMain;
import te.app.aljoud.pages.settings.models.services.ServiceItem;
import te.app.aljoud.repository.SettingsRepository;
import te.app.aljoud.utils.Constants;

public class SettingsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    SettingsRepository repository;
    AboutMain aboutMain;
    AskRequest askRequest;
    pickFilesAdapter filesAdapter;
    List<FileObject> fileObjectList = new ArrayList<>();
    List<ServiceItem> serviceItemList = new ArrayList<>();

    @Inject
    public SettingsViewModel(SettingsRepository repository) {
        aboutMain = new AboutMain();
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void sendContact() {
        if (!TextUtils.isEmpty(getAskRequest().getMessage()))
            compositeDisposable.add(repository.sendContact(getAskRequest()));
    }

    public void sendService() {
        if (!TextUtils.isEmpty(getAskRequest().getMessage()) && !TextUtils.isEmpty(getAskRequest().getServiceId()))
            compositeDisposable.add(repository.sendRequest(getAskRequest()));
    }

    public void getServices() {
        compositeDisposable.add(repository.getServices());
    }

    public void about() {
        compositeDisposable.add(repository.getAbout());
    }

    public void action(String action) {
        liveData.setValue(new Mutable(action));
    }

    @Bindable
    public AskRequest getAskRequest() {
        return this.askRequest == null ? this.askRequest = new AskRequest() : this.askRequest;
    }

    @Bindable
    public pickFilesAdapter getFilesAdapter() {
        return this.filesAdapter == null ? this.filesAdapter = new pickFilesAdapter() : this.filesAdapter;
    }

    public List<FileObject> getFileObjectList() {
        return fileObjectList;
    }

    public List<ServiceItem> getServiceItemList() {
        return serviceItemList;
    }

    public void setServiceItemList(List<ServiceItem> serviceItemList) {
        this.serviceItemList = serviceItemList;
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
