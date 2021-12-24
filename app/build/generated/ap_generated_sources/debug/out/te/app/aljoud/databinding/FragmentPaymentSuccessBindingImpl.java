package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPaymentSuccessBindingImpl extends FragmentPaymentSuccessBinding implements te.app.aljoud.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_success, 6);
        sViewsWithIds.put(R.id.payment_done_sub_title, 7);
        sViewsWithIds.put(R.id.ic_success, 8);
        sViewsWithIds.put(R.id.payment_body, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPaymentSuccessBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentPaymentSuccessBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[9]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[7]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[6]
            );
        this.icClose.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.next.setTag(null);
        this.paymentBody2.setTag(null);
        this.paymentCode.setTag(null);
        this.paymentValidation.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
        mCallback18 = new te.app.aljoud.generated.callback.OnClickListener(this, 2);
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
        if (BR.viewmodel == variableId) {
            setViewmodel((te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.paymentResultData) {
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
        java.lang.String viewmodelPaymentResultDataPaymentResultDataPaymentDataExpireDate = null;
        int viewmodelPaymentResultDataPaymentResultDataPaymentDataExpireDateJavaLangObjectNullViewVISIBLEViewGONE = 0;
        te.app.aljoud.pages.fawaterkPayment.models.paymentResult.PaymentResultData viewmodelPaymentResultData = null;
        boolean viewmodelPaymentResultDataPaymentResultDataPaymentDataFawryCodeJavaLangObjectNull = false;
        java.lang.String viewmodelPaymentResultDataPaymentResultDataPaymentDataFawryCodeJavaLangObjectNullViewmodelPaymentResultDataPaymentResultDataPaymentDataFawryCodeViewmodelPaymentResultDataPaymentResultDataPaymentDataMeezaReference = null;
        te.app.aljoud.pages.fawaterkPayment.models.paymentResult.PaymentData viewmodelPaymentResultDataPaymentResultDataPaymentData = null;
        te.app.aljoud.pages.fawaterkPayment.models.paymentResult.PaymentResultData viewmodelPaymentResultDataPaymentResultData = null;
        java.lang.String viewmodelPaymentResultDataPaymentResultDataPaymentDataMeezaReference = null;
        java.lang.String viewmodelPaymentResultDataPaymentResultDataPaymentDataFawryCode = null;
        boolean viewmodelPaymentResultDataPaymentResultDataPaymentDataExpireDateJavaLangObjectNull = false;
        te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.paymentResultData
                    viewmodelPaymentResultData = viewmodel.getPaymentResultData();
                }


                if (viewmodelPaymentResultData != null) {
                    // read viewmodel.paymentResultData.paymentResultData
                    viewmodelPaymentResultDataPaymentResultData = viewmodelPaymentResultData.getPaymentResultData();
                }


                if (viewmodelPaymentResultDataPaymentResultData != null) {
                    // read viewmodel.paymentResultData.paymentResultData.paymentData
                    viewmodelPaymentResultDataPaymentResultDataPaymentData = viewmodelPaymentResultDataPaymentResultData.getPaymentData();
                }


                if (viewmodelPaymentResultDataPaymentResultDataPaymentData != null) {
                    // read viewmodel.paymentResultData.paymentResultData.paymentData.expireDate
                    viewmodelPaymentResultDataPaymentResultDataPaymentDataExpireDate = viewmodelPaymentResultDataPaymentResultDataPaymentData.getExpireDate();
                    // read viewmodel.paymentResultData.paymentResultData.paymentData.fawryCode
                    viewmodelPaymentResultDataPaymentResultDataPaymentDataFawryCode = viewmodelPaymentResultDataPaymentResultDataPaymentData.getFawryCode();
                }


                // read viewmodel.paymentResultData.paymentResultData.paymentData.expireDate != null
                viewmodelPaymentResultDataPaymentResultDataPaymentDataExpireDateJavaLangObjectNull = (viewmodelPaymentResultDataPaymentResultDataPaymentDataExpireDate) != (null);
                // read viewmodel.paymentResultData.paymentResultData.paymentData.fawryCode != null
                viewmodelPaymentResultDataPaymentResultDataPaymentDataFawryCodeJavaLangObjectNull = (viewmodelPaymentResultDataPaymentResultDataPaymentDataFawryCode) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelPaymentResultDataPaymentResultDataPaymentDataExpireDateJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelPaymentResultDataPaymentResultDataPaymentDataFawryCodeJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read viewmodel.paymentResultData.paymentResultData.paymentData.expireDate != null ? View.VISIBLE : View.GONE
                viewmodelPaymentResultDataPaymentResultDataPaymentDataExpireDateJavaLangObjectNullViewVISIBLEViewGONE = ((viewmodelPaymentResultDataPaymentResultDataPaymentDataExpireDateJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                if (viewmodelPaymentResultDataPaymentResultDataPaymentData != null) {
                    // read viewmodel.paymentResultData.paymentResultData.paymentData.meezaReference
                    viewmodelPaymentResultDataPaymentResultDataPaymentDataMeezaReference = viewmodelPaymentResultDataPaymentResultDataPaymentData.getMeezaReference();
                }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read viewmodel.paymentResultData.paymentResultData.paymentData.fawryCode != null ? viewmodel.paymentResultData.paymentResultData.paymentData.fawryCode : viewmodel.paymentResultData.paymentResultData.paymentData.meezaReference
                viewmodelPaymentResultDataPaymentResultDataPaymentDataFawryCodeJavaLangObjectNullViewmodelPaymentResultDataPaymentResultDataPaymentDataFawryCodeViewmodelPaymentResultDataPaymentResultDataPaymentDataMeezaReference = ((viewmodelPaymentResultDataPaymentResultDataPaymentDataFawryCodeJavaLangObjectNull) ? (viewmodelPaymentResultDataPaymentResultDataPaymentDataFawryCode) : (viewmodelPaymentResultDataPaymentResultDataPaymentDataMeezaReference));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.icClose.setOnClickListener(mCallback17);
            this.next.setOnClickListener(mCallback18);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.paymentBody2.setVisibility(viewmodelPaymentResultDataPaymentResultDataPaymentDataExpireDateJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paymentCode, viewmodelPaymentResultDataPaymentResultDataPaymentDataFawryCodeJavaLangObjectNullViewmodelPaymentResultDataPaymentResultDataPaymentDataFawryCodeViewmodelPaymentResultDataPaymentResultDataPaymentDataMeezaReference);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paymentValidation, viewmodelPaymentResultDataPaymentResultDataPaymentDataExpireDate);
            this.paymentValidation.setVisibility(viewmodelPaymentResultDataPaymentResultDataPaymentDataExpireDateJavaLangObjectNullViewVISIBLEViewGONE);
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
                te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {



                    viewmodel.goBack(getRoot().getContext());
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.makeCopy();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.paymentResultData
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.paymentResultData.paymentResultData.paymentData.expireDate != null ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewmodel.paymentResultData.paymentResultData.paymentData.expireDate != null ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewmodel.paymentResultData.paymentResultData.paymentData.fawryCode != null ? viewmodel.paymentResultData.paymentResultData.paymentData.fawryCode : viewmodel.paymentResultData.paymentResultData.paymentData.meezaReference
        flag 6 (0x7L): viewmodel.paymentResultData.paymentResultData.paymentData.fawryCode != null ? viewmodel.paymentResultData.paymentResultData.paymentData.fawryCode : viewmodel.paymentResultData.paymentResultData.paymentData.meezaReference
    flag mapping end*/
    //end
}