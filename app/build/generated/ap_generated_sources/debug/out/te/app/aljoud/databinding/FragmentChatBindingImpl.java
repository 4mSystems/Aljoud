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
        sViewsWithIds.put(R.id.tv_from, 11);
        sViewsWithIds.put(R.id.tv_to, 12);
        sViewsWithIds.put(R.id.rc_files, 13);
        sViewsWithIds.put(R.id.tv_replies, 14);
        sViewsWithIds.put(R.id.progress, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
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
            te.app.aljoud.pages.courseDetails.models.AskRequest viewmodelRequest = null;
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
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.cardview.widget.CardView) bindings[1]
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (android.widget.ProgressBar) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[2]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[11]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[14]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[12]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[4]
            );
        this.attach.setTag(null);
        this.cardInfo.setTag(null);
        this.chatActions.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.more.setTag(null);
        this.rcChat.setTag(null);
        this.sendChat.setTag(null);
        this.tvCreatedAt.setTag(null);
        this.tvDesc.setTag(null);
        this.tvFromValue.setTag(null);
        this.tvToValue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new te.app.aljoud.generated.callback.OnClickListener(this, 3);
        mCallback4 = new te.app.aljoud.generated.callback.OnClickListener(this, 2);
        mCallback3 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        else if (fieldId == BR.chatMain) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.adapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String viewmodelChatMainReceiverName = null;
        te.app.aljoud.pages.courseDetails.models.AskRequest viewmodelRequest = null;
        java.lang.String viewmodelChatMainReceiverJavaLangObjectNullViewmodelChatMainReceiverNameJavaLangString = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        boolean viewmodelChatMainReceiverJavaLangObjectNull = false;
        te.app.aljoud.pages.auth.models.UserData viewmodelChatMainSender = null;
        java.lang.String viewmodelMessage = null;
        java.lang.String viewmodelRequestMessage = null;
        java.lang.String viewmodelChatMainSenderJavaLangObjectNullViewmodelChatMainSenderNameJavaLangString = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewINVISIBLEViewVISIBLE = 0;
        boolean viewmodelChatMainMessageJavaLangObjectNull = false;
        java.lang.String viewmodelChatMainCreatedAt = null;
        te.app.aljoud.pages.chat.model.ChatMain viewmodelChatMain = null;
        java.lang.String viewmodelChatMainMessage = null;
        boolean viewmodelChatMainSenderJavaLangObjectNull = false;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        te.app.aljoud.pages.chat.adapter.ChatAdapter viewmodelAdapter = null;
        te.app.aljoud.pages.auth.models.UserData viewmodelChatMainReceiver = null;
        int viewmodelChatMainMessageJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelChatMainSenderName = null;
        te.app.aljoud.pages.chat.viewmodel.ChatViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x11L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.request
                        viewmodelRequest = viewmodel.request;
                    }


                    if (viewmodelRequest != null) {
                        // read viewmodel.request.message
                        viewmodelRequestMessage = viewmodelRequest.getMessage();
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0x19L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
            }
            if ((dirtyFlags & 0x13L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.chatMain
                        viewmodelChatMain = viewmodel.getChatMain();
                    }


                    if (viewmodelChatMain != null) {
                        // read viewmodel.chatMain.sender
                        viewmodelChatMainSender = viewmodelChatMain.getSender();
                        // read viewmodel.chatMain.createdAt
                        viewmodelChatMainCreatedAt = viewmodelChatMain.getCreatedAt();
                        // read viewmodel.chatMain.message
                        viewmodelChatMainMessage = viewmodelChatMain.getMessage();
                        // read viewmodel.chatMain.receiver
                        viewmodelChatMainReceiver = viewmodelChatMain.getReceiver();
                    }


                    // read viewmodel.chatMain.sender != null
                    viewmodelChatMainSenderJavaLangObjectNull = (viewmodelChatMainSender) != (null);
                    // read viewmodel.chatMain.message != null
                    viewmodelChatMainMessageJavaLangObjectNull = (viewmodelChatMainMessage) != (null);
                    // read viewmodel.chatMain.receiver != null
                    viewmodelChatMainReceiverJavaLangObjectNull = (viewmodelChatMainReceiver) != (null);
                if((dirtyFlags & 0x13L) != 0) {
                    if(viewmodelChatMainSenderJavaLangObjectNull) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }
                if((dirtyFlags & 0x13L) != 0) {
                    if(viewmodelChatMainMessageJavaLangObjectNull) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
                if((dirtyFlags & 0x13L) != 0) {
                    if(viewmodelChatMainReceiverJavaLangObjectNull) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read viewmodel.chatMain.message != null ? View.VISIBLE : View.GONE
                    viewmodelChatMainMessageJavaLangObjectNullViewVISIBLEViewGONE = ((viewmodelChatMainMessageJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x15L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.adapter
                        viewmodelAdapter = viewmodel.getAdapter();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                if (viewmodelChatMainReceiver != null) {
                    // read viewmodel.chatMain.receiver.name
                    viewmodelChatMainReceiverName = viewmodelChatMainReceiver.getName();
                }
        }
        if ((dirtyFlags & 0x4000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.aljoud.utils.Constants.SHOW_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x100L) != 0) {

                if (viewmodelChatMainSender != null) {
                    // read viewmodel.chatMain.sender.name
                    viewmodelChatMainSenderName = viewmodelChatMainSender.getName();
                }
        }

        if ((dirtyFlags & 0x13L) != 0) {

                // read viewmodel.chatMain.receiver != null ? viewmodel.chatMain.receiver.name : ""
                viewmodelChatMainReceiverJavaLangObjectNullViewmodelChatMainReceiverNameJavaLangString = ((viewmodelChatMainReceiverJavaLangObjectNull) ? (viewmodelChatMainReceiverName) : (""));
                // read viewmodel.chatMain.sender != null ? viewmodel.chatMain.sender.name : ""
                viewmodelChatMainSenderJavaLangObjectNullViewmodelChatMainSenderNameJavaLangString = ((viewmodelChatMainSenderJavaLangObjectNull) ? (viewmodelChatMainSenderName) : (""));
        }
        if ((dirtyFlags & 0x19L) != 0) {

                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0x19L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.INVISIBLE : View.VISIBLE
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewINVISIBLEViewVISIBLE = ((textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.attach.setOnClickListener(mCallback3);
            this.chatActions.setOnClickListener(mCallback5);
            this.more.setOnClickListener(mCallback4);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.sendChat, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, sendChatandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.attach.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            this.cardInfo.setVisibility(viewmodelChatMainMessageJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCreatedAt, viewmodelChatMainCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDesc, viewmodelChatMainMessage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvFromValue, viewmodelChatMainSenderJavaLangObjectNullViewmodelChatMainSenderNameJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvToValue, viewmodelChatMainReceiverJavaLangObjectNullViewmodelChatMainReceiverNameJavaLangString);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.getItemsV2Binding(this.rcChat, viewmodelAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sendChat, viewmodelRequestMessage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.aljoud.pages.chat.viewmodel.ChatViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.aljoud.utils.Constants.DIALOG);
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.chatMain
        flag 2 (0x3L): viewmodel.adapter
        flag 3 (0x4L): viewmodel.message
        flag 4 (0x5L): null
        flag 5 (0x6L): viewmodel.chatMain.receiver != null ? viewmodel.chatMain.receiver.name : ""
        flag 6 (0x7L): viewmodel.chatMain.receiver != null ? viewmodel.chatMain.receiver.name : ""
        flag 7 (0x8L): viewmodel.chatMain.sender != null ? viewmodel.chatMain.sender.name : ""
        flag 8 (0x9L): viewmodel.chatMain.sender != null ? viewmodel.chatMain.sender.name : ""
        flag 9 (0xaL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.INVISIBLE : View.VISIBLE
        flag 10 (0xbL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.INVISIBLE : View.VISIBLE
        flag 11 (0xcL): viewmodel.chatMain.message != null ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewmodel.chatMain.message != null ? View.VISIBLE : View.GONE
        flag 13 (0xeL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 14 (0xfL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}