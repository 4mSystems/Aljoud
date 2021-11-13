package te.app.aljoud.pages.conversations.models;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.pages.auth.models.UserData;


public class ConversationsData {

    @SerializedName("user")
    private UserData receiver;

    @SerializedName("time")
    private String createdAt;
    @SerializedName("message")
    private String message;
    @SerializedName("image")
    private String image;

    @SerializedName("id")
    private int id;
    @SerializedName("unread_count")
    private int unreadCount;

    public UserData getReceiver() {
        return receiver;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getMessage() {
        return message;
    }

    public String getImage() {
        return image;
    }

    public int getId() {
        return id;
    }

    public int getUnreadCount() {
        return unreadCount;
    }

    @Override
    public String toString() {
        return "ConversationsData{" +
                "receiver=" + receiver +
                ", createdAt='" + createdAt + '\'' +
                ", message='" + message + '\'' +
                ", image='" + image + '\'' +
                ", id=" + id +
                ", unreadCount=" + unreadCount +
                '}';
    }
}