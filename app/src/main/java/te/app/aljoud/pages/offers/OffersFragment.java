package te.app.aljoud.pages.offers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentOffersBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.offers.models.OffersResponse;
import te.app.aljoud.pages.offers.viewModel.OffersViewModel;
import te.app.aljoud.utils.Constants;


public class OffersFragment extends BaseFragment {
    @Inject
    OffersViewModel viewModel;
    FragmentOffersBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_offers, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.offers(1, true);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.OFFERS.equals(((Mutable) o).message)) {
                viewModel.setOffersMainData(((OffersResponse) mutable.object).getData());
            } else if (Constants.BUY_OFFER.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
            }
        });
        viewModel.getOffersAdapter().liveData.observe(requireActivity(), integer -> viewModel.buyOffer(integer));
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
    }
}
