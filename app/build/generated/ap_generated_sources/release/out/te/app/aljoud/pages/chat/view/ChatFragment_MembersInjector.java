package te.app.aljoud.pages.chat.view;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.pages.chat.viewmodel.ChatViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChatFragment_MembersInjector implements MembersInjector<ChatFragment> {
  private final Provider<ChatViewModel> viewModelProvider;

  public ChatFragment_MembersInjector(Provider<ChatViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ChatFragment> create(Provider<ChatViewModel> viewModelProvider) {
    return new ChatFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ChatFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.chat.view.ChatFragment.viewModel")
  public static void injectViewModel(ChatFragment instance, ChatViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
