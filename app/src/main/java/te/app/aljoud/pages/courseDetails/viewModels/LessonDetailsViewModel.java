package te.app.aljoud.pages.courseDetails.viewModels;

import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.courseDetails.adapters.LessonArticlesAdapter;
import te.app.aljoud.pages.courseDetails.adapters.LessonQuizzesAdapter;
import te.app.aljoud.pages.courseDetails.adapters.LessonVideosAdapter;
import te.app.aljoud.pages.courseDetails.models.videos.VideosMainData;
import te.app.aljoud.repository.HomeRepository;

public class LessonDetailsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    LessonVideosAdapter lessonVideosAdapter;
    LessonQuizzesAdapter lessonQuizzesAdapter;
    LessonArticlesAdapter articlesAdapter;
    VideosMainData videosMainData, quizMainData, articleMainData;

    @Inject
    public LessonDetailsViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
    }

    public void lessonVideos(int lessonId, int page, boolean showProgress) {
        compositeDisposable.add(homeRepository.getLessonVideos(lessonId, page, showProgress));
    }

    public void lessonQuizzes(int lessonId, int page, boolean showProgress) {
        compositeDisposable.add(homeRepository.getLessonQuizzes(lessonId, page, showProgress));
    }
    public void lessonArticles(int lessonId, int page, boolean showProgress) {
        compositeDisposable.add(homeRepository.getLessonArticles(lessonId, page, showProgress));
    }

    @Bindable
    public VideosMainData getVideosMainData() {
        return this.videosMainData==null?this.videosMainData= new VideosMainData():this.videosMainData;
    }

    @Bindable
    public void setVideosMainData(VideosMainData videosMainData) {
        getLessonVideosAdapter().update(videosMainData.getVideoDataList());
        notifyChange(BR.lessonVideosAdapter);
        notifyChange(BR.videosMainData);
        this.videosMainData = videosMainData;
    }

    @Bindable
    public VideosMainData getQuizMainData() {
        return this.quizMainData==null?this.quizMainData= new VideosMainData():this.quizMainData;
    }

    @Bindable
    public void setQuizMainData(VideosMainData quizMainData) {
        getLessonQuizzesAdapter().update(quizMainData.getVideoDataList());
        notifyChange(BR.lessonQuizzesAdapter);
        notifyChange(BR.quizMainData);
        this.quizMainData = quizMainData;
    }

    @Bindable
    public VideosMainData getArticleMainData() {
        return this.articleMainData==null?this.articleMainData= new VideosMainData():this.articleMainData;
    }

    @Bindable
    public void setArticleMainData(VideosMainData articleMainData) {
        getArticlesAdapter().update(articleMainData.getVideoDataList());
        notifyChange(BR.articlesAdapter);
        notifyChange(BR.articleMainData);
        this.quizMainData = articleMainData;
    }

    @Bindable
    public LessonVideosAdapter getLessonVideosAdapter() {
        return this.lessonVideosAdapter == null ? this.lessonVideosAdapter = new LessonVideosAdapter() : this.lessonVideosAdapter;
    }

    @Bindable
    public LessonQuizzesAdapter getLessonQuizzesAdapter() {
        return this.lessonQuizzesAdapter == null ? this.lessonQuizzesAdapter = new LessonQuizzesAdapter() : this.lessonQuizzesAdapter;
    }

    @Bindable
    public LessonArticlesAdapter getArticlesAdapter() {
        return this.articlesAdapter == null ? this.articlesAdapter = new LessonArticlesAdapter() : this.articlesAdapter;
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
