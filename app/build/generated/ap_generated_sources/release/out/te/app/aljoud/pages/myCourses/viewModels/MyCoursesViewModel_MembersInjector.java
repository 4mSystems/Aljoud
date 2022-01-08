package te.app.aljoud.pages.myCourses.viewModels;

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
public final class MyCoursesViewModel_MembersInjector implements MembersInjector<MyCoursesViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  public MyCoursesViewModel_MembersInjector(Provider<HomeRepository> homeRepositoryProvider) {
    this.homeRepositoryProvider = homeRepositoryProvider;
  }

  public static MembersInjector<MyCoursesViewModel> create(
      Provider<HomeRepository> homeRepositoryProvider) {
    return new MyCoursesViewModel_MembersInjector(homeRepositoryProvider);
  }

  @Override
  public void injectMembers(MyCoursesViewModel instance) {
    injectHomeRepository(instance, homeRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.myCourses.viewModels.MyCoursesViewModel.homeRepository")
  public static void injectHomeRepository(MyCoursesViewModel instance,
      HomeRepository homeRepository) {
    instance.homeRepository = homeRepository;
  }
}
