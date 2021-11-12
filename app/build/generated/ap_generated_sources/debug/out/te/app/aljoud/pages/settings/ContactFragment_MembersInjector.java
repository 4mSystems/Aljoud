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
public final class ContactFragment_MembersInjector implements MembersInjector<ContactFragment> {
  private final Provider<SettingsViewModel> viewModelProvider;

  public ContactFragment_MembersInjector(Provider<SettingsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ContactFragment> create(
      Provider<SettingsViewModel> viewModelProvider) {
    return new ContactFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ContactFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.settings.ContactFragment.viewModel")
  public static void injectViewModel(ContactFragment instance, SettingsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
