package te.app.aljoud.pages.university.viewModel;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.university.adapters.CourseAdapter;
import te.app.aljoud.pages.university.adapters.LevelsAdapter;
import te.app.aljoud.pages.university.adapters.UniversityCollegesAdapter;
import te.app.aljoud.pages.university.models.UniversityData;
import te.app.aljoud.repository.HomeRepository;

public class UniversityViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    UniversityCollegesAdapter collegesAdapter;
    UniversityData universityData;
    LevelsAdapter levelsAdapter;
    CourseAdapter courseAdapter;

    @Inject
    public UniversityViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void universityDetails() {
        compositeDisposable.add(homeRepository.universityDetails(getPassingObject().getId()));
    }

    public void levels() {
        compositeDisposable.add(homeRepository.levels(getPassingObject().getId()));
    }

    public void levelCourses() {
        compositeDisposable.add(homeRepository.levelCourses(getLevelsAdapter().lastSelected, getPassingObject().getId()));
    }

    @Bindable
    public UniversityData getUniversityData() {
        return this.universityData == null ? this.universityData = new UniversityData() : this.universityData;
    }

    public void setUniversityData(UniversityData universityData) {
        getCollegesAdapter().update(universityData.getSpecialists());
        notifyChange(BR.universityData);
        this.universityData = universityData;
    }

    @Bindable
    public UniversityCollegesAdapter getCollegesAdapter() {
        return this.collegesAdapter == null ? this.collegesAdapter = new UniversityCollegesAdapter() : this.collegesAdapter;
    }

    @Bindable
    public LevelsAdapter getLevelsAdapter() {
        return this.levelsAdapter == null ? this.levelsAdapter = new LevelsAdapter() : this.levelsAdapter;
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
