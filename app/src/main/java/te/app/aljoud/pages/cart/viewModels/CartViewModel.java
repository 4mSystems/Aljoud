package te.app.aljoud.pages.cart.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.cart.adapters.CartAdapter;
import te.app.aljoud.pages.cart.models.DeleteCartRequest;
import te.app.aljoud.pages.cart.models.cart_items.CartData;
import te.app.aljoud.repository.CartRepository;
import te.app.aljoud.utils.Constants;

public class CartViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    CartRepository cartRepository;
    CartAdapter cartAdapter;

    public CartData cartData;

    @Inject
    public CartViewModel(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
        this.liveData = new MutableLiveData<>();
        cartRepository.setLiveData(liveData);
        cartData = new CartData();
    }

    public void getCart() {
        compositeDisposable.add(cartRepository.getCartItems());
    }

    public CartRepository getCartRepository() {
        return cartRepository;
    }

    @Bindable
    public CartAdapter getCartAdapter() {
        return this.cartAdapter == null ? this.cartAdapter = new CartAdapter() : this.cartAdapter;
    }

    @Bindable
    public CartData getCartData() {
        return cartData;
    }

    @Bindable
    public void setCartData(CartData cartData) {
        this.cartData = cartData;
        getCartAdapter().update(cartData.getCart());
        notifyChange(BR.cartAdapter);
        notifyChange(BR.cartData);
    }

//    public String getCartTotal() {
//        if (getCartData().getCart() != null && getCartData().getCart().size() > 0) {
//            return getCartData().getFinalTotal().concat(" ").concat(getCartData().getCart().get(0).getCourse().getCurrency().getCode());
//        } else {
//            return "0.0";
//        }
//    }
//
//    public String getCartCurrency() {
//        if (getCartData().getCart() != null && getCartData().getCart().size() > 0) {
//            return getCartData().getCart().get(0).getCourse().getCurrency().getCode();
//        } else {
//            return "EGP";
//        }
//    }

    public void openPayment() {
        if (getCartData().getCart().size() > 0)
            liveData.setValue(new Mutable(Constants.PAYMENT_METHOD));
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public void deleteItem(Integer cartId) {
        compositeDisposable.add(cartRepository.deleteCartItem(new DeleteCartRequest(cartId)));
    }
}
