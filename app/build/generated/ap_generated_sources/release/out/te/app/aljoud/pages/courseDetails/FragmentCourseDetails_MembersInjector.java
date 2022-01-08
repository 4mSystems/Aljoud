package te.app.aljoud.pages.courseDetails;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FragmentCourseDetails_MembersInjector implements MembersInjector<FragmentCourseDetails> {
  private final Provider<CourseViewModel> viewModelProvider;

  public FragmentCourseDetails_MembersInjector(Provider<CourseViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<FragmentCourseDetails> create(
      Provider<CourseViewModel> viewModelProvider) {
    return new FragmentCourseDetails_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(FragmentCourseDetails instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.courseDetails.FragmentCourseDetails.viewModel")
  public static void injectViewModel(FragmentCourseDetails instance, CourseViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
