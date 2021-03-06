package te.app.aljoud;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import te.app.aljoud.databinding.ActivityBaseBindingImpl;
import te.app.aljoud.databinding.ActivityExoPlayerBindingImpl;
import te.app.aljoud.databinding.ActivityMainBindingImpl;
import te.app.aljoud.databinding.ActivityPaymentVisaBindingImpl;
import te.app.aljoud.databinding.ActivityRemotePdfBindingImpl;
import te.app.aljoud.databinding.AskLessonSheetBindingImpl;
import te.app.aljoud.databinding.AskSheetBindingImpl;
import te.app.aljoud.databinding.ExamResultDialogBindingImpl;
import te.app.aljoud.databinding.ExitLayoutBindingImpl;
import te.app.aljoud.databinding.FragmentAboutBindingImpl;
import te.app.aljoud.databinding.FragmentCategorySectionsBindingImpl;
import te.app.aljoud.databinding.FragmentChangePasswordBindingImpl;
import te.app.aljoud.databinding.FragmentChatBindingImpl;
import te.app.aljoud.databinding.FragmentConfirmCodeBindingImpl;
import te.app.aljoud.databinding.FragmentContactsBindingImpl;
import te.app.aljoud.databinding.FragmentConversationsBindingImpl;
import te.app.aljoud.databinding.FragmentCourseDetailsBindingImpl;
import te.app.aljoud.databinding.FragmentCourseLessonsBindingImpl;
import te.app.aljoud.databinding.FragmentExamsBindingImpl;
import te.app.aljoud.databinding.FragmentForgetPasswordBindingImpl;
import te.app.aljoud.databinding.FragmentHomeBindingImpl;
import te.app.aljoud.databinding.FragmentLessonArticlesBindingImpl;
import te.app.aljoud.databinding.FragmentLessonDetailsBindingImpl;
import te.app.aljoud.databinding.FragmentLessonQuizzesBindingImpl;
import te.app.aljoud.databinding.FragmentLessonVideosBindingImpl;
import te.app.aljoud.databinding.FragmentLoginBindingImpl;
import te.app.aljoud.databinding.FragmentMyCoursesBindingImpl;
import te.app.aljoud.databinding.FragmentOffersBindingImpl;
import te.app.aljoud.databinding.FragmentPaymentMethodsBindingImpl;
import te.app.aljoud.databinding.FragmentPaymentSuccessBindingImpl;
import te.app.aljoud.databinding.FragmentProfileBindingImpl;
import te.app.aljoud.databinding.FragmentRegisterBindingImpl;
import te.app.aljoud.databinding.FragmentServiceRequestBindingImpl;
import te.app.aljoud.databinding.FragmentSplashBindingImpl;
import te.app.aljoud.databinding.FragmentUniversitiesBindingImpl;
import te.app.aljoud.databinding.FragmentUniversityDetailsBindingImpl;
import te.app.aljoud.databinding.InstractorSheetBindingImpl;
import te.app.aljoud.databinding.ItemAnswerBindingImpl;
import te.app.aljoud.databinding.ItemChatBindingImpl;
import te.app.aljoud.databinding.ItemConversationBindingImpl;
import te.app.aljoud.databinding.ItemCourseBindingImpl;
import te.app.aljoud.databinding.ItemCourseLessonBindingImpl;
import te.app.aljoud.databinding.ItemCourseOfferBindingImpl;
import te.app.aljoud.databinding.ItemFilesBindingImpl;
import te.app.aljoud.databinding.ItemHomeBindingImpl;
import te.app.aljoud.databinding.ItemLessonArticleBindingImpl;
import te.app.aljoud.databinding.ItemLessonQuizBindingImpl;
import te.app.aljoud.databinding.ItemLessonVideoBindingImpl;
import te.app.aljoud.databinding.ItemLevelsBindingImpl;
import te.app.aljoud.databinding.ItemOfferBindingImpl;
import te.app.aljoud.databinding.ItemPaymentMethodBindingImpl;
import te.app.aljoud.databinding.ItemPickFileBindingImpl;
import te.app.aljoud.databinding.ItemUniversitySectionBindingImpl;
import te.app.aljoud.databinding.LayoutActionBarBackBindingImpl;
import te.app.aljoud.databinding.LayoutActionBarHomeBindingImpl;
import te.app.aljoud.databinding.LayoutNavigationDrawerBindingImpl;
import te.app.aljoud.databinding.LayoutTesBindingImpl;
import te.app.aljoud.databinding.ReplySheetBindingImpl;
import te.app.aljoud.databinding.SuccessDialogBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBASE = 1;

  private static final int LAYOUT_ACTIVITYEXOPLAYER = 2;

  private static final int LAYOUT_ACTIVITYMAIN = 3;

  private static final int LAYOUT_ACTIVITYPAYMENTVISA = 4;

  private static final int LAYOUT_ACTIVITYREMOTEPDF = 5;

  private static final int LAYOUT_ASKLESSONSHEET = 6;

  private static final int LAYOUT_ASKSHEET = 7;

  private static final int LAYOUT_EXAMRESULTDIALOG = 8;

  private static final int LAYOUT_EXITLAYOUT = 9;

  private static final int LAYOUT_FRAGMENTABOUT = 10;

  private static final int LAYOUT_FRAGMENTCATEGORYSECTIONS = 11;

  private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 12;

  private static final int LAYOUT_FRAGMENTCHAT = 13;

  private static final int LAYOUT_FRAGMENTCONFIRMCODE = 14;

  private static final int LAYOUT_FRAGMENTCONTACTS = 15;

  private static final int LAYOUT_FRAGMENTCONVERSATIONS = 16;

  private static final int LAYOUT_FRAGMENTCOURSEDETAILS = 17;

  private static final int LAYOUT_FRAGMENTCOURSELESSONS = 18;

  private static final int LAYOUT_FRAGMENTEXAMS = 19;

  private static final int LAYOUT_FRAGMENTFORGETPASSWORD = 20;

  private static final int LAYOUT_FRAGMENTHOME = 21;

  private static final int LAYOUT_FRAGMENTLESSONARTICLES = 22;

  private static final int LAYOUT_FRAGMENTLESSONDETAILS = 23;

  private static final int LAYOUT_FRAGMENTLESSONQUIZZES = 24;

  private static final int LAYOUT_FRAGMENTLESSONVIDEOS = 25;

  private static final int LAYOUT_FRAGMENTLOGIN = 26;

  private static final int LAYOUT_FRAGMENTMYCOURSES = 27;

  private static final int LAYOUT_FRAGMENTOFFERS = 28;

  private static final int LAYOUT_FRAGMENTPAYMENTMETHODS = 29;

  private static final int LAYOUT_FRAGMENTPAYMENTSUCCESS = 30;

  private static final int LAYOUT_FRAGMENTPROFILE = 31;

  private static final int LAYOUT_FRAGMENTREGISTER = 32;

  private static final int LAYOUT_FRAGMENTSERVICEREQUEST = 33;

  private static final int LAYOUT_FRAGMENTSPLASH = 34;

  private static final int LAYOUT_FRAGMENTUNIVERSITIES = 35;

  private static final int LAYOUT_FRAGMENTUNIVERSITYDETAILS = 36;

  private static final int LAYOUT_INSTRACTORSHEET = 37;

  private static final int LAYOUT_ITEMANSWER = 38;

  private static final int LAYOUT_ITEMCHAT = 39;

  private static final int LAYOUT_ITEMCONVERSATION = 40;

  private static final int LAYOUT_ITEMCOURSE = 41;

  private static final int LAYOUT_ITEMCOURSELESSON = 42;

  private static final int LAYOUT_ITEMCOURSEOFFER = 43;

  private static final int LAYOUT_ITEMFILES = 44;

  private static final int LAYOUT_ITEMHOME = 45;

  private static final int LAYOUT_ITEMLESSONARTICLE = 46;

  private static final int LAYOUT_ITEMLESSONQUIZ = 47;

  private static final int LAYOUT_ITEMLESSONVIDEO = 48;

  private static final int LAYOUT_ITEMLEVELS = 49;

  private static final int LAYOUT_ITEMOFFER = 50;

  private static final int LAYOUT_ITEMPAYMENTMETHOD = 51;

  private static final int LAYOUT_ITEMPICKFILE = 52;

  private static final int LAYOUT_ITEMUNIVERSITYSECTION = 53;

  private static final int LAYOUT_LAYOUTACTIONBARBACK = 54;

  private static final int LAYOUT_LAYOUTACTIONBARHOME = 55;

  private static final int LAYOUT_LAYOUTNAVIGATIONDRAWER = 56;

  private static final int LAYOUT_LAYOUTTES = 57;

  private static final int LAYOUT_REPLYSHEET = 58;

  private static final int LAYOUT_SUCCESSDIALOG = 59;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(59);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.activity_exo_player, LAYOUT_ACTIVITYEXOPLAYER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.activity_payment_visa, LAYOUT_ACTIVITYPAYMENTVISA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.activity_remote_pdf, LAYOUT_ACTIVITYREMOTEPDF);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.ask_lesson_sheet, LAYOUT_ASKLESSONSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.ask_sheet, LAYOUT_ASKSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.exam_result_dialog, LAYOUT_EXAMRESULTDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.exit_layout, LAYOUT_EXITLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_about, LAYOUT_FRAGMENTABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_category_sections, LAYOUT_FRAGMENTCATEGORYSECTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_change_password, LAYOUT_FRAGMENTCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_chat, LAYOUT_FRAGMENTCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_confirm_code, LAYOUT_FRAGMENTCONFIRMCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_contacts, LAYOUT_FRAGMENTCONTACTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_conversations, LAYOUT_FRAGMENTCONVERSATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_course_details, LAYOUT_FRAGMENTCOURSEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_course_lessons, LAYOUT_FRAGMENTCOURSELESSONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_exams, LAYOUT_FRAGMENTEXAMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_forget_password, LAYOUT_FRAGMENTFORGETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_lesson_articles, LAYOUT_FRAGMENTLESSONARTICLES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_lesson_details, LAYOUT_FRAGMENTLESSONDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_lesson_quizzes, LAYOUT_FRAGMENTLESSONQUIZZES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_lesson_videos, LAYOUT_FRAGMENTLESSONVIDEOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_my_courses, LAYOUT_FRAGMENTMYCOURSES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_offers, LAYOUT_FRAGMENTOFFERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_payment_methods, LAYOUT_FRAGMENTPAYMENTMETHODS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_payment_success, LAYOUT_FRAGMENTPAYMENTSUCCESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_service_request, LAYOUT_FRAGMENTSERVICEREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_universities, LAYOUT_FRAGMENTUNIVERSITIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_university_details, LAYOUT_FRAGMENTUNIVERSITYDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.instractor_sheet, LAYOUT_INSTRACTORSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_answer, LAYOUT_ITEMANSWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_chat, LAYOUT_ITEMCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_conversation, LAYOUT_ITEMCONVERSATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_course, LAYOUT_ITEMCOURSE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_course_lesson, LAYOUT_ITEMCOURSELESSON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_course_offer, LAYOUT_ITEMCOURSEOFFER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_files, LAYOUT_ITEMFILES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_home, LAYOUT_ITEMHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_lesson_article, LAYOUT_ITEMLESSONARTICLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_lesson_quiz, LAYOUT_ITEMLESSONQUIZ);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_lesson_video, LAYOUT_ITEMLESSONVIDEO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_levels, LAYOUT_ITEMLEVELS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_offer, LAYOUT_ITEMOFFER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_payment_method, LAYOUT_ITEMPAYMENTMETHOD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_pick_file, LAYOUT_ITEMPICKFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_university_section, LAYOUT_ITEMUNIVERSITYSECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.layout_action_bar_back, LAYOUT_LAYOUTACTIONBARBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.layout_action_bar_home, LAYOUT_LAYOUTACTIONBARHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.layout_navigation_drawer, LAYOUT_LAYOUTNAVIGATIONDRAWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.layout_tes, LAYOUT_LAYOUTTES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.reply_sheet, LAYOUT_REPLYSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.success_dialog, LAYOUT_SUCCESSDIALOG);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ACTIVITYBASE: {
        if ("layout/activity_base_0".equals(tag)) {
          return new ActivityBaseBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_base is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYEXOPLAYER: {
        if ("layout/activity_exo_player_0".equals(tag)) {
          return new ActivityExoPlayerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_exo_player is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYMAIN: {
        if ("layout/activity_main_0".equals(tag)) {
          return new ActivityMainBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYPAYMENTVISA: {
        if ("layout/activity_payment_visa_0".equals(tag)) {
          return new ActivityPaymentVisaBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_payment_visa is invalid. Received: " + tag);
      }
      case  LAYOUT_ACTIVITYREMOTEPDF: {
        if ("layout/activity_remote_pdf_0".equals(tag)) {
          return new ActivityRemotePdfBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for activity_remote_pdf is invalid. Received: " + tag);
      }
      case  LAYOUT_ASKLESSONSHEET: {
        if ("layout/ask_lesson_sheet_0".equals(tag)) {
          return new AskLessonSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for ask_lesson_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_ASKSHEET: {
        if ("layout/ask_sheet_0".equals(tag)) {
          return new AskSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for ask_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_EXAMRESULTDIALOG: {
        if ("layout/exam_result_dialog_0".equals(tag)) {
          return new ExamResultDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for exam_result_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_EXITLAYOUT: {
        if ("layout/exit_layout_0".equals(tag)) {
          return new ExitLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for exit_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTABOUT: {
        if ("layout/fragment_about_0".equals(tag)) {
          return new FragmentAboutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCATEGORYSECTIONS: {
        if ("layout/fragment_category_sections_0".equals(tag)) {
          return new FragmentCategorySectionsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_category_sections is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCHANGEPASSWORD: {
        if ("layout/fragment_change_password_0".equals(tag)) {
          return new FragmentChangePasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_change_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCHAT: {
        if ("layout/fragment_chat_0".equals(tag)) {
          return new FragmentChatBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_chat is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONFIRMCODE: {
        if ("layout/fragment_confirm_code_0".equals(tag)) {
          return new FragmentConfirmCodeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_confirm_code is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONTACTS: {
        if ("layout/fragment_contacts_0".equals(tag)) {
          return new FragmentContactsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_contacts is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCONVERSATIONS: {
        if ("layout/fragment_conversations_0".equals(tag)) {
          return new FragmentConversationsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_conversations is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCOURSEDETAILS: {
        if ("layout/fragment_course_details_0".equals(tag)) {
          return new FragmentCourseDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_course_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTCOURSELESSONS: {
        if ("layout/fragment_course_lessons_0".equals(tag)) {
          return new FragmentCourseLessonsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_course_lessons is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTEXAMS: {
        if ("layout/fragment_exams_0".equals(tag)) {
          return new FragmentExamsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_exams is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTFORGETPASSWORD: {
        if ("layout/fragment_forget_password_0".equals(tag)) {
          return new FragmentForgetPasswordBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_forget_password is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTHOME: {
        if ("layout/fragment_home_0".equals(tag)) {
          return new FragmentHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLESSONARTICLES: {
        if ("layout/fragment_lesson_articles_0".equals(tag)) {
          return new FragmentLessonArticlesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_lesson_articles is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLESSONDETAILS: {
        if ("layout/fragment_lesson_details_0".equals(tag)) {
          return new FragmentLessonDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_lesson_details is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLESSONQUIZZES: {
        if ("layout/fragment_lesson_quizzes_0".equals(tag)) {
          return new FragmentLessonQuizzesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_lesson_quizzes is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLESSONVIDEOS: {
        if ("layout/fragment_lesson_videos_0".equals(tag)) {
          return new FragmentLessonVideosBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_lesson_videos is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTLOGIN: {
        if ("layout/fragment_login_0".equals(tag)) {
          return new FragmentLoginBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTMYCOURSES: {
        if ("layout/fragment_my_courses_0".equals(tag)) {
          return new FragmentMyCoursesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_my_courses is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTOFFERS: {
        if ("layout/fragment_offers_0".equals(tag)) {
          return new FragmentOffersBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_offers is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPAYMENTMETHODS: {
        if ("layout/fragment_payment_methods_0".equals(tag)) {
          return new FragmentPaymentMethodsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_payment_methods is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPAYMENTSUCCESS: {
        if ("layout/fragment_payment_success_0".equals(tag)) {
          return new FragmentPaymentSuccessBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_payment_success is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTPROFILE: {
        if ("layout/fragment_profile_0".equals(tag)) {
          return new FragmentProfileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTREGISTER: {
        if ("layout/fragment_register_0".equals(tag)) {
          return new FragmentRegisterBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSERVICEREQUEST: {
        if ("layout/fragment_service_request_0".equals(tag)) {
          return new FragmentServiceRequestBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_service_request is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTSPLASH: {
        if ("layout/fragment_splash_0".equals(tag)) {
          return new FragmentSplashBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTUNIVERSITIES: {
        if ("layout/fragment_universities_0".equals(tag)) {
          return new FragmentUniversitiesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_universities is invalid. Received: " + tag);
      }
      case  LAYOUT_FRAGMENTUNIVERSITYDETAILS: {
        if ("layout/fragment_university_details_0".equals(tag)) {
          return new FragmentUniversityDetailsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for fragment_university_details is invalid. Received: " + tag);
      }
      case  LAYOUT_INSTRACTORSHEET: {
        if ("layout/instractor_sheet_0".equals(tag)) {
          return new InstractorSheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for instractor_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMANSWER: {
        if ("layout/item_answer_0".equals(tag)) {
          return new ItemAnswerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_answer is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCHAT: {
        if ("layout/item_chat_0".equals(tag)) {
          return new ItemChatBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_chat is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCONVERSATION: {
        if ("layout/item_conversation_0".equals(tag)) {
          return new ItemConversationBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_conversation is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCOURSE: {
        if ("layout/item_course_0".equals(tag)) {
          return new ItemCourseBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_course is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCOURSELESSON: {
        if ("layout/item_course_lesson_0".equals(tag)) {
          return new ItemCourseLessonBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_course_lesson is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMCOURSEOFFER: {
        if ("layout/item_course_offer_0".equals(tag)) {
          return new ItemCourseOfferBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_course_offer is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMFILES: {
        if ("layout/item_files_0".equals(tag)) {
          return new ItemFilesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_files is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMHOME: {
        if ("layout/item_home_0".equals(tag)) {
          return new ItemHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_home is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMLESSONARTICLE: {
        if ("layout/item_lesson_article_0".equals(tag)) {
          return new ItemLessonArticleBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_lesson_article is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMLESSONQUIZ: {
        if ("layout/item_lesson_quiz_0".equals(tag)) {
          return new ItemLessonQuizBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_lesson_quiz is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMLESSONVIDEO: {
        if ("layout/item_lesson_video_0".equals(tag)) {
          return new ItemLessonVideoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_lesson_video is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMLEVELS: {
        if ("layout/item_levels_0".equals(tag)) {
          return new ItemLevelsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_levels is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMOFFER: {
        if ("layout/item_offer_0".equals(tag)) {
          return new ItemOfferBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_offer is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ITEMPAYMENTMETHOD: {
        if ("layout/item_payment_method_0".equals(tag)) {
          return new ItemPaymentMethodBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_payment_method is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMPICKFILE: {
        if ("layout/item_pick_file_0".equals(tag)) {
          return new ItemPickFileBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_pick_file is invalid. Received: " + tag);
      }
      case  LAYOUT_ITEMUNIVERSITYSECTION: {
        if ("layout/item_university_section_0".equals(tag)) {
          return new ItemUniversitySectionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for item_university_section is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTACTIONBARBACK: {
        if ("layout/layout_action_bar_back_0".equals(tag)) {
          return new LayoutActionBarBackBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_action_bar_back is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTACTIONBARHOME: {
        if ("layout/layout_action_bar_home_0".equals(tag)) {
          return new LayoutActionBarHomeBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_action_bar_home is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTNAVIGATIONDRAWER: {
        if ("layout/layout_navigation_drawer_0".equals(tag)) {
          return new LayoutNavigationDrawerBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_navigation_drawer is invalid. Received: " + tag);
      }
      case  LAYOUT_LAYOUTTES: {
        if ("layout/layout_tes_0".equals(tag)) {
          return new LayoutTesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for layout_tes is invalid. Received: " + tag);
      }
      case  LAYOUT_REPLYSHEET: {
        if ("layout/reply_sheet_0".equals(tag)) {
          return new ReplySheetBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for reply_sheet is invalid. Received: " + tag);
      }
      case  LAYOUT_SUCCESSDIALOG: {
        if ("layout/success_dialog_0".equals(tag)) {
          return new SuccessDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for success_dialog is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(55);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aboutMain");
      sKeys.put(2, "adapter");
      sKeys.put(3, "answersAdapter");
      sKeys.put(4, "answersItem");
      sKeys.put(5, "article");
      sKeys.put(6, "articleMainData");
      sKeys.put(7, "articlesAdapter");
      sKeys.put(8, "askRequest");
      sKeys.put(9, "baseViewModel");
      sKeys.put(10, "chat");
      sKeys.put(11, "chatMain");
      sKeys.put(12, "chatMediaAdapter");
      sKeys.put(13, "collegesAdapter");
      sKeys.put(14, "conversationsAdapter");
      sKeys.put(15, "conversationsData");
      sKeys.put(16, "conversationsMain");
      sKeys.put(17, "course");
      sKeys.put(18, "courseAdapter");
      sKeys.put(19, "courseMainData");
      sKeys.put(20, "examData");
      sKeys.put(21, "filesAdapter");
      sKeys.put(22, "homeMainData");
      sKeys.put(23, "itemChatViewModel");
      sKeys.put(24, "itemViewModel");
      sKeys.put(25, "lessonMainData");
      sKeys.put(26, "lessonQuizzesAdapter");
      sKeys.put(27, "lessonVideosAdapter");
      sKeys.put(28, "lessonsAdapter");
      sKeys.put(29, "lessonsItem");
      sKeys.put(30, "levelsAdapter");
      sKeys.put(31, "levelsData");
      sKeys.put(32, "menuViewModel");
      sKeys.put(33, "message");
      sKeys.put(34, "methodsAdapter");
      sKeys.put(35, "offerItem");
      sKeys.put(36, "offersAdapter");
      sKeys.put(37, "offersMainData");
      sKeys.put(38, "passingObject");
      sKeys.put(39, "paymentMethod");
      sKeys.put(40, "paymentMethodMain");
      sKeys.put(41, "paymentResultData");
      sKeys.put(42, "progress");
      sKeys.put(43, "quizData");
      sKeys.put(44, "quizMainData");
      sKeys.put(45, "request");
      sKeys.put(46, "searchProgressVisible");
      sKeys.put(47, "specialistsItem");
      sKeys.put(48, "university");
      sKeys.put(49, "universityAdapter");
      sKeys.put(50, "universityData");
      sKeys.put(51, "videoData");
      sKeys.put(52, "videosMainData");
      sKeys.put(53, "viewModel");
      sKeys.put(54, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(59);

    static {
      sKeys.put("layout/activity_base_0", te.app.aljoud.R.layout.activity_base);
      sKeys.put("layout/activity_exo_player_0", te.app.aljoud.R.layout.activity_exo_player);
      sKeys.put("layout/activity_main_0", te.app.aljoud.R.layout.activity_main);
      sKeys.put("layout/activity_payment_visa_0", te.app.aljoud.R.layout.activity_payment_visa);
      sKeys.put("layout/activity_remote_pdf_0", te.app.aljoud.R.layout.activity_remote_pdf);
      sKeys.put("layout/ask_lesson_sheet_0", te.app.aljoud.R.layout.ask_lesson_sheet);
      sKeys.put("layout/ask_sheet_0", te.app.aljoud.R.layout.ask_sheet);
      sKeys.put("layout/exam_result_dialog_0", te.app.aljoud.R.layout.exam_result_dialog);
      sKeys.put("layout/exit_layout_0", te.app.aljoud.R.layout.exit_layout);
      sKeys.put("layout/fragment_about_0", te.app.aljoud.R.layout.fragment_about);
      sKeys.put("layout/fragment_category_sections_0", te.app.aljoud.R.layout.fragment_category_sections);
      sKeys.put("layout/fragment_change_password_0", te.app.aljoud.R.layout.fragment_change_password);
      sKeys.put("layout/fragment_chat_0", te.app.aljoud.R.layout.fragment_chat);
      sKeys.put("layout/fragment_confirm_code_0", te.app.aljoud.R.layout.fragment_confirm_code);
      sKeys.put("layout/fragment_contacts_0", te.app.aljoud.R.layout.fragment_contacts);
      sKeys.put("layout/fragment_conversations_0", te.app.aljoud.R.layout.fragment_conversations);
      sKeys.put("layout/fragment_course_details_0", te.app.aljoud.R.layout.fragment_course_details);
      sKeys.put("layout/fragment_course_lessons_0", te.app.aljoud.R.layout.fragment_course_lessons);
      sKeys.put("layout/fragment_exams_0", te.app.aljoud.R.layout.fragment_exams);
      sKeys.put("layout/fragment_forget_password_0", te.app.aljoud.R.layout.fragment_forget_password);
      sKeys.put("layout/fragment_home_0", te.app.aljoud.R.layout.fragment_home);
      sKeys.put("layout/fragment_lesson_articles_0", te.app.aljoud.R.layout.fragment_lesson_articles);
      sKeys.put("layout/fragment_lesson_details_0", te.app.aljoud.R.layout.fragment_lesson_details);
      sKeys.put("layout/fragment_lesson_quizzes_0", te.app.aljoud.R.layout.fragment_lesson_quizzes);
      sKeys.put("layout/fragment_lesson_videos_0", te.app.aljoud.R.layout.fragment_lesson_videos);
      sKeys.put("layout/fragment_login_0", te.app.aljoud.R.layout.fragment_login);
      sKeys.put("layout/fragment_my_courses_0", te.app.aljoud.R.layout.fragment_my_courses);
      sKeys.put("layout/fragment_offers_0", te.app.aljoud.R.layout.fragment_offers);
      sKeys.put("layout/fragment_payment_methods_0", te.app.aljoud.R.layout.fragment_payment_methods);
      sKeys.put("layout/fragment_payment_success_0", te.app.aljoud.R.layout.fragment_payment_success);
      sKeys.put("layout/fragment_profile_0", te.app.aljoud.R.layout.fragment_profile);
      sKeys.put("layout/fragment_register_0", te.app.aljoud.R.layout.fragment_register);
      sKeys.put("layout/fragment_service_request_0", te.app.aljoud.R.layout.fragment_service_request);
      sKeys.put("layout/fragment_splash_0", te.app.aljoud.R.layout.fragment_splash);
      sKeys.put("layout/fragment_universities_0", te.app.aljoud.R.layout.fragment_universities);
      sKeys.put("layout/fragment_university_details_0", te.app.aljoud.R.layout.fragment_university_details);
      sKeys.put("layout/instractor_sheet_0", te.app.aljoud.R.layout.instractor_sheet);
      sKeys.put("layout/item_answer_0", te.app.aljoud.R.layout.item_answer);
      sKeys.put("layout/item_chat_0", te.app.aljoud.R.layout.item_chat);
      sKeys.put("layout/item_conversation_0", te.app.aljoud.R.layout.item_conversation);
      sKeys.put("layout/item_course_0", te.app.aljoud.R.layout.item_course);
      sKeys.put("layout/item_course_lesson_0", te.app.aljoud.R.layout.item_course_lesson);
      sKeys.put("layout/item_course_offer_0", te.app.aljoud.R.layout.item_course_offer);
      sKeys.put("layout/item_files_0", te.app.aljoud.R.layout.item_files);
      sKeys.put("layout/item_home_0", te.app.aljoud.R.layout.item_home);
      sKeys.put("layout/item_lesson_article_0", te.app.aljoud.R.layout.item_lesson_article);
      sKeys.put("layout/item_lesson_quiz_0", te.app.aljoud.R.layout.item_lesson_quiz);
      sKeys.put("layout/item_lesson_video_0", te.app.aljoud.R.layout.item_lesson_video);
      sKeys.put("layout/item_levels_0", te.app.aljoud.R.layout.item_levels);
      sKeys.put("layout/item_offer_0", te.app.aljoud.R.layout.item_offer);
      sKeys.put("layout/item_payment_method_0", te.app.aljoud.R.layout.item_payment_method);
      sKeys.put("layout/item_pick_file_0", te.app.aljoud.R.layout.item_pick_file);
      sKeys.put("layout/item_university_section_0", te.app.aljoud.R.layout.item_university_section);
      sKeys.put("layout/layout_action_bar_back_0", te.app.aljoud.R.layout.layout_action_bar_back);
      sKeys.put("layout/layout_action_bar_home_0", te.app.aljoud.R.layout.layout_action_bar_home);
      sKeys.put("layout/layout_navigation_drawer_0", te.app.aljoud.R.layout.layout_navigation_drawer);
      sKeys.put("layout/layout_tes_0", te.app.aljoud.R.layout.layout_tes);
      sKeys.put("layout/reply_sheet_0", te.app.aljoud.R.layout.reply_sheet);
      sKeys.put("layout/success_dialog_0", te.app.aljoud.R.layout.success_dialog);
    }
  }
}
