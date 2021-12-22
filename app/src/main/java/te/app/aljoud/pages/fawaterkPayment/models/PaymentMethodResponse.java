package te.app.aljoud.pages.fawaterkPayment.models;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;

public class PaymentMethodResponse extends StatusMessage {

	@SerializedName("data")
	private PaymentMethodMain paymentMethodMain;

	public PaymentMethodMain getPaymentMethodMain(){
		return paymentMethodMain;
	}

}