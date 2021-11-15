package te.app.aljoud.pages.courseDetails.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.courseDetails.adapters.LessonVideosAdapter;
import te.app.aljoud.pages.courseDetails.adapters.LessonsAdapter;
import te.app.aljoud.pages.courseDetails.models.lessons.LessonMainData;
import te.app.aljoud.pages.courseDetails.models.videos.VideosMainData;
import te.app.aljoud.repository.HomeRepository;

public class LessonDetailsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    LessonsAdapter lessonsAdapter;
    LessonVideosAdapter lessonVideosAdapter;
    LessonMainData lessonMainData;
    VideosMainData videosMainData;

    @Inject
    public LessonDetailsViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void lessonVideos() {
        compositeDisposable.add(homeRepository.getLessonVideos(getPassingObject().getId()));
    }

    @Bindable
    public LessonsAdapter getLessonsAdapter() {
        return this.lessonsAdapter == null ? this.lessonsAdapter = new LessonsAdapter() : this.lessonsAdapter;
    }

    @Bindable
    public LessonVideosAdapter getLessonVideosAdapter() {
        return this.lessonVideosAdapter == null ? this.lessonVideosAdapter = new LessonVideosAdapter() : this.lessonVideosAdapter;
    }

    @Bindable
    public void setLessonMainData(LessonMainData lessonMainData) {
        getLessonsAdapter().update(lessonMainData.getLessons());
        notifyChange(BR.lessonsAdapter);
        notifyChange(BR.lessonMainData);
        this.lessonMainData = lessonMainData;
    }

    @Bindable
    public VideosMainData getVideosMainData() {
        return videosMainData;
    }

    @Bindable
    public void setVideosMainData(VideosMainData videosMainData) {
        getLessonVideosAdapter().update(videosMainData.getVideoDataList());
        notifyChange(BR.lessonVideosAdapter);
        notifyChange(BR.videosMainData);
        this.videosMainData = videosMainData;
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
