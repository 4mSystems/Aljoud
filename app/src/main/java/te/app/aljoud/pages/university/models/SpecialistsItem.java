package te.app.aljoud.pages.university. models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class SpecialistsItem{

	@SerializedName("image")
	private String image;

	@SerializedName("university_id")
	private String universityId;

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

	@SerializedName("id")
	private int id;

	@SerializedName("sort")
	private String sort;

	@SerializedName("name_en")
	private String nameEn;

	public String getImage(){
		return image;
	}

	public String getUniversityId(){
		return universityId;
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