package te.app.aljoud.pages.cart;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import javax.inject.Inject;

import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentCheckoutTermsBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.fawaterkPayment.models.check_out.PassingCheckoutData;
import te.app.aljoud.pages.fawaterkPayment.models.paymentResult.PaymentResultData;
import te.app.aljoud.pages.fawaterkPayment.models.paymentResult.PaymentResultResponse;
import te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.MovementHelper;

public class CheckoutTermsFragment extends BaseFragment {
    FragmentCheckoutTermsBinding methodsBinding;
    @Inject
    PaymentsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        methodsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_checkout_terms, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        baseActivity().backActionBarView.cartEnabled(false);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setPassingCheckoutData(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), PassingCheckoutData.class));
        }
        setEvent();
        return methodsBinding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CHECK_PAYMENT.equals(((Mutable) o).message)) {
                openCheckSummary(((PaymentResultResponse) mutable.object).getPaymentResultData());
            }
        });
        methodsBinding.next.setOnClickListener(view -> {
            if (methodsBinding.checkbox.isChecked())
                viewModel.checkout();
            else
                toastMessageError(getString(R.string.agreed_checkout_terms));
        });
    }

    private void openCheckSummary(PaymentResultData paymentResultData) {
        viewModel.getPassingCheckoutData().setInvoiceId(paymentResultData.getPaymentResultData().getInvoiceId());
        viewModel.getPassingCheckoutData().setRedirectTo(paymentResultData.getPaymentResultData().getPaymentData().getRedirectTo());
        Log.e("setEvent", "setEvent: " + viewModel.getPassingCheckoutData().getInvoiceId() + " " + viewModel.getPassingCheckoutData().getRedirectTo());
        MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.getPassingCheckoutData()), null, CheckoutSummaryFragment.class.getName(), null);

    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }
}
