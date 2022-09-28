package te.app.aljoud.pages.installment.viewModels;

import android.view.View;

import androidx.databinding.Bindable;

import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.fawaterkPayment.models.PaymentMethod;
import te.app.aljoud.pages.installment.models.InstallmentData;
import te.app.aljoud.utils.Constants;


public class ItemInstallmentViewModel extends BaseViewModel {
    public InstallmentData installmentData;
    @Bindable
    public boolean isSelected = false;

    public ItemInstallmentViewModel(InstallmentData paymentMethod) {
        this.installmentData = paymentMethod;
    }

    @Bindable
    public InstallmentData getInstallmentData() {
        return installmentData;
    }

    public Integer isStatusVisible() {
        if (getInstallmentData().getStatus().equals(Constants.PAID))
            return View.GONE;
        else
            return View.VISIBLE;
    }

    public void itemAction() {
        isSelected = !isSelected;
        notifyChange(BR.isSelected);
        getLiveData().setValue(Constants.MENu);
    }

}
