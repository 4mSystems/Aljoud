package te.app.aljoud.pages.auth.register;

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
public final class RegisterViewModel_MembersInjector implements MembersInjector<RegisterViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public RegisterViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<RegisterViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new RegisterViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(RegisterViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.auth.register.RegisterViewModel.repository")
  public static void injectRepository(RegisterViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}
