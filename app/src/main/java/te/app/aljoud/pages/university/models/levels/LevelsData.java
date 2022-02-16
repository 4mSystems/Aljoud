package te.app.aljoud.pages.university.models.levels;

import com.google.gson.annotations.SerializedName;

public class LevelsData {

    @SerializedName("image")
    private String image;

    @SerializedName("college_id")
    private String collegeId;

    @SerializedName("show")
    private String show;

    @SerializedName("name")
    private String name;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("id")
    private int id;

    @SerializedName("sort")
    private String sort;
    @SerializedName("college_data")
    private CollageData college_data;

    public LevelsData(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public LevelsData() {
    }

    public String getImage() {
        return image;
    }

    public String getShow() {
        return show;
    }

    public String getName() {
        return name;
    }

    public CollageData getCollege_data() {
        return college_data;
    }

    public int getId() {
        return id;
    }

}