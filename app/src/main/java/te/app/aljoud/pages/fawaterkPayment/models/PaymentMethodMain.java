package te.app.aljoud.pages.fawaterkPayment.models;

import androidx.annotation.Keep;

import java.util.List;
import com.google.gson.annotations.SerializedName;
@Keep
public class PaymentMethodMain {

	@SerializedName("data")
	private List<PaymentMethod> paymentMethodList;

	@SerializedName("status")
	private String status;

	public List<PaymentMethod> getPaymentMethodList(){
		return paymentMethodList;
	}

	public String getStatus(){
		return status;
	}
}