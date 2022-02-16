package te.app.aljoud.pages.home.viewModels;

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
public final class HomeViewModel_MembersInjector implements MembersInjector<HomeViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  public HomeViewModel_MembersInjector(Provider<HomeRepository> homeRepositoryProvider) {
    this.homeRepositoryProvider = homeRepositoryProvider;
  }

  public static MembersInjector<HomeViewModel> create(
      Provider<HomeRepository> homeRepositoryProvider) {
    return new HomeViewModel_MembersInjector(homeRepositoryProvider);
  }

  @Override
  public void injectMembers(HomeViewModel instance) {
    injectHomeRepository(instance, homeRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.home.viewModels.HomeViewModel.homeRepository")
  public static void injectHomeRepository(HomeViewModel instance, HomeRepository homeRepository) {
    instance.homeRepository = homeRepository;
  }
}
