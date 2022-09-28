package te.app.aljoud.pages.myCourses.viewModels;

import android.view.View;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.university.adapters.CourseAdapter;
import te.app.aljoud.pages.university.models.course.CourseMainData;
import te.app.aljoud.repository.HomeRepository;

public class MyCoursesViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    CourseAdapter courseAdapter;
    CourseMainData courseMainData;

    @Inject
    public MyCoursesViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void myCourses(int page, boolean showProgress) {
        compositeDisposable.add(homeRepository.myCourses(page, showProgress));
    }

    @Bindable
    public CourseMainData getCourseMainData() {
        return this.courseMainData == null ? this.courseMainData = new CourseMainData() : this.courseMainData;
    }

    @Bindable
    public void setCourseMainData(CourseMainData courseMainData) {
        if (courseMainData.getCurrentPage() > 1) {
            getCourseAdapter().loadMore(courseMainData.getCourseList());
        } else {
            getCourseAdapter().update(courseMainData.getCourseList());
            notifyChange(BR.courseAdapter);
        }
        setSearchProgressVisible(View.GONE);
        notifyChange(BR.courseMainData);
        this.courseMainData = courseMainData;
    }


    @Bindable
    public CourseAdapter getCourseAdapter() {
        return this.courseAdapter == null ? this.courseAdapter = new CourseAdapter() : this.courseAdapter;
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
