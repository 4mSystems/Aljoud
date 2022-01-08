package te.app.aljoud.pages.chat.viewmodel;

import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.repository.ChatRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChatViewModel_Factory implements Factory<ChatViewModel> {
  private final Provider<ChatRepository> repositoryProvider;

  private final Provider<ChatRepository> repositoryProvider2;

  public ChatViewModel_Factory(Provider<ChatRepository> repositoryProvider,
      Provider<ChatRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public ChatViewModel get() {
    ChatViewModel instance = newInstance(repositoryProvider.get());
    ChatViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static ChatViewModel_Factory create(Provider<ChatRepository> repositoryProvider,
      Provider<ChatRepository> repositoryProvider2) {
    return new ChatViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static ChatViewModel newInstance(ChatRepository repository) {
    return new ChatViewModel(repository);
  }
}
