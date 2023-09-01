package te.app.aljoud.pages.offers.models;

import androidx.annotation.Keep;

import java.util.List;
import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
@Keep
public class OffersMainData extends StatusMessage {

	@SerializedName("data")
	private List<OfferItem> offerItemList;

	public List<OfferItem> getOfferItemList(){
		return offerItemList;
	}

}