package te.app.aljoud.pages.installment.models;

import com.google.gson.annotations.SerializedName;

public class InstallmentData {

    @SerializedName("course_id")
    private int courseId;

    @SerializedName("amount")
    private double amount;

    @SerializedName("course_name")
    private String courseName;

    @SerializedName("collected_date")
    private String collectedDate;

    @SerializedName("id")
    private int id;

    @SerializedName("status")
    private String status;

    public int getCourseId() {
        return courseId;
    }

    public double getAmount() {
        return amount;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCollectedDate() {
        return collectedDate;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}