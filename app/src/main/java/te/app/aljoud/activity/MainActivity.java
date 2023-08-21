package te.app.aljoud.activity;

import android.content.IntentSender;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.UpdateAvailability;

import javax.inject.Inject;

import te.app.aljoud.R;
import te.app.aljoud.base.CheckNotificationsPermissions;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.ImmediateUpdateActivity;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.base.ParentActivity;
import te.app.aljoud.customViews.actionbar.HomeActionBarView;
import te.app.aljoud.customViews.menu.NavigationDrawerView;
import te.app.aljoud.databinding.ActivityMainBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.home.HomeFragment;
import te.app.aljoud.pages.home.viewModels.HomeViewModel;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.filepicker.core.FilePicker;
import te.app.aljoud.utils.helper.MovementHelper;

import static te.app.aljoud.base.ImmediateUpdateActivity.UPDATE_REQUEST_CODE;

public class MainActivity extends ParentActivity {
    ActivityMainBinding activityMainBinding;
    @Inject
    HomeViewModel viewModel;
    HomeActionBarView homeActionBarView;
    ImmediateUpdateActivity immediateUpdateActivity;
    public NavigationDrawerView navigationDrawerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeLanguage();
        setContentView(R.layout.activity_main);
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(viewModel);
        homeActionBarView = new HomeActionBarView(this);
        navigationDrawerView = new NavigationDrawerView(this);
        activityMainBinding.llBaseContainer.addView(navigationDrawerView);
        navigationDrawerView.layoutNavigationDrawerBinding.llBaseActionBarContainer.addView(homeActionBarView, 0);
        homeActionBarView.setNavigation(navigationDrawerView);
        homeActionBarView.connectDrawer(navigationDrawerView.layoutNavigationDrawerBinding.dlMainNavigationMenu, true);
        navigationDrawerView.setActionBar(homeActionBarView);
        setHomeActionTitle(getResources().getString(R.string.menuHome), null);
        MovementHelper.replaceFragment(this, new HomeFragment(), "");
        setEvents();
        immediateUpdateActivity = new ImmediateUpdateActivity(this);
        new CheckNotificationsPermissions().checkNotificationsPermissions(this);

    }

    private void setEvents() {
        viewModel.liveData.observe(this, (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            switch (((Mutable) o).message) {
                case Constants.MENU_HOME:
                    MovementHelper.replaceFragment(this, new HomeFragment(), "");
                    break;

            }
        });

    }

    private void updateAuto() {
        immediateUpdateActivity.getAppUpdateManager().getAppUpdateInfo().addOnSuccessListener(it -> {
            if (it.updateAvailability() == UpdateAvailability.DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS) {
                try {
                    immediateUpdateActivity.getAppUpdateManager().startUpdateFlowForResult(it, AppUpdateType.IMMEDIATE, this, UPDATE_REQUEST_CODE);
                } catch (IntentSender.SendIntentException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void setHomeActionTitle(String title, String notificationVisible) {
        homeActionBarView.setTitle(title);
//        if (notificationVisible != null)
//            homeActionBarView.notificationVisible(View.VISIBLE);
//        else
//            homeActionBarView.notificationVisible(View.GONE);
    }

    public HomeActionBarView getHomeActionBarView() {
        return homeActionBarView;
    }

    @Override
    public void onResume() {
        super.onResume();
        updateAuto();
        if (homeActionBarView != null)
            cartCount.setValue(1);
    }

}
