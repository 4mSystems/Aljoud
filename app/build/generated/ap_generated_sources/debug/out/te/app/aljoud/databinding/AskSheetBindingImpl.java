package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AskSheetBindingImpl extends AskSheetBinding implements te.app.aljoud.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.input_reply, 4);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView1;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.askRequest.message
            //         is viewModel.askRequest.setMessage((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewModel.askRequest != null
            boolean viewModelAskRequestJavaLangObjectNull = false;
            // viewModel.askRequest.message
            java.lang.String viewModelAskRequestMessage = null;
            // viewModel
            te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel viewModel = mViewModel;
            // viewModel.askRequest
            te.app.aljoud.pages.courseDetails.models.AskRequest viewModelAskRequest = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAskRequest = viewModel.getAskRequest();

                viewModelAskRequestJavaLangObjectNull = (viewModelAskRequest) != (null);
                if (viewModelAskRequestJavaLangObjectNull) {




                    viewModelAskRequest.setMessage(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public AskSheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private AskSheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            );
        this.icFile.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.AppCompatEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (com.google.android.material.button.MaterialButton) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback43 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
        mCallback44 = new te.app.aljoud.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.askRequest) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String viewModelAskRequestMessage = null;
        te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel viewModel = mViewModel;
        te.app.aljoud.pages.courseDetails.models.AskRequest viewModelAskRequest = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.askRequest
                    viewModelAskRequest = viewModel.getAskRequest();
                }


                if (viewModelAskRequest != null) {
                    // read viewModel.askRequest.message
                    viewModelAskRequestMessage = viewModelAskRequest.getMessage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.icFile.setOnClickListener(mCallback43);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            this.mboundView3.setOnClickListener(mCallback44);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelAskRequestMessage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.action(te.app.aljoud.utils.Constants.PICKED_SUCCESSFULLY);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.ask();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.askRequest
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}