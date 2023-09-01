package te.app.aljoud.pages.cart.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class CartCountData {
    @SerializedName("count")
    private String count;

    public String getCount() {
        return count;
    }

}
