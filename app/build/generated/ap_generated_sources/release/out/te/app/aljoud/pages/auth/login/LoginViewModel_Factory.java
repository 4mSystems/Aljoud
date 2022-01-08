package te.app.aljoud.pages.auth.login;

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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  private final Provider<AuthRepository> repositoryProvider2;

  public LoginViewModel_Factory(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public LoginViewModel get() {
    LoginViewModel instance = newInstance(repositoryProvider.get());
    LoginViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static LoginViewModel_Factory create(Provider<AuthRepository> repositoryProvider,
      Provider<AuthRepository> repositoryProvider2) {
    return new LoginViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static LoginViewModel newInstance(AuthRepository repository) {
    return new LoginViewModel(repository);
  }
}
