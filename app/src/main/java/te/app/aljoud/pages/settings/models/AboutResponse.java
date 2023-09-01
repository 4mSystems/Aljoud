package te.app.aljoud.pages.settings.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
@Keep
public class AboutResponse extends StatusMessage {

    @SerializedName("data")
    private AboutMain data;

    public AboutMain getData() {
        return data;
    }

}