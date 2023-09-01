package te.app.aljoud.pages.auth.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
@Keep
public class UsersResponse extends StatusMessage {

    @SerializedName("data")
    private UserData userData;

    public UserData getUserData() {
        return userData;
    }

}