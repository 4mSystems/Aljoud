package te.app.aljoud.pages.home.models.home;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.aljoud.model.PaginateMain;

public class HomeMainData extends PaginateMain {
    @SerializedName("data")
    private List<University> universityList;

    public List<University> getUniversityList() {
        return universityList;
    }
}