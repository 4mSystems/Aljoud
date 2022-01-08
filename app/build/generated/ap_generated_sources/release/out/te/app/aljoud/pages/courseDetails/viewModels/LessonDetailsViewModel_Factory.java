package te.app.aljoud.pages.courseDetails.viewModels;

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
public final class LessonDetailsViewModel_Factory implements Factory<LessonDetailsViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  private final Provider<HomeRepository> homeRepositoryProvider2;

  public LessonDetailsViewModel_Factory(Provider<HomeRepository> homeRepositoryProvider,
      Provider<HomeRepository> homeRepositoryProvider2) {
    this.homeRepositoryProvider = homeRepositoryProvider;
    this.homeRepositoryProvider2 = homeRepositoryProvider2;
  }

  @Override
  public LessonDetailsViewModel get() {
    LessonDetailsViewModel instance = newInstance(homeRepositoryProvider.get());
    LessonDetailsViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider2.get());
    return instance;
  }

  public static LessonDetailsViewModel_Factory create(
      Provider<HomeRepository> homeRepositoryProvider,
      Provider<HomeRepository> homeRepositoryProvider2) {
    return new LessonDetailsViewModel_Factory(homeRepositoryProvider, homeRepositoryProvider2);
  }

  public static LessonDetailsViewModel newInstance(HomeRepository homeRepository) {
    return new LessonDetailsViewModel(homeRepository);
  }
}
