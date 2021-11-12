package te.app.aljoud.connection;


import com.google.gson.JsonObject;

import java.util.List;
import java.util.Map;

import io.reactivex.Flowable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Created by Elmohandes on 20/09/2018.
 */

public interface Api {

    @Multipart
    @POST
    Flowable<JsonObject> post(@Url String url, @QueryMap Map<String, String> map, @Part MultipartBody.Part file);

    @Multipart
    @POST
    Flowable<JsonObject> post(@Url String url, @QueryMap Map<String, String> map, @Part List<MultipartBody.Part> image);

    @POST
    Flowable<JsonObject> post(@Url String url, @QueryMap Map<String, String> map, @Body RequestBody file);

    @POST
    Flowable<JsonObject> post(@Url String url, @QueryMap Map<String, String> map);

    @POST
    Flowable<JsonObject> post(@Url String url, @Body Object object);

    @GET
    Flowable<JsonObject> get(@Url String url, @QueryMap Map<String, String> map);

    @DELETE
    Flowable<JsonObject> delete(@Url String url, @QueryMap Map<String, String> map);
}
