package te.app.aljoud.pages.cart.viewModels;

import androidx.databinding.Bindable;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.cart.models.cart_items.CartItem;
import te.app.aljoud.utils.Constants;

public class ItemCartViewModel extends BaseViewModel {
    public CartItem cartItem;

    public ItemCartViewModel(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    @Bindable
    public CartItem getCartItem() {
        return cartItem;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.DELETE);
    }

}
