package te.app.aljoud.utils.validation;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import te.app.aljoud.R;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.resources.ResourceManager;

public class Validate {
    public static String error;

    public static boolean isValid(String data, String type) {
        if (isValid(data)) {
            if (type.equals(Constants.EMAIL) && !Validate.isMail(data)) {
//                error = ResourceManager.getString(R.string.invalidEmail);
                return false;
            }
            if (type.equals(Constants.CHANGE_PASSWORD) && !Validate.isPassword(data)) {
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

    public static boolean isPhoneValid(String phoneNo) {
        String expression = "^[0-9-+]{9,15}$";
        CharSequence inputStr = phoneNo;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        return (matcher.matches()) ? true : false;
    }

    private static final String TAG = "Validate";

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


    public static Boolean isEmpty(String str) {
        return str == null || str.isEmpty() ? true : false;
    }

    public static Boolean isAvLen(String str, int from, int to) {
        return str.length() > from && str.length() < to ? true : false;
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
        return str == null ? false : PASSWORD_PATTERN.matcher(str).matches();
    }

    public static Boolean isEqual(String str1, String str2) {
        return str1.equals(str2) ? true : false;
    }


    //Different between URL and NetworkURL http://stackoverflow.com/questions/23866700/difference-between-isnetworkurl-and-isvalidurl
    public static Boolean isUrl(String url) {
        return URLUtil.isValidUrl(url);
    }

    public static Boolean isNetworkUrl(String url) {
        return URLUtil.isNetworkUrl(url);
    }

    public static Boolean isMail(CharSequence str) {

        return str == null ? false : android.util.Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public static Boolean isIPAddress(CharSequence str) {

        return str == null ? false : android.util.Patterns.IP_ADDRESS.matcher(str).matches();
    }

    public static Boolean isPhone(CharSequence str) {
//        Pattern phone_pattern;
//        if (phoneExpression == 1) {
//            phone_pattern =
//                    Pattern.compile("(201)[0-9]{9}");
//            return str == null ? false : phone_pattern.matcher(str).matches();
//        } else
        return str == null ? false : Patterns.PHONE.matcher(str).matches();
    }

    public static int batteryLevel(Context context) {
        Intent intent = context.registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
        int scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, 100);
        int percent = (level * 100) / scale;

        return percent;
    }

}
