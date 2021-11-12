package te.app.aljoud.pages.auth.changePassword;

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
public final class ChangePasswordViewModel_MembersInjector implements MembersInjector<ChangePasswordViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public ChangePasswordViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<ChangePasswordViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new ChangePasswordViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(ChangePasswordViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.auth.changePassword.ChangePasswordViewModel.repository")
  public static void injectRepository(ChangePasswordViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}
