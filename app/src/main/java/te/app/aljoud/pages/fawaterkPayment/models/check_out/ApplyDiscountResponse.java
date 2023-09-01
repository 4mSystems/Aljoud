package te.app.aljoud.pages.fawaterkPayment.models.check_out;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
@Keep
public class ApplyDiscountResponse extends StatusMessage {
	@SerializedName("data")
	private DiscountData discountData;

	public DiscountData getDiscountData(){
		return discountData;
	}

}