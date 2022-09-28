package te.app.aljoud.pages.fawaterkPayment.models.paymentResult;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;

public class PaymentResultResponse extends StatusMessage {

    @SerializedName("data")
    private PaymentResultData paymentResultData;

    public PaymentResultData getPaymentResultData() {
        return paymentResultData;
    }

}