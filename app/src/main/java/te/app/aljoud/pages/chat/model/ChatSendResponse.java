package te.app.aljoud.pages.chat.model;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.conversations.models.ConversationsData;
@Keep
public class ChatSendResponse extends StatusMessage {

    @SerializedName("data")
    @Expose
    private ConversationsData data;

    public ConversationsData getData() {
        return data;
    }
}
