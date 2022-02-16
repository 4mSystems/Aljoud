package te.app.aljoud.pages.auth.forgetPassword;

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
public final class ForgetPasswordFragment_MembersInjector implements MembersInjector<ForgetPasswordFragment> {
  private final Provider<ForgetPasswordViewModel> viewModelProvider;

  public ForgetPasswordFragment_MembersInjector(
      Provider<ForgetPasswordViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ForgetPasswordFragment> create(
      Provider<ForgetPasswordViewModel> viewModelProvider) {
    return new ForgetPasswordFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ForgetPasswordFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.auth.forgetPassword.ForgetPasswordFragment.viewModel")
  public static void injectViewModel(ForgetPasswordFragment instance,
      ForgetPasswordViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
