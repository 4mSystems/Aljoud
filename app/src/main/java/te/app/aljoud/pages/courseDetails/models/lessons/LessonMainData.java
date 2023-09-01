package te.app.aljoud.pages.courseDetails.models.lessons;

import androidx.annotation.Keep;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.aljoud.pages.university.models.course.Course;
@Keep
public class LessonMainData {

	@SerializedName("course_data")
	private Course courseData;

	@SerializedName("lessons")
	private List<LessonsItem> lessons;

	public Course getCourseData(){
		return courseData;
	}

	public List<LessonsItem> getLessons(){
		return lessons;
	}
}