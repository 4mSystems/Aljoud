package te.app.aljoud.pages.home.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.aljoud.model.base.StatusMessage;

public class HomeResponse extends StatusMessage {

    @SerializedName("data")
    private List<CategoriesItem> categories;

    public List<CategoriesItem> getCategories(){
        return categories;
    }


}