package te.app.aljoud.base;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;

import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.UpdateAvailability;
import com.google.android.play.core.tasks.Task;

public class ImmediateUpdateActivity {
    public final static int UPDATE_REQUEST_CODE = 381;
     static final String TAG = "ImmediateUpdateActivity";
     Activity activity;
     AppUpdateManager appUpdateManager;
    public ImmediateUpdateActivity(Activity activity){
        this.activity = activity;
        init();
    }

    private void init() {
        appUpdateManager = AppUpdateManagerFactory.create(activity);
        Task<AppUpdateInfo> appUpdateInfoTask = appUpdateManager.getAppUpdateInfo();
        Log.d(TAG,appUpdateInfoTask.toString());
        appUpdateInfoTask.addOnSuccessListener(it -> {
            Log.d(TAG, "init: "+it.updateAvailability());
            if(it.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE){
                Log.d(TAG,"update available");
            }
            if(it.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE)){
                Log.d(TAG,"AppUpdateType IMMEDIATE");
            }
            if(it.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE && it.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE)){
                try {
                    appUpdateManager.startUpdateFlowForResult(it,AppUpdateType.IMMEDIATE,activity, UPDATE_REQUEST_CODE);
                } catch (IntentSender.SendIntentException e) {
                    e.printStackTrace();
                    Log.e(TAG, "init: "+e.getMessage() );
                }
            }
        }).addOnFailureListener(e -> Log.e(TAG, "onFailure: "+e.getMessage() ));
    }

    public AppUpdateManager getAppUpdateManager() {
        return appUpdateManager;
    }
}
