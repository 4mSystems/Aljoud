package te.app.aljoud.pages.fawaterkPayment.models.check_out;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;

public class ApplyDiscountResponse extends StatusMessage {
	@SerializedName("data")
	private DiscountData discountData;

	public DiscountData getDiscountData(){
		return discountData;
	}

}