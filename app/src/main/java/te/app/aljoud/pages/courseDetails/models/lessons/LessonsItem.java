package te.app.aljoud.pages.courseDetails.models.lessons;

import com.google.gson.annotations.SerializedName;

public class LessonsItem{

	@SerializedName("image")
	private String image;

	@SerializedName("course_id")
	private String courseId;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("name_ar")
	private String nameAr;

	@SerializedName("show")
	private String show;

	@SerializedName("name")
	private String name;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("is_lock")
	private boolean isLock;

	@SerializedName("id")
	private int id;

	@SerializedName("sort")
	private String sort;

	@SerializedName("name_en")
	private String nameEn;

	public String getImage(){
		return image;
	}

	public String getCourseId(){
		return courseId;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getNameAr(){
		return nameAr;
	}

	public String getShow(){
		return show;
	}

	public String getName(){
		return name;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public boolean isIsLock(){
		return isLock;
	}

	public int getId(){
		return id;
	}

	public String getSort(){
		return sort;
	}

	public String getNameEn(){
		return nameEn;
	}
}