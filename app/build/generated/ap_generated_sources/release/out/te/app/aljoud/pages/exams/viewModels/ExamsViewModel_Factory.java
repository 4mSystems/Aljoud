package te.app.aljoud.pages.exams.viewModels;

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
public final class ExamsViewModel_Factory implements Factory<ExamsViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  private final Provider<HomeRepository> homeRepositoryProvider2;

  public ExamsViewModel_Factory(Provider<HomeRepository> homeRepositoryProvider,
      Provider<HomeRepository> homeRepositoryProvider2) {
    this.homeRepositoryProvider = homeRepositoryProvider;
    this.homeRepositoryProvider2 = homeRepositoryProvider2;
  }

  @Override
  public ExamsViewModel get() {
    ExamsViewModel instance = newInstance(homeRepositoryProvider.get());
    ExamsViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider2.get());
    return instance;
  }

  public static ExamsViewModel_Factory create(Provider<HomeRepository> homeRepositoryProvider,
      Provider<HomeRepository> homeRepositoryProvider2) {
    return new ExamsViewModel_Factory(homeRepositoryProvider, homeRepositoryProvider2);
  }

  public static ExamsViewModel newInstance(HomeRepository homeRepository) {
    return new ExamsViewModel(homeRepository);
  }
}
