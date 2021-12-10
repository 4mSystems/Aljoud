package te.app.aljoud.pages.chat.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.aljoud.pages.conversations.models.ConversationsData;

public class ChatMain extends ConversationsData {
    @SerializedName("childreninboxes")
    private List<ConversationsData> conversationsDataList;

    public List<ConversationsData> getConversationsDataList() {
        return conversationsDataList;
    }
}
