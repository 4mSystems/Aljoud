package te.app.aljoud.pages.courseDetails.models.videos;

import com.google.gson.annotations.SerializedName;

public class VideoData {

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("name_ar")
	private String nameAr;

	@SerializedName("show")
	private String show;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("time")
	private String time;

	@SerializedName("sort")
	private String sort;

	@SerializedName("lesson_id")
	private String lessonId;

	@SerializedName("url")
	private String url;

	@SerializedName("name_en")
	private String nameEn;
@SerializedName("name")
	private String name;

	public String getUpdatedAt(){
		return updatedAt;
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

	public int getId(){
		return id;
	}

	public String getTime(){
		return time;
	}

	public String getSort(){
		return sort;
	}

	public String getLessonId(){
		return lessonId;
	}

	public String getUrl(){
		return url;
	}

	public String getNameEn(){
		return nameEn;
	}

	public String getName() {
		return name;
	}
}