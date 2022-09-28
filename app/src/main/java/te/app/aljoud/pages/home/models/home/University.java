package te.app.aljoud.pages.home.models.home;

import com.google.gson.annotations.SerializedName;

public class University {

	@SerializedName("image")
	private String image;

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

	@SerializedName("show_data")
	private String showData;

	@SerializedName("id")
	private int id;

	@SerializedName("sort")
	private String sort;

	@SerializedName("name_en")
	private String nameEn;

	public String getImage(){
		return image;
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

	public String getShowData(){
		return showData;
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