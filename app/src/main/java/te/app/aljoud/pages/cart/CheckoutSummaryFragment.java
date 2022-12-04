package te.app.aljoud.pages.cart;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.google.gson.Gson;

import javax.inject.Inject;

import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentCheckoutSummaryBinding;
import te.app.aljoud.pages.fawaterkPayment.models.check_out.PassingCheckoutData;
import te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.AppHelper;
import te.app.aljoud.utils.helper.MovementHelper;

public class CheckoutSummaryFragment extends BaseFragment {
    FragmentCheckoutSummaryBinding methodsBinding;
    @Inject
    PaymentsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        methodsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_checkout_summary, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        baseActivity().backActionBarView.cartEnabled(false);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.setPassingCheckoutData(new Gson().fromJson(String.valueOf(viewModel.getPassingObject().getObjectClass()), PassingCheckoutData.class));
            methodsBinding.setData(viewModel.getPassingCheckoutData());
        }
        setEvent();
        return methodsBinding.getRoot();
    }

    private void setEvent() {
        methodsBinding.payNow.setOnClickListener(view -> MovementHelper.startPaymentActivityForResultWithBundle(requireActivity(), viewModel.getPassingCheckoutData().getRedirectTo()));
        methodsBinding.home.setOnClickListener(view -> MovementHelper.startActivityMain(requireActivity()));
        methodsBinding.icCopy.setOnClickListener(view -> {
            AppHelper.copyText(requireActivity(), String.valueOf(viewModel.getPassingCheckoutData().getInvoiceId()));
            toastMessage(getString(R.string.invoice_number_copied));
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                MovementHelper.startActivityMain(requireActivity());
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }
}
