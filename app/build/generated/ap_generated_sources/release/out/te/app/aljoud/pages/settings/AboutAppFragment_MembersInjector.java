package te.app.aljoud.pages.settings;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.pages.settings.viewModels.SettingsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AboutAppFragment_MembersInjector implements MembersInjector<AboutAppFragment> {
  private final Provider<SettingsViewModel> viewModelProvider;

  public AboutAppFragment_MembersInjector(Provider<SettingsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<AboutAppFragment> create(
      Provider<SettingsViewModel> viewModelProvider) {
    return new AboutAppFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(AboutAppFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.settings.AboutAppFragment.viewModel")
  public static void injectViewModel(AboutAppFragment instance, SettingsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
