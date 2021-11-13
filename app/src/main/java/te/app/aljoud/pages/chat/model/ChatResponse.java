package te.app.aljoud.pages.chat.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.conversations.models.ConversationsData;


public class ChatResponse extends StatusMessage {
    @SerializedName("data")
    @Expose
    private List<ConversationsData> chats;

    public List<ConversationsData> getChats() {
        return chats;
    }
}
