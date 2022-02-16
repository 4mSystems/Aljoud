package te.app.aljoud.pages.auth.confirmCode;

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
public final class ConfirmCodeFragment_MembersInjector implements MembersInjector<ConfirmCodeFragment> {
  private final Provider<ConfirmViewModel> viewModelProvider;

  public ConfirmCodeFragment_MembersInjector(Provider<ConfirmViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ConfirmCodeFragment> create(
      Provider<ConfirmViewModel> viewModelProvider) {
    return new ConfirmCodeFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ConfirmCodeFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.auth.confirmCode.ConfirmCodeFragment.viewModel")
  public static void injectViewModel(ConfirmCodeFragment instance, ConfirmViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
