package te.app.aljoud.pages.cart.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
@Keep
public class CartCountResponse extends StatusMessage {
    @SerializedName("data")
    private CartCountData cartCountData;

    public CartCountData getCartCountData() {
        return cartCountData;
    }

}

