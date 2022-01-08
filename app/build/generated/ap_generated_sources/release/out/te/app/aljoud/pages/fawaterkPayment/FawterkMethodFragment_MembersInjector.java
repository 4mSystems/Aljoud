package te.app.aljoud.pages.fawaterkPayment;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FawterkMethodFragment_MembersInjector implements MembersInjector<FawterkMethodFragment> {
  private final Provider<PaymentsViewModel> viewModelProvider;

  public FawterkMethodFragment_MembersInjector(Provider<PaymentsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<FawterkMethodFragment> create(
      Provider<PaymentsViewModel> viewModelProvider) {
    return new FawterkMethodFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(FawterkMethodFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.fawaterkPayment.FawterkMethodFragment.viewModel")
  public static void injectViewModel(FawterkMethodFragment instance, PaymentsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
