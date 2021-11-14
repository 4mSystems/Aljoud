package te.app.aljoud.pages.home.models.home;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HomeMainData {
    @SerializedName("data")
    private List<University> universityList;
//	@SerializedName("my_courses")
//	private Object myCourses;
//
//	@SerializedName("universities")
//	private Universities universities;
//
//	public Object getMyCourses(){
//		return myCourses;
//	}
//
//	public Universities getUniversities(){
//		return universities;
//	}

    public List<University> getUniversityList() {
        return universityList;
    }
}