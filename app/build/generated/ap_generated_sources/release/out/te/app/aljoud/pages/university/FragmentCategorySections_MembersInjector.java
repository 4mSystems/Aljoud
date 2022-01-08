package te.app.aljoud.pages.university;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.pages.university.viewModel.UniversityViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FragmentCategorySections_MembersInjector implements MembersInjector<FragmentCategorySections> {
  private final Provider<UniversityViewModel> viewModelProvider;

  public FragmentCategorySections_MembersInjector(Provider<UniversityViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<FragmentCategorySections> create(
      Provider<UniversityViewModel> viewModelProvider) {
    return new FragmentCategorySections_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(FragmentCategorySections instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.university.FragmentCategorySections.viewModel")
  public static void injectViewModel(FragmentCategorySections instance,
      UniversityViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
