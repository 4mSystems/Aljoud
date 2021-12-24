package te.app.aljoud.activity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.databinding.DataBindingUtil;

import im.delight.android.webview.AdvancedWebView;
import te.app.aljoud.R;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.base.ParentActivity;
import te.app.aljoud.databinding.ActivityPaymentVisaBinding;
import te.app.aljoud.utils.Constants;

public class PaymentVisaActivity extends ParentActivity implements AdvancedWebView.Listener {
    ActivityPaymentVisaBinding binding;
    private static final String TAG = "PAYMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IApplicationComponent component = ((MyApplication) getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_payment_visa);
        String url = getIntent().getStringExtra(Constants.BUNDLE);

        if (url != null) {
            Log.e("onCreate", "onCreate: " + url);
            binding.webview.setListener(this, this);
            binding.webview.setMixedContentAllowed(false);
            binding.webview.setDesktopMode(true);
            binding.webview.loadUrl(url);
        }
        binding.imgActionBarCancel.setOnClickListener(v -> finish());
    }

    @SuppressLint("NewApi")
    @Override
    public void onResume() {
        super.onResume();
        binding.webview.onResume();
        // ...
    }

    @SuppressLint("NewApi")
    @Override
    public void onPause() {
        binding.webview.onPause();
        // ...
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        binding.webview.onDestroy();
        // ...
        super.onDestroy();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        binding.webview.onActivityResult(requestCode, resultCode, intent);
    }

    @Override
    public void onBackPressed() {
        if (!binding.webview.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override
    public void onPageStarted(String url, Bitmap favicon) {
        binding.webview.setVisibility(View.VISIBLE);
    }

    @Override
    public void onPageFinished(String url) {
//        https://aljoud-edu.com/api/pay/error?invoice_id=1340340
        Log.e(TAG, "onPageFinished: " + url);
        binding.webProgress.setVisibility(View.GONE);
    }

    @Override
    public void onPageError(int errorCode, String description, String failingUrl) {
        toastError(description);
    }

    @Override
    public void onDownloadRequested(String url, String suggestedFilename, String mimeType, long contentLength, String contentDisposition, String userAgent) {
    }

    @Override
    public void onExternalPageRequest(String url) {
    }
}