package te.app.aljoud.pages.fawaterkPayment.viewModels;

import androidx.databinding.Bindable;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.fawaterkPayment.models.PaymentMethod;
import te.app.aljoud.utils.Constants;
import androidx.lifecycle.MutableLiveData;


public class ItemPaymentMethodsViewModel extends BaseViewModel {
    public PaymentMethod paymentMethod;

    public ItemPaymentMethodsViewModel(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Bindable
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.MENu);
    }

}
