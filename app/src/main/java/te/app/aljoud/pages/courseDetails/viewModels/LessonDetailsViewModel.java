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
import te.app.aljoud.pages.courseDetails.adapters.LessonArticlesAdapter;
import te.app.aljoud.pages.courseDetails.adapters.LessonQuizzesAdapter;
import te.app.aljoud.pages.courseDetails.adapters.LessonVideosAdapter;
import te.app.aljoud.pages.courseDetails.adapters.pickFilesAdapter;
import te.app.aljoud.pages.courseDetails.models.AskRequest;
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
    pickFilesAdapter filesAdapter;
    List<FileObject> fileObjectList = new ArrayList<>();
    AskRequest askRequest;
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

    public void action(String action) {
        liveData.setValue(new Mutable(action));
    }
    @Bindable
    public AskRequest getAskRequest() {
        return this.askRequest == null ? this.askRequest = new AskRequest() : this.askRequest;
    }
    @Bindable
    public VideosMainData getVideosMainData() {
        return this.videosMainData == null ? this.videosMainData = new VideosMainData() : this.videosMainData;
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
        return this.quizMainData == null ? this.quizMainData = new VideosMainData() : this.quizMainData;
    }

    public void ask() {
        getAskRequest().setLessonId(String.valueOf(getPassingObject().getId()));
        if (!TextUtils.isEmpty(getAskRequest().getMessage()))
            compositeDisposable.add(homeRepository.ask(askRequest, getFileObjectList()));
    }

    @Bindable
    public void setQuizMainData(VideosMainData quizMainData) {
        getLessonQuizzesAdapter().update(quizMainData.getVideoDataList());
        notifyChange(BR.lessonQuizzesAdapter);
        notifyChange(BR.quizMainData);
        this.quizMainData = quizMainData;
    }
    @Bindable
    public pickFilesAdapter getFilesAdapter() {
        return this.filesAdapter == null ? this.filesAdapter = new pickFilesAdapter() : this.filesAdapter;
    }

    public List<FileObject> getFileObjectList() {
        return fileObjectList;
    }
    @Bindable
    public VideosMainData getArticleMainData() {
        return this.articleMainData == null ? this.articleMainData = new VideosMainData() : this.articleMainData;
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
