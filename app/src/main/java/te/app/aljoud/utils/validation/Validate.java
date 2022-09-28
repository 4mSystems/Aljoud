package te.app.aljoud.utils.validation;

import android.text.TextUtils;
import android.util.Patterns;
import java.util.regex.Pattern;
import te.app.aljoud.R;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.resources.ResourceManager;

public class Validate {
    public static String error;

    public static boolean isValid(String data, String type) {
        if (isValid(data)) {
            if (type.equals(Constants.EMAIL) && !Validate.isMail(data)) {
                error = ResourceManager.getString(R.string.invalidEmail);
                return false;
            } else if (type.equals(Constants.CHANGE_PASSWORD) && !Validate.isPassword(data)) {
                error = ResourceManager.getString(R.string.invalidPassword);
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isValid(String data) {
        if (TextUtils.isEmpty(data)) {
            error = ResourceManager.getString(R.string.fieldRequired);
            return false;
        }
        return true;
    }

    public static boolean isMatchPassword(String password, String passwordConfirm) {
        if (isValid(password) && isValid(passwordConfirm)) {
            if (!password.equals(passwordConfirm)) {
                error = ResourceManager.getString(R.string.password_not_match);
                return false;
            }
            return true;
        }
        return false;
    }



    public static Boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static Boolean isPassword(CharSequence str) {
        Pattern PASSWORD_PATTERN =
                Pattern.compile("^" +
                        "(?=.*[0-9])" +         //at least 1 digit
                        //"(?=.*[a-z])" +         //at least 1 lower case letter
                        //"(?=.*[A-Z])" +         //at least 1 upper case letter
                        "(?=.*[a-zA-Z])" +      //any letter
//                        "(?=.*[@#$%^&+=])" +    //at least 1 special character
                        "(?=\\S+$)" +           //no white spaces
                        ".{8,}" +               //at least 4 characters
                        "$");
        return str != null && PASSWORD_PATTERN.matcher(str).matches();
    }
    public static Boolean isMail(CharSequence str) {
        return str != null && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

}
