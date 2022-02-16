package te.app.aljoud.pages.exams;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.pages.exams.viewModels.ExamsViewModel;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ExamsFragment_MembersInjector implements MembersInjector<ExamsFragment> {
  private final Provider<ExamsViewModel> viewModelProvider;

  public ExamsFragment_MembersInjector(Provider<ExamsViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ExamsFragment> create(Provider<ExamsViewModel> viewModelProvider) {
    return new ExamsFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ExamsFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.exams.ExamsFragment.viewModel")
  public static void injectViewModel(ExamsFragment instance, ExamsViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
