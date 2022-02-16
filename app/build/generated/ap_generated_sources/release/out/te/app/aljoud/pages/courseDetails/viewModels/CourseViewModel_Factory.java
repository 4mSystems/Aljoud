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
public final class CourseViewModel_Factory implements Factory<CourseViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  private final Provider<HomeRepository> homeRepositoryProvider2;

  public CourseViewModel_Factory(Provider<HomeRepository> homeRepositoryProvider,
      Provider<HomeRepository> homeRepositoryProvider2) {
    this.homeRepositoryProvider = homeRepositoryProvider;
    this.homeRepositoryProvider2 = homeRepositoryProvider2;
  }

  @Override
  public CourseViewModel get() {
    CourseViewModel instance = newInstance(homeRepositoryProvider.get());
    CourseViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider2.get());
    return instance;
  }

  public static CourseViewModel_Factory create(Provider<HomeRepository> homeRepositoryProvider,
      Provider<HomeRepository> homeRepositoryProvider2) {
    return new CourseViewModel_Factory(homeRepositoryProvider, homeRepositoryProvider2);
  }

  public static CourseViewModel newInstance(HomeRepository homeRepository) {
    return new CourseViewModel(homeRepository);
  }
}
