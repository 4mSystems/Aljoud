package te.app.aljoud.pages.courseDetails.viewModels;


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
import te.app.aljoud.pages.university.models.course.Course;
import te.app.aljoud.repository.HomeRepository;

public class CourseViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    Course course;
    AskRequest askRequest;
    pickFilesAdapter filesAdapter;
    List<FileObject> fileObjectList = new ArrayList<>();

    @Inject
    public CourseViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void courseDetails() {
        compositeDisposable.add(homeRepository.courseDetails(getPassingObject().getId()));
    }

    public void ask() {
        if (!TextUtils.isEmpty(getAskRequest().getMessage()))
            compositeDisposable.add(homeRepository.ask(getAskRequest(), getFileObjectList()));
    }

    @Bindable
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        notifyChange(BR.course);
        this.course = course;
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

    public void action(String action) {
        liveData.setValue(new Mutable(action));
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
