package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterBindingImpl extends FragmentRegisterBinding implements te.app.aljoud.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ic_back, 11);
        sViewsWithIds.put(R.id.card_login, 12);
        sViewsWithIds.put(R.id.ic_logo, 13);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView4;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView6;
    @NonNull
    private final androidx.appcompat.widget.AppCompatEditText mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener autoandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.name
            //         is viewmodel.request.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(auto);
            // localize variables for thread safety
            // viewmodel.request.name
            java.lang.String viewmodelRequestName = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.aljoud.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            te.app.aljoud.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.email
            //         is viewmodel.request.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request.email
            java.lang.String viewmodelRequestEmail = null;
            // viewmodel.request
            te.app.aljoud.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel
            te.app.aljoud.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.phone
            //         is viewmodel.request.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.aljoud.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.phone
            java.lang.String viewmodelRequestPhone = null;
            // viewmodel
            te.app.aljoud.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setPhone(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.request.password
            //         is viewmodel.request.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.request
            te.app.aljoud.pages.auth.models.RegisterRequest viewmodelRequest = null;
            // viewmodel.request.password
            java.lang.String viewmodelRequestPassword = null;
            // viewmodel
            te.app.aljoud.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
            // viewmodel.request != null
            boolean viewmodelRequestJavaLangObjectNull = false;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelRequest = viewmodel.getRequest();

                viewmodelRequestJavaLangObjectNull = (viewmodelRequest) != (null);
                if (viewmodelRequestJavaLangObjectNull) {




                    viewmodelRequest.setPassword(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[13]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[10]
            );
        this.appCompatButtonNext.setTag(null);
        this.auto.setTag(null);
        this.inputEmail.setTag(null);
        this.inputName.setTag(null);
        this.inputPassword.setTag(null);
        this.inputPhone.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (androidx.appcompat.widget.AppCompatEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (androidx.appcompat.widget.AppCompatEditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (androidx.appcompat.widget.AppCompatEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.progress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback42 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setViewmodel((te.app.aljoud.pages.auth.register.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.aljoud.pages.auth.register.RegisterViewModel Viewmodel) {
        updateRegistration(4, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelRequestEmailError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelRequestPasswordError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelRequestNameError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelRequestPhoneError((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodel((te.app.aljoud.pages.auth.register.RegisterViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelRequestEmailError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestEmailError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestPasswordError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestPasswordError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestNameError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRequestPhoneError(androidx.databinding.ObservableField<java.lang.String> ViewmodelRequestPhoneError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.aljoud.pages.auth.register.RegisterViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.request) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.message) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        te.app.aljoud.pages.auth.models.RegisterRequest viewmodelRequest = null;
        boolean textUtilsIsEmptyViewmodelMessage = false;
        boolean TextUtilsIsEmptyViewmodelMessage1 = false;
        java.lang.String viewmodelRequestName = null;
        java.lang.String viewmodelRequestEmail = null;
        boolean viewmodelRequestPhoneErrorJavaLangObjectNullBooleanFalseBooleanTrue = false;
        boolean viewmodelRequestNameErrorJavaLangObjectNullBooleanFalseBooleanTrue = false;
        android.graphics.drawable.Drawable textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewPrimaryDarkAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = null;
        java.lang.String viewmodelRequestPhoneErrorGet = null;
        java.lang.String viewmodelMessage = null;
        boolean viewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        java.lang.String viewmodelRequestPasswordErrorGet = null;
        java.lang.String viewmodelRequestNameErrorGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestEmailError = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestPasswordError = null;
        boolean viewmodelRequestPasswordErrorJavaLangObjectNullBooleanFalseBooleanTrue = false;
        java.lang.String viewmodelRequestPassword = null;
        boolean viewmodelRequestNameErrorJavaLangObjectNull = false;
        boolean viewmodelRequestPhoneErrorJavaLangObjectNull = false;
        java.lang.String viewmodelRequestPhone = null;
        boolean textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestNameError = null;
        boolean viewmodelRequestEmailErrorJavaLangObjectNullBooleanFalseBooleanTrue = false;
        boolean viewmodelRequestPasswordErrorJavaLangObjectNull = false;
        boolean viewmodelMessageEqualsConstantsSHOWPROGRESS = false;
        androidx.databinding.ObservableField<java.lang.String> viewmodelRequestPhoneError = null;
        int textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewmodelRequestEmailErrorJavaLangObjectNull = false;
        java.lang.String viewmodelRequestEmailErrorGet = null;
        te.app.aljoud.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;
        boolean textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = false;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xbfL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.request
                        viewmodelRequest = viewmodel.getRequest();
                    }

                if ((dirtyFlags & 0xb0L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.name
                            viewmodelRequestName = viewmodelRequest.getName();
                            // read viewmodel.request.email
                            viewmodelRequestEmail = viewmodelRequest.getEmail();
                            // read viewmodel.request.password
                            viewmodelRequestPassword = viewmodelRequest.getPassword();
                            // read viewmodel.request.phone
                            viewmodelRequestPhone = viewmodelRequest.getPhone();
                        }
                }
                if ((dirtyFlags & 0xb1L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.emailError
                            viewmodelRequestEmailError = viewmodelRequest.emailError;
                        }
                        updateRegistration(0, viewmodelRequestEmailError);


                        if (viewmodelRequestEmailError != null) {
                            // read viewmodel.request.emailError.get()
                            viewmodelRequestEmailErrorGet = viewmodelRequestEmailError.get();
                        }


                        // read viewmodel.request.emailError.get() == null
                        viewmodelRequestEmailErrorJavaLangObjectNull = (viewmodelRequestEmailErrorGet) == (null);
                    if((dirtyFlags & 0xb1L) != 0) {
                        if(viewmodelRequestEmailErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x200000L;
                        }
                        else {
                                dirtyFlags |= 0x100000L;
                        }
                    }


                        // read viewmodel.request.emailError.get() == null ? false : true
                        viewmodelRequestEmailErrorJavaLangObjectNullBooleanFalseBooleanTrue = ((viewmodelRequestEmailErrorJavaLangObjectNull) ? (false) : (true));
                }
                if ((dirtyFlags & 0xb2L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.passwordError
                            viewmodelRequestPasswordError = viewmodelRequest.passwordError;
                        }
                        updateRegistration(1, viewmodelRequestPasswordError);


                        if (viewmodelRequestPasswordError != null) {
                            // read viewmodel.request.passwordError.get()
                            viewmodelRequestPasswordErrorGet = viewmodelRequestPasswordError.get();
                        }


                        // read viewmodel.request.passwordError.get() == null
                        viewmodelRequestPasswordErrorJavaLangObjectNull = (viewmodelRequestPasswordErrorGet) == (null);
                    if((dirtyFlags & 0xb2L) != 0) {
                        if(viewmodelRequestPasswordErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x20000L;
                        }
                        else {
                                dirtyFlags |= 0x10000L;
                        }
                    }


                        // read viewmodel.request.passwordError.get() == null ? false : true
                        viewmodelRequestPasswordErrorJavaLangObjectNullBooleanFalseBooleanTrue = ((viewmodelRequestPasswordErrorJavaLangObjectNull) ? (false) : (true));
                }
                if ((dirtyFlags & 0xb4L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.nameError
                            viewmodelRequestNameError = viewmodelRequest.nameError;
                        }
                        updateRegistration(2, viewmodelRequestNameError);


                        if (viewmodelRequestNameError != null) {
                            // read viewmodel.request.nameError.get()
                            viewmodelRequestNameErrorGet = viewmodelRequestNameError.get();
                        }


                        // read viewmodel.request.nameError.get() == null
                        viewmodelRequestNameErrorJavaLangObjectNull = (viewmodelRequestNameErrorGet) == (null);
                    if((dirtyFlags & 0xb4L) != 0) {
                        if(viewmodelRequestNameErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x800L;
                        }
                        else {
                                dirtyFlags |= 0x400L;
                        }
                    }


                        // read viewmodel.request.nameError.get() == null ? false : true
                        viewmodelRequestNameErrorJavaLangObjectNullBooleanFalseBooleanTrue = ((viewmodelRequestNameErrorJavaLangObjectNull) ? (false) : (true));
                }
                if ((dirtyFlags & 0xb8L) != 0) {

                        if (viewmodelRequest != null) {
                            // read viewmodel.request.phoneError
                            viewmodelRequestPhoneError = viewmodelRequest.phoneError;
                        }
                        updateRegistration(3, viewmodelRequestPhoneError);


                        if (viewmodelRequestPhoneError != null) {
                            // read viewmodel.request.phoneError.get()
                            viewmodelRequestPhoneErrorGet = viewmodelRequestPhoneError.get();
                        }


                        // read viewmodel.request.phoneError.get() == null
                        viewmodelRequestPhoneErrorJavaLangObjectNull = (viewmodelRequestPhoneErrorGet) == (null);
                    if((dirtyFlags & 0xb8L) != 0) {
                        if(viewmodelRequestPhoneErrorJavaLangObjectNull) {
                                dirtyFlags |= 0x200L;
                        }
                        else {
                                dirtyFlags |= 0x100L;
                        }
                    }


                        // read viewmodel.request.phoneError.get() == null ? false : true
                        viewmodelRequestPhoneErrorJavaLangObjectNullBooleanFalseBooleanTrue = ((viewmodelRequestPhoneErrorJavaLangObjectNull) ? (false) : (true));
                }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.message
                        viewmodelMessage = viewmodel.getMessage();
                    }


                    // read TextUtils.isEmpty(viewmodel.message)
                    textUtilsIsEmptyViewmodelMessage = android.text.TextUtils.isEmpty(viewmodelMessage);
                if((dirtyFlags & 0xd0L) != 0) {
                    if(textUtilsIsEmptyViewmodelMessage) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read !TextUtils.isEmpty(viewmodel.message)
                    TextUtilsIsEmptyViewmodelMessage1 = !textUtilsIsEmptyViewmodelMessage;
                if((dirtyFlags & 0xd0L) != 0) {
                    if(TextUtilsIsEmptyViewmodelMessage1) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.HIDE_PROGRESS)
                    viewmodelMessageEqualsConstantsHIDEPROGRESS = viewmodelMessage.equals(te.app.aljoud.utils.Constants.HIDE_PROGRESS);
                }
        }
        if ((dirtyFlags & 0x2000000L) != 0) {

                if (viewmodelMessage != null) {
                    // read viewmodel.message.equals(Constants.SHOW_PROGRESS)
                    viewmodelMessageEqualsConstantsSHOWPROGRESS = viewmodelMessage.equals(te.app.aljoud.utils.Constants.SHOW_PROGRESS);
                }
        }

        if ((dirtyFlags & 0xd0L) != 0) {

                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS = ((textUtilsIsEmptyViewmodelMessage) ? (true) : (viewmodelMessageEqualsConstantsHIDEPROGRESS));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse = ((TextUtilsIsEmptyViewmodelMessage1) ? (viewmodelMessageEqualsConstantsSHOWPROGRESS) : (false));
            if((dirtyFlags & 0xd0L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x40000L;
                }
            }
            if((dirtyFlags & 0xd0L) != 0) {
                if(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }


                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_primary_medium
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewPrimaryDarkAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(appCompatButtonNext.getContext(), R.drawable.corner_view_primary_dark)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(appCompatButtonNext.getContext(), R.drawable.corner_view_primary_medium)));
                // read TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
                textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse = ((textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESS) ? (true) : (false));
                // read !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.appCompatButtonNext, textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSAppCompatButtonNextAndroidDrawableCornerViewPrimaryDarkAppCompatButtonNextAndroidDrawableCornerViewPrimaryMedium);
            this.appCompatButtonNext.setEnabled(textUtilsIsEmptyViewmodelMessageBooleanTrueViewmodelMessageEqualsConstantsHIDEPROGRESSBooleanTrueBooleanFalse);
            this.progress.setVisibility(textUtilsIsEmptyViewmodelMessageViewmodelMessageEqualsConstantsSHOWPROGRESSBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.appCompatButtonNext.setOnClickListener(mCallback42);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.auto, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, autoandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xb0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.auto, viewmodelRequestName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewmodelRequestEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewmodelRequestPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewmodelRequestPassword);
        }
        if ((dirtyFlags & 0xb1L) != 0) {
            // api target 1

            this.inputEmail.setError(viewmodelRequestEmailErrorGet);
            this.inputEmail.setErrorEnabled(viewmodelRequestEmailErrorJavaLangObjectNullBooleanFalseBooleanTrue);
        }
        if ((dirtyFlags & 0xb4L) != 0) {
            // api target 1

            this.inputName.setError(viewmodelRequestNameErrorGet);
            this.inputName.setErrorEnabled(viewmodelRequestNameErrorJavaLangObjectNullBooleanFalseBooleanTrue);
        }
        if ((dirtyFlags & 0xb2L) != 0) {
            // api target 1

            this.inputPassword.setError(viewmodelRequestPasswordErrorGet);
            this.inputPassword.setErrorEnabled(viewmodelRequestPasswordErrorJavaLangObjectNullBooleanFalseBooleanTrue);
        }
        if ((dirtyFlags & 0xb8L) != 0) {
            // api target 1

            this.inputPhone.setError(viewmodelRequestPhoneErrorGet);
            this.inputPhone.setErrorEnabled(viewmodelRequestPhoneErrorJavaLangObjectNullBooleanFalseBooleanTrue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        te.app.aljoud.pages.auth.register.RegisterViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.register();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.request.emailError
        flag 1 (0x2L): viewmodel.request.passwordError
        flag 2 (0x3L): viewmodel.request.nameError
        flag 3 (0x4L): viewmodel.request.phoneError
        flag 4 (0x5L): viewmodel
        flag 5 (0x6L): viewmodel.request
        flag 6 (0x7L): viewmodel.message
        flag 7 (0x8L): null
        flag 8 (0x9L): viewmodel.request.phoneError.get() == null ? false : true
        flag 9 (0xaL): viewmodel.request.phoneError.get() == null ? false : true
        flag 10 (0xbL): viewmodel.request.nameError.get() == null ? false : true
        flag 11 (0xcL): viewmodel.request.nameError.get() == null ? false : true
        flag 12 (0xdL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_primary_medium
        flag 13 (0xeL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? @android:drawable/corner_view_primary_dark : @android:drawable/corner_view_primary_medium
        flag 14 (0xfL): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 15 (0x10L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS)
        flag 16 (0x11L): viewmodel.request.passwordError.get() == null ? false : true
        flag 17 (0x12L): viewmodel.request.passwordError.get() == null ? false : true
        flag 18 (0x13L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 19 (0x14L): TextUtils.isEmpty(viewmodel.message) ? true : viewmodel.message.equals(Constants.HIDE_PROGRESS) ? true : false
        flag 20 (0x15L): viewmodel.request.emailError.get() == null ? false : true
        flag 21 (0x16L): viewmodel.request.emailError.get() == null ? false : true
        flag 22 (0x17L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 23 (0x18L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false ? View.VISIBLE : View.GONE
        flag 24 (0x19L): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
        flag 25 (0x1aL): !TextUtils.isEmpty(viewmodel.message) ? viewmodel.message.equals(Constants.SHOW_PROGRESS) : false
    flag mapping end*/
    //end
}