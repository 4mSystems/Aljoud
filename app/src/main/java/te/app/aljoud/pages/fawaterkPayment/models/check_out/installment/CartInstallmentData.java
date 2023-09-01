package te.app.aljoud.pages.fawaterkPayment.models.check_out.installment;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import java.text.DecimalFormat;

import te.app.aljoud.utils.helper.AppHelper;
@Keep
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
        if (installmentPrice != null) {
            return AppHelper.convertCurrency(installmentPrice);
        }
        return installmentPrice;
    }

    public String getNextPayDate() {
        return nextPayDate;
    }
}