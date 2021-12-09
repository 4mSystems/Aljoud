package te.app.aljoud.pages.myCourses.viewModels;

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
public final class MyCoursesViewModel_Factory implements Factory<MyCoursesViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  private final Provider<HomeRepository> homeRepositoryProvider2;

  public MyCoursesViewModel_Factory(Provider<HomeRepository> homeRepositoryProvider,
      Provider<HomeRepository> homeRepositoryProvider2) {
    this.homeRepositoryProvider = homeRepositoryProvider;
    this.homeRepositoryProvider2 = homeRepositoryProvider2;
  }

  @Override
  public MyCoursesViewModel get() {
    MyCoursesViewModel instance = newInstance(homeRepositoryProvider.get());
    MyCoursesViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider2.get());
    return instance;
  }

  public static MyCoursesViewModel_Factory create(Provider<HomeRepository> homeRepositoryProvider,
      Provider<HomeRepository> homeRepositoryProvider2) {
    return new MyCoursesViewModel_Factory(homeRepositoryProvider, homeRepositoryProvider2);
  }

  public static MyCoursesViewModel newInstance(HomeRepository homeRepository) {
    return new MyCoursesViewModel(homeRepository);
  }
}
