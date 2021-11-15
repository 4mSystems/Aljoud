package te.app.aljoud.pages.courseDetails.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.courseDetails.adapters.LessonsAdapter;
import te.app.aljoud.pages.courseDetails.models.lessons.LessonMainData;
import te.app.aljoud.repository.HomeRepository;

public class CourseLessonsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    LessonsAdapter lessonsAdapter;
    LessonMainData lessonMainData;

    @Inject
    public CourseLessonsViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void courseLessons() {
        compositeDisposable.add(homeRepository.getCourseLessons(getPassingObject().getId()));
    }

    @Bindable
    public LessonsAdapter getLessonsAdapter() {
        return this.lessonsAdapter == null ? this.lessonsAdapter = new LessonsAdapter() : this.lessonsAdapter;
    }

    @Bindable
    public LessonMainData getLessonMainData() {
        return lessonMainData;
    }

    @Bindable
    public void setLessonMainData(LessonMainData lessonMainData) {
        getLessonsAdapter().update(lessonMainData.getLessons());
        notifyChange(BR.lessonMainData);
        this.lessonMainData = lessonMainData;
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
