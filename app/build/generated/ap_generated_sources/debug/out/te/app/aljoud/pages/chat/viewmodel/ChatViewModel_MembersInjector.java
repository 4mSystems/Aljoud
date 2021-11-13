package te.app.aljoud.pages.chat.viewmodel;

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
public final class ChatViewModel_MembersInjector implements MembersInjector<ChatViewModel> {
  private final Provider<ChatRepository> repositoryProvider;

  public ChatViewModel_MembersInjector(Provider<ChatRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<ChatViewModel> create(Provider<ChatRepository> repositoryProvider) {
    return new ChatViewModel_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(ChatViewModel instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.chat.viewmodel.ChatViewModel.repository")
  public static void injectRepository(ChatViewModel instance, ChatRepository repository) {
    instance.repository = repository;
  }
}
