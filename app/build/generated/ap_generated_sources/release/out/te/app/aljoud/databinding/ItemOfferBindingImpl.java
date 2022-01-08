package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemOfferBindingImpl extends ItemOfferBinding implements te.app.aljoud.generated.callback.OnClickListener.Listener {

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
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemOfferBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemOfferBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[7]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.btGetOffer.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.rcLevels.setTag(null);
        this.tvDesc.setTag(null);
        this.tvLevel.setTag(null);
        this.tvOfferName.setTag(null);
        this.tvPrice.setTag(null);
        this.tvSpecial.setTag(null);
        this.tvUniversity.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
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
        if (BR.itemViewModel == variableId) {
            setItemViewModel((te.app.aljoud.pages.offers.viewModel.ItemOfferViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.aljoud.pages.offers.viewModel.ItemOfferViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.aljoud.pages.offers.viewModel.ItemOfferViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.aljoud.pages.offers.viewModel.ItemOfferViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.offerItem) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.levelsAdapter) {
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
        te.app.aljoud.pages.university.models.course.Currency itemViewModelOfferItemCurrency = null;
        java.lang.String itemViewModelOfferItemDesc = null;
        te.app.aljoud.pages.offers.viewModel.ItemOfferViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelOfferItemName = null;
        te.app.aljoud.pages.university.adapters.LevelsAdapter itemViewModelLevelsAdapter = null;
        java.lang.String itemViewModelOfferItemPriceConcatJavaLangStringConcatItemViewModelOfferItemCurrencyName = null;
        java.lang.String itemViewModelOfferItemPrice = null;
        java.lang.String itemViewModelOfferItemPriceConcatJavaLangString = null;
        te.app.aljoud.pages.offers.models.OfferItem itemViewModelOfferItem = null;
        java.lang.String itemViewModelOfferItemCurrencyName = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.levelsAdapter
                        itemViewModelLevelsAdapter = itemViewModel.getLevelsAdapter();
                    }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (itemViewModel != null) {
                        // read itemViewModel.offerItem
                        itemViewModelOfferItem = itemViewModel.getOfferItem();
                    }


                    if (itemViewModelOfferItem != null) {
                        // read itemViewModel.offerItem.currency
                        itemViewModelOfferItemCurrency = itemViewModelOfferItem.getCurrency();
                        // read itemViewModel.offerItem.desc
                        itemViewModelOfferItemDesc = itemViewModelOfferItem.getDesc();
                        // read itemViewModel.offerItem.name
                        itemViewModelOfferItemName = itemViewModelOfferItem.getName();
                        // read itemViewModel.offerItem.price
                        itemViewModelOfferItemPrice = itemViewModelOfferItem.getPrice();
                    }


                    if (itemViewModelOfferItemCurrency != null) {
                        // read itemViewModel.offerItem.currency.name
                        itemViewModelOfferItemCurrencyName = itemViewModelOfferItemCurrency.getName();
                    }
                    if (itemViewModelOfferItemPrice != null) {
                        // read itemViewModel.offerItem.price.concat(" ")
                        itemViewModelOfferItemPriceConcatJavaLangString = itemViewModelOfferItemPrice.concat(" ");
                    }


                    if (itemViewModelOfferItemPriceConcatJavaLangString != null) {
                        // read itemViewModel.offerItem.price.concat(" ").concat(itemViewModel.offerItem.currency.name)
                        itemViewModelOfferItemPriceConcatJavaLangStringConcatItemViewModelOfferItemCurrencyName = itemViewModelOfferItemPriceConcatJavaLangString.concat(itemViewModelOfferItemCurrencyName);
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btGetOffer.setOnClickListener(mCallback7);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.getItemsV2Binding(this.rcLevels, itemViewModelLevelsAdapter, "1", "2");
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDesc, itemViewModelOfferItemDesc);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLevel, itemViewModelOfferItemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOfferName, itemViewModelOfferItemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, itemViewModelOfferItemPriceConcatJavaLangStringConcatItemViewModelOfferItemCurrencyName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSpecial, itemViewModelOfferItemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUniversity, itemViewModelOfferItemName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        te.app.aljoud.pages.offers.viewModel.ItemOfferViewModel itemViewModel = mItemViewModel;
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
        flag 1 (0x2L): itemViewModel.offerItem
        flag 2 (0x3L): itemViewModel.levelsAdapter
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}