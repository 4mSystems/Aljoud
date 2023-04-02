package te.app.aljoud.repository;


import android.text.TextUtils;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.aljoud.connection.ConnectionHelper;
import te.app.aljoud.connection.FileObject;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.courseDetails.models.AskRequest;
import te.app.aljoud.pages.courseDetails.models.CourseDetailsResponse;
import te.app.aljoud.pages.courseDetails.models.RateRequest;
import te.app.aljoud.pages.courseDetails.models.lessons.CourseLessonsResponse;
import te.app.aljoud.pages.courseDetails.models.videos.VideosResponse;
import te.app.aljoud.pages.exams.models.ExamsResponse;
import te.app.aljoud.pages.home.models.home.HomeResponse;
import te.app.aljoud.pages.myCourses.models.MyCourseResponse;
import te.app.aljoud.pages.offers.models.OffersResponse;
import te.app.aljoud.pages.university.models.UniversityDetailsResponse;
import te.app.aljoud.pages.university.models.course.CourseResponse;
import te.app.aljoud.pages.university.models.levels.LevelsResponse;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.URLS;

@Singleton
public class HomeRepository extends BaseRepository {
    @Inject
    public ConnectionHelper connectionHelper;
    protected MutableLiveData<Mutable> liveData;

    @Inject
    public HomeRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable universities(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.HOME + page, new Object(), HomeResponse.class,
                Constants.HOME, showProgress);
    }

    public Disposable universityDetails(int id) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.UNIVERSITY_DETAILS + id, new Object(), UniversityDetailsResponse.class,
                Constants.DETAILS, true);
    }

    public Disposable levels(int id) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.LEVELS + id, new Object(), LevelsResponse.class,
                Constants.LEVELS, false);
    }


    public Disposable levelCourses(int levelId, int collegeId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.LEVEL_COURSES.concat(levelId == 0 ? "" : String.valueOf(levelId)) + "&college_id=" + collegeId, new Object(), CourseResponse.class,
                Constants.LEVEL_COURSES, false);
    }

    public Disposable courseDetails(int courseId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.COURSE_DETAILS.concat(String.valueOf(courseId)), new Object(), CourseDetailsResponse.class,
                Constants.COURSE_DETAILS, true);
    }

    public Disposable getCourseLessons(int courseId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.COURSE_LESSONS.concat(String.valueOf(courseId)), new Object(), CourseLessonsResponse.class,
                Constants.COURSE_LESSONS, true);
    }

    public Disposable getLessonVideos(int lessonId, int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.LESSON_VIDEOS.concat(String.valueOf(lessonId)), new Object(), VideosResponse.class,
                Constants.LESSON_VIDEOS, showProgress);
    }

    public Disposable getLessonQuizzes(int lessonId, int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.LESSON_QUIZZES.concat(String.valueOf(lessonId)), new Object(), VideosResponse.class,
                Constants.LESSON_QUIZZES, showProgress);
    }

    public Disposable getLessonArticles(int lessonId, int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.LESSON_ARTICLES.concat(String.valueOf(lessonId)), new Object(), VideosResponse.class,
                Constants.LESSON_ARTICLES, showProgress);
    }

    public Disposable rateCourse(RateRequest rateRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.RATE_REQUEST, rateRequest, StatusMessage.class,
                Constants.RATE_APP, true);
    }

    public Disposable ask(AskRequest askRequest, List<FileObject> fileObjectList) {
        return connectionHelper.requestApi(!TextUtils.isEmpty(askRequest.getCourseId()) ? URLS.ASK_COURSE : URLS.ASK_LESSON, askRequest, fileObjectList, StatusMessage.class,
                Constants.DIALOG, true);
    }

    public Disposable offers(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.OFFERS + page, new Object(), OffersResponse.class,
                Constants.OFFERS, showProgress);
    }

    public Disposable buyOffer(int offerId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.BUY_OFFER + offerId, new Object(), StatusMessage.class,
                Constants.BUY_OFFER, true);
    }

    public Disposable buyCourse(int courseId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.BUY_COURSE + courseId, new Object(), StatusMessage.class,
                Constants.BUY_COURSE, true);
    }

    public Disposable myCourses(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.MY_COURSES + page, new Object(), MyCourseResponse.class,
                Constants.MY_COURSES, showProgress);
    }

    public Disposable exam(int id, String url) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, url + id, new Object(), ExamsResponse.class,
                Constants.EXAMS, true);
    }

}