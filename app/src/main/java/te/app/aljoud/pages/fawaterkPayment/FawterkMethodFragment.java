package te.app.aljoud.pages.fawaterkPayment;

import android.os.Bundle;
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
import te.app.aljoud.databinding.FragmentPaymentMethodsBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.cart.CheckoutTermsFragment;
import te.app.aljoud.pages.fawaterkPayment.models.PaymentMethodResponse;
import te.app.aljoud.pages.fawaterkPayment.models.check_out.PassingCheckoutData;
import te.app.aljoud.pages.fawaterkPayment.models.check_out.installment.CartInstallmentData;
import te.app.aljoud.pages.fawaterkPayment.models.check_out.installment.CartInstallmentResponse;
import te.app.aljoud.pages.fawaterkPayment.models.paymentResult.PaymentResultResponse;
import te.app.aljoud.pages.fawaterkPayment.models.check_out.ApplyDiscountResponse;
import te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel;
import te.app.aljoud.pages.installment.models.PayInstallmentRequest;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.MovementHelper;

public class FawterkMethodFragment extends BaseFragment {
    FragmentPaymentMethodsBinding methodsBinding;
    @Inject
    PaymentsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        methodsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_payment_methods, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        methodsBinding.setViewmodel(viewModel);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setPayInstallmentRequest(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), PayInstallmentRequest.class));
            viewModel.getPaymentMethod();
        }
        setEvent();
        return methodsBinding.getRoot();
    }


    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);

            switch (((Mutable) o).message) {
                case Constants.PAYMENT_METHOD:
                case Constants.PAYMENT_REDIRECT:
                    viewModel.setPaymentMethodMain(((PaymentMethodResponse) mutable.object).getPaymentMethodMain());
                    break;
                case Constants.CHECK_PAYMENT:
                    viewModel.setPaymentResultData(((PaymentResultResponse) mutable.object).getPaymentResultData());
                    break;
                case Constants.FAWRY:
                case Constants.MOBILE_WALLET:
                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.getPaymentResultData()), null, PaymentSuccessFragment.class.getName(), null);
                    break;
                case Constants.BANK_CARD:
                    MovementHelper.startPaymentActivityForResultWithBundle(requireActivity(), viewModel.getPaymentResultData().getPaymentResultData().getPaymentData().getRedirectTo());
                    break;
                case Constants.PAYMENT_METHOD_WARNING:
                    showError(getString(R.string.choose_payment_method));
                    break;
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

}
