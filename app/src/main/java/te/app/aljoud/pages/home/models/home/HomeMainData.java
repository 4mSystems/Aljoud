package te.app.aljoud.pages.home.models.home;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.aljoud.model.PaginateMain;

@Keep
public class HomeMainData extends PaginateMain {
    @SerializedName("data")
    private List<University> universityList;

    public List<University> getUniversityList() {
        return universityList;
    }
}