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
public final class FragmentLessonDetails_MembersInjector implements MembersInjector<FragmentLessonDetails> {
  private final Provider<LessonDetailsViewModel> viewModelProvider;

  public FragmentLessonDetails_MembersInjector(Provider<LessonDetailsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<FragmentLessonDetails> create(
      Provider<LessonDetailsViewModel> viewModelProvider) {
    return new FragmentLessonDetails_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(FragmentLessonDetails instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.courseDetails.FragmentLessonDetails.viewModel")
  public static void injectViewModel(FragmentLessonDetails instance,
      LessonDetailsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
