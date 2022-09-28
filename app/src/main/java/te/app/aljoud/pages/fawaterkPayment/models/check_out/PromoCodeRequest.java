package te.app.aljoud.pages.fawaterkPayment.models.check_out;

import com.google.gson.annotations.SerializedName;

public class PromoCodeRequest {
    @SerializedName("coupon_code")
    private String couponCode = "";

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
}
