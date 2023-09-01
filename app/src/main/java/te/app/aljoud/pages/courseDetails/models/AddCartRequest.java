package te.app.aljoud.pages.courseDetails.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class AddCartRequest {
    @SerializedName("course_id")
    private int courseId;

    public AddCartRequest(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
