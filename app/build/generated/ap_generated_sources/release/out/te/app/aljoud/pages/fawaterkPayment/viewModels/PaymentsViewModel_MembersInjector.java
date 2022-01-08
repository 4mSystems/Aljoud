package te.app.aljoud.pages.fawaterkPayment.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.repository.AuthRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PaymentsViewModel_MembersInjector implements MembersInjector<PaymentsViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public PaymentsViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<PaymentsViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new PaymentsViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(PaymentsViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel.repository")
  public static void injectRepository(PaymentsViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}
