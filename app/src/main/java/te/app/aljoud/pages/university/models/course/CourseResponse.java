package te.app.aljoud.pages.university.models.course;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.aljoud.model.base.StatusMessage;

public class CourseResponse extends StatusMessage {

    @SerializedName("data")
    private List<Course> course;

    public List<Course> getCourse() {
        return course;
    }

}