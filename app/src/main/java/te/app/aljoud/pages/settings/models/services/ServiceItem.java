package te.app.aljoud.pages.settings.models.services;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class ServiceItem {
	
	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

}