package te.app.aljoud.pages.courseDetails.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
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
        compositeDisposable.add(homeRepository.ask(getAskRequest()));
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
