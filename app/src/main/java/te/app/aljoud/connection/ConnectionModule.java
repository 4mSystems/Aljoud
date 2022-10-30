package te.app.aljoud.connection;


import android.util.Log;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import te.app.aljoud.utils.URLS;
import te.app.aljoud.utils.session.LanguagesHelper;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.TlsVersion;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by Elmohandes on 20/09/2018.
 */


@Module
public class ConnectionModule {

    private Retrofit retrofit = null;
    public static int bufferSize = 256 * 1024;
    private static final String TAG = "ConnectionModule";

    @Singleton
    @Provides
    public Api webService() {
        if (retrofit == null) {
            Log.d(TAG, "retrofit");
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            ConnectionSpec spec = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
                    .tlsVersions(TlsVersion.TLS_1_2)
                    .cipherSuites(
                            CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256,
                            CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256,
                            CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256)
                    .build();


            OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder()
                    //.addInterceptor(interceptor)
                    .connectTimeout(120, TimeUnit.SECONDS)
                    .readTimeout(120, TimeUnit.SECONDS)
                    .writeTimeout(120, TimeUnit.SECONDS);
//                    .connectionSpecs(Collections.singletonList(spec))
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();

            logging.setLevel(HttpLoggingInterceptor.Level.BODY);

            okHttpClientBuilder.addInterceptor(logging);
            okHttpClientBuilder.addInterceptor(chain -> {
                Request request = chain.request();
                Request.Builder newRequest = request.newBuilder();
                if (LanguagesHelper.getJwt() != null) {
                    newRequest.header("jwt", LanguagesHelper.getJwt());
                }
                Log.e(TAG, "webService: "+LanguagesHelper.getJwt() );
                newRequest.addHeader("lang", LanguagesHelper.getCurrentLanguage());
                return chain.proceed(newRequest.build());
            });

            retrofit = new Retrofit.Builder()
                    .baseUrl(URLS.BASE_URL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClientBuilder.build())
                    .build();
        }
        return retrofit.create(Api.class);
    }
}
