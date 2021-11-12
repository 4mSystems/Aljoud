package te.app.aljoud.pages.splash;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;


import java.util.Objects;

import javax.inject.Inject;

import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.R;
import te.app.aljoud.databinding.FragmentSplashBinding;
import te.app.aljoud.pages.auth.login.LoginFragment;
import te.app.aljoud.pages.auth.register.RegisterViewModel;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.MovementHelper;

public class SplashFragment extends BaseFragment {
    @Inject
    SplashViewModel viewModel;
    @Inject
    RegisterViewModel registerViewModel;
    FragmentSplashBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        baseActivity().activityBaseBinding.logo.setVisibility(View.GONE);
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_splash, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.splashStart();

        setEvent();
        return binding.getRoot();
    }


    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.HOME)) {
//                if (UserHelper.getInstance(context).getIsFirst())
//                else
//                if (UserHelper.getInstance(requireActivity()).getUserData() != null)
//                    MovementHelper.startActivityMain(context);
//                else
                    MovementHelper.startActivityBase(requireActivity(), LoginFragment.class.getName(), null, null);
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }

}
