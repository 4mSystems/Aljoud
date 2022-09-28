package te.app.aljoud.pages.fawaterkPayment.models.check_out;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.utils.Constants;

public class CheckoutRequest {
    @SerializedName("type")
    private String type = Constants.CASH;
    @SerializedName("payment_method")
    private int paymentMethod;
    @SerializedName("coupon_code")
    private String coupon_code;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCoupon_code() {
        return coupon_code;
    }

    public void setCoupon_code(String coupon_code) {
        this.coupon_code = coupon_code;
    }

}
