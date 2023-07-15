package te.app.aljoud.base;

import javax.inject.Singleton;


import dagger.Component;
import te.app.aljoud.activity.BaseActivity;
import te.app.aljoud.activity.MainActivity;
import te.app.aljoud.activity.PaymentVisaActivity;
import te.app.aljoud.connection.ConnectionModule;
import te.app.aljoud.pages.auth.changePassword.ChangePasswordFragment;
import te.app.aljoud.pages.auth.confirmCode.ConfirmCodeFragment;
import te.app.aljoud.pages.auth.forgetPassword.ForgetPasswordFragment;
import te.app.aljoud.pages.auth.login.LoginFragment;
import te.app.aljoud.pages.auth.register.RegisterFragment;
import te.app.aljoud.pages.cart.CartFragment;
import te.app.aljoud.pages.cart.CheckoutFragment;
import te.app.aljoud.pages.chat.view.ChatFragment;
import te.app.aljoud.pages.conversations.ConversationsFragment;
import te.app.aljoud.pages.courseDetails.FragmentCourseDetails;
import te.app.aljoud.pages.courseDetails.FragmentCourseLessons;
import te.app.aljoud.pages.courseDetails.FragmentLessonArticles;
import te.app.aljoud.pages.courseDetails.FragmentLessonDetails;
import te.app.aljoud.pages.courseDetails.FragmentLessonQuizzes;
import te.app.aljoud.pages.courseDetails.FragmentLessonVideos;
import te.app.aljoud.pages.exams.ExamsFragment;
import te.app.aljoud.pages.cart.CheckoutSummaryFragment;
import te.app.aljoud.pages.cart.CheckoutTermsFragment;
import te.app.aljoud.pages.fawaterkPayment.FawterkMethodFragment;
import te.app.aljoud.pages.fawaterkPayment.PaymentSuccessFragment;
import te.app.aljoud.pages.home.viewModels.UniversitiesFragment;
import te.app.aljoud.pages.installment.InstallmentFragment;
import te.app.aljoud.pages.installment.LateInstallmentFragment;
import te.app.aljoud.pages.installment.PaidInstallmentFragment;
import te.app.aljoud.pages.installment.UnPaidInstallmentFragment;
import te.app.aljoud.pages.myCourses.MyCoursesFragment;
import te.app.aljoud.pages.offers.OffersFragment;
import te.app.aljoud.pages.profile.ProfileFragment;
import te.app.aljoud.pages.request_to_buy.FragmentRequestToBuy;
import te.app.aljoud.pages.settings.ServiceRequestFragment;
import te.app.aljoud.pages.university.FragmentCategorySections;
import te.app.aljoud.pages.home.HomeFragment;
import te.app.aljoud.pages.settings.AboutAppFragment;
import te.app.aljoud.pages.settings.ContactFragment;
import te.app.aljoud.pages.splash.SplashFragment;
import te.app.aljoud.pages.university.FragmentUniversityDetails;

@Singleton
@Component(modules = {ConnectionModule.class, LiveData.class})
public interface IApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(BaseActivity tmpActivity);

    void inject(PaymentVisaActivity paymentVisaActivity);

//    void inject(MapAddressActivity mapAddressActivity);

    void inject(SplashFragment splashFragment);

    void inject(HomeFragment homeFragment);

    void inject(ProfileFragment profileFragment);

    void inject(UniversitiesFragment universitiesFragment);

    void inject(ContactFragment contactFragment);

    void inject(AboutAppFragment aboutAppFragment);

    void inject(LoginFragment loginFragment);

    void inject(RegisterFragment registerFragment);

    void inject(ForgetPasswordFragment forgetPasswordFragment);

    void inject(ConfirmCodeFragment confirmCodeFragment);

    void inject(ChangePasswordFragment changePasswordFragment);

    void inject(FragmentCategorySections fragmentCategorySections);

    void inject(FragmentUniversityDetails fragmentUniversityDetails);

    void inject(FragmentCourseDetails fragmentCourseDetails);

    void inject(FragmentCourseLessons fragmentCourseLessons);

    void inject(FragmentLessonDetails fragmentLessonDetails);

    void inject(FragmentLessonVideos fragmentLessonVideos);

    void inject(FragmentLessonQuizzes fragmentLessonQuizzes);

    void inject(FragmentLessonArticles fragmentLessonArticles);

    void inject(ConversationsFragment conversationsFragment);

    void inject(ChatFragment chatFragment);

    void inject(OffersFragment offersFragment);

    void inject(MyCoursesFragment myCoursesFragment);

    void inject(ServiceRequestFragment serviceRequestFragment);

    void inject(ExamsFragment examsFragment);

    void inject(FawterkMethodFragment fawterkMethodFragment);

    void inject(PaymentSuccessFragment paymentSuccessFragment);

    void inject(CartFragment cartFragment);

    void inject(CheckoutTermsFragment checkoutTermsFragment);

    void inject(CheckoutSummaryFragment checkoutSummaryFragment);

    void inject(InstallmentFragment installmentFragment);

    void inject(PaidInstallmentFragment paidInstallmentFragment);

    void inject(UnPaidInstallmentFragment unPaidInstallmentFragment);

    void inject(LateInstallmentFragment lateInstallmentFragment);

    void inject(CheckoutFragment checkoutFragment);
    void inject(FragmentRequestToBuy fragmentRequestToBuy);

    @Component.Builder
    interface Builder {
        IApplicationComponent build();
    }
}
