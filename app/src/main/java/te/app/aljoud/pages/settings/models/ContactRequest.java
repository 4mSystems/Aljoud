package te.app.aljoud.pages.settings.models;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

public class ContactRequest {
    @SerializedName("name")
    private String name;
    @SerializedName("phone")
    private String phone;
    @SerializedName("address")
    private String address;
    @SerializedName("message")
    private String message;

    public boolean isValid() {
        return (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(phone)&& !TextUtils.isEmpty(address) && !TextUtils.isEmpty(message));
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
