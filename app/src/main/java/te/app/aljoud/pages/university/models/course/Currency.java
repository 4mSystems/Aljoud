package te.app.aljoud.pages.university.models.course;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class Currency{

	@SerializedName("code")
	private String code;

	@SerializedName("name_ar")
	private String nameAr;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("name_en")
	private String nameEn;

	public String getCode(){
		return code;
	}

	public String getNameAr(){
		return nameAr;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String getNameEn(){
		return nameEn;
	}
}