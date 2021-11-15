package te.app.aljoud.pages.courseDetails.models.lessons;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;

public class CourseLessonsResponse extends StatusMessage {

    @SerializedName("data")
    private LessonMainData lessonMainData;

    public LessonMainData getLessonMainData() {
        return lessonMainData;
    }

}