package te.app.aljoud.pages.profile;

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
public final class ProfileViewModel_MembersInjector implements MembersInjector<ProfileViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  public ProfileViewModel_MembersInjector(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<ProfileViewModel> create(
      Provider<AuthRepository> repositoryProvider) {
    return new ProfileViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(ProfileViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.profile.ProfileViewModel.repository")
  public static void injectRepository(ProfileViewModel instance, AuthRepository repository) {
    instance.repository = repository;
  }
}
