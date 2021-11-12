package te.app.aljoud.pages.splash.models;

import com.google.gson.annotations.SerializedName;

public class BannersItem{

	@SerializedName("img")
	private String img;

	@SerializedName("id")
	private int id;

	public String getImg(){
		return img;
	}

	public int getId(){
		return id;
	}
}