package te.app.aljoud.pages.courseDetails.models.videos;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
@Keep
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

    public boolean isImage() {
        try {
            URLConnection connection = new URL(getFile()).openConnection();
            String contentType = connection.getHeaderField("Content-Type");
            return contentType.startsWith("image/");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}