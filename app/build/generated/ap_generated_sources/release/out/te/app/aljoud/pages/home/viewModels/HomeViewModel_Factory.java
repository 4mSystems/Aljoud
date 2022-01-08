package te.app.aljoud.pages.home.viewModels;

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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  private final Provider<HomeRepository> homeRepositoryProvider2;

  public HomeViewModel_Factory(Provider<HomeRepository> homeRepositoryProvider,
      Provider<HomeRepository> homeRepositoryProvider2) {
    this.homeRepositoryProvider = homeRepositoryProvider;
    this.homeRepositoryProvider2 = homeRepositoryProvider2;
  }

  @Override
  public HomeViewModel get() {
    HomeViewModel instance = newInstance(homeRepositoryProvider.get());
    HomeViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider2.get());
    return instance;
  }

  public static HomeViewModel_Factory create(Provider<HomeRepository> homeRepositoryProvider,
      Provider<HomeRepository> homeRepositoryProvider2) {
    return new HomeViewModel_Factory(homeRepositoryProvider, homeRepositoryProvider2);
  }

  public static HomeViewModel newInstance(HomeRepository homeRepository) {
    return new HomeViewModel(homeRepository);
  }
}
