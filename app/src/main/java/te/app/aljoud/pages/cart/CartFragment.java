package te.app.aljoud.pages.cart;

import android.os.Bundle;
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
import te.app.aljoud.databinding.FragmentCartBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.cart.models.cart_items.CartResponse;
import te.app.aljoud.pages.cart.viewModels.CartViewModel;
import te.app.aljoud.pages.fawaterkPayment.FawterkMethodFragment;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.MovementHelper;


public class CartFragment extends BaseFragment {
    @Inject
    CartViewModel viewModel;
    FragmentCartBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cart, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.getCart();
        setEvent();
        return binding.getRoot();
    }


    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.CART.equals(((Mutable) o).message)) {
                viewModel.setCartData(((CartResponse) mutable.object).getCartData());
                if (viewModel.getCartAdapter().getItemCount() == 0)
                    showCartEmpty();
            } else if (Constants.DELETE.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.getCartAdapter().removeItem();
                if (viewModel.getCartAdapter().getItemCount() == 0)
                    showCartEmpty();
            } else if (Constants.PAYMENT_METHOD.equals(((Mutable) o).message)) {
                MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.getCartAdapter().hasInstallment,String.valueOf(viewModel.getCartData().getFinalTotal()), viewModel.getCartData().getCartCurrency()), getString(R.string.payment), CheckoutFragment.class.getName(), null);
            }
        });
        viewModel.getCartAdapter().cartLiveData.observeForever(cartId -> viewModel.deleteItem(cartId));
    }

    private void showCartEmpty() {
        binding.emptyCart.setVisibility(View.VISIBLE);
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getCartRepository().setLiveData(viewModel.liveData);
    }
}
