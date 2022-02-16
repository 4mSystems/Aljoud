package te.app.aljoud.pages.splash;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.repository.HomeRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashViewModel_MembersInjector implements MembersInjector<SplashViewModel> {
  private final Provider<HomeRepository> repositoryProvider;

  public SplashViewModel_MembersInjector(Provider<HomeRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<SplashViewModel> create(
      Provider<HomeRepository> repositoryProvider) {
    return new SplashViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(SplashViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.splash.SplashViewModel.repository")
  public static void injectRepository(SplashViewModel instance, HomeRepository repository) {
    instance.repository = repository;
  }
}
