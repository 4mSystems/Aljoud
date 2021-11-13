package te.app.aljoud.pages.conversations.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class ConversationsViewModel_MembersInjector implements MembersInjector<ConversationsViewModel> {
  private final Provider<ChatRepository> repositoryProvider;

  public ConversationsViewModel_MembersInjector(Provider<ChatRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<ConversationsViewModel> create(
      Provider<ChatRepository> repositoryProvider) {
    return new ConversationsViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(ConversationsViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.conversations.viewModels.ConversationsViewModel.repository")
  public static void injectRepository(ConversationsViewModel instance, ChatRepository repository) {
    instance.repository = repository;
  }
}
