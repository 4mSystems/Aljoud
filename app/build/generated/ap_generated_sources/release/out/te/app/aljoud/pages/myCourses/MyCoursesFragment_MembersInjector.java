package te.app.aljoud.pages.myCourses;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.pages.myCourses.viewModels.MyCoursesViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyCoursesFragment_MembersInjector implements MembersInjector<MyCoursesFragment> {
  private final Provider<MyCoursesViewModel> viewModelProvider;

  public MyCoursesFragment_MembersInjector(Provider<MyCoursesViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<MyCoursesFragment> create(
      Provider<MyCoursesViewModel> viewModelProvider) {
    return new MyCoursesFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(MyCoursesFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.myCourses.MyCoursesFragment.viewModel")
  public static void injectViewModel(MyCoursesFragment instance, MyCoursesViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
