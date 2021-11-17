package te.app.aljoud.pages.courseDetails.models;

import com.google.gson.annotations.SerializedName;

public class AskRequest {
    @SerializedName("message")
    private String message;
    @SerializedName("course_id")
    private String courseId;
    @SerializedName("lesson_id")
    private String lessonId;

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
}
