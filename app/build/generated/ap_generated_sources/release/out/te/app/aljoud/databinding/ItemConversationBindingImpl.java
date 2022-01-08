package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemConversationBindingImpl extends ItemConversationBinding implements te.app.aljoud.generated.callback.OnClickListener.Listener {

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
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemConversationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemConversationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[5]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3]
            );
        this.conTime.setTag(null);
        this.conTitle.setTag(null);
        this.conTitleAddress.setTag(null);
        this.conUserImage.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.tvCounter.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
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
            setItemViewModel((te.app.aljoud.pages.conversations.viewModels.ItemConversationsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.aljoud.pages.conversations.viewModels.ItemConversationsViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.aljoud.pages.conversations.viewModels.ItemConversationsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.aljoud.pages.conversations.viewModels.ItemConversationsViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.conversationsData) {
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
        te.app.aljoud.pages.conversations.viewModels.ItemConversationsViewModel itemViewModel = mItemViewModel;
        java.lang.String itemViewModelConversationsDataReceiverImage = null;
        te.app.aljoud.pages.auth.models.UserData itemViewModelConversationsDataReceiver = null;
        java.lang.String itemViewModelConversationsDataMessage = null;
        int itemViewModelConversationsDataIsReadInt0ViewVISIBLEViewGONE = 0;
        java.lang.String itemViewModelConversationsDataCreatedAt = null;
        te.app.aljoud.pages.conversations.models.ConversationsData itemViewModelConversationsData = null;
        java.lang.String itemViewModelConversationsDataReceiverName = null;
        boolean itemViewModelConversationsDataIsReadInt0 = false;
        int itemViewModelConversationsDataIsRead = 0;
        android.graphics.drawable.Drawable itemViewModelConversationsDataIsReadInt0TvCounterAndroidDrawableBadgeRedTvCounterAndroidDrawableBadge = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.conversationsData
                    itemViewModelConversationsData = itemViewModel.getConversationsData();
                }


                if (itemViewModelConversationsData != null) {
                    // read itemViewModel.conversationsData.receiver
                    itemViewModelConversationsDataReceiver = itemViewModelConversationsData.getReceiver();
                    // read itemViewModel.conversationsData.message
                    itemViewModelConversationsDataMessage = itemViewModelConversationsData.getMessage();
                    // read itemViewModel.conversationsData.createdAt
                    itemViewModelConversationsDataCreatedAt = itemViewModelConversationsData.getCreatedAt();
                    // read itemViewModel.conversationsData.is_read
                    itemViewModelConversationsDataIsRead = itemViewModelConversationsData.getIs_read();
                }


                if (itemViewModelConversationsDataReceiver != null) {
                    // read itemViewModel.conversationsData.receiver.image
                    itemViewModelConversationsDataReceiverImage = itemViewModelConversationsDataReceiver.getImage();
                    // read itemViewModel.conversationsData.receiver.name
                    itemViewModelConversationsDataReceiverName = itemViewModelConversationsDataReceiver.getName();
                }
                // read itemViewModel.conversationsData.is_read == 0
                itemViewModelConversationsDataIsReadInt0 = (itemViewModelConversationsDataIsRead) == (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelConversationsDataIsReadInt0) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read itemViewModel.conversationsData.is_read == 0 ? View.VISIBLE : View.GONE
                itemViewModelConversationsDataIsReadInt0ViewVISIBLEViewGONE = ((itemViewModelConversationsDataIsReadInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read itemViewModel.conversationsData.is_read == 0 ? @android:drawable/badge_red : @android:drawable/badge
                itemViewModelConversationsDataIsReadInt0TvCounterAndroidDrawableBadgeRedTvCounterAndroidDrawableBadge = ((itemViewModelConversationsDataIsReadInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvCounter.getContext(), R.drawable.badge_red)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvCounter.getContext(), R.drawable.badge)));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.conTime, itemViewModelConversationsDataCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.conTitle, itemViewModelConversationsDataReceiverName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.conTitleAddress, itemViewModelConversationsDataMessage);
            te.app.aljoud.base.ApplicationBinding.loadImage(this.conUserImage, itemViewModelConversationsDataReceiverImage);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.tvCounter, itemViewModelConversationsDataIsReadInt0TvCounterAndroidDrawableBadgeRedTvCounterAndroidDrawableBadge);
            this.tvCounter.setVisibility(itemViewModelConversationsDataIsReadInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // itemViewModel
        te.app.aljoud.pages.conversations.viewModels.ItemConversationsViewModel itemViewModel = mItemViewModel;
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
        flag 1 (0x2L): itemViewModel.conversationsData
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.conversationsData.is_read == 0 ? View.VISIBLE : View.GONE
        flag 4 (0x5L): itemViewModel.conversationsData.is_read == 0 ? View.VISIBLE : View.GONE
        flag 5 (0x6L): itemViewModel.conversationsData.is_read == 0 ? @android:drawable/badge_red : @android:drawable/badge
        flag 6 (0x7L): itemViewModel.conversationsData.is_read == 0 ? @android:drawable/badge_red : @android:drawable/badge
    flag mapping end*/
    //end
}