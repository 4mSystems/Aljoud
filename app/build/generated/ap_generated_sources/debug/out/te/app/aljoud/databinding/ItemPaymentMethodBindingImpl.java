package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPaymentMethodBindingImpl extends ItemPaymentMethodBinding implements te.app.aljoud.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.marketContainer, 3);
        sViewsWithIds.put(R.id.checked, 4);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPaymentMethodBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemPaymentMethodBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.offerItemName.setTag(null);
        this.orderItemImg.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((te.app.aljoud.pages.fawaterkPayment.viewModels.ItemPaymentMethodsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.aljoud.pages.fawaterkPayment.viewModels.ItemPaymentMethodsViewModel ItemViewModel) {
        updateRegistration(0, ItemViewModel);
        this.mItemViewModel = ItemViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemViewModel((te.app.aljoud.pages.fawaterkPayment.viewModels.ItemPaymentMethodsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.aljoud.pages.fawaterkPayment.viewModels.ItemPaymentMethodsViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.paymentMethod) {
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
        te.app.aljoud.pages.fawaterkPayment.models.PaymentMethod itemViewModelPaymentMethod = null;
        te.app.aljoud.pages.fawaterkPayment.viewModels.ItemPaymentMethodsViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelPaymentMethodLogo = null;
        boolean itemViewModelLangEqualsJavaLangStringAr = false;
        java.lang.String itemViewModelPaymentMethodNameAr = null;
        java.lang.String itemViewModelPaymentMethodNameEn = null;
        java.lang.String itemViewModelLang = null;
        java.lang.String itemViewModelLangEqualsJavaLangStringArItemViewModelPaymentMethodNameArItemViewModelPaymentMethodNameEn = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.paymentMethod
                    itemViewModelPaymentMethod = itemViewModel.getPaymentMethod();
                    // read itemViewModel.lang
                    itemViewModelLang = itemViewModel.lang;
                }


                if (itemViewModelPaymentMethod != null) {
                    // read itemViewModel.paymentMethod.logo
                    itemViewModelPaymentMethodLogo = itemViewModelPaymentMethod.getLogo();
                }
                if (itemViewModelLang != null) {
                    // read itemViewModel.lang.equals("ar")
                    itemViewModelLangEqualsJavaLangStringAr = itemViewModelLang.equals("ar");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelLangEqualsJavaLangStringAr) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                if (itemViewModelPaymentMethod != null) {
                    // read itemViewModel.paymentMethod.nameAr
                    itemViewModelPaymentMethodNameAr = itemViewModelPaymentMethod.getNameAr();
                }
        }
        if ((dirtyFlags & 0x8L) != 0) {

                if (itemViewModelPaymentMethod != null) {
                    // read itemViewModel.paymentMethod.nameEn
                    itemViewModelPaymentMethodNameEn = itemViewModelPaymentMethod.getNameEn();
                }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read itemViewModel.lang.equals("ar") ? itemViewModel.paymentMethod.nameAr : itemViewModel.paymentMethod.nameEn
                itemViewModelLangEqualsJavaLangStringArItemViewModelPaymentMethodNameArItemViewModelPaymentMethodNameEn = ((itemViewModelLangEqualsJavaLangStringAr) ? (itemViewModelPaymentMethodNameAr) : (itemViewModelPaymentMethodNameEn));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.offerItemName, itemViewModelLangEqualsJavaLangStringArItemViewModelPaymentMethodNameArItemViewModelPaymentMethodNameEn);
            te.app.aljoud.base.ApplicationBinding.loadImage(this.orderItemImg, itemViewModelPaymentMethodLogo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        te.app.aljoud.pages.fawaterkPayment.viewModels.ItemPaymentMethodsViewModel itemViewModel = mItemViewModel;
        // itemViewModel != null
        boolean itemViewModelJavaLangObjectNull = false;



        itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
        if (itemViewModelJavaLangObjectNull) {


            itemViewModel.itemAction();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.paymentMethod
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.lang.equals("ar") ? itemViewModel.paymentMethod.nameAr : itemViewModel.paymentMethod.nameEn
        flag 4 (0x5L): itemViewModel.lang.equals("ar") ? itemViewModel.paymentMethod.nameAr : itemViewModel.paymentMethod.nameEn
    flag mapping end*/
    //end
}