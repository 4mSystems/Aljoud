package te.app.aljoud.repository;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class BaseRepository_MembersInjector implements MembersInjector<BaseRepository> {
  private final Provider<ConnectionHelper> connectionHelperProvider;

  public BaseRepository_MembersInjector(Provider<ConnectionHelper> connectionHelperProvider) {
    this.connectionHelperProvider = connectionHelperProvider;
  }

  public static MembersInjector<BaseRepository> create(
      Provider<ConnectionHelper> connectionHelperProvider) {
    return new BaseRepository_MembersInjector(connectionHelperProvider);
  }

  @Override
  public void injectMembers(BaseRepository instance) {
    injectConnectionHelper(instance, connectionHelperProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.repository.BaseRepository.connectionHelper")
  public static void injectConnectionHelper(BaseRepository instance,
      ConnectionHelper connectionHelper) {
    instance.connectionHelper = connectionHelper;
  }
}
