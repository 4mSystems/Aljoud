package te.app.aljoud.base;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import te.app.aljoud.BR;
import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.utils.images.PhotoFullPopupWindow;
import te.app.aljoud.utils.resources.ResourceManager;
import te.app.aljoud.utils.session.LanguagesHelper;


public class BaseViewModel extends ViewModel implements Observable {
    private MutableLiveData<Object> mutableLiveData = new MutableLiveData<>();
    private String message;
    private PropertyChangeRegistry mCallBacks;
    private PassingObject passingObject = new PassingObject();
    public String lang = LanguagesHelper.getCurrentLanguage();
    int searchProgressVisible = View.GONE;

    public BaseViewModel() {
        mCallBacks = new PropertyChangeRegistry();
    }

    public MutableLiveData<Object> getLiveData() {
        return mutableLiveData == null ? mutableLiveData = new MutableLiveData<>() : mutableLiveData;
    }

    @Bindable
    public String getMessage() {
        return message;
    }

    @Bindable
    public void setMessage(String message) {
        notifyChange(BR.message);
        this.message = message;
    }
    @Bindable
    public int getSearchProgressVisible() {
        return searchProgressVisible;
    }

    @Bindable
    public void setSearchProgressVisible(int searchProgressVisible) {
        notifyChange(BR.searchProgressVisible);
        this.searchProgressVisible = searchProgressVisible;
    }
    public String getString(int stringRes) {
        return ResourceManager.getString(stringRes);
    }

    public Drawable getDrawable(int drawable) {
        return ResourceManager.getDrawable(drawable);
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        mCallBacks.add(callback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        mCallBacks.remove(callback);
    }

    public void goBack(Context context) {
        ((Activity) context).finish();
    }

    public void notifyChange() {
        mCallBacks.notifyChange(this, 0);
    }

    public void notifyChange(int propertyId) {
        mCallBacks.notifyChange(this, propertyId);
    }

    @Bindable
    public PassingObject getPassingObject() {
        return passingObject;
    }

    @Bindable
    public void setPassingObject(PassingObject passingObject) {
        notifyChange(BR.passingObject);
        this.passingObject = passingObject;
    }
    public void showImage(String imgUrl, View imageView) {
        new PhotoFullPopupWindow(MyApplication.getInstance(), R.layout.popup_photo_full, imageView, imgUrl, null);
    }
}
