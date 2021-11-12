package te.app.aljoud.utils.session;

import android.content.Context;
import android.content.SharedPreferences;

import te.app.aljoud.base.MyApplication;


public class SharedPreferenceHelper {

    //here you can find shared preference operations like get saved data for user

    public static SharedPreferences getSharedPreferenceInstance() {
        return MyApplication.getInstance().getSharedPreferences("savedData", Context.MODE_PRIVATE);
    }

    public static String getKey(String key) {
        return MyApplication.getInstance().getSharedPreferences("shared", Context.MODE_PRIVATE).getString(key, "");
    }

    public static void saveKey(String key,String value){
        MyApplication.getInstance().getSharedPreferences("shared", Context.MODE_PRIVATE).edit().putString(key, value).apply();
    }
}
