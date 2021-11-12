package te.app.aljoud.pages.auth.models;

import android.text.TextUtils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ForgetPasswordRequest {
    @SerializedName("phone")
    @Expose
    private String phone;

    public ForgetPasswordRequest() {
    }

    public ForgetPasswordRequest(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;

    }

    public boolean isValid() {
        return (!TextUtils.isEmpty(phone));
    }
}
