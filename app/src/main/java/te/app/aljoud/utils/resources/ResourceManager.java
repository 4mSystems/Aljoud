package te.app.aljoud.utils.resources;

import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import te.app.aljoud.base.MyApplication;


public class ResourceManager {
    public static String getString(int id){
        return MyApplication.getInstance().getResources().getString(id);
    }

    public static int getColor(int id){
        return MyApplication.getInstance().getResources().getColor(id);
    }

    public static Drawable getDrawable(int id){
        return ContextCompat.getDrawable(MyApplication.getInstance(),id);
    }


    public static Float getDimens(int id){
        return MyApplication.getInstance().getResources().getDimension(id);
    }

}
