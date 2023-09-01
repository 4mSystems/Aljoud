package te.app.aljoud.pages.cart.models.cart_items;

import androidx.annotation.Keep;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.utils.helper.AppHelper;
@Keep
public class CartData {

    @SerializedName("final_total")
    private String finalTotal = "0";

    @SerializedName("cart")
    private List<CartItem> cart;

    private String cartCurrency = "";


    public String getCartCurrency() {
        if (cart != null) {
            return cart.get(0).getCourse().getCurrency().getCode();
        }
        return cartCurrency;
    }

    public String getCartTotal() {
        if (!finalTotal.equals("0")) {
            return AppHelper.convertCurrency(finalTotal);
        }
        return finalTotal;
    }

    public String getFinalTotal() {
        return finalTotal;
    }

    public List<CartItem> getCart() {
        return cart;
    }
}