package te.app.aljoud.connection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ConnectionModule_WebServiceFactory implements Factory<Api> {
  private final ConnectionModule module;

  public ConnectionModule_WebServiceFactory(ConnectionModule module) {
    this.module = module;
  }

  @Override
  public Api get() {
    return webService(module);
  }

  public static ConnectionModule_WebServiceFactory create(ConnectionModule module) {
    return new ConnectionModule_WebServiceFactory(module);
  }

  public static Api webService(ConnectionModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.webService());
  }
}
