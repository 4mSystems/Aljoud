package te.app.aljoud.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

import te.app.aljoud.R;
import te.app.aljoud.activity.BaseActivity;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.upload.FileOperations;


public class BaseFragment extends Fragment {
    private Context context;

    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return null;
    }


    protected void pickImageDialogSelect(int requestCode) {
        FileOperations.pickImage(context, BaseFragment.this, requestCode);
    }

    protected void pickDocs() {
        FileOperations.pickDocuments(context, BaseFragment.this, Constants.FILE_TYPE_IMAGE);
    }


    public void handleActions(Mutable mutable) {
        ((ParentActivity) context).handleActions(mutable);
    }

    public void showError(String msg) {
        if (context != null) {
            ((ParentActivity) context).showError(msg);
        }
    }

    public ParentActivity getActivityBase() {
        return ((ParentActivity) context);
    }

    public BaseActivity baseActivity() {
        return ((BaseActivity) context);
    }

    public void toastMessage(String message, int icon, int color) {
        ((ParentActivity) context).toastMessage(message, icon, color);
    }

    public void toastMessageError(String message) {
        ((ParentActivity) context).toastError(message);
    }

    public void toastMessage(String message) {
        ((ParentActivity) context).toastMessage(message, R.drawable.ic_check_white_24dp, R.color.colorPrimaryDark);
    }


    protected void finishActivity() {
        ((ParentActivity) context).finish();
    }

    protected void finishAllActivities() {
        ((ParentActivity) context).finishAffinity();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    private static final String TAG = "BaseFragment";

    @Override
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    public void launchActivityResult(int request, int resultCode, Intent result) {
        Log.e(TAG, "launchActivityResult: " + request);
    }

}
