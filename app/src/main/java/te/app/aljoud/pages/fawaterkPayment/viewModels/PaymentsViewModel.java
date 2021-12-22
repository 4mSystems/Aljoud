package te.app.aljoud.pages.fawaterkPayment.viewModels;

import androidx.databinding.Bindable;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.fawaterkPayment.adapters.PaymentMethodsAdapter;
import te.app.aljoud.pages.fawaterkPayment.models.PaymentMethod;
import te.app.aljoud.pages.fawaterkPayment.models.PaymentMethodMain;
import te.app.aljoud.pages.fawaterkPayment.models.paymentResult.PaymentResultData;
import te.app.aljoud.repository.AuthRepository;
import te.app.aljoud.utils.Constants;

import androidx.lifecycle.MutableLiveData;

public class PaymentsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    PaymentMethodsAdapter methodsAdapter;
    @Inject
    AuthRepository repository;
    //    SendPaymentRequest sendPaymentRequest;
    PaymentMethodMain paymentMethodMain;
    PaymentResultData paymentResultData;

    @Inject
    public PaymentsViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void getPaymentMethod() {
        compositeDisposable.add(repository.getPaymentMethods());
    }

    public void checkPayment() {
        if (getMethodsAdapter().lastSelected != -1)
            compositeDisposable.add(repository.checkPayment(getPassingObject().getId(), getMethodsAdapter().paymentMethodList.get(getMethodsAdapter().lastSelected).getPaymentId()));
    }

    public void redirectPayment() {
        if (getMethodsAdapter().paymentMethodList.get(getMethodsAdapter().lastSelected).getPaymentId() == Constants.FAWRY_ID)
            liveData.setValue(new Mutable(Constants.FAWRY));
        else if (getMethodsAdapter().paymentMethodList.get(getMethodsAdapter().lastSelected).getPaymentId() == Constants.MOBILE_WALLET_ID)
            liveData.setValue(new Mutable(Constants.MOBILE_WALLET));
        else if (getMethodsAdapter().paymentMethodList.get(getMethodsAdapter().lastSelected).getPaymentId() == Constants.BANK_CARD_ID)
            liveData.setValue(new Mutable(Constants.BANK_CARD));

    }

//    @Bindable
//    public SendPaymentRequest getSendPaymentRequest() {
//        return this.sendPaymentRequest == null ? this.sendPaymentRequest = new SendPaymentRequest() : this.sendPaymentRequest;
//    }

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

    public PaymentResultData getPaymentResultData() {
        return this.paymentResultData == null ? this.paymentResultData = new PaymentResultData() : this.paymentResultData;
    }


    public void setPaymentResultData(PaymentResultData paymentResultData) {
        redirectPayment();
        this.paymentResultData = paymentResultData;
    }

    public AuthRepository getRepository() {
        return repository;
    }


    @Bindable
    public PaymentMethodsAdapter getMethodsAdapter() {
        return this.methodsAdapter == null ? this.methodsAdapter = new PaymentMethodsAdapter() : this.methodsAdapter;
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

}
