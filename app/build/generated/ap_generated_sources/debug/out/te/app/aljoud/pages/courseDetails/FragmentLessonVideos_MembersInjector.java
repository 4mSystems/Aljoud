package te.app.aljoud.pages.courseDetails;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.pages.courseDetails.viewModels.LessonDetailsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FragmentLessonVideos_MembersInjector implements MembersInjector<FragmentLessonVideos> {
  private final Provider<LessonDetailsViewModel> viewModelProvider;

  public FragmentLessonVideos_MembersInjector(Provider<LessonDetailsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<FragmentLessonVideos> create(
      Provider<LessonDetailsViewModel> viewModelProvider) {
    return new FragmentLessonVideos_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(FragmentLessonVideos instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.courseDetails.FragmentLessonVideos.viewModel")
  public static void injectViewModel(FragmentLessonVideos instance,
      LessonDetailsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
