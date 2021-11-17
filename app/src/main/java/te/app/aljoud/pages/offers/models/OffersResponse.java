package te.app.aljoud.pages.offers.models;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;

public class OffersResponse extends StatusMessage {

	@SerializedName("data")
	private OffersMainData offersMainData;

	public OffersMainData getData(){
		return offersMainData;
	}

}