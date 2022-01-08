package te.app.aljoud.utils.locations;

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
public final class MapAddressActivity_MembersInjector implements MembersInjector<MapAddressActivity> {
  private final Provider<MapAddressViewModel> mapAddressViewModelProvider;

  public MapAddressActivity_MembersInjector(
      Provider<MapAddressViewModel> mapAddressViewModelProvider) {
    this.mapAddressViewModelProvider = mapAddressViewModelProvider;
  }

  public static MembersInjector<MapAddressActivity> create(
      Provider<MapAddressViewModel> mapAddressViewModelProvider) {
    return new MapAddressActivity_MembersInjector(mapAddressViewModelProvider);
  }

  @Override
  public void injectMembers(MapAddressActivity instance) {
    injectMapAddressViewModel(instance, mapAddressViewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.utils.locations.MapAddressActivity.mapAddressViewModel")
  public static void injectMapAddressViewModel(MapAddressActivity instance,
      MapAddressViewModel mapAddressViewModel) {
    instance.mapAddressViewModel = mapAddressViewModel;
  }
}
