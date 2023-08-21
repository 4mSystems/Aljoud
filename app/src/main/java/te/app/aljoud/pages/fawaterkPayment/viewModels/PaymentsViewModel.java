package te.app.aljoud.pages.fawaterkPayment.viewModels;

import android.widget.RadioGroup;

import androidx.databinding.Bindable;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.fawaterkPayment.adapters.PaymentMethodsAdapter;
import te.app.aljoud.pages.fawaterkPayment.models.PaymentMethodMain;
import te.app.aljoud.pages.fawaterkPayment.models.check_out.CheckoutRequest;
import te.app.aljoud.pages.fawaterkPayment.models.check_out.PassingCheckoutData;
import te.app.aljoud.pages.fawaterkPayment.models.paymentResult.PaymentResultData;
import te.app.aljoud.pages.fawaterkPayment.models.check_out.DiscountData;
import te.app.aljoud.pages.fawaterkPayment.models.check_out.PromoCodeRequest;
import te.app.aljoud.pages.installment.models.PayInstallmentRequest;
import te.app.aljoud.repository.CartRepository;
import te.app.aljoud.utils.Constants;

import androidx.lifecycle.MutableLiveData;

public class PaymentsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    PaymentMethodsAdapter methodsAdapter;
    @Inject
    CartRepository repository;
    PaymentMethodMain paymentMethodMain;
    PaymentResultData paymentResultData;
    private int paymentId;

    PromoCodeRequest promoCodeRequest;
    CheckoutRequest checkoutRequest;
    DiscountData discountData;
    PassingCheckoutData passingCheckoutData;
    public PayInstallmentRequest payInstallmentRequest;

    @Inject
    public PaymentsViewModel(CartRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void getPaymentMethod() {
        compositeDisposable.add(repository.getPaymentMethods(getPassingObject().getObject()));
    }

    public void payOffer() {
        if (getMethodsAdapter().lastSelected != -1) {
            paymentId = getMethodsAdapter().paymentMethodList.get(getMethodsAdapter().lastSelected).getPaymentId();
            compositeDisposable.add(repository.checkPayment(getPassingObject().getId(), paymentId, getPassingObject().getObject()));
        }
    }

    public void payInstallments() {
        if (getMethodsAdapter().lastSelected != -1) {
            paymentId = getMethodsAdapter().paymentMethodList.get(getMethodsAdapter().lastSelected).getPaymentId();
            getPayInstallmentRequest().setPaymentMethod(paymentId);
            compositeDisposable.add(repository.payInstallments(getPayInstallmentRequest()));
        }
    }

    public void initPaymentAction() {
        if (getPassingObject().getObject().equals(Constants.INSTALLMENT))
            payInstallments();
        else
            payOffer();
    }

    public void applyDiscount() {
        if (!getPromoCodeRequest().getCouponCode().isEmpty())
            compositeDisposable.add(repository.applyDiscount(getPromoCodeRequest()));
    }

    public void confirmOrder() {
        getCheckoutRequest().setCoupon_code(getPromoCodeRequest().getCouponCode());
        if (getMethodsAdapter().lastSelected != -1) {
            paymentId = getMethodsAdapter().getPaymentMethodList().get(getMethodsAdapter().lastSelected).getPaymentId();
            getCheckoutRequest().setPaymentMethod(paymentId);
            if (getCheckoutRequest().getType().equals(Constants.CASH))
                checkout();
            else
                liveData.setValue(new Mutable(Constants.INSTALLMENT));
        } else
            liveData.setValue(new Mutable(Constants.PAYMENT_METHOD_WARNING));
    }

    public void checkout() {
        compositeDisposable.add(repository.checkout(getCheckoutRequest()));
    }

    public void getInstallment() {
        compositeDisposable.add(repository.getInstallment(getCheckoutRequest()));
    }

    public void redirectPayment() {
        if (paymentId == Constants.FAWRY_ID)
            liveData.setValue(new Mutable(Constants.FAWRY));
        else if (paymentId == Constants.MOBILE_WALLET_ID)
            liveData.setValue(new Mutable(Constants.MOBILE_WALLET));
        else if (paymentId == Constants.BANK_CARD_ID)
            liveData.setValue(new Mutable(Constants.BANK_CARD));

    }

    public void makeCopy() {
        liveData.setValue(new Mutable(Constants.COPY));
    }

    public void onPaymentChanged(RadioGroup radioGroup, int id) {
        if (id == R.id.radio_cash)
            getCheckoutRequest().setType(Constants.CASH);
        else
            getCheckoutRequest().setType(Constants.INSTALLMENT);
    }

    @Bindable
    public PaymentMethodMain getPaymentMethodMain() {
        return this.paymentMethodMain == null ? this.paymentMethodMain = new PaymentMethodMain() : this.paymentMethodMain;
    }

    @Bindable
    public void setPaymentMethodMain(PaymentMethodMain paymentMethodMain) {
        getMethodsAdapter().update(paymentMethodMain.getPaymentMethodList());
        notifyChange(BR.methodsAdapter);
        notifyChange(BR.paymentMethodMain);
        this.paymentMethodMain = paymentMethodMain;
    }

    @Bindable
    public PaymentResultData getPaymentResultData() {
        return this.paymentResultData == null ? this.paymentResultData = new PaymentResultData() : this.paymentResultData;
    }

    @Bindable
    public void setPaymentResultData(PaymentResultData paymentResultData) {
        redirectPayment();
        notifyChange(BR.paymentResultData);
        this.paymentResultData = paymentResultData;
    }

    @Bindable
    public DiscountData getDiscountData() {
        return this.discountData == null ? this.discountData = new DiscountData() : this.discountData;
    }

    @Bindable
    public CheckoutRequest getCheckoutRequest() {
        return this.checkoutRequest == null ? this.checkoutRequest = new CheckoutRequest() : this.checkoutRequest;
    }

    public void setCheckoutRequest(CheckoutRequest checkoutRequest) {
        this.checkoutRequest = checkoutRequest;
    }

    public void setPayInstallmentRequest(PayInstallmentRequest payInstallmentRequest) {
        this.payInstallmentRequest = payInstallmentRequest;
    }

    public PayInstallmentRequest getPayInstallmentRequest() {
        return this.payInstallmentRequest == null ? this.payInstallmentRequest = new PayInstallmentRequest() : this.payInstallmentRequest;
    }

    @Bindable
    public void setDiscountData(DiscountData discountData) {
        notifyChange(BR.discountData);
        this.discountData = discountData;
    }

    public CartRepository getRepository() {
        return repository;
    }


    @Bindable
    public PaymentMethodsAdapter getMethodsAdapter() {
        return this.methodsAdapter == null ? this.methodsAdapter = new PaymentMethodsAdapter() : this.methodsAdapter;
    }

    @Bindable
    public PromoCodeRequest getPromoCodeRequest() {
        return this.promoCodeRequest == null ? this.promoCodeRequest = new PromoCodeRequest() : this.promoCodeRequest;
    }

    @Bindable
    public PassingCheckoutData getPassingCheckoutData() {
        return this.passingCheckoutData == null ? this.passingCheckoutData = new PassingCheckoutData() : this.passingCheckoutData;
    }

    public void setPassingCheckoutData(PassingCheckoutData passingCheckoutData) {
        setCheckoutRequest(passingCheckoutData.getCheckoutRequest());
        this.passingCheckoutData = passingCheckoutData;
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

    public void updateTotalPrice() {
        DiscountData discountData = new DiscountData();
        discountData.setNewPrice(Float.parseFloat(getPassingObject().getObject()));
        setDiscountData(discountData);
    }
}
