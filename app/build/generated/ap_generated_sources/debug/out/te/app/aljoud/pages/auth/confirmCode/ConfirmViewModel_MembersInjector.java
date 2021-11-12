package te.app.aljoud.pages.auth.confirmCode;

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
public final class ConfirmViewModel_MembersInjector implements MembersInjector<ConfirmViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public ConfirmViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<ConfirmViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new ConfirmViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(ConfirmViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.auth.confirmCode.ConfirmViewModel.repository")
  public static void injectRepository(ConfirmViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}
