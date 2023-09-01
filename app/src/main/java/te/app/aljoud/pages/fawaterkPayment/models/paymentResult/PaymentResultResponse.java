package te.app.aljoud.pages.fawaterkPayment.models.paymentResult;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
@Keep
public class PaymentResultResponse extends StatusMessage {

    @SerializedName("data")
    private PaymentResultData paymentResultData;

    public PaymentResultData getPaymentResultData() {
        return paymentResultData;
    }

}