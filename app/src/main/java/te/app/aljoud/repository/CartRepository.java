package te.app.aljoud.repository;


import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.disposables.Disposable;
import te.app.aljoud.connection.ConnectionHelper;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.cart.models.CartCountResponse;
import te.app.aljoud.pages.cart.models.DeleteCartRequest;
import te.app.aljoud.pages.cart.models.cart_items.CartResponse;
import te.app.aljoud.pages.courseDetails.models.AddCartRequest;
import te.app.aljoud.pages.fawaterkPayment.models.PaymentMethodResponse;
import te.app.aljoud.pages.fawaterkPayment.models.check_out.CheckoutRequest;
import te.app.aljoud.pages.fawaterkPayment.models.check_out.installment.CartInstallmentResponse;
import te.app.aljoud.pages.fawaterkPayment.models.paymentResult.PaymentResultResponse;
import te.app.aljoud.pages.fawaterkPayment.models.check_out.ApplyDiscountResponse;
import te.app.aljoud.pages.fawaterkPayment.models.check_out.PromoCodeRequest;
import te.app.aljoud.pages.installment.models.InstallmentResponse;
import te.app.aljoud.pages.installment.models.PayInstallmentRequest;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.URLS;

@Singleton
public class CartRepository extends BaseRepository {
    @Inject
    public ConnectionHelper connectionHelper;
    protected MutableLiveData<Mutable> liveData;

    @Inject
    public CartRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable addToCart(AddCartRequest addCartRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.ADD_CART, addCartRequest, StatusMessage.class,
                Constants.ADD_CART, true);
    }

    public Disposable getCartCount() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CART_COUNT, new Object(), CartCountResponse.class,
                Constants.ADD_CART, false);
    }

    public Disposable getCartItems() {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CART, new Object(), CartResponse.class,
                Constants.CART, true);
    }

    public Disposable deleteCartItem(DeleteCartRequest deleteCartRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.DELETE_CART_ITEM, deleteCartRequest, StatusMessage.class,
                Constants.DELETE, true);
    }


    public Disposable getPaymentMethods(String type) {
//        type.equals(Constants.COURSE_DETAILS) ? URLS.PAYMENT_METHODS : URLS.PAYMENT_METHODS_OFFERS
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.PAYMENT_METHODS, new Object(), PaymentMethodResponse.class,
                Constants.PAYMENT_METHOD, true);
    }

    public Disposable checkPayment(int courseId, int paymentId, String type) {
        String url;
        if (type.equals(Constants.COURSE_DETAILS))
            url = URLS.CHECK_PAYMENT;
        else
            url = URLS.CHECK_PAYMENT_OFFERS;
        return connectionHelper.requestApi(Constants.GET_REQUEST, url + paymentId + "/" + courseId, new Object(), PaymentResultResponse.class,
                Constants.CHECK_PAYMENT, true);
    }

    public Disposable applyDiscount(PromoCodeRequest promoCodeRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.APPLY_DISCOUNT, promoCodeRequest, ApplyDiscountResponse.class,
                Constants.APPLY_DISCOUNT, true);
    }

    public Disposable checkout(CheckoutRequest checkoutRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.CHECK_OUT, checkoutRequest, PaymentResultResponse.class,
                Constants.CHECK_PAYMENT, true);
    }

    public Disposable getInstallment(CheckoutRequest checkoutRequest) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.GET_CART_INSTALLMENT, checkoutRequest, CartInstallmentResponse.class,
                Constants.INSTALLMENT, true);
    }

    public Disposable getInstallmentByStatus(String status) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.GET_INSTALLMENTS + status, new Object(), InstallmentResponse.class,
                Constants.INSTALLMENT, true);
    }

    public Disposable payInstallments(PayInstallmentRequest request) {
        return connectionHelper.requestApi(Constants.POST_REQUEST, URLS.PAY_INSTALLMENTS, request, PaymentResultResponse.class,
                Constants.CHECK_PAYMENT, true);
    }
}