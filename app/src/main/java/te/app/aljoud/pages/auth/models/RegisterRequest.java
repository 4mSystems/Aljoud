package te.app.aljoud.pages.auth.models;

import androidx.databinding.ObservableField;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.validation.Validate;

public class RegisterRequest {
    @SerializedName("name")
    private String name;
    @SerializedName("phone")
    private String phone;
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;
    @SerializedName("old_password")
    @Expose
    private String oldPassword;
    @SerializedName("password_confirmation")
    @Expose
    private String confirmPassword;
    @SerializedName("fcm_token")
    private String token;
    @SerializedName("device_id")
    private String macAddress;
    private transient String user_image;
    public transient ObservableField<String> nameError = new ObservableField<>();
    public transient ObservableField<String> emailError = new ObservableField<>();
    public transient ObservableField<String> phoneError = new ObservableField<>();
    public transient ObservableField<String> passwordError = new ObservableField<>();
    public transient ObservableField<String> oldError = new ObservableField<>();
    public transient ObservableField<String> confirmPasswordError = new ObservableField<>();

    public RegisterRequest() {
    }

    public boolean isValid() {
        boolean valid = true;
        if (!Validate.isValid(name, Constants.FIELD)) {
            nameError.set(Validate.error);
            valid = false;
        }
        if (!Validate.isValid(email, Constants.EMAIL)) {
            emailError.set(Validate.error);
            valid = false;
        }
        if (!Validate.isValid(phone, Constants.FIELD)) {
            phoneError.set(Validate.error);
            valid = false;
        }
        if (!Validate.isValid(password, Constants.CHANGE_PASSWORD)) {
            passwordError.set(Validate.error);
            valid = false;
        }
        return valid;
    }


    public boolean isUpdateValid() {
        boolean valid = true;
        if (!Validate.isValid(name, Constants.FIELD)) {
            nameError.set(Validate.error);
            valid = false;
        }
        if (!Validate.isValid(phone, Constants.FIELD)) {
            phoneError.set(Validate.error);
            valid = false;
        }
        if (!Validate.isValid(email, Constants.EMAIL)) {
            emailError.set(Validate.error);
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

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        oldError.set(null);
        this.oldPassword = oldPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        emailError.set(null);
        this.email = email;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
}
