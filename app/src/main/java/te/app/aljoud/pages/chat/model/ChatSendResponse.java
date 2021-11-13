package te.app.aljoud.pages.chat.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.conversations.models.ConversationsData;

public class ChatSendResponse extends StatusMessage {

    @SerializedName("data")
    @Expose
    private ConversationsData data;

    public ConversationsData getData() {
        return data;
    }
}
