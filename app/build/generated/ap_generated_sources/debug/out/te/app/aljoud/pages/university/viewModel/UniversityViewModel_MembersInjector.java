package te.app.aljoud.pages.university.viewModel;

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
public final class UniversityViewModel_MembersInjector implements MembersInjector<UniversityViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  public UniversityViewModel_MembersInjector(Provider<HomeRepository> homeRepositoryProvider) {
    this.homeRepositoryProvider = homeRepositoryProvider;
  }

  public static MembersInjector<UniversityViewModel> create(
      Provider<HomeRepository> homeRepositoryProvider) {
    return new UniversityViewModel_MembersInjector(homeRepositoryProvider);
  }

  @Override
  public void injectMembers(UniversityViewModel instance) {
    injectHomeRepository(instance, homeRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.university.viewModel.UniversityViewModel.homeRepository")
  public static void injectHomeRepository(UniversityViewModel instance,
      HomeRepository homeRepository) {
    instance.homeRepository = homeRepository;
  }
}
