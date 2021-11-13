package te.app.aljoud.pages.auth.models;

import android.text.TextUtils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ForgetPasswordRequest {
    @SerializedName("email")
    @Expose
    private String email;

    public ForgetPasswordRequest() {
    }

    public ForgetPasswordRequest(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public boolean isValid() {
        return (!TextUtils.isEmpty(email));
    }
}
