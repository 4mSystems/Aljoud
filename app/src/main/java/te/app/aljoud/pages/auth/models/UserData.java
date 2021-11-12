package te.app.aljoud.pages.auth.models;

import com.google.gson.annotations.SerializedName;

public class UserData {

	@SerializedName("suspend")
	private String suspend;

	@SerializedName("image")
	private String image;

	@SerializedName("address")
	private String address;

	@SerializedName("lng")
	private String lng;

	@SerializedName("jwt")
	private String jwt;

	@SerializedName("active")
	private String active;

	@SerializedName("type")
	private String type;

	@SerializedName("token")
	private String token;

	@SerializedName("phone")
	private String phone;

	@SerializedName("mac_address")
	private String macAddress;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("email")
	private Object email;

	@SerializedName("lat")
	private String lat;

	public String getSuspend(){
		return suspend;
	}

	public String getImage(){
		return image;
	}

	public String getAddress(){
		return address;
	}

	public String getLng(){
		return lng;
	}

	public String getJwt(){
		return jwt;
	}

	public String getActive(){
		return active;
	}

	public String getType(){
		return type;
	}

	public String getToken(){
		return token;
	}

	public String getPhone(){
		return phone;
	}

	public String getMacAddress(){
		return macAddress;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public Object getEmail(){
		return email;
	}

	public String getLat(){
		return lat;
	}
}