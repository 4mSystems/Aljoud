package te.app.aljoud.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.google.gson.Gson;

import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.base.ParentActivity;
import te.app.aljoud.customViews.actionbar.BackActionBarView;
import te.app.aljoud.databinding.ActivityBaseBinding;
import te.app.aljoud.pages.chat.view.ChatFragment;
import te.app.aljoud.pages.courseDetails.FragmentCourseDetails;
import te.app.aljoud.pages.offers.OffersFragment;
import te.app.aljoud.pages.splash.SplashFragment;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.MovementHelper;
import te.app.aljoud.utils.resources.ResourceManager;

public class BaseActivity extends ParentActivity {
    public ActivityBaseBinding activityBaseBinding;
    public BackActionBarView backActionBarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeLanguage();
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        activityBaseBinding = DataBindingUtil.setContentView(this, R.layout.activity_base);
        backActionBarView = new BackActionBarView(this);
        getNotification();
        if (!notification_checked) {
            if (getIntent().hasExtra(Constants.PAGE)) {
                String fragmentName = getIntent().getStringExtra(Constants.PAGE);
                if (fragmentName != null) {
                    try {
                        Fragment fragment = (Fragment) Class.forName(fragmentName).newInstance();
                        MovementHelper.replaceFragmentTag(this, getBundle(fragment), fragmentName, "");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            } else
                MovementHelper.replaceFragment(this, new SplashFragment(), "");
        }
    }

    public void getNotification() {
        if (getIntent() != null && getIntent().getBooleanExtra("is_notification", false)) {
            if (getIntent().getSerializableExtra(Constants.TYPE) != null) {
                notification_checked = true;
                String typeNotifications = getIntent().getStringExtra(Constants.TYPE);
                String postId = getIntent().getStringExtra(Constants.TARGET_ID);
                Log.e("getNotification", "getNotification: " + postId);
                Bundle bundle = new Bundle();
                switch (typeNotifications) {
                    case Constants.course: {
                        FragmentCourseDetails homeMainFragment = new FragmentCourseDetails();
                        bundle.putString(Constants.BUNDLE, new Gson().toJson(new PassingObject(Integer.parseInt(postId))));
                        homeMainFragment.setArguments(bundle);
                        setTitleName(ResourceManager.getString(R.string.course_details));
                        MovementHelper.replaceFragmentTag(this, homeMainFragment, homeMainFragment.getClass().getName(), "");
                        break;
                    }
                    case Constants.inbox: {
                        ChatFragment homeMainFragment = new ChatFragment();
                        setTitleName(ResourceManager.getString(R.string.inbox));
                        MovementHelper.replaceFragmentTag(this, homeMainFragment, homeMainFragment.getClass().getName(), "");
                        break;
                    }
                    case Constants.offer: {
                        OffersFragment homeMainFragment = new OffersFragment();
                        setTitleName(ResourceManager.getString(R.string.offers));
                        MovementHelper.replaceFragmentTag(this, homeMainFragment, homeMainFragment.getClass().getName(), "");
                        break;
                    }
                    default:
                        MovementHelper.replaceFragment(this, new SplashFragment(), "");
                }
            }
        }
    }

    private void setTitleName(@Nullable String title) {
        if (title != null) {
            backActionBarView.setTitle(title);
        } else {
            if (getIntent().hasExtra(Constants.NAME_BAR)) {
                backActionBarView.setTitle(getIntent().getStringExtra(Constants.NAME_BAR));
            }
        }
        activityBaseBinding.llBaseActionBarContainer.addView(backActionBarView);
    }


    private Fragment getBundle(Fragment fragment) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants.BUNDLE, getIntent().getStringExtra(Constants.BUNDLE));
        fragment.setArguments(bundle);
        if (getIntent().hasExtra(Constants.NAME_BAR)) {
            setTitleName(null);
        }
        return fragment;
    }

    @Override
    public void onBackPressed() {
        try {
            if (dialogLoader != null && dialogLoader.isShowing()) {
                dialogLoader.dismiss();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        super.onBackPressed();
    }
}