package te.app.aljoud.pages.settings.models.services;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;

public class ServicesResponse extends StatusMessage {

	@SerializedName("data")
	private List<ServiceItem> data;

	public List<ServiceItem> getData(){
		return data;
	}

}