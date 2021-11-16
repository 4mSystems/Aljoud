package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentChatBindingImpl extends FragmentChatBinding implements te.app.aljoud.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.chat_actions, 5);
        sViewsWithIds.put(R.id.progress, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener sendChatandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.message
            //         is viewmodel.request.setMessage((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(sendChat);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.aljoud.pages.chat.model.ChatRequest viewmodelRequest = null;
            // viewmodel.request.message
            java.lang.String viewmodelRequestMessage = null;
            // viewmodel
            te.app.aljoud.pages.chat.viewmodel.ChatViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.request;

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setMessage(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentChatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (android.widget.ProgressBar) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            );
        this.attach.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.more.setTag(null);
        this.rcChat.setTag(null);
        this.sendChat.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
        mCallback7 = new te.app.aljoud.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.viewmodel == variableId) {
            setViewmodel((te.app.aljoud.pages.chat.viewmodel.ChatViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.aljoud.pages.chat.viewmodel.ChatViewModel Viewmodel) {
        updateRegistration(0, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((te.app.aljoud.pages.chat.viewmodel.ChatViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.aljoud.pages.chat.viewmodel.ChatViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.adapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewINVISIBLEViewVISIBLE = 0;
        te.app.aljoud.pages.chat.model.ChatRequest viewmodelRequest = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        te.app.aljoud.pages.chat.adapter.ChatAdapter viewmodelAdapter = null;
        java.lang.String viewmodelMessage = null;
        java.lang.String viewmodelRequestMessage = null;
        te.app.aljoud.pages.chat.viewmodel.ChatViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0x9L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.request
                        viewmodelRequest = viewmodel.request;
                    }


                    if (viewmodelRequest != null) {
                        // read viewmodel.request.message
                        viewmodelRequestMessage = viewmodelRequest.getMessage();
                    }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.adapter
                        viewmodelAdapter = viewmodel.getAdapter();
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0xdL) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.aljoud.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0xdL) != 0) {

                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0xdL) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.INVISIBLE : View.VISIBLE
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewINVISIBLEViewVISIBLE = ((textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.attach.setOnClickListener(mCallback6);
            this.more.setOnClickListener(mCallback7);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.sendChat, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, sendChatandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.attach.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.getItemsV2Binding(this.rcChat, viewmodelAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sendChat, viewmodelRequestMessage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.aljoud.pages.chat.viewmodel.ChatViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.sendMessage();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.aljoud.pages.chat.viewmodel.ChatViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.select();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.adapter
        flag 2 (0x3L): viewmodel.message
        flag 3 (0x4L): null
        flag 4 (0x5L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.INVISIBLE : View.VISIBLE
        flag 5 (0x6L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.INVISIBLE : View.VISIBLE
        flag 6 (0x7L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 7 (0x8L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}