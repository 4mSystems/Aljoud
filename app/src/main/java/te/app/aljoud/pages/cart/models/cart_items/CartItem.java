package te.app.aljoud.pages.cart.models.cart_items;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.text.DecimalFormat;

import te.app.aljoud.pages.university.models.course.Course;
@Keep
public class CartItem {

    @SerializedName("course_id")
    private String courseId;

    @SerializedName("total")
    private Double total;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("user_id")
    private String userId;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("course")
    private Course course;

    @SerializedName("id")
    private int id;

    public String getCourseId() {
        return courseId;
    }

    public Double getTotal() {
        if (total != 0.0) {
            DecimalFormat decimalFormat = new DecimalFormat("##.##");

            // Format the number
            String formattedNumber = decimalFormat.format(total);
            return Double.parseDouble(formattedNumber);
        }
        return total;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getUserId() {
        return userId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Course getCourse() {
        return course;
    }

    public int getId() {
        return id;
    }
}