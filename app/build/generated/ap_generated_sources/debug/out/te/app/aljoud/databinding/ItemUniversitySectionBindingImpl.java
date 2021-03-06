package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemUniversitySectionBindingImpl extends ItemUniversitySectionBinding implements te.app.aljoud.generated.callback.OnClickListener.Listener {

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
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemUniversitySectionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemUniversitySectionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            );
        this.catImage.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((te.app.aljoud.pages.university.viewModel.ItemCollegesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.aljoud.pages.university.viewModel.ItemCollegesViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.aljoud.pages.university.viewModel.ItemCollegesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.aljoud.pages.university.viewModel.ItemCollegesViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.specialistsItem) {
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
        java.lang.String itemViewModelSpecialistsItemImage = null;
        te.app.aljoud.pages.university.models.SpecialistsItem itemViewModelSpecialistsItem = null;
        te.app.aljoud.pages.university.viewModel.ItemCollegesViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelSpecialistsItemName = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.specialistsItem
                    itemViewModelSpecialistsItem = itemViewModel.getSpecialistsItem();
                }


                if (itemViewModelSpecialistsItem != null) {
                    // read itemViewModel.specialistsItem.image
                    itemViewModelSpecialistsItemImage = itemViewModelSpecialistsItem.getImage();
                    // read itemViewModel.specialistsItem.name
                    itemViewModelSpecialistsItemName = itemViewModelSpecialistsItem.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.loadImage(this.catImage, itemViewModelSpecialistsItemImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, itemViewModelSpecialistsItemName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback8);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        te.app.aljoud.pages.university.viewModel.ItemCollegesViewModel itemViewModel = mItemViewModel;
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
        flag 1 (0x2L): itemViewModel.specialistsItem
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}