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
public final class FragmentLessonQuizzes_MembersInjector implements MembersInjector<FragmentLessonQuizzes> {
  private final Provider<LessonDetailsViewModel> viewModelProvider;

  public FragmentLessonQuizzes_MembersInjector(Provider<LessonDetailsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<FragmentLessonQuizzes> create(
      Provider<LessonDetailsViewModel> viewModelProvider) {
    return new FragmentLessonQuizzes_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(FragmentLessonQuizzes instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.courseDetails.FragmentLessonQuizzes.viewModel")
  public static void injectViewModel(FragmentLessonQuizzes instance,
      LessonDetailsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
