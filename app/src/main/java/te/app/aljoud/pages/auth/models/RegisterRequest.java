package te.app.aljoud.pages.auth.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.validation.Validate;

public class RegisterRequest {
    @SerializedName("name")
    private String name;
    @SerializedName("lat")
    private String lat;
    @SerializedName("lng")
    private String lng;
    @SerializedName("phone")
    private String phone;
    @SerializedName("address")
    private String address;
    @SerializedName("password")
    private String password;
    @SerializedName("old_password")
    @Expose
    private String oldPassword;
    private String confirmPassword;
    @SerializedName("token")
    private String token;
    @SerializedName("type")
    private String type = "1";
    @SerializedName("mac_address")
    private String macAddress;

    private transient String file;
    private transient String location;
    public transient ObservableField<String> nameError = new ObservableField<>();
    public transient ObservableField<String> phoneError = new ObservableField<>();
    public transient ObservableField<String> passwordError = new ObservableField<>();
    public transient ObservableField<String> oldError = new ObservableField<>();
    public transient ObservableField<String> confirmPasswordError = new ObservableField<>();
    public transient ObservableField<String> latError = new ObservableField<>();
    public transient ObservableField<String> addressError = new ObservableField<>();
    public transient ObservableField<String> fileError = new ObservableField<>();

    public RegisterRequest() {
    }

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(name, Constants.FIELD)) {
            nameError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(phone, Constants.FIELD)) {
            phoneError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(lat, Constants.FIELD)) {
            latError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(address, Constants.FIELD)) {
            addressError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(password, Constants.CHANGE_PASSWORD)) {
            passwordError.set(Validate.error);
            valid = false;
        }
        return valid;
//        else if (type.equals("2")) {
//            if (!Validate.isValid(file, Constants.FIELD)) {
//                fileError.set(Validate.error);
//                valid = false;
//            } else if (!Validate.isValid(special, Constants.FIELD)) {
//                specialError.set(Validate.error);
//                valid = false;
//            }
//        }
    }


    public boolean isUpdateValid() {
        boolean valid = true;
        if (!Validate.isValid(name, Constants.FIELD)) {
            nameError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(phone, Constants.EMAIL)) {
            phoneError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public boolean isPasswordsValid() {
        boolean valid = true;
        if (!Validate.isValid(password, Constants.CHANGE_PASSWORD)) {
            passwordError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(confirmPassword, Constants.CHANGE_PASSWORD)) {
            confirmPasswordError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public boolean isUpdatePasswordsValid() {
        boolean valid = true;
        if (!Validate.isValid(oldPassword, Constants.CHANGE_PASSWORD)) {
            oldError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(password, Constants.CHANGE_PASSWORD)) {
            passwordError.set(Validate.error);
            valid = false;
        } else if (!Validate.isValid(confirmPassword, Constants.CHANGE_PASSWORD)) {
            confirmPasswordError.set(Validate.error);
            valid = false;
        }
        return valid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        nameError.set(null);
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        phoneError.set(null);
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        passwordError.set(null);
        this.password = password;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        confirmPasswordError.set(null);
        this.confirmPassword = confirmPassword;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        oldError.set(null);
        this.oldPassword = oldPassword;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        fileError.set(null);
        this.file = file;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        latError.set(null);
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        addressError.set(null);
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
}
