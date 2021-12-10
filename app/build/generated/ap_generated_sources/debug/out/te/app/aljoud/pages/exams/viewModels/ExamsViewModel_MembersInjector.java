package te.app.aljoud.pages.exams.viewModels;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.repository.HomeRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ExamsViewModel_MembersInjector implements MembersInjector<ExamsViewModel> {
  private final Provider<HomeRepository> homeRepositoryProvider;

  public ExamsViewModel_MembersInjector(Provider<HomeRepository> homeRepositoryProvider) {
    this.homeRepositoryProvider = homeRepositoryProvider;
  }

  public static MembersInjector<ExamsViewModel> create(
      Provider<HomeRepository> homeRepositoryProvider) {
    return new ExamsViewModel_MembersInjector(homeRepositoryProvider);
  }

  @Override
  public void injectMembers(ExamsViewModel instance) {
    injectHomeRepository(instance, homeRepositoryProvider.get());
  }

  @InjectedFieldSignature("te.app.aljoud.pages.exams.viewModels.ExamsViewModel.homeRepository")
  public static void injectHomeRepository(ExamsViewModel instance, HomeRepository homeRepository) {
    instance.homeRepository = homeRepository;
  }
}
