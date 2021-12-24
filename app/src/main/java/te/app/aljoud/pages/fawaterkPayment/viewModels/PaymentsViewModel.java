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
    PaymentMethodMain paymentMethodMain;
    PaymentResultData paymentResultData;
    private int paymentId;

    @Inject
    public PaymentsViewModel(AuthRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void getPaymentMethod() {
        compositeDisposable.add(repository.getPaymentMethods(getPassingObject().getObject()));
    }

    public void checkPayment() {
        if (getMethodsAdapter().lastSelected != -1) {
            paymentId = getMethodsAdapter().paymentMethodList.get(getMethodsAdapter().lastSelected).getPaymentId();
            compositeDisposable.add(repository.checkPayment(getPassingObject().getId(), paymentId, getPassingObject().getObject()));
        }
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
