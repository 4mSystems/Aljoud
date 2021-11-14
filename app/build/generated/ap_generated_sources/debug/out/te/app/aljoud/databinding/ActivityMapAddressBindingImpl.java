package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMapAddressBindingImpl extends ActivityMapAddressBinding implements te.app.aljoud.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.map_view, 2);
        sViewsWithIds.put(R.id.img_marker_center, 3);
        sViewsWithIds.put(R.id.tv_home_header, 4);
        sViewsWithIds.put(R.id.map_progress, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatButton mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMapAddressBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityMapAddressBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (android.widget.ProgressBar) bindings[5]
            , (com.google.android.gms.maps.MapView) bindings[2]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[4]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatButton) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback22 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mapAddressViewModel == variableId) {
            setMapAddressViewModel((te.app.aljoud.utils.locations.MapAddressViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMapAddressViewModel(@Nullable te.app.aljoud.utils.locations.MapAddressViewModel MapAddressViewModel) {
        updateRegistration(0, MapAddressViewModel);
        this.mMapAddressViewModel = MapAddressViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mapAddressViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMapAddressViewModel((te.app.aljoud.utils.locations.MapAddressViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMapAddressViewModel(te.app.aljoud.utils.locations.MapAddressViewModel MapAddressViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        te.app.aljoud.utils.locations.MapAddressViewModel mapAddressViewModel = mMapAddressViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback22);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // mapAddressViewModel
        te.app.aljoud.utils.locations.MapAddressViewModel mapAddressViewModel = mMapAddressViewModel;
        // mapAddressViewModel != null
        boolean mapAddressViewModelJavaLangObjectNull = false;



        mapAddressViewModelJavaLangObjectNull = (mapAddressViewModel) != (null);
        if (mapAddressViewModelJavaLangObjectNull) {


            mapAddressViewModel.submit();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mapAddressViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}