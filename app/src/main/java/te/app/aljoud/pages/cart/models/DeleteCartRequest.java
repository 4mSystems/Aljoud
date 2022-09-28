package te.app.aljoud.pages.cart.models;

import com.google.gson.annotations.SerializedName;

public class DeleteCartRequest {
    @SerializedName("cart_id")
    private int cartId;

    public DeleteCartRequest(int cartId) {
        this.cartId = cartId;
    }

}
