package te.app.aljoud.pages.home.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.util.List;
@Keep
public class CategoriesItem {

    @SerializedName("image")
    private String image;

    @SerializedName("id")
    private int id;
    @SerializedName("category_id")
    private int category_id;

    @SerializedName("name")
    private String title;
    @SerializedName("sub_categories")
    private List<CategoriesItem> subCategoriesItems;

    public String getImage() {
        return image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<CategoriesItem> getSubCategoriesItems() {
        return subCategoriesItems;
    }

    public int getCategory_id() {
        return category_id;
    }
}