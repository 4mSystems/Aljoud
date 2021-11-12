package te.app.aljoud.model.govs;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GovsData {

    @SerializedName("image")
    private String image;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private int id;

    @SerializedName("govs")
    private List<GovsData> govsData;
    @SerializedName("cities")
    private List<GovsData> citiesData;

    public List<GovsData> getGovsData() {
        return govsData;
    }

    public List<GovsData> getCitiesData() {
        return citiesData;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}