package te.app.aljoud.pages.splash.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class SettingData {

	@SerializedName("reasons")
	private List<ReasonsItem> reasons;


	@SerializedName("banners")
	private List<BannersItem> banners;

	public List<ReasonsItem> getReasons(){
		return reasons;
	}

	public List<BannersItem> getBanners(){
		return banners;
	}
}