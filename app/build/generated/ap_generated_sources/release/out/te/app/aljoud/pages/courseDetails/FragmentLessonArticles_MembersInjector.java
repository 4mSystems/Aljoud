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
public final class FragmentLessonArticles_MembersInjector implements MembersInjector<FragmentLessonArticles> {
  private final Provider<LessonDetailsViewModel> viewModelProvider;

  public FragmentLessonArticles_MembersInjector(
      Provider<LessonDetailsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<FragmentLessonArticles> create(
      Provider<LessonDetailsViewModel> viewModelProvider) {
    return new FragmentLessonArticles_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(FragmentLessonArticles instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.courseDetails.FragmentLessonArticles.viewModel")
  public static void injectViewModel(FragmentLessonArticles instance,
      LessonDetailsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
