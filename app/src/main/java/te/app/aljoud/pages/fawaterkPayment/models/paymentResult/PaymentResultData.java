package te.app.aljoud.pages.fawaterkPayment.models.paymentResult;

import com.google.gson.annotations.SerializedName;

public class PaymentResultData {

	@SerializedName("data")
	private PaymentResultData paymentResultData;

	@SerializedName("status")
	private String status;

	@SerializedName("invoice_id")
	private int invoiceId;

	@SerializedName("payment_data")
	private PaymentData paymentData;

	@SerializedName("invoice_key")
	private String invoiceKey;

	public PaymentResultData getPaymentResultData(){
		return paymentResultData;
	}

	public String getStatus(){
		return status;
	}

	public int getInvoiceId(){
		return invoiceId;
	}

	public PaymentData getPaymentData(){
		return paymentData;
	}

	public String getInvoiceKey(){
		return invoiceKey;
	}
}