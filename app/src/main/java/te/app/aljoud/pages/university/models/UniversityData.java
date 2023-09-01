package te.app.aljoud.pages.university. models;

import androidx.annotation.Keep;

import java.util.List;
import com.google.gson.annotations.SerializedName;
@Keep
public class UniversityData {

	@SerializedName("image")
	private String image;

	@SerializedName("courses")
	private int courses;

	@SerializedName("name_ar")
	private String nameAr;

	@SerializedName("show")
	private String show;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("students")
	private int students;

	@SerializedName("show_data")
	private String showData;

	@SerializedName("sort")
	private String sort;

	@SerializedName("specialists")
	private List<SpecialistsItem> specialists;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("name")
	private String name;

	@SerializedName("spiecialest")
	private int spiecialest;

	@SerializedName("id")
	private int id;

	@SerializedName("name_en")
	private String nameEn;

	@SerializedName("lessons")
	private int lessons;

	public String getImage(){
		return image;
	}

	public int getCourses(){
		return courses;
	}

	public String getNameAr(){
		return nameAr;
	}

	public String getShow(){
		return show;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public int getStudents(){
		return students;
	}

	public String getShowData(){
		return showData;
	}

	public String getSort(){
		return sort;
	}

	public List<SpecialistsItem> getSpecialists(){
		return specialists;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getName(){
		return name;
	}

	public int getSpiecialest(){
		return spiecialest;
	}

	public int getId(){
		return id;
	}

	public String getNameEn(){
		return nameEn;
	}

	public int getLessons(){
		return lessons;
	}
}