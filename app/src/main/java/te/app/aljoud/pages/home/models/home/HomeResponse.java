package te.app.aljoud.pages.home.models.home;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;

public class HomeResponse extends StatusMessage {

    @SerializedName("data")
    private HomeMainData homeMainData;

    public HomeMainData getData() {
        return homeMainData;
    }
}