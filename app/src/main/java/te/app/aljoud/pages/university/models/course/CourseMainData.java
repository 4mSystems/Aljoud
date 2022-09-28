package te.app.aljoud.pages.university.models.course;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import te.app.aljoud.model.PaginateMain;

public class CourseMainData extends PaginateMain {
    @SerializedName("data")
    private List<Course> courseList;

    public List<Course> getCourseList() {
        return courseList;
    }
}
