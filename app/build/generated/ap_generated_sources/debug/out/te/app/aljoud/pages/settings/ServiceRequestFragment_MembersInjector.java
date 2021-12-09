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
public final class ServiceRequestFragment_MembersInjector implements MembersInjector<ServiceRequestFragment> {
  private final Provider<SettingsViewModel> viewModelProvider;

  public ServiceRequestFragment_MembersInjector(Provider<SettingsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ServiceRequestFragment> create(
      Provider<SettingsViewModel> viewModelProvider) {
    return new ServiceRequestFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ServiceRequestFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.settings.ServiceRequestFragment.viewModel")
  public static void injectViewModel(ServiceRequestFragment instance, SettingsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
