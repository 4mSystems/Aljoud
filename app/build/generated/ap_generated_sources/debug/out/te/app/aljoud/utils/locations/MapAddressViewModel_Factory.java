package te.app.aljoud.utils.locations;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MapAddressViewModel_Factory implements Factory<MapAddressViewModel> {
  @Override
  public MapAddressViewModel get() {
    return newInstance();
  }

  public static MapAddressViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MapAddressViewModel newInstance() {
    return new MapAddressViewModel();
  }

  private static final class InstanceHolder {
    private static final MapAddressViewModel_Factory INSTANCE = new MapAddressViewModel_Factory();
  }
}
