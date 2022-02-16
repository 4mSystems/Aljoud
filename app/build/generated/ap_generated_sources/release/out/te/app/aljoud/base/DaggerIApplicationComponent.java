package te.app.aljoud.base;

import dagger.internal.DoubleCheck;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import te.app.aljoud.activity.BaseActivity;
import te.app.aljoud.activity.MainActivity;
import te.app.aljoud.activity.MainActivity_MembersInjector;
import te.app.aljoud.activity.PaymentVisaActivity;
import te.app.aljoud.connection.Api;
import te.app.aljoud.connection.ConnectionHelper;
import te.app.aljoud.connection.ConnectionHelper_Factory;
import te.app.aljoud.connection.ConnectionModule;
import te.app.aljoud.connection.ConnectionModule_WebServiceFactory;
import te.app.aljoud.pages.auth.changePassword.ChangePasswordFragment;
import te.app.aljoud.pages.auth.changePassword.ChangePasswordFragment_MembersInjector;
import te.app.aljoud.pages.auth.changePassword.ChangePasswordViewModel;
import te.app.aljoud.pages.auth.changePassword.ChangePasswordViewModel_Factory;
import te.app.aljoud.pages.auth.changePassword.ChangePasswordViewModel_MembersInjector;
import te.app.aljoud.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.aljoud.pages.auth.confirmCode.ConfirmCodeFragment_MembersInjector;
import te.app.aljoud.pages.auth.confirmCode.ConfirmViewModel;
import te.app.aljoud.pages.auth.confirmCode.ConfirmViewModel_Factory;
import te.app.aljoud.pages.auth.confirmCode.ConfirmViewModel_MembersInjector;
import te.app.aljoud.pages.auth.forgetPassword.ForgetPasswordFragment;
import te.app.aljoud.pages.auth.forgetPassword.ForgetPasswordFragment_MembersInjector;
import te.app.aljoud.pages.auth.forgetPassword.ForgetPasswordViewModel;
import te.app.aljoud.pages.auth.forgetPassword.ForgetPasswordViewModel_Factory;
import te.app.aljoud.pages.auth.forgetPassword.ForgetPasswordViewModel_MembersInjector;
import te.app.aljoud.pages.auth.login.LoginFragment;
import te.app.aljoud.pages.auth.login.LoginFragment_MembersInjector;
import te.app.aljoud.pages.auth.login.LoginViewModel;
import te.app.aljoud.pages.auth.login.LoginViewModel_Factory;
import te.app.aljoud.pages.auth.login.LoginViewModel_MembersInjector;
import te.app.aljoud.pages.auth.register.RegisterFragment;
import te.app.aljoud.pages.auth.register.RegisterFragment_MembersInjector;
import te.app.aljoud.pages.auth.register.RegisterViewModel;
import te.app.aljoud.pages.auth.register.RegisterViewModel_Factory;
import te.app.aljoud.pages.auth.register.RegisterViewModel_MembersInjector;
import te.app.aljoud.pages.chat.view.ChatFragment;
import te.app.aljoud.pages.chat.view.ChatFragment_MembersInjector;
import te.app.aljoud.pages.chat.viewmodel.ChatViewModel;
import te.app.aljoud.pages.chat.viewmodel.ChatViewModel_Factory;
import te.app.aljoud.pages.chat.viewmodel.ChatViewModel_MembersInjector;
import te.app.aljoud.pages.conversations.ConversationsFragment;
import te.app.aljoud.pages.conversations.ConversationsFragment_MembersInjector;
import te.app.aljoud.pages.conversations.viewModels.ConversationsViewModel;
import te.app.aljoud.pages.conversations.viewModels.ConversationsViewModel_Factory;
import te.app.aljoud.pages.conversations.viewModels.ConversationsViewModel_MembersInjector;
import te.app.aljoud.pages.courseDetails.FragmentCourseDetails;
import te.app.aljoud.pages.courseDetails.FragmentCourseDetails_MembersInjector;
import te.app.aljoud.pages.courseDetails.FragmentCourseLessons;
import te.app.aljoud.pages.courseDetails.FragmentCourseLessons_MembersInjector;
import te.app.aljoud.pages.courseDetails.FragmentLessonArticles;
import te.app.aljoud.pages.courseDetails.FragmentLessonArticles_MembersInjector;
import te.app.aljoud.pages.courseDetails.FragmentLessonDetails;
import te.app.aljoud.pages.courseDetails.FragmentLessonDetails_MembersInjector;
import te.app.aljoud.pages.courseDetails.FragmentLessonQuizzes;
import te.app.aljoud.pages.courseDetails.FragmentLessonQuizzes_MembersInjector;
import te.app.aljoud.pages.courseDetails.FragmentLessonVideos;
import te.app.aljoud.pages.courseDetails.FragmentLessonVideos_MembersInjector;
import te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel;
import te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel_Factory;
import te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel_MembersInjector;
import te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel;
import te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel_Factory;
import te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel_MembersInjector;
import te.app.aljoud.pages.courseDetails.viewModels.LessonDetailsViewModel;
import te.app.aljoud.pages.courseDetails.viewModels.LessonDetailsViewModel_Factory;
import te.app.aljoud.pages.courseDetails.viewModels.LessonDetailsViewModel_MembersInjector;
import te.app.aljoud.pages.exams.ExamsFragment;
import te.app.aljoud.pages.exams.ExamsFragment_MembersInjector;
import te.app.aljoud.pages.exams.viewModels.ExamsViewModel;
import te.app.aljoud.pages.exams.viewModels.ExamsViewModel_Factory;
import te.app.aljoud.pages.exams.viewModels.ExamsViewModel_MembersInjector;
import te.app.aljoud.pages.fawaterkPayment.FawterkMethodFragment;
import te.app.aljoud.pages.fawaterkPayment.FawterkMethodFragment_MembersInjector;
import te.app.aljoud.pages.fawaterkPayment.PaymentSuccessFragment;
import te.app.aljoud.pages.fawaterkPayment.PaymentSuccessFragment_MembersInjector;
import te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel;
import te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel_Factory;
import te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel_MembersInjector;
import te.app.aljoud.pages.home.HomeFragment;
import te.app.aljoud.pages.home.HomeFragment_MembersInjector;
import te.app.aljoud.pages.home.viewModels.HomeViewModel;
import te.app.aljoud.pages.home.viewModels.HomeViewModel_Factory;
import te.app.aljoud.pages.home.viewModels.HomeViewModel_MembersInjector;
import te.app.aljoud.pages.home.viewModels.UniversitiesFragment;
import te.app.aljoud.pages.home.viewModels.UniversitiesFragment_MembersInjector;
import te.app.aljoud.pages.myCourses.MyCoursesFragment;
import te.app.aljoud.pages.myCourses.MyCoursesFragment_MembersInjector;
import te.app.aljoud.pages.myCourses.viewModels.MyCoursesViewModel;
import te.app.aljoud.pages.myCourses.viewModels.MyCoursesViewModel_Factory;
import te.app.aljoud.pages.myCourses.viewModels.MyCoursesViewModel_MembersInjector;
import te.app.aljoud.pages.offers.OffersFragment;
import te.app.aljoud.pages.offers.OffersFragment_MembersInjector;
import te.app.aljoud.pages.offers.viewModel.OffersViewModel;
import te.app.aljoud.pages.offers.viewModel.OffersViewModel_Factory;
import te.app.aljoud.pages.offers.viewModel.OffersViewModel_MembersInjector;
import te.app.aljoud.pages.profile.ProfileFragment;
import te.app.aljoud.pages.profile.ProfileFragment_MembersInjector;
import te.app.aljoud.pages.profile.ProfileViewModel;
import te.app.aljoud.pages.profile.ProfileViewModel_Factory;
import te.app.aljoud.pages.profile.ProfileViewModel_MembersInjector;
import te.app.aljoud.pages.settings.AboutAppFragment;
import te.app.aljoud.pages.settings.AboutAppFragment_MembersInjector;
import te.app.aljoud.pages.settings.ContactFragment;
import te.app.aljoud.pages.settings.ContactFragment_MembersInjector;
import te.app.aljoud.pages.settings.ServiceRequestFragment;
import te.app.aljoud.pages.settings.ServiceRequestFragment_MembersInjector;
import te.app.aljoud.pages.settings.viewModels.SettingsViewModel;
import te.app.aljoud.pages.settings.viewModels.SettingsViewModel_Factory;
import te.app.aljoud.pages.settings.viewModels.SettingsViewModel_MembersInjector;
import te.app.aljoud.pages.splash.SplashFragment;
import te.app.aljoud.pages.splash.SplashFragment_MembersInjector;
import te.app.aljoud.pages.splash.SplashViewModel;
import te.app.aljoud.pages.splash.SplashViewModel_Factory;
import te.app.aljoud.pages.splash.SplashViewModel_MembersInjector;
import te.app.aljoud.pages.university.FragmentCategorySections;
import te.app.aljoud.pages.university.FragmentCategorySections_MembersInjector;
import te.app.aljoud.pages.university.FragmentUniversityDetails;
import te.app.aljoud.pages.university.FragmentUniversityDetails_MembersInjector;
import te.app.aljoud.pages.university.viewModel.UniversityViewModel;
import te.app.aljoud.pages.university.viewModel.UniversityViewModel_Factory;
import te.app.aljoud.pages.university.viewModel.UniversityViewModel_MembersInjector;
import te.app.aljoud.repository.AuthRepository;
import te.app.aljoud.repository.AuthRepository_Factory;
import te.app.aljoud.repository.ChatRepository;
import te.app.aljoud.repository.ChatRepository_Factory;
import te.app.aljoud.repository.HomeRepository;
import te.app.aljoud.repository.HomeRepository_Factory;
import te.app.aljoud.repository.SettingsRepository;
import te.app.aljoud.repository.SettingsRepository_Factory;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerIApplicationComponent implements IApplicationComponent {
  private Provider<Api> webServiceProvider;

  private Provider<ConnectionHelper> connectionHelperProvider;

  private Provider<HomeRepository> homeRepositoryProvider;

  private Provider<AuthRepository> authRepositoryProvider;

  private Provider<SettingsRepository> settingsRepositoryProvider;

  private Provider<ChatRepository> chatRepositoryProvider;

  private DaggerIApplicationComponent(ConnectionModule connectionModuleParam) {

    initialize(connectionModuleParam);
  }

  public static IApplicationComponent.Builder builder() {
    return new Builder();
  }

  public static IApplicationComponent create() {
    return new Builder().build();
  }

  private HomeViewModel homeViewModel() {
    return injectHomeViewModel(HomeViewModel_Factory.newInstance(homeRepositoryProvider.get()));
  }

  private SplashViewModel splashViewModel() {
    return injectSplashViewModel(SplashViewModel_Factory.newInstance(homeRepositoryProvider.get()));
  }

  private RegisterViewModel registerViewModel() {
    return injectRegisterViewModel(RegisterViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ProfileViewModel profileViewModel() {
    return injectProfileViewModel(ProfileViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private SettingsViewModel settingsViewModel() {
    return injectSettingsViewModel(SettingsViewModel_Factory.newInstance(settingsRepositoryProvider.get()));
  }

  private LoginViewModel loginViewModel() {
    return injectLoginViewModel(LoginViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ForgetPasswordViewModel forgetPasswordViewModel() {
    return injectForgetPasswordViewModel(ForgetPasswordViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ConfirmViewModel confirmViewModel() {
    return injectConfirmViewModel(ConfirmViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private ChangePasswordViewModel changePasswordViewModel() {
    return injectChangePasswordViewModel(ChangePasswordViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  private UniversityViewModel universityViewModel() {
    return injectUniversityViewModel(UniversityViewModel_Factory.newInstance(homeRepositoryProvider.get()));
  }

  private CourseViewModel courseViewModel() {
    return injectCourseViewModel(CourseViewModel_Factory.newInstance(homeRepositoryProvider.get()));
  }

  private CourseLessonsViewModel courseLessonsViewModel() {
    return injectCourseLessonsViewModel(CourseLessonsViewModel_Factory.newInstance(homeRepositoryProvider.get()));
  }

  private LessonDetailsViewModel lessonDetailsViewModel() {
    return injectLessonDetailsViewModel(LessonDetailsViewModel_Factory.newInstance(homeRepositoryProvider.get()));
  }

  private ConversationsViewModel conversationsViewModel() {
    return injectConversationsViewModel(ConversationsViewModel_Factory.newInstance(chatRepositoryProvider.get()));
  }

  private ChatViewModel chatViewModel() {
    return injectChatViewModel(ChatViewModel_Factory.newInstance(chatRepositoryProvider.get()));
  }

  private OffersViewModel offersViewModel() {
    return injectOffersViewModel(OffersViewModel_Factory.newInstance(homeRepositoryProvider.get()));
  }

  private MyCoursesViewModel myCoursesViewModel() {
    return injectMyCoursesViewModel(MyCoursesViewModel_Factory.newInstance(homeRepositoryProvider.get()));
  }

  private ExamsViewModel examsViewModel() {
    return injectExamsViewModel(ExamsViewModel_Factory.newInstance(homeRepositoryProvider.get()));
  }

  private PaymentsViewModel paymentsViewModel() {
    return injectPaymentsViewModel(PaymentsViewModel_Factory.newInstance(authRepositoryProvider.get()));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ConnectionModule connectionModuleParam) {
    this.webServiceProvider = DoubleCheck.provider(ConnectionModule_WebServiceFactory.create(connectionModuleParam));
    this.connectionHelperProvider = DoubleCheck.provider(ConnectionHelper_Factory.create(webServiceProvider, webServiceProvider));
    this.homeRepositoryProvider = DoubleCheck.provider(HomeRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.authRepositoryProvider = DoubleCheck.provider(AuthRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.settingsRepositoryProvider = DoubleCheck.provider(SettingsRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
    this.chatRepositoryProvider = DoubleCheck.provider(ChatRepository_Factory.create(connectionHelperProvider, connectionHelperProvider, connectionHelperProvider));
  }

  @Override
  public void inject(MainActivity mainActivity) {
    injectMainActivity(mainActivity);
  }

  @Override
  public void inject(BaseActivity tmpActivity) {
  }

  @Override
  public void inject(PaymentVisaActivity paymentVisaActivity) {
  }

  @Override
  public void inject(SplashFragment splashFragment) {
    injectSplashFragment(splashFragment);
  }

  @Override
  public void inject(HomeFragment homeFragment) {
    injectHomeFragment(homeFragment);
  }

  @Override
  public void inject(ProfileFragment profileFragment) {
    injectProfileFragment(profileFragment);
  }

  @Override
  public void inject(UniversitiesFragment universitiesFragment) {
    injectUniversitiesFragment(universitiesFragment);
  }

  @Override
  public void inject(ContactFragment contactFragment) {
    injectContactFragment(contactFragment);
  }

  @Override
  public void inject(AboutAppFragment aboutAppFragment) {
    injectAboutAppFragment(aboutAppFragment);
  }

  @Override
  public void inject(LoginFragment loginFragment) {
    injectLoginFragment(loginFragment);
  }

  @Override
  public void inject(RegisterFragment registerFragment) {
    injectRegisterFragment(registerFragment);
  }

  @Override
  public void inject(ForgetPasswordFragment forgetPasswordFragment) {
    injectForgetPasswordFragment(forgetPasswordFragment);
  }

  @Override
  public void inject(ConfirmCodeFragment confirmCodeFragment) {
    injectConfirmCodeFragment(confirmCodeFragment);
  }

  @Override
  public void inject(ChangePasswordFragment changePasswordFragment) {
    injectChangePasswordFragment(changePasswordFragment);
  }

  @Override
  public void inject(FragmentCategorySections fragmentCategorySections) {
    injectFragmentCategorySections(fragmentCategorySections);
  }

  @Override
  public void inject(FragmentUniversityDetails fragmentUniversityDetails) {
    injectFragmentUniversityDetails(fragmentUniversityDetails);
  }

  @Override
  public void inject(FragmentCourseDetails fragmentCourseDetails) {
    injectFragmentCourseDetails(fragmentCourseDetails);
  }

  @Override
  public void inject(FragmentCourseLessons fragmentCourseLessons) {
    injectFragmentCourseLessons(fragmentCourseLessons);
  }

  @Override
  public void inject(FragmentLessonDetails fragmentLessonDetails) {
    injectFragmentLessonDetails(fragmentLessonDetails);
  }

  @Override
  public void inject(FragmentLessonVideos fragmentLessonVideos) {
    injectFragmentLessonVideos(fragmentLessonVideos);
  }

  @Override
  public void inject(FragmentLessonQuizzes fragmentLessonQuizzes) {
    injectFragmentLessonQuizzes(fragmentLessonQuizzes);
  }

  @Override
  public void inject(FragmentLessonArticles fragmentLessonArticles) {
    injectFragmentLessonArticles(fragmentLessonArticles);
  }

  @Override
  public void inject(ConversationsFragment conversationsFragment) {
    injectConversationsFragment(conversationsFragment);
  }

  @Override
  public void inject(ChatFragment chatFragment) {
    injectChatFragment(chatFragment);
  }

  @Override
  public void inject(OffersFragment offersFragment) {
    injectOffersFragment(offersFragment);
  }

  @Override
  public void inject(MyCoursesFragment myCoursesFragment) {
    injectMyCoursesFragment(myCoursesFragment);
  }

  @Override
  public void inject(ServiceRequestFragment serviceRequestFragment) {
    injectServiceRequestFragment(serviceRequestFragment);
  }

  @Override
  public void inject(ExamsFragment examsFragment) {
    injectExamsFragment(examsFragment);
  }

  @Override
  public void inject(FawterkMethodFragment fawterkMethodFragment) {
    injectFawterkMethodFragment(fawterkMethodFragment);
  }

  @Override
  public void inject(PaymentSuccessFragment paymentSuccessFragment) {
    injectPaymentSuccessFragment(paymentSuccessFragment);
  }

  private HomeViewModel injectHomeViewModel(HomeViewModel instance) {
    HomeViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider.get());
    return instance;
  }

  private MainActivity injectMainActivity(MainActivity instance) {
    MainActivity_MembersInjector.injectViewModel(instance, homeViewModel());
    return instance;
  }

  private SplashViewModel injectSplashViewModel(SplashViewModel instance) {
    SplashViewModel_MembersInjector.injectRepository(instance, homeRepositoryProvider.get());
    return instance;
  }

  private RegisterViewModel injectRegisterViewModel(RegisterViewModel instance) {
    RegisterViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private SplashFragment injectSplashFragment(SplashFragment instance) {
    SplashFragment_MembersInjector.injectViewModel(instance, splashViewModel());
    SplashFragment_MembersInjector.injectRegisterViewModel(instance, registerViewModel());
    return instance;
  }

  private HomeFragment injectHomeFragment(HomeFragment instance) {
    HomeFragment_MembersInjector.injectViewModel(instance, homeViewModel());
    return instance;
  }

  private ProfileViewModel injectProfileViewModel(ProfileViewModel instance) {
    ProfileViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ProfileFragment injectProfileFragment(ProfileFragment instance) {
    ProfileFragment_MembersInjector.injectViewModel(instance, profileViewModel());
    return instance;
  }

  private UniversitiesFragment injectUniversitiesFragment(UniversitiesFragment instance) {
    UniversitiesFragment_MembersInjector.injectViewModel(instance, homeViewModel());
    return instance;
  }

  private SettingsViewModel injectSettingsViewModel(SettingsViewModel instance) {
    SettingsViewModel_MembersInjector.injectRepository(instance, settingsRepositoryProvider.get());
    return instance;
  }

  private ContactFragment injectContactFragment(ContactFragment instance) {
    ContactFragment_MembersInjector.injectViewModel(instance, settingsViewModel());
    return instance;
  }

  private AboutAppFragment injectAboutAppFragment(AboutAppFragment instance) {
    AboutAppFragment_MembersInjector.injectViewModel(instance, settingsViewModel());
    return instance;
  }

  private LoginViewModel injectLoginViewModel(LoginViewModel instance) {
    LoginViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private LoginFragment injectLoginFragment(LoginFragment instance) {
    LoginFragment_MembersInjector.injectViewModel(instance, loginViewModel());
    return instance;
  }

  private RegisterFragment injectRegisterFragment(RegisterFragment instance) {
    RegisterFragment_MembersInjector.injectViewModel(instance, registerViewModel());
    return instance;
  }

  private ForgetPasswordViewModel injectForgetPasswordViewModel(ForgetPasswordViewModel instance) {
    ForgetPasswordViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ForgetPasswordFragment injectForgetPasswordFragment(ForgetPasswordFragment instance) {
    ForgetPasswordFragment_MembersInjector.injectViewModel(instance, forgetPasswordViewModel());
    return instance;
  }

  private ConfirmViewModel injectConfirmViewModel(ConfirmViewModel instance) {
    ConfirmViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ConfirmCodeFragment injectConfirmCodeFragment(ConfirmCodeFragment instance) {
    ConfirmCodeFragment_MembersInjector.injectViewModel(instance, confirmViewModel());
    return instance;
  }

  private ChangePasswordViewModel injectChangePasswordViewModel(ChangePasswordViewModel instance) {
    ChangePasswordViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private ChangePasswordFragment injectChangePasswordFragment(ChangePasswordFragment instance) {
    ChangePasswordFragment_MembersInjector.injectViewModel(instance, changePasswordViewModel());
    return instance;
  }

  private UniversityViewModel injectUniversityViewModel(UniversityViewModel instance) {
    UniversityViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider.get());
    return instance;
  }

  private FragmentCategorySections injectFragmentCategorySections(
      FragmentCategorySections instance) {
    FragmentCategorySections_MembersInjector.injectViewModel(instance, universityViewModel());
    return instance;
  }

  private FragmentUniversityDetails injectFragmentUniversityDetails(
      FragmentUniversityDetails instance) {
    FragmentUniversityDetails_MembersInjector.injectViewModel(instance, universityViewModel());
    return instance;
  }

  private CourseViewModel injectCourseViewModel(CourseViewModel instance) {
    CourseViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider.get());
    return instance;
  }

  private FragmentCourseDetails injectFragmentCourseDetails(FragmentCourseDetails instance) {
    FragmentCourseDetails_MembersInjector.injectViewModel(instance, courseViewModel());
    return instance;
  }

  private CourseLessonsViewModel injectCourseLessonsViewModel(CourseLessonsViewModel instance) {
    CourseLessonsViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider.get());
    return instance;
  }

  private FragmentCourseLessons injectFragmentCourseLessons(FragmentCourseLessons instance) {
    FragmentCourseLessons_MembersInjector.injectViewModel(instance, courseLessonsViewModel());
    return instance;
  }

  private LessonDetailsViewModel injectLessonDetailsViewModel(LessonDetailsViewModel instance) {
    LessonDetailsViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider.get());
    return instance;
  }

  private FragmentLessonDetails injectFragmentLessonDetails(FragmentLessonDetails instance) {
    FragmentLessonDetails_MembersInjector.injectViewModel(instance, lessonDetailsViewModel());
    return instance;
  }

  private FragmentLessonVideos injectFragmentLessonVideos(FragmentLessonVideos instance) {
    FragmentLessonVideos_MembersInjector.injectViewModel(instance, lessonDetailsViewModel());
    return instance;
  }

  private FragmentLessonQuizzes injectFragmentLessonQuizzes(FragmentLessonQuizzes instance) {
    FragmentLessonQuizzes_MembersInjector.injectViewModel(instance, lessonDetailsViewModel());
    return instance;
  }

  private FragmentLessonArticles injectFragmentLessonArticles(FragmentLessonArticles instance) {
    FragmentLessonArticles_MembersInjector.injectViewModel(instance, lessonDetailsViewModel());
    return instance;
  }

  private ConversationsViewModel injectConversationsViewModel(ConversationsViewModel instance) {
    ConversationsViewModel_MembersInjector.injectRepository(instance, chatRepositoryProvider.get());
    return instance;
  }

  private ConversationsFragment injectConversationsFragment(ConversationsFragment instance) {
    ConversationsFragment_MembersInjector.injectViewModel(instance, conversationsViewModel());
    return instance;
  }

  private ChatViewModel injectChatViewModel(ChatViewModel instance) {
    ChatViewModel_MembersInjector.injectRepository(instance, chatRepositoryProvider.get());
    return instance;
  }

  private ChatFragment injectChatFragment(ChatFragment instance) {
    ChatFragment_MembersInjector.injectViewModel(instance, chatViewModel());
    return instance;
  }

  private OffersViewModel injectOffersViewModel(OffersViewModel instance) {
    OffersViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider.get());
    return instance;
  }

  private OffersFragment injectOffersFragment(OffersFragment instance) {
    OffersFragment_MembersInjector.injectViewModel(instance, offersViewModel());
    return instance;
  }

  private MyCoursesViewModel injectMyCoursesViewModel(MyCoursesViewModel instance) {
    MyCoursesViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider.get());
    return instance;
  }

  private MyCoursesFragment injectMyCoursesFragment(MyCoursesFragment instance) {
    MyCoursesFragment_MembersInjector.injectViewModel(instance, myCoursesViewModel());
    return instance;
  }

  private ServiceRequestFragment injectServiceRequestFragment(ServiceRequestFragment instance) {
    ServiceRequestFragment_MembersInjector.injectViewModel(instance, settingsViewModel());
    return instance;
  }

  private ExamsViewModel injectExamsViewModel(ExamsViewModel instance) {
    ExamsViewModel_MembersInjector.injectHomeRepository(instance, homeRepositoryProvider.get());
    return instance;
  }

  private ExamsFragment injectExamsFragment(ExamsFragment instance) {
    ExamsFragment_MembersInjector.injectViewModel(instance, examsViewModel());
    return instance;
  }

  private PaymentsViewModel injectPaymentsViewModel(PaymentsViewModel instance) {
    PaymentsViewModel_MembersInjector.injectRepository(instance, authRepositoryProvider.get());
    return instance;
  }

  private FawterkMethodFragment injectFawterkMethodFragment(FawterkMethodFragment instance) {
    FawterkMethodFragment_MembersInjector.injectViewModel(instance, paymentsViewModel());
    return instance;
  }

  private PaymentSuccessFragment injectPaymentSuccessFragment(PaymentSuccessFragment instance) {
    PaymentSuccessFragment_MembersInjector.injectViewModel(instance, paymentsViewModel());
    return instance;
  }

  private static final class Builder implements IApplicationComponent.Builder {
    @Override
    public IApplicationComponent build() {
      return new DaggerIApplicationComponent(new ConnectionModule());
    }
  }
}
