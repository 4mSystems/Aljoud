package te.app.aljoud.pages.university.viewModel;

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
public final class UniversityViewModel_Factory implements Factory<UniversityViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  private final Provider<HomeRepository> homeRepositoryProvider2;

  public UniversityViewModel_Factory(Provider<HomeRepository> homeRepositoryProvider,
      Provider<HomeRepository> homeRepositoryProvider2) {
    this.homeRepositoryProvider = homeRepositoryProvider;
    this.homeRepositoryProvider2 = homeRepositoryProvider2;
  }

  @Override
  public UniversityViewModel get() {
    UniversityViewModel instance = newInstance(homeRepositoryProvider.get());
    UniversityViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider2.get());
    return instance;
  }

  public static UniversityViewModel_Factory create(Provider<HomeRepository> homeRepositoryProvider,
      Provider<HomeRepository> homeRepositoryProvider2) {
    return new UniversityViewModel_Factory(homeRepositoryProvider, homeRepositoryProvider2);
  }

  public static UniversityViewModel newInstance(HomeRepository homeRepository) {
    return new UniversityViewModel(homeRepository);
  }
}
