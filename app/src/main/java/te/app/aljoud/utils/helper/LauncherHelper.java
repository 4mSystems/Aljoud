package te.app.aljoud.utils.helper;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import java.util.Map;

import te.app.aljoud.base.ParentActivity;


public class LauncherHelper {
    public static int launcherRequest;
    public static String[] storage = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.CAMERA,
    };
    public static ActivityResultLauncher<String[]> requestMultiplePermissions;

    public static void checkPermission(Fragment fragment, int request, LauncherInterface.permissionInterface permissionInterface) {
        requestMultiplePermissions = fragment.registerForActivityResult(
                new ActivityResultContracts.RequestMultiplePermissions(), result -> {
                    boolean final_result = true;
                    if (result != null) {
                        for (Map.Entry<String, Boolean> entry : result.entrySet()) {
                            if (entry == null || entry.getValue() == null || !entry.getValue()) {
                                final_result = false;
                            }
                        }
                    } else final_result = false;
                    permissionInterface.result(request, final_result);
                });
    }

    public static void execute(String[] permissions) {
        requestMultiplePermissions.launch(permissions);
    }

    public static void execute(Intent intent, int launcherRequestIntent, Context context) {
        launcherRequest = launcherRequestIntent;
        ((ParentActivity) context).someActivityResultLauncher.launch(intent);
    }

    public static void onActivityResult(ParentActivity fragment, LauncherInterface.activityResultInterface resultInterface) {
        fragment.someActivityResultLauncher = fragment.registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == Activity.RESULT_OK || result.getResultCode() == launcherRequest) {
                        // There are no request codes
                        resultInterface.result(launcherRequest, result.getResultCode(), result.getData());
                    }
                });
    }
}
