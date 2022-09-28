package te.app.aljoud.pages.fawaterkPayment.models.check_out.installment;

import com.google.gson.annotations.SerializedName;

public class CartInstallmentData {

	@SerializedName("count")
	private String count;

	@SerializedName("installment_price")
	private String installmentPrice;

	@SerializedName("next_pay_date")
	private String nextPayDate;

	public String getCount() {
		return count;
	}

	public String getInstallmentPrice() {
		return installmentPrice;
	}

	public String getNextPayDate() {
		return nextPayDate;
	}
}