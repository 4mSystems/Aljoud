package te.app.aljoud.pages.conversations.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;

@Keep
public class ConversationsResponse extends StatusMessage {
    @SerializedName("data")
    private ConversationsMain conversationsMain;

    public ConversationsMain getConversationsMain() {
        return conversationsMain;
    }
}