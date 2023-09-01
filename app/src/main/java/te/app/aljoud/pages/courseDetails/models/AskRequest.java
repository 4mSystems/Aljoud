package te.app.aljoud.pages.courseDetails.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class AskRequest {
    @SerializedName("message")
    private String message;
    @SerializedName("course_id")
    private String courseId;
    @SerializedName("lesson_id")
    private String lessonId;
    @SerializedName("service_id")
    private String serviceId;
    @SerializedName("parent_id")
    private String parentId;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
