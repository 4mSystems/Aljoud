package te.app.aljoud.pages.cart.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class DeleteCartRequest {
    @SerializedName("cart_id")
    private int cartId;

    public DeleteCartRequest(int cartId) {
        this.cartId = cartId;
    }

}
