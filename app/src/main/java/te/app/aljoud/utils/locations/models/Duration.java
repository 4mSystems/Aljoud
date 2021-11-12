package te.app.aljoud.utils.locations.models;

import com.google.gson.annotations.SerializedName;

public class Duration{

	@SerializedName("text")
	private String text;

	@SerializedName("value")
	private long value;

	public String getText(){
		return text;
	}

	public long getValue(){
		return value;
	}
}