package te.app.aljoud.pages.request_to_buy.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

@Keep
public class RequestToBuy {
    @SerializedName("message")
    private String message = "";
    @SerializedName("course_id")
    private int courseId = 0;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCourseId() {
        return courseId;
    }
}
