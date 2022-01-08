package te.app.aljoud.activity;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<HomeViewModel> viewModelProvider;

  public MainActivity_MembersInjector(Provider<HomeViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<HomeViewModel> viewModelProvider) {
    return new MainActivity_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.activity.MainActivity.viewModel")
  public static void injectViewModel(MainActivity instance, HomeViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
