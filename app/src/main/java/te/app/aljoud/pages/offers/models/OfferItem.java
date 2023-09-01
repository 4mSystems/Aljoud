package te.app.aljoud.pages.offers.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.aljoud.pages.university.models.course.Course;
import te.app.aljoud.pages.university.models.course.Currency;
import te.app.aljoud.pages.university.models.levels.LevelsData;
@Keep
public class OfferItem {

    @SerializedName("level")
    private LevelsData level;

    @SerializedName("name_ar")
    private String nameAr;

    @SerializedName("level_id")
    private String levelId;

    @SerializedName("show")
    private String show;

    @SerializedName("sort")
    private String sort;

    @SerializedName("desc_ar")
    private String descAr;

    @SerializedName("price")
    private String price;

    @SerializedName("name")
    private String name;

    @SerializedName("currency")
    private Currency currency;

    @SerializedName("id")
    private int id;

    @SerializedName("desc_en")
    private String descEn;

    @SerializedName("currency_id")
    private String currencyId;

    @SerializedName("name_en")
    private String nameEn;

    @SerializedName("desc")
    private String desc;
    @SerializedName("courses")
    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public LevelsData getLevel() {
        return level;
    }

    public String getNameAr() {
        return nameAr;
    }

    public String getLevelId() {
        return levelId;
    }

    public String getShow() {
        return show;
    }

    public String getSort() {
        return sort;
    }

    public String getDescAr() {
        return descAr;
    }

    public String getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getId() {
        return id;
    }

    public String getDescEn() {
        return descEn;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getDesc() {
        return desc;
    }
}