package te.app.aljoud.pages.fawaterkPayment.viewModels;

import dagger.internal.Factory;
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
public final class PaymentsViewModel_Factory implements Factory<PaymentsViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  private final Provider<AuthRepository> repositoryProvider2;

  public PaymentsViewModel_Factory(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public PaymentsViewModel get() {
    PaymentsViewModel instance = newInstance(repositoryProvider.get());
    PaymentsViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static PaymentsViewModel_Factory create(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    return new PaymentsViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static PaymentsViewModel newInstance(AuthRepository repository) {
    return new PaymentsViewModel(repository);
  }
}
