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

import te.app.aljoud.BR;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentPaidInstallmentBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.installment.models.InstallmentResponse;
import te.app.aljoud.pages.installment.viewModels.InstallmentsViewModel;
import te.app.aljoud.utils.Constants;

public class PaidInstallmentFragment extends BaseFragment {
    FragmentPaidInstallmentBinding installmentBinding;
    @Inject
    InstallmentsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        installmentBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_paid_installment, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        viewModel.getInstallmentByStatus(Constants.PAID);
        setEvent();
        return installmentBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.INSTALLMENT.equals(((Mutable) o).message)) {
                viewModel.updateList(((InstallmentResponse) mutable.object).getInstallmentDataList());
                installmentBinding.rcPaid.setAdapter(viewModel.getInstallmentsAdapter());
            }
        });
    }
    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }
}
