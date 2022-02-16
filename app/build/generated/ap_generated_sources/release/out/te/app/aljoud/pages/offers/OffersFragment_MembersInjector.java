package te.app.aljoud.pages.offers;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.pages.offers.viewModel.OffersViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OffersFragment_MembersInjector implements MembersInjector<OffersFragment> {
  private final Provider<OffersViewModel> viewModelProvider;

  public OffersFragment_MembersInjector(Provider<OffersViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<OffersFragment> create(
      Provider<OffersViewModel> viewModelProvider) {
    return new OffersFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(OffersFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.offers.OffersFragment.viewModel")
  public static void injectViewModel(OffersFragment instance, OffersViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
