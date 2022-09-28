package te.app.aljoud.pages.chat.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import te.app.aljoud.model.base.StatusMessage;


public class ChatResponse extends StatusMessage {
    @SerializedName("data")
    @Expose
    private ChatMain chats;

    public ChatMain getChats() {
        return chats;
    }
}
