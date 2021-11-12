package te.app.aljoud.pages.auth.models;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;

public class UsersResponse extends StatusMessage {

    @SerializedName("data")
    private UserData userData;

    public UserData getUserData() {
        return userData;
    }

}