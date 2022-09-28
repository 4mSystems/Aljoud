package te.app.aljoud.pages.myCourses.models;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.university.models.course.CourseMainData;

public class MyCourseResponse extends StatusMessage {
    @SerializedName("data")
    private CourseMainData courseMainData;

    public CourseMainData getCourseMainData() {
        return courseMainData;
    }
}
