package te.app.aljoud.pages.auth.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class UserData {

    @SerializedName("image")
    private String image;

    @SerializedName("api_token")
    private String jwt;

    @SerializedName("type")
    private String type;

    @SerializedName("phone")
    private String phone;

    @SerializedName("mac_address")
    private String macAddress;

    @SerializedName("name")
    private String name;
    @SerializedName("job_title")
    private String jobTitle;
    @SerializedName("bio")
    private String bio;

    @SerializedName("id")
    private int id;

    @SerializedName("email")
    private String email;

    @SerializedName("qr_image")
    private String qr_image;


    public String getImage() {
        return image;
    }

    public String getJwt() {
        return jwt;
    }

    public String getType() {
        return type;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getQr_image() {
        return qr_image;
    }

    public String getBio() {
        return bio;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}