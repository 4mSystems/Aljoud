package te.app.aljoud.pages.conversations.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.aljoud.model.PaginateMain;
@Keep
public class ConversationsMain extends PaginateMain {
    @SerializedName("data")
    private List<ConversationsData> data;

    public List<ConversationsData> getData() {
        return data;
    }
}
