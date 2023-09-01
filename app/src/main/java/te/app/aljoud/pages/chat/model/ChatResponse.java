package te.app.aljoud.pages.chat.model;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import te.app.aljoud.model.base.StatusMessage;

@Keep
public class ChatResponse extends StatusMessage {
    @SerializedName("data")
    @Expose
    private ChatMain chats;

    public ChatMain getChats() {
        return chats;
    }
}
