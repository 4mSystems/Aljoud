package te.app.aljoud.pages.auth.models;

import android.text.TextUtils;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class ConfirmCodeRequest {
    @SerializedName("email")
    private String email;
    @SerializedName("code")
    private String code;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isValid() {
        return (!TextUtils.isEmpty(code));
    }

}
