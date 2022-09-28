package te.app.aljoud.pages.installment.viewModels;


import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.installment.adapter.InstallmentsAdapter;
import te.app.aljoud.pages.installment.models.InstallmentData;
import te.app.aljoud.pages.installment.models.PayInstallmentRequest;
import te.app.aljoud.repository.CartRepository;
import te.app.aljoud.utils.Constants;

public class InstallmentsViewModel extends BaseViewModel {
    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    InstallmentsAdapter installmentsAdapter;
    @Inject
    CartRepository repository;
    @Bindable
    public Double amountToPay = 0.0;
    public List<Integer> selectedIds = new ArrayList<>();
    public PayInstallmentRequest payInstallmentRequest = new PayInstallmentRequest();

    @Inject
    public InstallmentsViewModel(CartRepository repository) {
        this.repository = repository;
        this.liveData = new MutableLiveData<>();
        repository.setLiveData(liveData);
    }

    public void getInstallmentByStatus(String status) {
        compositeDisposable.add(repository.getInstallmentByStatus(status));
    }

    public CartRepository getRepository() {
        return repository;
    }


    public InstallmentsAdapter getInstallmentsAdapter() {
        return this.installmentsAdapter == null ? this.installmentsAdapter = new InstallmentsAdapter() : this.installmentsAdapter;
    }

    public void updateList(List<InstallmentData> installmentDataList) {
        getInstallmentsAdapter().update(installmentDataList);
    }

    public void updateTotalToPay(Double amount) {
        amountToPay = amountToPay + amount;
        notifyChange(BR.amountToPay);
    }

    public int getItemIndex(int id) {
        for (int i = 0; i < selectedIds.size(); i++) {
            if (selectedIds.get(i) == id) {
                return i;
            }
        }
        return -1;
    }

    public void openPay() {
        if (selectedIds.size() > 0)
            payInstallmentRequest.setInstallmentIds(selectedIds.toString().replace(" ", "").replace("[", "").replace("]", ""));
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

}
