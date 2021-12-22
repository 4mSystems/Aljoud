package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAnswerBindingImpl extends ItemAnswerBinding implements te.app.aljoud.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    @NonNull
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView2;
    @NonNull
    private final com.google.android.material.imageview.ShapeableImageView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAnswerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemAnswerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.radiobutton.MaterialRadioButton) bindings[1]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.imageview.ShapeableImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.radio.setTag(null);
        setRootTag(root);
        // listeners
        mCallback38 = new te.app.aljoud.generated.callback.OnClickListener(this, 2);
        mCallback37 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((te.app.aljoud.pages.exams.viewModels.ItemAnswerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.aljoud.pages.exams.viewModels.ItemAnswerViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.aljoud.pages.exams.viewModels.ItemAnswerViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.aljoud.pages.exams.viewModels.ItemAnswerViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.answersItem) {
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
        te.app.aljoud.pages.exams.viewModels.ItemAnswerViewModel itemViewModel = mItemViewModel;
        te.app.aljoud.pages.exams.models.AnswersItem itemViewModelAnswersItem = null;
        java.lang.String itemViewModelAnswersItemType = null;
        int itemViewModelAnswersItemTypeEqualsJavaLangStringImageViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelAnswersItemName = null;
        int itemViewModelAnswersItemTypeEqualsJavaLangStringTextViewVISIBLEViewGONE = 0;
        boolean itemViewModelAnswersItemTypeEqualsJavaLangStringText = false;
        boolean itemViewModelAnswersItemTypeEqualsJavaLangStringImage = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.answersItem
                    itemViewModelAnswersItem = itemViewModel.getAnswersItem();
                }


                if (itemViewModelAnswersItem != null) {
                    // read itemViewModel.answersItem.type
                    itemViewModelAnswersItemType = itemViewModelAnswersItem.getType();
                    // read itemViewModel.answersItem.name
                    itemViewModelAnswersItemName = itemViewModelAnswersItem.getName();
                }


                if (itemViewModelAnswersItemType != null) {
                    // read itemViewModel.answersItem.type.equals("text")
                    itemViewModelAnswersItemTypeEqualsJavaLangStringText = itemViewModelAnswersItemType.equals("text");
                    // read itemViewModel.answersItem.type.equals("image")
                    itemViewModelAnswersItemTypeEqualsJavaLangStringImage = itemViewModelAnswersItemType.equals("image");
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelAnswersItemTypeEqualsJavaLangStringText) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelAnswersItemTypeEqualsJavaLangStringImage) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read itemViewModel.answersItem.type.equals("text") ? View.VISIBLE : View.GONE
                itemViewModelAnswersItemTypeEqualsJavaLangStringTextViewVISIBLEViewGONE = ((itemViewModelAnswersItemTypeEqualsJavaLangStringText) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read itemViewModel.answersItem.type.equals("image") ? View.VISIBLE : View.GONE
                itemViewModelAnswersItemTypeEqualsJavaLangStringImageViewVISIBLEViewGONE = ((itemViewModelAnswersItemTypeEqualsJavaLangStringImage) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback37);
            this.radio.setOnClickListener(mCallback38);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, itemViewModelAnswersItemName);
            this.mboundView2.setVisibility(itemViewModelAnswersItemTypeEqualsJavaLangStringTextViewVISIBLEViewGONE);
            this.mboundView3.setVisibility(itemViewModelAnswersItemTypeEqualsJavaLangStringImageViewVISIBLEViewGONE);
            te.app.aljoud.base.ApplicationBinding.loadFullImage(this.mboundView3, itemViewModelAnswersItemName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // itemViewModel
                te.app.aljoud.pages.exams.viewModels.ItemAnswerViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.itemAction();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // itemViewModel
                te.app.aljoud.pages.exams.viewModels.ItemAnswerViewModel itemViewModel = mItemViewModel;
                // itemViewModel != null
                boolean itemViewModelJavaLangObjectNull = false;



                itemViewModelJavaLangObjectNull = (itemViewModel) != (null);
                if (itemViewModelJavaLangObjectNull) {


                    itemViewModel.itemAction();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemViewModel
        flag 1 (0x2L): itemViewModel.answersItem
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.answersItem.type.equals("image") ? View.VISIBLE : View.GONE
        flag 4 (0x5L): itemViewModel.answersItem.type.equals("image") ? View.VISIBLE : View.GONE
        flag 5 (0x6L): itemViewModel.answersItem.type.equals("text") ? View.VISIBLE : View.GONE
        flag 6 (0x7L): itemViewModel.answersItem.type.equals("text") ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}