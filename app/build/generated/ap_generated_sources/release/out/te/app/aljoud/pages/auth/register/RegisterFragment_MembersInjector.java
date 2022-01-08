package te.app.aljoud.pages.auth.register;

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
public final class RegisterFragment_MembersInjector implements MembersInjector<RegisterFragment> {
  private final Provider<RegisterViewModel> viewModelProvider;

  public RegisterFragment_MembersInjector(Provider<RegisterViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<RegisterFragment> create(
      Provider<RegisterViewModel> viewModelProvider) {
    return new RegisterFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(RegisterFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.auth.register.RegisterFragment.viewModel")
  public static void injectViewModel(RegisterFragment instance, RegisterViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
