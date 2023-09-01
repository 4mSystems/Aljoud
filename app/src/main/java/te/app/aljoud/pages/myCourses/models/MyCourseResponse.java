package te.app.aljoud.pages.myCourses.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.university.models.course.CourseMainData;
@Keep
public class MyCourseResponse extends StatusMessage {
    @SerializedName("data")
    private CourseMainData courseMainData;

    public CourseMainData getCourseMainData() {
        return courseMainData;
    }
}
