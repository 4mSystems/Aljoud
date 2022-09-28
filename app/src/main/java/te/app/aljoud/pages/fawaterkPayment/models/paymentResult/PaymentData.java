package te.app.aljoud.pages.fawaterkPayment.models.paymentResult;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaymentData {

    @SerializedName("expireDate")
    @Expose
    private String expireDate;

    @SerializedName("fawryCode")
    @Expose
    private String fawryCode;
    @SerializedName("meezaReference")
    @Expose
    private String meezaReference;
    @SerializedName("redirectTo")
    @Expose
    private String redirectTo;

    public String getMeezaReference() {
        return meezaReference;
    }

    public String getRedirectTo() {
        return redirectTo;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public String getFawryCode() {
        return fawryCode;
    }
}