package te.app.aljoud.pages.home.models.home;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
@Keep
public class HomeResponse extends StatusMessage {

    @SerializedName("data")
    private HomeMainData homeMainData;

    public HomeMainData getData() {
        return homeMainData;
    }
}