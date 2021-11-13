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
public final class LessonDetailsViewModel_MembersInjector implements MembersInjector<LessonDetailsViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  public LessonDetailsViewModel_MembersInjector(Provider<HomeRepository> homeRepositoryProvider) {
    this.homeRepositoryProvider = homeRepositoryProvider;
  }

  public static MembersInjector<LessonDetailsViewModel> create(
      Provider<HomeRepository> homeRepositoryProvider) {
    return new LessonDetailsViewModel_MembersInjector(homeRepositoryProvider);
  }

  @Override
  public void injectMembers(LessonDetailsViewModel instance) {
    injectHomeRepository(instance, homeRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.courseDetails.viewModels.LessonDetailsViewModel.homeRepository")
  public static void injectHomeRepository(LessonDetailsViewModel instance,
      HomeRepository homeRepository) {
    instance.homeRepository = homeRepository;
  }
}
