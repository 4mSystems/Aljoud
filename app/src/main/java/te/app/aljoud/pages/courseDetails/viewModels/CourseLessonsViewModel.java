package te.app.aljoud.pages.courseDetails.viewModels;

import android.text.TextUtils;
import android.widget.RatingBar;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.courseDetails.adapters.LessonsAdapter;
import te.app.aljoud.pages.courseDetails.models.RateRequest;
import te.app.aljoud.pages.courseDetails.models.lessons.LessonMainData;
import te.app.aljoud.repository.HomeRepository;
import te.app.aljoud.utils.Constants;

public class CourseLessonsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    LessonsAdapter lessonsAdapter;
    LessonMainData lessonMainData;
    RateRequest rateRequest;

    @Inject
    public CourseLessonsViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void courseLessons() {
        compositeDisposable.add(homeRepository.getCourseLessons(getPassingObject().getId()));
    }

    public void rateCourse() {
        getRateRequest().setCourseId(getPassingObject().getId());
        if (!TextUtils.isEmpty(getRateRequest().getRate()))
            compositeDisposable.add(homeRepository.rateCourse(getRateRequest()));
    }

    public void toExam() {
        liveData.setValue(new Mutable(Constants.EXAMS));
    }

    public void onRateChange(RatingBar ratingBar, float rating, boolean fromUser) {
        getRateRequest().setRate(String.valueOf(rating));
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

    public RateRequest getRateRequest() {
        return this.rateRequest == null ? this.rateRequest = new RateRequest() : this.rateRequest;
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
