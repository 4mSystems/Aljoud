package te.app.aljoud.pages.home.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UniversitiesFragment_MembersInjector implements MembersInjector<UniversitiesFragment> {
  private final Provider<HomeViewModel> viewModelProvider;

  public UniversitiesFragment_MembersInjector(Provider<HomeViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<UniversitiesFragment> create(
      Provider<HomeViewModel> viewModelProvider) {
    return new UniversitiesFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(UniversitiesFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.home.viewModels.UniversitiesFragment.viewModel")
  public static void injectViewModel(UniversitiesFragment instance, HomeViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
