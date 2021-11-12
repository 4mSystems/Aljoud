package te.app.aljoud.pages.auth.login;

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
public final class LoginViewModel_MembersInjector implements MembersInjector<LoginViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public LoginViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<LoginViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new LoginViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(LoginViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.auth.login.LoginViewModel.repository")
  public static void injectRepository(LoginViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}
