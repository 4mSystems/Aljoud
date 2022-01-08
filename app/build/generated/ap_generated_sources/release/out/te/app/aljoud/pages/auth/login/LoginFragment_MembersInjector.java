package te.app.aljoud.pages.auth.login;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginFragment_MembersInjector implements MembersInjector<LoginFragment> {
  private final Provider<LoginViewModel> viewModelProvider;

  public LoginFragment_MembersInjector(Provider<LoginViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<LoginFragment> create(Provider<LoginViewModel> viewModelProvider) {
    return new LoginFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(LoginFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.auth.login.LoginFragment.viewModel")
  public static void injectViewModel(LoginFragment instance, LoginViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
