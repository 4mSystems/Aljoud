package te.app.aljoud.pages.university.models.levels;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.pages.home.models.home.University;
@Keep
public class CollageData {
    @SerializedName("name")
    private String name;
    @SerializedName("university")
    private University university;

    public String getName() {
        return name;
    }

    public University getUniversity() {
        return university;
    }
}
