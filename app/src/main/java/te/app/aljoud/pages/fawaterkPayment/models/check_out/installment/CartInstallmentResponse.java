package te.app.aljoud.pages.fawaterkPayment.models.check_out.installment;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
@Keep
public class CartInstallmentResponse extends StatusMessage {

    @SerializedName("data")
    private CartInstallmentData cartInstallmentData;

    public CartInstallmentData getInstallmentData() {
        return cartInstallmentData;
    }

}