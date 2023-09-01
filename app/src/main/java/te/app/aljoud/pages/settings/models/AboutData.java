package te.app.aljoud.pages.settings.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class AboutData {

	@SerializedName("whatsapp")
	private String whatsapp;

	@SerializedName("monkez_recieve")
	private String monkezRecieve;

	@SerializedName("monkez_name")
	private String monkezName;

	@SerializedName("facebook")
	private String facebook;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("youtube")
	private String youtube;

	@SerializedName("body")
	private String body;

	@SerializedName("deleted_at")
	private Object deletedAt;

	@SerializedName("monkez_pre_reserve")
	private String monkezPreReserve;

	@SerializedName("twitter")
	private String twitter;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("phone")
	private String phone;

	@SerializedName("monkez_system")
	private String monkezSystem;

	@SerializedName("id")
	private int id;

	@SerializedName("email")
	private String email;

	@SerializedName("monkez_phone")
	private String monkezPhone;

	public String getWhatsapp(){
		return whatsapp;
	}

	public String getMonkezRecieve(){
		return monkezRecieve;
	}

	public String getMonkezName(){
		return monkezName;
	}

	public String getFacebook(){
		return facebook;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public String getYoutube(){
		return youtube;
	}

	public String getBody(){
		return body;
	}

	public Object getDeletedAt(){
		return deletedAt;
	}

	public String getMonkezPreReserve(){
		return monkezPreReserve;
	}

	public String getTwitter(){
		return twitter;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public String getPhone(){
		return phone;
	}

	public String getMonkezSystem(){
		return monkezSystem;
	}

	public int getId(){
		return id;
	}

	public String getEmail(){
		return email;
	}

	public String getMonkezPhone(){
		return monkezPhone;
	}
}