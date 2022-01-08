package te.app.aljoud.pages.offers.viewModel;

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
public final class OffersViewModel_MembersInjector implements MembersInjector<OffersViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  public OffersViewModel_MembersInjector(Provider<HomeRepository> homeRepositoryProvider) {
    this.homeRepositoryProvider = homeRepositoryProvider;
  }

  public static MembersInjector<OffersViewModel> create(
      Provider<HomeRepository> homeRepositoryProvider) {
    return new OffersViewModel_MembersInjector(homeRepositoryProvider);
  }

  @Override
  public void injectMembers(OffersViewModel instance) {
    injectHomeRepository(instance, homeRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.offers.viewModel.OffersViewModel.homeRepository")
  public static void injectHomeRepository(OffersViewModel instance, HomeRepository homeRepository) {
    instance.homeRepository = homeRepository;
  }
}
