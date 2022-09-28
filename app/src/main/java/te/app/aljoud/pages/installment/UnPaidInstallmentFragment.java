package te.app.aljoud.pages.installment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentUnpaidInstallmentBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.fawaterkPayment.FawterkMethodFragment;
import te.app.aljoud.pages.installment.models.InstallmentResponse;
import te.app.aljoud.pages.installment.viewModels.InstallmentsViewModel;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.MovementHelper;

public class UnPaidInstallmentFragment extends BaseFragment {
    FragmentUnpaidInstallmentBinding installmentBinding;
    @Inject
    InstallmentsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        installmentBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_unpaid_installment, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        installmentBinding.setViewmodel(viewModel);
        viewModel.getInstallmentByStatus(Constants.UNPAID);
        setEvent();
        return installmentBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.INSTALLMENT.equals(((Mutable) o).message)) {
                viewModel.updateList(((InstallmentResponse) mutable.object).getInstallmentDataList());
            } else if (Constants.PAYMENT_METHOD.equals(((Mutable) o).message)) {
                viewModel.payInstallmentRequest.setStatus(Constants.UNPAID);
                MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.payInstallmentRequest), getString(R.string.payment), FawterkMethodFragment.class.getName(), null);
            }
        });

        viewModel.getInstallmentsAdapter().onSelected.observeForever(data -> {
            if (viewModel.selectedIds.contains(data.getId())) {
                viewModel.updateTotalToPay(-data.getAmount());
                viewModel.selectedIds.remove(viewModel.getItemIndex(data.getId()));
            } else {
                viewModel.updateTotalToPay(data.getAmount());
                viewModel.selectedIds.add(data.getId());
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }
}
