package te.app.aljoud.base;

import android.app.Application;

import androidx.databinding.DataBindingUtil;


public class MyApplication extends Application {
    IApplicationComponent applicationComponent;
    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        applicationComponent = DaggerIApplicationComponent.builder().build();
        DataBindingUtil.setDefaultComponent(new ApplicationComponent());
    }
    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }

    public IApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public static synchronized MyApplication getInstance() {
        return mInstance;
    }

}
