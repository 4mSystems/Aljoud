package te.app.aljoud.pages.home.models;

import com.google.gson.annotations.SerializedName;

public class SliderAdsItem{

	@SerializedName("image")
	private String image;

	@SerializedName("id")
	private int id;

	@SerializedName("type")
	private String type;

	@SerializedName("content")
	private String content;

	public String getImage(){
		return image;
	}

	public int getId(){
		return id;
	}

	public String getType(){
		return type;
	}

	public String getContent(){
		return content;
	}
}