package te.app.aljoud.pages.fawaterkPayment.models;

import com.google.gson.annotations.SerializedName;

public class PaymentMethod {

	@SerializedName("redirect")
	private String redirect;

	@SerializedName("paymentId")
	private int paymentId;

	@SerializedName("name_ar")
	private String nameAr;

	@SerializedName("logo")
	private String logo;

	@SerializedName("name_en")
	private String nameEn;

	public String getRedirect(){
		return redirect;
	}

	public int getPaymentId(){
		return paymentId;
	}

	public String getNameAr(){
		return nameAr;
	}

	public String getLogo(){
		return logo;
	}

	public String getNameEn(){
		return nameEn;
	}
}