package te.app.aljoud.pages.auth.changePassword;

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
public final class ChangePasswordFragment_MembersInjector implements MembersInjector<ChangePasswordFragment> {
  private final Provider<ChangePasswordViewModel> viewModelProvider;

  public ChangePasswordFragment_MembersInjector(
      Provider<ChangePasswordViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ChangePasswordFragment> create(
      Provider<ChangePasswordViewModel> viewModelProvider) {
    return new ChangePasswordFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ChangePasswordFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.auth.changePassword.ChangePasswordFragment.viewModel")
  public static void injectViewModel(ChangePasswordFragment instance,
      ChangePasswordViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
