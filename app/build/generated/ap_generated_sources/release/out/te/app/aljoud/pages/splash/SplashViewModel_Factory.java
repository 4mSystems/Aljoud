package te.app.aljoud.pages.splash;

import dagger.internal.Factory;
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
public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  private final Provider<HomeRepository> repositoryProvider;

  private final Provider<HomeRepository> repositoryProvider2;

  public SplashViewModel_Factory(Provider<HomeRepository> repositoryProvider,
      Provider<HomeRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public SplashViewModel get() {
    SplashViewModel instance = newInstance(repositoryProvider.get());
    SplashViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static SplashViewModel_Factory create(Provider<HomeRepository> repositoryProvider,
      Provider<HomeRepository> repositoryProvider2) {
    return new SplashViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static SplashViewModel newInstance(HomeRepository repository) {
    return new SplashViewModel(repository);
  }
}
