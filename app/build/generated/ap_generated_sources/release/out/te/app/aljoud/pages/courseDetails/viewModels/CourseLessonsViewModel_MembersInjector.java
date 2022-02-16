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
public final class CourseLessonsViewModel_MembersInjector implements MembersInjector<CourseLessonsViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  public CourseLessonsViewModel_MembersInjector(Provider<HomeRepository> homeRepositoryProvider) {
    this.homeRepositoryProvider = homeRepositoryProvider;
  }

  public static MembersInjector<CourseLessonsViewModel> create(
      Provider<HomeRepository> homeRepositoryProvider) {
    return new CourseLessonsViewModel_MembersInjector(homeRepositoryProvider);
  }

  @Override
  public void injectMembers(CourseLessonsViewModel instance) {
    injectHomeRepository(instance, homeRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel.homeRepository")
  public static void injectHomeRepository(CourseLessonsViewModel instance,
      HomeRepository homeRepository) {
    instance.homeRepository = homeRepository;
  }
}
