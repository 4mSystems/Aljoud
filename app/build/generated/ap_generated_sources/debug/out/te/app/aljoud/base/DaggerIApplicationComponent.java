package te.app.aljoud.base;

import dagger.internal.DoubleCheck;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.activity.BaseActivity;
import te.app.aljoud.activity.MainActivity;
import te.app.aljoud.activity.MainActivity_MembersInjector;
import te.app.aljoud.connection.Api;
import te.app.aljoud.connection.ConnectionHelper;
import te.app.aljoud.connection.ConnectionHelper_Factory;
import te.app.aljoud.connection.ConnectionModule;
import te.app.aljoud.connection.ConnectionModule_WebServiceFactory;
import te.app.aljoud.pages.auth.changePassword.ChangePasswordFragment;
import te.app.aljoud.pages.auth.changePassword.ChangePasswordFragment_MembersInjector;
import te.app.aljoud.pages.auth.changePassword.ChangePasswordViewModel;
import te.app.aljoud.pages.auth.changePassword.ChangePasswordViewModel_Factory;
import te.app.aljoud.pages.auth.changePassword.ChangePasswordViewModel_MembersInjector;
import te.app.aljoud.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.aljoud.pages.auth.confirmCode.ConfirmCodeFragment_MembersInjector;
import te.app.aljoud.pages.auth.confirmCode.ConfirmViewModel;
import te.app.aljoud.pages.auth.confirmCode.ConfirmViewModel_Factory;
import te.app.aljoud.pages.auth.confirmCode.ConfirmViewModel_MembersInjector;
import te.app.aljoud.pages.auth.forgetPassword.ForgetPasswordFragment;
import te.app.aljoud.pages.auth.forgetPassword.ForgetPasswordFragment_MembersInjector;
import te.app.aljoud.pages.auth.forgetPassword.ForgetPasswordViewModel;
import te.app.aljoud.pages.auth.forgetPassword.ForgetPasswordViewModel_Factory;
import te.app.aljoud.pages.auth.forgetPassword.ForgetPasswordViewModel_MembersInjector;
import te.app.aljoud.pages.auth.login.LoginFragment;
import te.app.aljoud.pages.auth.login.LoginFragment_MembersInjector;
import te.app.aljoud.pages.auth.login.LoginViewModel;
import te.app.aljoud.pages.auth.login.LoginViewModel_Factory;
import te.app.aljoud.pages.auth.login.LoginViewModel_MembersInjector;
import te.app.aljoud.pages.auth.register.RegisterFragment;
import te.app.aljoud.pages.auth.register.RegisterFragment_MembersInjector;
import te.app.aljoud.pages.auth.register.RegisterViewModel;
import te.app.aljoud.pages.auth.register.RegisterViewModel_Factory;
import te.app.aljoud.pages.auth.register.RegisterViewModel_MembersInjector;
import te.app.aljoud.pages.home.HomeFragment;
import te.app.aljoud.pages.home.HomeFragment_MembersInjector;
import te.app.aljoud.pages.home.viewModels.HomeViewModel;
import te.app.aljoud.pages.home.viewModels.HomeViewModel_Factory;
import te.app.aljoud.pages.home.viewModels.HomeViewModel_MembersInjector;
import te.app.aljoud.pages.settings.AboutAppFragment;
import te.app.aljoud.pages.settings.AboutAppFragment_MembersInjector;
import te.app.aljoud.pages.settings.ContactFragment;
import te.app.aljoud.pages.settings.ContactFragment_MembersInjector;
import te.app.aljoud.pages.settings.viewModels.SettingsViewModel;
import te.app.aljoud.pages.settings.viewModels.SettingsViewModel_Factory;
import te.app.aljoud.pages.settings.viewModels.SettingsViewModel_MembersInjector;
import te.app.aljoud.pages.splash.SplashFragment;
import te.app.aljoud.pages.splash.SplashFragment_MembersInjector;
import te.app.aljoud.pages.splash.SplashViewModel;
import te.app.aljoud.pages.splash.SplashViewModel_Factory;
import te.app.aljoud.pages.splash.SplashViewModel_MembersInjector;
import te.app.aljoud.repository.AuthRepository;
import te.app.aljoud.repository.AuthRepository_Factory;
import te.app.aljoud.repository.HomeRepository;
import te.app.aljoud.repository.HomeRepository_Factory;
import te.app.aljoud.repository.SettingsRepository;
import te.app.aljoud.repository.SettingsRepository_Factory;
import te.app.aljoud.utils.locations.MapAddressActivity;
import te.app.aljoud.utils.locations.MapAddressActivity_MembersInjector;
import te.app.aljoud.utils.locations.MapAddressViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerIApplicationComponent implements IApplicationComponent {
  private Provider<Api> webServiceProvider;

  private Provider<ConnectionHelper> connectionHelperProvider;

  private Provider<HomeRepository> homeRepositoryProvider;

  private Provider<AuthRepository> authRepositoryProvider;

  private Provider<SettingsRepository> settingsRepositoryProvider;

  private DaggerIApplicationComponent(ConnectionModule connectionModuleParam) {

    initialize(connectionModuleParam);
  }

  public static IApplicationComponent.Builder builder() {
    return new Builder();
  }

  public static IApplicationComponent create() {
    return new Builder().build();
  }

  private HomeViewModel homeViewModel() {
    return injectHomeViewModel(HomeViewModel_Factory.newInstance(homeRepositoryProvider.get()));
  }

  private SplashViewModel splashViewModel() {
    return injectSplashViewModel(SplashViewModel_Factory.newInstance(homeRepositoryProvider.get()));
  }

  private RegisterViewModel registerViewModel() {
    return injectRegisterViewModel(RegisterViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private SettingsViewModel settingsViewModel() {
    return injectSettingsViewModel(SettingsViewModel_Factory.newInstance(settingsRepositoryProvider.get()));
  }

  private LoginViewModel loginViewModel() {
    return injectLoginViewModel(LoginViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ForgetPasswordViewModel forgetPasswordViewModel() {
    return injectForgetPasswordViewModel(ForgetPasswordViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ConfirmViewModel confirmViewModel() {
    return injectConfirmViewModel(ConfirmViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ChangePasswordViewModel changePasswordViewModel() {
    return injectChangePasswordViewModel(ChangePasswordViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ConnectionModule connectionModuleParam) {
    this.webServiceProvider = DoubleCheck.provider(ConnectionModule_WebServiceFactory.create(connectionModuleParam));
    this.connectionHelperProvider = DoubleCheck.provider(ConnectionHelper_Factory.create(webServiceProvider, webServiceProvider));
    this.homeRepositoryProvider = DoubleCheck.provider(HomeRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.authRepositoryProvider = DoubleCheck.provider(AuthRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.settingsRepositoryProvider = DoubleCheck.provider(SettingsRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
  }

  @Override
  public void inject(MainActivity mainActivity) {
    injectMainActivity(mainActivity);
  }

  @Override
  public void inject(BaseActivity tmpActivity) {
  }

  @Override
  public void inject(MapAddressActivity mapAddressActivity) {
    injectMapAddressActivity(mapAddressActivity);
  }

  @Override
  public void inject(SplashFragment splashFragment) {
    injectSplashFragment(splashFragment);
  }

  @Override
  public void inject(HomeFragment homeFragment) {
    injectHomeFragment(homeFragment);
  }

  @Override
  public void inject(ContactFragment contactFragment) {
    injectContactFragment(contactFragment);
  }

  @Override
  public void inject(AboutAppFragment aboutAppFragment) {
    injectAboutAppFragment(aboutAppFragment);
  }

  @Override
  public void inject(LoginFragment loginFragment) {
    injectLoginFragment(loginFragment);
  }

  @Override
  public void inject(RegisterFragment registerFragment) {
    injectRegisterFragment(registerFragment);
  }

  @Override
  public void inject(ForgetPasswordFragment forgetPasswordFragment) {
    injectForgetPasswordFragment(forgetPasswordFragment);
  }

  @Override
  public void inject(ConfirmCodeFragment confirmCodeFragment) {
    injectConfirmCodeFragment(confirmCodeFragment);
  }

  @Override
  public void inject(ChangePasswordFragment changePasswordFragment) {
    injectChangePasswordFragment(changePasswordFragment);
  }

  private HomeViewModel injectHomeViewModel(HomeViewModel instance) {
    HomeViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider.get());
    return instance;
  }

  private MainActivity injectMainActivity(MainActivity instance) {
    MainActivity_MembersInjector.injectViewModel(instance, homeViewModel());
    return instance;
  }

  private MapAddressActivity injectMapAddressActivity(MapAddressActivity instance) {
    MapAddressActivity_MembersInjector.injectMapAddressViewModel(instance, new MapAddressViewModel());
    return instance;
  }

  private SplashViewModel injectSplashViewModel(SplashViewModel instance) {
    SplashViewModel_MembersInjector.injectRepository(instance, homeRepositoryProvider.get());
    return instance;
  }

  private RegisterViewModel injectRegisterViewModel(RegisterViewModel instance) {
    RegisterViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private SplashFragment injectSplashFragment(SplashFragment instance) {
    SplashFragment_MembersInjector.injectViewModel(instance, splashViewModel());
    SplashFragment_MembersInjector.injectRegisterViewModel(instance, registerViewModel());
    return instance;
  }

  private HomeFragment injectHomeFragment(HomeFragment instance) {
    HomeFragment_MembersInjector.injectViewModel(instance, homeViewModel());
    return instance;
  }

  private SettingsViewModel injectSettingsViewModel(SettingsViewModel instance) {
    SettingsViewModel_MembersInjector.injectRepository(instance, settingsRepositoryProvider.get());
    return instance;
  }

  private ContactFragment injectContactFragment(ContactFragment instance) {
    ContactFragment_MembersInjector.injectViewModel(instance, settingsViewModel());
    return instance;
  }

  private AboutAppFragment injectAboutAppFragment(AboutAppFragment instance) {
    AboutAppFragment_MembersInjector.injectViewModel(instance, settingsViewModel());
    return instance;
  }

  private LoginViewModel injectLoginViewModel(LoginViewModel instance) {
    LoginViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private LoginFragment injectLoginFragment(LoginFragment instance) {
    LoginFragment_MembersInjector.injectViewModel(instance, loginViewModel());
    return instance;
  }

  private RegisterFragment injectRegisterFragment(RegisterFragment instance) {
    RegisterFragment_MembersInjector.injectViewModel(instance, registerViewModel());
    return instance;
  }

  private ForgetPasswordViewModel injectForgetPasswordViewModel(ForgetPasswordViewModel instance) {
    ForgetPasswordViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ForgetPasswordFragment injectForgetPasswordFragment(ForgetPasswordFragment instance) {
    ForgetPasswordFragment_MembersInjector.injectViewModel(instance, forgetPasswordViewModel());
    return instance;
  }

  private ConfirmViewModel injectConfirmViewModel(ConfirmViewModel instance) {
    ConfirmViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ConfirmCodeFragment injectConfirmCodeFragment(ConfirmCodeFragment instance) {
    ConfirmCodeFragment_MembersInjector.injectViewModel(instance, confirmViewModel());
    return instance;
  }

  private ChangePasswordViewModel injectChangePasswordViewModel(ChangePasswordViewModel instance) {
    ChangePasswordViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ChangePasswordFragment injectChangePasswordFragment(ChangePasswordFragment instance) {
    ChangePasswordFragment_MembersInjector.injectViewModel(instance, changePasswordViewModel());
    return instance;
  }

  private static final class Builder implements IApplicationComponent.Builder {
    @Override
    public IApplicationComponent build() {
      return new DaggerIApplicationComponent(new ConnectionModule());
    }
  }
}
