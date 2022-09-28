package te.app.aljoud.pages.splash;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

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
import te.app.aljoud.utils.session.UserHelper;

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
        splashStart();

        setEvent();
        return binding.getRoot();
    }


    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (mutable.message.equals(Constants.HOME)) {
                if (UserHelper.getInstance(requireActivity()).getUserData() != null)
                    MovementHelper.startActivityMain(requireActivity());
                else
                    MovementHelper.startActivityBase(requireActivity(), LoginFragment.class.getName(), null, null);
            }
        });
    }

    public void splashStart() {
        CountDownTimer countDownTimer = new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {
                binding.progress.setProgress(binding.progress.getProgress() + 20);
            }

            public void onFinish() {
                if (UserHelper.getInstance(requireActivity()).getUserData() != null)
                    MovementHelper.startActivityMain(requireActivity());
                else
                    MovementHelper.startActivityBase(requireActivity(), LoginFragment.class.getName(), null, null);
            }
        }.start();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }

}
