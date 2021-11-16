package te.app.aljoud.pages.courseDetails.models.videos;

import com.google.gson.annotations.SerializedName;

public class VideoData {

    @SerializedName("id")
    private int id;

    @SerializedName("lesson_id")
    private String lessonId;

    @SerializedName("url")
    private String url;
    @SerializedName("file")
    private String file;

    @SerializedName("name")
    private String name;

    public int getId() {
        return id;
    }

    public String getLessonId() {
        return lessonId;
    }

    public String getUrl() {
        return url;
    }

    public String getFile() {
        return file;
    }

    public String getName() {
        return name;
    }
}