package te.app.aljoud.pages.conversations.models;

import android.os.Build;
import android.text.Html;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.aljoud.pages.auth.models.UserData;
import te.app.aljoud.pages.courseDetails.models.videos.VideoData;

@Keep
public class ConversationsData {

    @SerializedName("receiver")
    private UserData receiver;

    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("message")
    private String message;

    @SerializedName("id")
    private int id;
    @SerializedName("sender_id")
    private String sender_id;
    @SerializedName("receiver_id")
    private String receiver_id;
    @SerializedName("is_read")
    private int is_read;
    @SerializedName("is_lock")
    private int is_lock;
    @SerializedName("files")
    private List<VideoData> videoData;
    @SerializedName("sender")
    private UserData sender;

    public UserData getSender() {
        return sender;
    }

    public UserData getReceiver() {
        return receiver;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getMessage() {
        if (message != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                return Html.fromHtml(message, Html.FROM_HTML_MODE_COMPACT).toString();
            } else
                return Html.fromHtml(message).toString();
        }
        return "";
    }

    public int getId() {
        return id;
    }

    public String getSender_id() {
        return sender_id;
    }

    public String getReceiver_id() {
        return receiver_id;
    }

    public int getIs_read() {
        return is_read;
    }

    public int getIs_lock() {
        return is_lock;
    }

    public List<VideoData> getVideoData() {
        return videoData;
    }
}