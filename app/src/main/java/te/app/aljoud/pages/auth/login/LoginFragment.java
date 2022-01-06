package te.app.aljoud.pages.auth.login;

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
import te.app.aljoud.databinding.FragmentLoginBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.aljoud.pages.auth.forgetPassword.ForgetPasswordFragment;
import te.app.aljoud.pages.auth.models.UsersResponse;
import te.app.aljoud.pages.auth.register.RegisterFragment;
import te.app.aljoud.pages.splash.SplashFragment;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.MovementHelper;
import te.app.aljoud.utils.session.LanguagesHelper;
import te.app.aljoud.utils.session.UserHelper;

public class LoginFragment extends BaseFragment {
    @Inject
    LoginViewModel viewModel;
    FragmentLoginBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.LOGIN:
                    toastMessage(((UsersResponse) mutable.object).mMessage);
                    UserHelper.getInstance(requireActivity()).userLogin(((UsersResponse) mutable.object).getUserData());
                    MovementHelper.startActivityMain(requireActivity());
                    break;
                case Constants.FORGET_PASSWORD:
                    MovementHelper.startActivity(requireActivity(), ForgetPasswordFragment.class.getName(), null, null);
                    break;
                case Constants.REGISTER:
                    MovementHelper.startActivity(requireActivity(), RegisterFragment.class.getName(), null, null);
                    break;
                case Constants.ERROR_NOT_FOUND:
                    showError(String.valueOf(mutable.object));
                    break;
                case Constants.NOT_VERIFIED:
                    MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.loginRequest.getPhone()), null, ConfirmCodeFragment.class.getName(), null);
                    break;
                case Constants.HOME:
                    MovementHelper.startActivityMain(requireActivity());
                    break;
                case Constants.LANGUAGE:
                    LanguagesHelper.setLanguage(LanguagesHelper.getCurrentLanguage().equals("ar") ? "en" : "ar");
                    MovementHelper.startActivityBase(requireActivity(), SplashFragment.class.getName(), null, null);
                    break;

            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }

}
