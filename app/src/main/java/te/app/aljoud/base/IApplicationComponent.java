package te.app.aljoud.base;

import javax.inject.Singleton;


import dagger.Component;
import te.app.aljoud.activity.BaseActivity;
import te.app.aljoud.activity.MainActivity;
import te.app.aljoud.connection.ConnectionModule;
import te.app.aljoud.pages.auth.changePassword.ChangePasswordFragment;
import te.app.aljoud.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.aljoud.pages.auth.forgetPassword.ForgetPasswordFragment;
import te.app.aljoud.pages.auth.login.LoginFragment;
import te.app.aljoud.pages.auth.register.RegisterFragment;
import te.app.aljoud.pages.univerity.FragmentCategorySections;
import te.app.aljoud.pages.home.HomeFragment;
import te.app.aljoud.pages.settings.AboutAppFragment;
import te.app.aljoud.pages.settings.ContactFragment;
import te.app.aljoud.pages.splash.SplashFragment;
import te.app.aljoud.pages.univerity.FragmentUniversityDetails;
import te.app.aljoud.utils.locations.MapAddressActivity;

@Singleton
@Component(modules = {ConnectionModule.class, LiveData.class})
public interface IApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(BaseActivity tmpActivity);

    void inject(MapAddressActivity mapAddressActivity);

    void inject(SplashFragment splashFragment);

    void inject(HomeFragment homeFragment);

    void inject(ContactFragment contactFragment);

    void inject(AboutAppFragment aboutAppFragment);

    void inject(LoginFragment loginFragment);

    void inject(RegisterFragment registerFragment);

    void inject(ForgetPasswordFragment forgetPasswordFragment);

    void inject(ConfirmCodeFragment confirmCodeFragment);

    void inject(ChangePasswordFragment changePasswordFragment);

    void inject(FragmentCategorySections fragmentCategorySections);

    void inject(FragmentUniversityDetails fragmentUniversityDetails);

    @Component.Builder
    interface Builder {
        IApplicationComponent build();
    }
}
