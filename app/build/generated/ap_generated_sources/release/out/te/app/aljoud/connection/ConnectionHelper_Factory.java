package te.app.aljoud.connection;

import dagger.internal.Factory;
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
public final class ConnectionHelper_Factory implements Factory<ConnectionHelper> {
  private final Provider<Api> apiProvider;

  private final Provider<Api> apiProvider2;

  public ConnectionHelper_Factory(Provider<Api> apiProvider, Provider<Api> apiProvider2) {
    this.apiProvider = apiProvider;
    this.apiProvider2 = apiProvider2;
  }

  @Override
  public ConnectionHelper get() {
    ConnectionHelper instance = newInstance(apiProvider.get());
    ConnectionHelper_MembersInjector.injectApi(instance, apiProvider2.get());
    ConnectionHelper_MembersInjector.injectInit(instance);
    return instance;
  }

  public static ConnectionHelper_Factory create(Provider<Api> apiProvider,
      Provider<Api> apiProvider2) {
    return new ConnectionHelper_Factory(apiProvider, apiProvider2);
  }

  public static ConnectionHelper newInstance(Api api) {
    return new ConnectionHelper(api);
  }
}
