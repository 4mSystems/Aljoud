package te.app.aljoud.connection;


import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Singleton;

import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.utils.Constants;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;


@Singleton
public class ConnectionHelper {

    private static final String TAG = "ConnectionHelper";
    @Inject
    public Api api;

    //    @Inject
    public MutableLiveData<Mutable> liveData;

    public Gson gson;


    @Inject
    public ConnectionHelper(Api api) {
        this.api = api;
//        this.liveData = liveData;
    }

    @Inject
    public void init() {
        gson = new Gson();
    }

    public Disposable requestApi(String url, final Object requestData,
                                 final List<FileObject> fileObjects, final Class<?> responseType, String constantSuccessResponse, boolean showProgress) {
        Map<String, String> map = getParameters(requestData);
        Flowable<JsonObject> call = null;
        MultipartBody.Part file;
        if (fileObjects != null && fileObjects.size() > 0) {
            List<MultipartBody.Part> images = new ArrayList<>();
            for (FileObject fileObject : fileObjects) {
                File myFile = fileObject.getFile();
                RequestBody mFile;
                if (fileObject.getFileType() == Constants.FILE_TYPE_IMAGE) {
                    mFile = RequestBody.create(MediaType.parse("image/*"), myFile);
                } else {
                    mFile = RequestBody.create(MediaType.parse("video/*"), myFile);
                }
                file = MultipartBody.Part.createFormData(fileObject.getParamName(), myFile.getName(), mFile);
                images.add(file);
                call = api.post(url, map, images);
            }
        } else {
            call = api.post(url, map);
        }
        if (showProgress) {
            Log.d(TAG, "showProgress");
            liveData.setValue(new Mutable(Constants.SHOW_PROGRESS));
        }
        return call.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<JsonObject>() {
                    @Override
                    public void onNext(JsonObject response) {
                        hideProgress(showProgress);
                        String jsonString = gson.toJson(response);
                        try {
                            StatusMessage statusMessage = gson.fromJson(jsonString, (Type) responseType);
                            Log.e(TAG, "onNext: " + statusMessage.mMessage);
                            if (statusMessage.code == Constants.RESPONSE_SUCCESS)
                                liveData.setValue(new Mutable(constantSuccessResponse, gson.fromJson(jsonString, responseType)));
                            else if (statusMessage.code == Constants.RESPONSE_JWT_EXPIRE)
                                liveData.setValue(new Mutable(Constants.LOGOUT, statusMessage.mMessage));
                            else
                                liveData.setValue(new Mutable(Constants.ERROR_TOAST, statusMessage.mMessage));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onError(Throwable t) {
                        hideProgress(showProgress);
                        t.printStackTrace();
                        liveData.setValue(new Mutable(Constants.SERVER_ERROR));
                    }

                    @Override
                    public void onComplete() {
                        hideProgress(showProgress);
                    }
                });
    }


    /***
     *
     * @param method (method POST-> 200 , GET->201)
     * @param url (url end point)
     * @param requestData (json object for request your data)
     * @param responseType (json object for delivery your response)
     * @param constantSuccessResponse (constant value for delivery in view example (mutable.message == constantSuccessResponse) => success call)
     * @param showProgress (boolean take true or false)
     */


    public Disposable requestApi(int method, String url, Object requestData, Class<?> responseType, String constantSuccessResponse, boolean showProgress) {
        Flowable<JsonObject> call;
        Map<String, String> map = getParameters(requestData);
        if (method == Constants.POST_REQUEST) {
            call = api.post(url, requestData);//here
        } else if (method == Constants.GET_REQUEST) {
            call = api.get(url, map);
        } else if (method == Constants.DELETE_REQUEST) {
            call = api.delete(url, map);
        } else
            call = api.get(url, map);
        if (showProgress) {
            liveData.setValue(new Mutable(Constants.SHOW_PROGRESS));
        }

        return call.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<JsonObject>() {
                    @Override
                    public void onNext(JsonObject response) {
                        hideProgress(showProgress);
                        String jsonString = gson.toJson(response);
                        Log.e(TAG, "onNext: " + jsonString);
                        try {
                            StatusMessage statusMessage = gson.fromJson(jsonString, (Type) responseType);
                            if (statusMessage.code == Constants.RESPONSE_SUCCESS)
                                liveData.setValue(new Mutable(constantSuccessResponse, gson.fromJson(jsonString, responseType)));
                            else if (statusMessage.code == Constants.RESPONSE_JWT_EXPIRE)
                                liveData.setValue(new Mutable(Constants.LOGOUT, statusMessage.mMessage));
                            else if (statusMessage.code == Constants.RESPONSE_405)
                                liveData.setValue(new Mutable(Constants.NOT_VERIFIED, statusMessage.mMessage));
                            else if (statusMessage.code == Constants.RESPONSE_402) {
                                liveData.setValue(new Mutable(constantSuccessResponse, gson.fromJson(jsonString, responseType)));
                            } else if (statusMessage.code == Constants.RESPONSE_409) {
                                liveData.setValue(new Mutable(Constants.VERSION_CODE_CONFLICT, statusMessage.mMessage));
                            } else
                                liveData.setValue(new Mutable(Constants.ERROR_TOAST, statusMessage.mMessage));
                        } catch (Exception e) {
                            liveData.setValue(new Mutable(Constants.ERROR, e.getMessage()));
                            e.printStackTrace();
                        }

                    }

                    @Override
                    public void onError(Throwable t) {
                        hideProgress(showProgress);
                        liveData.setValue(new Mutable(Constants.SERVER_ERROR));
                    }

                    @Override
                    public void onComplete() {
                        hideProgress(showProgress);
                    }
                });

    }

    private void hideProgress(boolean showProgress) {
        if (showProgress)
            liveData.setValue(new Mutable(Constants.HIDE_PROGRESS));
    }


    private Map<String, String> getParameters(final Object requestData) {
        Map<String, String> params = new HashMap<>();
        if (requestData != null) {
            try {
                JSONObject jsonObject = new JSONObject(gson.toJson(requestData));
                for (int i = 0; i < Objects.requireNonNull(jsonObject.names()).length(); i++) {
                    params.put(Objects.requireNonNull(jsonObject.names()).getString(i), jsonObject.get(Objects.requireNonNull(jsonObject.names()).getString(i)) + "");
                }
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        return params;
    }

}
