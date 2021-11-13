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
public final class FragmentUniversityDetails_MembersInjector implements MembersInjector<FragmentUniversityDetails> {
  private final Provider<UniversityViewModel> viewModelProvider;

  public FragmentUniversityDetails_MembersInjector(
      Provider<UniversityViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<FragmentUniversityDetails> create(
      Provider<UniversityViewModel> viewModelProvider) {
    return new FragmentUniversityDetails_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(FragmentUniversityDetails instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.university.FragmentUniversityDetails.viewModel")
  public static void injectViewModel(FragmentUniversityDetails instance,
      UniversityViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
