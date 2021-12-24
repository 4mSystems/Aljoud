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
public final class PaymentSuccessFragment_MembersInjector implements MembersInjector<PaymentSuccessFragment> {
  private final Provider<PaymentsViewModel> viewModelProvider;

  public PaymentSuccessFragment_MembersInjector(Provider<PaymentsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<PaymentSuccessFragment> create(
      Provider<PaymentsViewModel> viewModelProvider) {
    return new PaymentSuccessFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(PaymentSuccessFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.fawaterkPayment.PaymentSuccessFragment.viewModel")
  public static void injectViewModel(PaymentSuccessFragment instance, PaymentsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
