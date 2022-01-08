package te.app.aljoud.connection;

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
public final class ConnectionHelper_MembersInjector implements MembersInjector<ConnectionHelper> {
  private final Provider<Api> apiProvider;

  public ConnectionHelper_MembersInjector(Provider<Api> apiProvider) {
    this.apiProvider = apiProvider;
  }

  public static MembersInjector<ConnectionHelper> create(Provider<Api> apiProvider) {
    return new ConnectionHelper_MembersInjector(apiProvider);
  }

  @Override
  public void injectMembers(ConnectionHelper instance) {
    injectApi(instance, apiProvider.get());
    injectInit(instance);
  }

  @InjectedFieldSignature("te.app.aljoud.connection.ConnectionHelper.api")
  public static void injectApi(ConnectionHelper instance, Api api) {
    instance.api = api;
  }

  public static void injectInit(ConnectionHelper instance) {
    instance.init();
  }
}
