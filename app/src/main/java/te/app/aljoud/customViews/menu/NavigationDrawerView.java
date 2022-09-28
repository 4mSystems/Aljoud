package te.app.aljoud.customViews.menu;


import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;

import java.util.Objects;

import te.app.aljoud.R;
import te.app.aljoud.base.ParentActivity;
import te.app.aljoud.customViews.actionbar.HomeActionBarView;
import te.app.aljoud.databinding.ExitLayoutBinding;
import te.app.aljoud.databinding.LayoutNavigationDrawerBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.auth.login.LoginFragment;
import te.app.aljoud.pages.conversations.ConversationsFragment;
import te.app.aljoud.pages.installment.InstallmentFragment;
import te.app.aljoud.pages.myCourses.MyCoursesFragment;
import te.app.aljoud.pages.offers.OffersFragment;
import te.app.aljoud.pages.profile.ProfileFragment;
import te.app.aljoud.pages.settings.AboutAppFragment;
import te.app.aljoud.pages.settings.ContactFragment;
import te.app.aljoud.pages.settings.ServiceRequestFragment;
import te.app.aljoud.pages.splash.SplashFragment;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.AppHelper;
import te.app.aljoud.utils.helper.MovementHelper;
import te.app.aljoud.utils.session.LanguagesHelper;


@SuppressLint("ViewConstructor")
public class NavigationDrawerView extends RelativeLayout {
    public MutableLiveData<Mutable> liveData;
    public LayoutNavigationDrawerBinding layoutNavigationDrawerBinding;
    AppCompatActivity context;
    HomeActionBarView homeActionBarView;
    public MenuViewModel menuViewModel;

    public NavigationDrawerView(AppCompatActivity context) {
        super(context);
        this.context = context;
        liveData = new MutableLiveData<>();
        init();
    }

    public NavigationDrawerView(AppCompatActivity context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();

    }

    public NavigationDrawerView(AppCompatActivity context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        this.context = context;
        init();
    }

    private void init() {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        layoutNavigationDrawerBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_navigation_drawer, this, true);
        menuViewModel = new MenuViewModel();
        layoutNavigationDrawerBinding.setMenuViewModel(menuViewModel);
        setEvents();
    }


    public void setActionBar(HomeActionBarView homeActionBarView) {
        this.homeActionBarView = homeActionBarView;
    }

    private void setEvents() {
        menuViewModel.getLiveData().observe(context, o -> {
            if (Constants.ABOUT.equals(o)) {
                MovementHelper.startActivity(context, AboutAppFragment.class.getName(), getResources().getString(R.string.about), null);
            } else if (Constants.UPDATE_PROFILE.equals(o)) {
                MovementHelper.startActivity(context, ProfileFragment.class.getName(), getResources().getString(R.string.profile), null);
            } else if (Constants.CONTACT.equals(o)) {
                MovementHelper.startActivity(context, ContactFragment.class.getName(), getResources().getString(R.string.contact_us), null);
            } else if (Constants.SERVICES.equals(o)) {
                MovementHelper.startActivity(context, ServiceRequestFragment.class.getName(), getResources().getString(R.string.request_course), null);
            } else if (Constants.OFFERS.equals(o)) {
                MovementHelper.startActivity(context, OffersFragment.class.getName(), getResources().getString(R.string.offers), null);
            } else if (Constants.MY_COURSES.equals(o)) {
                MovementHelper.startActivity(context, MyCoursesFragment.class.getName(), getResources().getString(R.string.my_courses), null);
            } else if (Constants.INBOX.equals(o)) {
                MovementHelper.startActivity(context, ConversationsFragment.class.getName(), getResources().getString(R.string.inbox), null);
            } else if (Constants.LOGIN.equals(o)) {
                MovementHelper.startActivity(context, LoginFragment.class.getName(), null, null);
            } else if (Constants.INSTALLMENT.equals(o)) {
                MovementHelper.startActivity(context, InstallmentFragment.class.getName(), context.getString(R.string.installment), null);
            } else if (Constants.SHARE_BAR.equals(o)) {
                AppHelper.shareApp(context);
            } else if (Constants.RATE_APP.equals(o)) {
                AppHelper.rateApp(context);
            } else if (Constants.DIALOG.equals(o)) {
                ((ParentActivity) context).handleActions(new Mutable(Constants.LOGOUT));
            } else if (Constants.LANGUAGE.equals(o)) {
                LanguagesHelper.setLanguage(LanguagesHelper.getCurrentLanguage().equals("ar") ? "en" : "ar");
                MovementHelper.startActivityBase(context, SplashFragment.class.getName(), null, null);
            }
            layoutNavigationDrawerBinding.dlMainNavigationMenu.closeDrawer(GravityCompat.START);
        });

    }

    public void exitDialog() {
        Dialog dialog = new Dialog(context, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ExitLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(dialog.getContext()), R.layout.exit_layout, null, false);
        dialog.setContentView(binding.getRoot());
        binding.agree.setOnClickListener(v -> {
            dialog.dismiss();
            ((ParentActivity) context).handleActions(new Mutable(Constants.LOGOUT));
        });
        binding.decline.setOnClickListener(v -> dialog.dismiss());
        dialog.show();
    }
}
