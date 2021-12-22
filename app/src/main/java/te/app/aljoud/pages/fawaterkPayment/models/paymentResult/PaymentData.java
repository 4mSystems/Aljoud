package te.app.aljoud.pages.fawaterkPayment.models.paymentResult;

import com.google.gson.annotations.SerializedName;

public class PaymentData{

	@SerializedName("expireDate")
	private String expireDate;

	@SerializedName("fawryCode")
	private String fawryCode;

	public String getExpireDate(){
		return expireDate;
	}

	public String getFawryCode(){
		return fawryCode;
	}
}