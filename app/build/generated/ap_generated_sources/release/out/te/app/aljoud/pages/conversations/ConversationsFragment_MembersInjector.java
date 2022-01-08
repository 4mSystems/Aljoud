package te.app.aljoud.pages.conversations;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.pages.conversations.viewModels.ConversationsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ConversationsFragment_MembersInjector implements MembersInjector<ConversationsFragment> {
  private final Provider<ConversationsViewModel> viewModelProvider;

  public ConversationsFragment_MembersInjector(Provider<ConversationsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ConversationsFragment> create(
      Provider<ConversationsViewModel> viewModelProvider) {
    return new ConversationsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ConversationsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.conversations.ConversationsFragment.viewModel")
  public static void injectViewModel(ConversationsFragment instance,
      ConversationsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
