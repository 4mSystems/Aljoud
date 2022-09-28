package te.app.aljoud.pages.splash.models;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;

public class SettingsResponse extends StatusMessage {

    @SerializedName("data")
    private SettingData data;

    public SettingData getData() {
        return data;
    }

}