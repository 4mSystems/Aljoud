package te.app.aljoud.pages.splash;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.pages.auth.register.RegisterViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashFragment_MembersInjector implements MembersInjector<SplashFragment> {
  private final Provider<SplashViewModel> viewModelProvider;

  private final Provider<RegisterViewModel> registerViewModelProvider;

  public SplashFragment_MembersInjector(Provider<SplashViewModel> viewModelProvider,
      Provider<RegisterViewModel> registerViewModelProvider) {
    this.viewModelProvider = viewModelProvider;
    this.registerViewModelProvider = registerViewModelProvider;
  }

  public static MembersInjector<SplashFragment> create(Provider<SplashViewModel> viewModelProvider,
      Provider<RegisterViewModel> registerViewModelProvider) {
    return new SplashFragment_MembersInjector(viewModelProvider, registerViewModelProvider);
  }

  @Override
  public void injectMembers(SplashFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
    injectRegisterViewModel(instance, registerViewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.splash.SplashFragment.viewModel")
  public static void injectViewModel(SplashFragment instance, SplashViewModel viewModel) {
    instance.viewModel = viewModel;
  }

  @InjectedFieldSignature("te.app.aljoud.pages.splash.SplashFragment.registerViewModel")
  public static void injectRegisterViewModel(SplashFragment instance,
      RegisterViewModel registerViewModel) {
    instance.registerViewModel = registerViewModel;
  }
}
