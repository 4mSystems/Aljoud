package te.app.aljoud.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.databinding.DataBindingUtil;

import es.voghdev.pdfviewpager.library.RemotePDFViewPager;
import es.voghdev.pdfviewpager.library.adapter.PDFPagerAdapter;
import es.voghdev.pdfviewpager.library.remote.DownloadFile;
import es.voghdev.pdfviewpager.library.util.FileUtil;
import te.app.aljoud.R;
import te.app.aljoud.base.ParentActivity;
import te.app.aljoud.databinding.ActivityRemotePdfBinding;
import te.app.aljoud.utils.Constants;

public class RemotePDFActivity extends ParentActivity implements DownloadFile.Listener {
    RemotePDFViewPager remotePDFViewPager;
    PDFPagerAdapter adapter;
    ActivityRemotePdfBinding remotePdfBinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        remotePdfBinding = DataBindingUtil.setContentView(this, R.layout.activity_remote_pdf);
        String url = getIntent().getStringExtra(Constants.BUNDLE);
        setDownloadButtonListener(url);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (adapter != null) {
            adapter.close();
        }
    }

    protected void setDownloadButtonListener(String url) {
        final DownloadFile.Listener listener = this;
        remotePDFViewPager = new RemotePDFViewPager(this, url, listener);
    }

    public void updateLayout() {
        remotePdfBinding.progress.setVisibility(View.GONE);
        remotePdfBinding.remotePdfRoot.addView(remotePDFViewPager,
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
    }

    @Override
    public void onSuccess(String url, String destinationPath) {
        adapter = new PDFPagerAdapter(this, FileUtil.extractFileNameFromURL(url));
        remotePDFViewPager.setAdapter(adapter);
        updateLayout();
    }

    @Override
    public void onFailure(Exception e) {
        e.printStackTrace();
    }

    @Override
    public void onProgressUpdate(int progress, int total) {

    }
}
