package te.app.aljoud.pages.courseDetails.models;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.university.models.course.Course;

public class CourseDetailsResponse extends StatusMessage {
    @SerializedName("data")
    private Course course;

    public Course getCourse() {
        return course;
    }
}
