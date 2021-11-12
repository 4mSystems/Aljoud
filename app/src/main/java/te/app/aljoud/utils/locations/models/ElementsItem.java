package te.app.aljoud.utils.locations.models;

import com.google.gson.annotations.SerializedName;

public class ElementsItem{

	@SerializedName("duration")
	private Duration duration;

	@SerializedName("distance")
	private Distance distance;

	@SerializedName("status")
	private String status;

	public Duration getDuration(){
		return duration;
	}

	public Distance getDistance(){
		return distance;
	}

	public String getStatus(){
		return status;
	}
}