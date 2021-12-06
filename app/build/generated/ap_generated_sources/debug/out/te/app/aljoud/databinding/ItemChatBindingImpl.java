package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemChatBindingImpl extends ItemChatBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rc_files, 4);
        sViewsWithIds.put(R.id.item_message_time, 5);
    }
    // views
    @NonNull
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemChatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.driverImage.setTag(null);
        this.itemMessage.setTag(null);
        this.mboundView3 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3];
        this.mboundView3.setTag(null);
        this.rlItemChat.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.itemChatViewModel == variableId) {
            setItemChatViewModel((te.app.aljoud.pages.chat.viewmodel.ItemChatViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemChatViewModel(@Nullable te.app.aljoud.pages.chat.viewmodel.ItemChatViewModel ItemChatViewModel) {
        updateRegistration(0, ItemChatViewModel);
        this.mItemChatViewModel = ItemChatViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.itemChatViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItemChatViewModel((te.app.aljoud.pages.chat.viewmodel.ItemChatViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemChatViewModel(te.app.aljoud.pages.chat.viewmodel.ItemChatViewModel ItemChatViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.chat) {
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
        te.app.aljoud.pages.auth.models.UserData userHelperGetInstanceContextUserData = null;
        java.lang.String userHelperGetInstanceContextUserDataImage = null;
        te.app.aljoud.pages.auth.models.UserData itemChatViewModelChatReceiver = null;
        te.app.aljoud.pages.conversations.models.ConversationsData itemChatViewModelChat = null;
        int textUtilsIsEmptyItemChatViewModelChatReceiverImageViewGONEViewVISIBLE = 0;
        int itemChatViewModelChatReceiverId = 0;
        int userHelperGetInstanceContextUserDataId = 0;
        boolean textUtilsIsEmptyItemChatViewModelChatReceiverImage = false;
        java.lang.String itemChatViewModelChatReceiverImage = null;
        boolean itemChatViewModelChatReceiverIdUserHelperGetInstanceContextUserDataId = false;
        te.app.aljoud.pages.chat.viewmodel.ItemChatViewModel itemChatViewModel = mItemChatViewModel;
        android.graphics.drawable.Drawable itemChatViewModelChatReceiverIdUserHelperGetInstanceContextUserDataIdMboundView3AndroidDrawableRightChatMboundView3AndroidDrawableLeftChat = null;
        boolean TextUtilsIsEmptyItemChatViewModelChatReceiverImage1 = false;
        java.lang.String itemChatViewModelChatReceiverIdUserHelperGetInstanceContextUserDataIdUserHelperGetInstanceContextUserDataImageItemChatViewModelChatReceiverImage = null;

        if ((dirtyFlags & 0x7L) != 0) {

                // read UserHelper.getInstance(context).userData
                userHelperGetInstanceContextUserData = te.app.aljoud.utils.session.UserHelper.getInstance(getRoot().getContext()).getUserData();
                updateRegistration(0, itemChatViewModel);


                if (userHelperGetInstanceContextUserData != null) {
                    // read UserHelper.getInstance(context).userData.id
                    userHelperGetInstanceContextUserDataId = userHelperGetInstanceContextUserData.getId();
                }
                if (itemChatViewModel != null) {
                    // read itemChatViewModel.chat
                    itemChatViewModelChat = itemChatViewModel.getChat();
                }


                if (itemChatViewModelChat != null) {
                    // read itemChatViewModel.chat.receiver
                    itemChatViewModelChatReceiver = itemChatViewModelChat.getReceiver();
                }


                if (itemChatViewModelChatReceiver != null) {
                    // read itemChatViewModel.chat.receiver.id
                    itemChatViewModelChatReceiverId = itemChatViewModelChatReceiver.getId();
                    // read itemChatViewModel.chat.receiver.image
                    itemChatViewModelChatReceiverImage = itemChatViewModelChatReceiver.getImage();
                }


                // read itemChatViewModel.chat.receiver.id == UserHelper.getInstance(context).userData.id
                itemChatViewModelChatReceiverIdUserHelperGetInstanceContextUserDataId = (itemChatViewModelChatReceiverId) == (userHelperGetInstanceContextUserDataId);
                // read TextUtils.isEmpty(itemChatViewModel.chat.receiver.image)
                TextUtilsIsEmptyItemChatViewModelChatReceiverImage1 = android.text.TextUtils.isEmpty(itemChatViewModelChatReceiverImage);
            if((dirtyFlags & 0x7L) != 0) {
                if(itemChatViewModelChatReceiverIdUserHelperGetInstanceContextUserDataId) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
            }


                // read itemChatViewModel.chat.receiver.id == UserHelper.getInstance(context).userData.id ? @android:drawable/right_chat : @android:drawable/left_chat
                itemChatViewModelChatReceiverIdUserHelperGetInstanceContextUserDataIdMboundView3AndroidDrawableRightChatMboundView3AndroidDrawableLeftChat = ((itemChatViewModelChatReceiverIdUserHelperGetInstanceContextUserDataId) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView3.getContext(), R.drawable.right_chat)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView3.getContext(), R.drawable.left_chat)));
                // read !TextUtils.isEmpty(itemChatViewModel.chat.receiver.image)
                textUtilsIsEmptyItemChatViewModelChatReceiverImage = !TextUtilsIsEmptyItemChatViewModelChatReceiverImage1;
            if((dirtyFlags & 0x7L) != 0) {
                if(textUtilsIsEmptyItemChatViewModelChatReceiverImage) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read !TextUtils.isEmpty(itemChatViewModel.chat.receiver.image) ? View.GONE : View.VISIBLE
                textUtilsIsEmptyItemChatViewModelChatReceiverImageViewGONEViewVISIBLE = ((textUtilsIsEmptyItemChatViewModelChatReceiverImage) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {

                if (userHelperGetInstanceContextUserData != null) {
                    // read UserHelper.getInstance(context).userData.image
                    userHelperGetInstanceContextUserDataImage = userHelperGetInstanceContextUserData.getImage();
                }
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read itemChatViewModel.chat.receiver.id == UserHelper.getInstance(context).userData.id ? UserHelper.getInstance(context).userData.image : itemChatViewModel.chat.receiver.image
                itemChatViewModelChatReceiverIdUserHelperGetInstanceContextUserDataIdUserHelperGetInstanceContextUserDataImageItemChatViewModelChatReceiverImage = ((itemChatViewModelChatReceiverIdUserHelperGetInstanceContextUserDataId) ? (userHelperGetInstanceContextUserDataImage) : (itemChatViewModelChatReceiverImage));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.loadImage(this.driverImage, itemChatViewModelChatReceiverIdUserHelperGetInstanceContextUserDataIdUserHelperGetInstanceContextUserDataImageItemChatViewModelChatReceiverImage);
            this.itemMessage.setVisibility(textUtilsIsEmptyItemChatViewModelChatReceiverImageViewGONEViewVISIBLE);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView3, itemChatViewModelChatReceiverIdUserHelperGetInstanceContextUserDataIdMboundView3AndroidDrawableRightChatMboundView3AndroidDrawableLeftChat);
            te.app.aljoud.pages.chat.viewmodel.ItemChatViewModel.chatAdminDirection(this.rlItemChat, itemChatViewModelChatReceiverId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemChatViewModel
        flag 1 (0x2L): itemChatViewModel.chat
        flag 2 (0x3L): null
        flag 3 (0x4L): !TextUtils.isEmpty(itemChatViewModel.chat.receiver.image) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): !TextUtils.isEmpty(itemChatViewModel.chat.receiver.image) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): itemChatViewModel.chat.receiver.id == UserHelper.getInstance(context).userData.id ? @android:drawable/right_chat : @android:drawable/left_chat
        flag 6 (0x7L): itemChatViewModel.chat.receiver.id == UserHelper.getInstance(context).userData.id ? @android:drawable/right_chat : @android:drawable/left_chat
        flag 7 (0x8L): itemChatViewModel.chat.receiver.id == UserHelper.getInstance(context).userData.id ? UserHelper.getInstance(context).userData.image : itemChatViewModel.chat.receiver.image
        flag 8 (0x9L): itemChatViewModel.chat.receiver.id == UserHelper.getInstance(context).userData.id ? UserHelper.getInstance(context).userData.image : itemChatViewModel.chat.receiver.image
    flag mapping end*/
    //end
}