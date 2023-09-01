package te.app.aljoud.model;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class Links{

	@SerializedName("next")
	private String next;

	@SerializedName("last")
	private String last;

	@SerializedName("prev")
	private String prev;

	@SerializedName("first")
	private String first;

	public String getNext(){
		return next;
	}

	public String getLast(){
		return last;
	}

	public String getPrev(){
		return prev;
	}

	public String getFirst(){
		return first;
	}
}