package te.app.aljoud.pages.conversations.viewModels;

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
public final class ConversationsViewModel_Factory implements Factory<ConversationsViewModel> {
  private final Provider<ChatRepository> repositoryProvider;

  private final Provider<ChatRepository> repositoryProvider2;

  public ConversationsViewModel_Factory(Provider<ChatRepository> repositoryProvider,
      Provider<ChatRepository> repositoryProvider2) {
    this.repositoryProvider = repositoryProvider;
    this.repositoryProvider2 = repositoryProvider2;
  }

  @Override
  public ConversationsViewModel get() {
    ConversationsViewModel instance = newInstance(repositoryProvider.get());
    ConversationsViewModel_MembersInjector.injectRepository(instance, repositoryProvider2.get());
    return instance;
  }

  public static ConversationsViewModel_Factory create(Provider<ChatRepository> repositoryProvider,
      Provider<ChatRepository> repositoryProvider2) {
    return new ConversationsViewModel_Factory(repositoryProvider, repositoryProvider2);
  }

  public static ConversationsViewModel newInstance(ChatRepository repository) {
    return new ConversationsViewModel(repository);
  }
}
