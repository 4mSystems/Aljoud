package te.app.aljoud.pages.university.models.course;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.pages.auth.models.UserData;

public class Course {

    @SerializedName("image")
    private String image;

    @SerializedName("level_id")
    private String levelId;

    @SerializedName("show")
    private String show;

    @SerializedName("discount")
    private String discount;

    @SerializedName("content")
    private List<Object> content;

    @SerializedName("Count_articles")
    private String countArticles;

    @SerializedName("desc_ar")
    private String descAr;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("instructor")
    private UserData instructor;

    @SerializedName("Count_videos_time")
    private String countVideosTime;

    @SerializedName("rate")
    private int rate;

    @SerializedName("price")
    private String price;

    @SerializedName("instructor_id")
    private Object instructorId;

    @SerializedName("name")
    private String name;

    @SerializedName("currency")
    private Currency currency;

    @SerializedName("id")
    private int id;

    @SerializedName("desc_en")
    private String descEn;

    @SerializedName("Count_quizzes")
    private String countQuizzes;

    @SerializedName("currency_id")
    private String currencyId;

    @SerializedName("name_en")
    private String nameEn;

    @SerializedName("desc")
    private String desc;
    @SerializedName("my_course")
    private boolean myCourse;

    public String getImage() {
        return image;
    }

    public String getLevelId() {
        return levelId;
    }

    public String getShow() {
        return show;
    }

    public String getDiscount() {
        if (discount != null && !discount.equals("0.00")) {
            double amount = Double.parseDouble(price) * (Double.parseDouble(discount) / 100);
            return discount = String.valueOf(Double.parseDouble(price) - amount);
        }
        return discount;
    }

    public List<Object> getContent() {
        return content;
    }

    public String getCountArticles() {
        return countArticles;
    }

    public String getDescAr() {
        return descAr;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public UserData getInstructor() {
        return instructor;
    }

    public String getCountVideosTime() {
        return countVideosTime;
    }

    public int getRate() {
        return rate;
    }

    public String getPrice() {
        return price;
    }

    public Object getInstructorId() {
        return instructorId;
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

    public String getCountQuizzes() {
        return countQuizzes;
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

    public boolean isMyCourse() {
        return myCourse;
    }

    public void setMyCourse(boolean myCourse) {
        this.myCourse = myCourse;
    }
}