package te.app.aljoud.pages.university.models.course;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.aljoud.model.base.StatusMessage;
@Keep
public class CourseResponse extends StatusMessage {

    @SerializedName("data")
    private List<Course> course;

    public List<Course> getCourse() {
        return course;
    }

}