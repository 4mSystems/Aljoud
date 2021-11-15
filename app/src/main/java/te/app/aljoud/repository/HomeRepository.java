package te.app.aljoud.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.aljoud.connection.ConnectionHelper;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.courseDetails.models.CourseDetailsResponse;
import te.app.aljoud.pages.courseDetails.models.lessons.CourseLessonsResponse;
import te.app.aljoud.pages.courseDetails.models.videos.VideosResponse;
import te.app.aljoud.pages.home.models.home.HomeResponse;
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
                Constants.COURSE_DETAILS, false);
    }

    public Disposable getCourseLessons(int courseId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.COURSE_LESSONS.concat(String.valueOf(courseId)), new Object(), CourseLessonsResponse.class,
                Constants.COURSE_LESSONS, false);
    }

    public Disposable getLessonVideos(int lessonId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.LESSON_VIDEOS.concat(String.valueOf(lessonId)), new Object(), VideosResponse.class,
                Constants.LESSON_VIDEOS, false);
    }

}