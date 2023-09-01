package te.app.aljoud.pages.settings.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class News {
    @SerializedName("id")
    private int id;
    @SerializedName("body")
    private String body;

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }
}
