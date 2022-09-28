package te.app.aljoud.utils.helper;

import android.content.Intent;

public interface LauncherInterface {
    interface activityResultInterface {
        void result(int request, int resultCode, Intent result);
    }

    interface permissionInterface {
        void result(int request, boolean result);
    }

}
