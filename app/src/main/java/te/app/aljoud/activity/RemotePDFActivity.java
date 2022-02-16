package te.app.aljoud.activity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.databinding.DataBindingUtil;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import te.app.aljoud.R;
import te.app.aljoud.base.ParentActivity;
import te.app.aljoud.databinding.ActivityRemotePdfBinding;
import te.app.aljoud.utils.Constants;

public class RemotePDFActivity extends ParentActivity  {
    ActivityRemotePdfBinding remotePdfBinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        remotePdfBinding = DataBindingUtil.setContentView(this, R.layout.activity_remote_pdf);
        String url = getIntent().getStringExtra(Constants.BUNDLE);
        setDownloadButtonListener(url);
    }


    protected void setDownloadButtonListener(String url) {
        new convertToInputStream().execute(url);
    }


    class convertToInputStream extends AsyncTask<String, Void, InputStream> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            remotePdfBinding.progress.setVisibility(View.VISIBLE);
        }

        @Override
        protected InputStream doInBackground(String... strings) {
            // we are using inputstream
            // for getting out PDF.
            InputStream inputStream = null;
            try {
                URL url = new URL(strings[0]);
                // below is the step where we are
                // creating our connection.
                HttpURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
                if (urlConnection.getResponseCode() == 200) {
                    // response is success.
                    // we are getting input stream from url
                    // and storing it in our variable.
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }

            } catch (IOException e) {
                // this is the method
                // to handle errors.
                e.printStackTrace();
                return null;
            }
            return inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            // after the execution of our async
            // task we are loading our pdf in our pdf view.
            remotePdfBinding.progress.setVisibility(View.GONE);
            remotePdfBinding.pdfView.fromStream(inputStream)
                    .onPageChange((page, pageCount) -> {
                        remotePdfBinding.pageCounter.setText(String.valueOf(page + 1).concat("/").concat(String.valueOf(pageCount)));
                    })

                    .load();
        }
    }
}
