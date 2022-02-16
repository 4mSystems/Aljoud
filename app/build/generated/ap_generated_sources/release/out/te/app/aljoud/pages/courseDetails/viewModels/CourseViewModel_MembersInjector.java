package te.app.aljoud.pages.courseDetails.viewModels;

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
public final class CourseViewModel_MembersInjector implements MembersInjector<CourseViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  public CourseViewModel_MembersInjector(Provider<HomeRepository> homeRepositoryProvider) {
    this.homeRepositoryProvider = homeRepositoryProvider;
  }

  public static MembersInjector<CourseViewModel> create(
      Provider<HomeRepository> homeRepositoryProvider) {
    return new CourseViewModel_MembersInjector(homeRepositoryProvider);
  }

  @Override
  public void injectMembers(CourseViewModel instance) {
    injectHomeRepository(instance, homeRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel.homeRepository")
  public static void injectHomeRepository(CourseViewModel instance, HomeRepository homeRepository) {
    instance.homeRepository = homeRepository;
  }
}
