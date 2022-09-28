package te.app.aljoud.base;

import static te.app.aljoud.base.ImmediateUpdateActivity.UPDATE_REQUEST_CODE;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.UpdateAvailability;
import com.google.firebase.messaging.FirebaseMessaging;

import es.dmoral.toasty.Toasty;
import te.app.aljoud.BuildConfig;
import te.app.aljoud.R;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.auth.login.LoginFragment;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.LauncherHelper;
import te.app.aljoud.utils.helper.MovementHelper;
import te.app.aljoud.utils.resources.ResourceManager;
import te.app.aljoud.utils.session.LanguagesHelper;
import te.app.aljoud.utils.session.MyContextWrapper;
import te.app.aljoud.utils.session.UserHelper;

public class ParentActivity extends AppCompatActivity implements
        ConnectivityReceiver.ConnectivityReceiverListener {
    public MutableLiveData<Boolean> ConnectionLiveData;
    ConnectivityReceiver connectivityReceiver = new ConnectivityReceiver();
    ImmediateUpdateActivity immediateUpdateActivity;
    public ActivityResultLauncher<Intent> someActivityResultLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (!BuildConfig.DEBUG)
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        super.onCreate(savedInstanceState);
        immediateUpdateActivity = new ImmediateUpdateActivity(this);
        ConnectionLiveData = new MutableLiveData<>();
        initializeLanguage();
        initializeToken();
        initializeProgress();
        launchActivityResult();
    }

    protected boolean notification_checked = false;

    protected void initializeLanguage() {
        LanguagesHelper.changeLanguage(this, LanguagesHelper.getCurrentLanguage());
        LanguagesHelper.changeLanguage(MyApplication.getInstance(), LanguagesHelper.getCurrentLanguage());
    }

    protected void initializeToken() {
        FirebaseMessaging.getInstance().getToken()
                .addOnCompleteListener(task -> {
                    if (!task.isSuccessful()) {
                        return;
                    }
                    UserHelper.getInstance(MyApplication.getInstance()).addToken(task.getResult());
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

    @Override
    public void onResume() {
        super.onResume();
        MyApplication.getInstance().setConnectivityListener(this);
        updateAuto();
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addCategory(Intent.CATEGORY_DEFAULT);
        registerReceiver(connectivityReceiver, intentFilter);
    }


    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(connectivityReceiver);

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.N_MR1) {
            super.attachBaseContext(MyContextWrapper.wrap(newBase, LanguagesHelper.getCurrentLanguage()));
        } else {
            super.attachBaseContext(newBase);
        }
    }

    protected Dialog dialogLoader;

    public void initializeProgress() {
        View view = LayoutInflater.from(this).inflate(R.layout.loader_animation, null);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.customDialog);
        builder.setView(view);
        dialogLoader = builder.create();
        dialogLoader.setOnCancelListener(dialogInterface -> dialogLoader.dismiss());
    }

    public void showProgress() {
        if (dialogLoader != null && !this.isFinishing()) {
            dialogLoader.show();
        }
    }

    public void hideProgress() {
        if (dialogLoader != null && dialogLoader.isShowing() && !this.isFinishing())
            dialogLoader.dismiss();
    }


    public void handleActions(Mutable mutable) {
        Log.e("handleActions", "handleActions: " + mutable.message);
        if (mutable.message.equals(Constants.SHOW_PROGRESS)) showProgress();
        else if (mutable.message.equals(Constants.HIDE_PROGRESS)) hideProgress();
        else if (mutable.message.equals(Constants.SERVER_ERROR) && mutable.object == null) {
            hideProgress();
            showError(ResourceManager.getString(R.string.msg_server_error));
        } else if (mutable.message.equals(Constants.ERROR) && mutable.object instanceof String) {
            hideProgress();
            showError((String) mutable.object);
        } else if (mutable.message.equals(Constants.ERROR_NOT_FOUND) && mutable.object instanceof String) {
            hideProgress();
            showError((String) mutable.object);
        } else if (mutable.message.equals(Constants.ERROR_TOAST) && mutable.object instanceof String) {
            toastError((String) mutable.object);
        } else if (mutable.message.equals(Constants.FAILURE_CONNECTION)) {
            hideProgress();
        } else if (mutable.message.equals(Constants.LOGOUT)) {
            if (UserHelper.getInstance(this).getUserData() != null) {
                try {
                    // clearing app data
                    Runtime runtime = Runtime.getRuntime();
                    runtime.exec("pm clear" + MyApplication.getInstance().getPackageName());
                    UserHelper.getInstance(this).logOut();
                    MovementHelper.startActivityBase(this, LoginFragment.class.getName(), null, null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void noConnection() {
        showError(ResourceManager.getString(R.string.connection_invaild_body));
    }

    @Override
    public void onNetworkConnectionChanged(boolean isConnected) {
        if (!isConnected) {
            noConnection();
        }
    }

    public void showError(String msg) {
        Snackbar snackBar = Snackbar.make(findViewById(R.id.ll_base_container),
                msg, Snackbar.LENGTH_LONG);
        View view = snackBar.getView();
        view.setBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent));
        TextView textView = view.findViewById(R.id.snackbar_text);
        textView.setGravity(Gravity.CENTER_VERTICAL);
        textView.setTextColor(ContextCompat.getColor(this, R.color.white));
        snackBar.show();
    }

    public void toastMessage(String message, int icon, int color) {
        Toasty.custom(this, message, icon, color, Toasty.LENGTH_SHORT, true, true).show();
    }

    public void toastError(String message) {
        Toasty.error(this, message, Toasty.LENGTH_SHORT, true).show();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        try {
//            if (resultCode == RESULT_OK) {
//                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fl_home_container);
//                assert fragment != null;
//                fragment.onActivityResult(requestCode, resultCode, data);
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            Toast.makeText(this, ResourceManager.getString(R.string.please_select_another_file), Toast.LENGTH_SHORT).show();
//        }
//    }

    private void launchActivityResult() {
        LauncherHelper.onActivityResult(this, (request, resultCode, result) -> {
            Log.e("launchActivityResult", "launchActivityResult: " + result.getData());
            try {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fl_home_container);
                assert fragment != null;
                if (fragment instanceof BaseFragment)
                    ((BaseFragment) fragment).launchActivityResult(request, resultCode, result);
            } catch (Exception ex) {
                ex.printStackTrace();
                Toast.makeText(this, ResourceManager.getString(R.string.please_select_another_file), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
