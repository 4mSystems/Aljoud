package te.app.aljoud.pages.courseDetails.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class RateRequest {
    @SerializedName("rate")
    private String rate;
    @SerializedName("course_id")
    private int courseId;

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
