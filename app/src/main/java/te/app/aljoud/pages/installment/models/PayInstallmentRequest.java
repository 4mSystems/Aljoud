package te.app.aljoud.pages.installment.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class PayInstallmentRequest {
    @SerializedName("installment_ids")
    private String installmentIds;
    @SerializedName("payment_method")
    private int paymentMethod;
    @SerializedName("status")
    private String status;

    public String getInstallmentIds() {
        return installmentIds;
    }

    public void setInstallmentIds(String installmentIds) {
        this.installmentIds = installmentIds;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
