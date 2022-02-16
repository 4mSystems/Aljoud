package te.app.aljoud.pages.courseDetails;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FragmentCourseLessons_MembersInjector implements MembersInjector<FragmentCourseLessons> {
  private final Provider<CourseLessonsViewModel> viewModelProvider;

  public FragmentCourseLessons_MembersInjector(Provider<CourseLessonsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<FragmentCourseLessons> create(
      Provider<CourseLessonsViewModel> viewModelProvider) {
    return new FragmentCourseLessons_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(FragmentCourseLessons instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.courseDetails.FragmentCourseLessons.viewModel")
  public static void injectViewModel(FragmentCourseLessons instance,
      CourseLessonsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
