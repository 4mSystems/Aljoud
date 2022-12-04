package te.app.aljoud.pages.fawaterkPayment.models.check_out;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

@Keep
public class DiscountData {

    @SerializedName("old_price")
    private float oldPrice;

    @SerializedName("discount")
    private float discount;

    @SerializedName("new_price")
    private float newPrice;

    @SerializedName("type")
    private String type;

    @SerializedName("done")
    private boolean done = false;

    public Float getOldPrice() {
        return oldPrice;
    }

    public float getDiscount() {
        return discount;
    }

    public float getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(float newPrice) {
        this.newPrice = newPrice;
    }

    public String getType() {
        return type;
    }

    public boolean isDone() {
        return done;
    }
}