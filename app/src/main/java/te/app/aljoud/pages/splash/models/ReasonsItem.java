package te.app.aljoud.pages.splash.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class ReasonsItem {

    @SerializedName("id")
    private int id;

    @SerializedName("text")
    private String text;
    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}