package te.app.aljoud.pages.cart.models.cart_items;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;

import te.app.aljoud.model.base.StatusMessage;
@Keep
public class CartResponse extends StatusMessage {

	@SerializedName("data")
	private CartData cartData;

	public CartData getCartData(){
		return cartData;
	}

}