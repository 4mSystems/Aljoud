package te.app.aljoud.repository;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.connection.ConnectionHelper;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChatRepository_Factory implements Factory<ChatRepository> {
  private final Provider<ConnectionHelper> connectionHelperProvider;

  private final Provider<ConnectionHelper> connectionHelperProvider2;

  private final Provider<ConnectionHelper> connectionHelperProvider3;

  public ChatRepository_Factory(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2,
      Provider<ConnectionHelper> connectionHelperProvider3) {
    this.connectionHelperProvider = connectionHelperProvider;
    this.connectionHelperProvider2 = connectionHelperProvider2;
    this.connectionHelperProvider3 = connectionHelperProvider3;
  }

  @Override
  public ChatRepository get() {
    ChatRepository instance = newInstance(connectionHelperProvider.get());
    BaseRepository_MembersInjector.injectConnectionHelper(instance, connectionHelperProvider2.get());
    ChatRepository_MembersInjector.injectConnectionHelper(instance, connectionHelperProvider3.get());
    return instance;
  }

  public static ChatRepository_Factory create(Provider<ConnectionHelper> connectionHelperProvider,
      Provider<ConnectionHelper> connectionHelperProvider2,
      Provider<ConnectionHelper> connectionHelperProvider3) {
    return new ChatRepository_Factory(connectionHelperProvider, connectionHelperProvider2, connectionHelperProvider3);
  }

  public static ChatRepository newInstance(ConnectionHelper connectionHelper) {
    return new ChatRepository(connectionHelper);
  }
}
