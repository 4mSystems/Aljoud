package te.app.aljoud.pages.home;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.pages.home.viewModels.HomeViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<HomeViewModel> viewModelProvider;

  public HomeFragment_MembersInjector(Provider<HomeViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<HomeFragment> create(Provider<HomeViewModel> viewModelProvider) {
    return new HomeFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.home.HomeFragment.viewModel")
  public static void injectViewModel(HomeFragment instance, HomeViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
