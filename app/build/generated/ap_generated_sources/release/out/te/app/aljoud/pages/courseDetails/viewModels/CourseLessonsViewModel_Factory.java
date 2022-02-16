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
public final class CourseLessonsViewModel_Factory implements Factory<CourseLessonsViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  private final Provider<HomeRepository> homeRepositoryProvider2;

  public CourseLessonsViewModel_Factory(Provider<HomeRepository> homeRepositoryProvider,
      Provider<HomeRepository> homeRepositoryProvider2) {
    this.homeRepositoryProvider = homeRepositoryProvider;
    this.homeRepositoryProvider2 = homeRepositoryProvider2;
  }

  @Override
  public CourseLessonsViewModel get() {
    CourseLessonsViewModel instance = newInstance(homeRepositoryProvider.get());
    CourseLessonsViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider2.get());
    return instance;
  }

  public static CourseLessonsViewModel_Factory create(
      Provider<HomeRepository> homeRepositoryProvider,
      Provider<HomeRepository> homeRepositoryProvider2) {
    return new CourseLessonsViewModel_Factory(homeRepositoryProvider, homeRepositoryProvider2);
  }

  public static CourseLessonsViewModel newInstance(HomeRepository homeRepository) {
    return new CourseLessonsViewModel(homeRepository);
  }
}
