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
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemChatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[4]
            );
        this.driverImage.setTag(null);
        this.itemMessage.setTag(null);
        this.itemMessageTime.setTag(null);
        this.message.setTag(null);
        this.rcFiles.setTag(null);
        this.rlItemChat.setTag(null);
        this.time.setTag(null);
        setRootTag(root);
        // listeners
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
        else if (fieldId == BR.chatMediaAdapter) {
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
        te.app.aljoud.pages.auth.models.UserData userHelperGetInstanceContextUserData = null;
        java.lang.String userHelperGetInstanceContextUserDataImage = null;
        te.app.aljoud.pages.chat.adapter.ChatMediaAdapter itemChatViewModelChatMediaAdapter = null;
        te.app.aljoud.pages.auth.models.UserData itemChatViewModelChatReceiver = null;
        te.app.aljoud.pages.conversations.models.ConversationsData itemChatViewModelChat = null;
        java.lang.String itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataIdUserHelperGetInstanceContextUserDataImageItemChatViewModelChatReceiverImage = null;
        boolean itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataId = false;
        int userHelperGetInstanceContextUserDataId = 0;
        android.graphics.drawable.Drawable itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataIdItemMessageAndroidDrawableRightChatItemMessageAndroidDrawableLeftChat = null;
        te.app.aljoud.pages.auth.models.UserData itemChatViewModelChatSender = null;
        java.lang.String itemChatViewModelChatReceiverImage = null;
        int itemChatViewModelChatSenderId = 0;
        boolean itemChatViewModelChatVideoDataSizeInt0 = false;
        java.lang.String itemChatViewModelChatMessage = null;
        te.app.aljoud.pages.chat.viewmodel.ItemChatViewModel itemChatViewModel = mItemChatViewModel;
        java.lang.String itemChatViewModelChatCreatedAt = null;
        int itemChatViewModelChatVideoDataSizeInt0ViewVISIBLEViewGONE = 0;
        java.lang.String itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataIdJavaLangStringItemChatViewModelChatSenderName = null;
        java.lang.String itemChatViewModelChatSenderName = null;
        int itemChatViewModelChatVideoDataSize = 0;
        java.util.List<te.app.aljoud.pages.courseDetails.models.videos.VideoData> itemChatViewModelChatVideoData = null;

        if ((dirtyFlags & 0xbL) != 0) {

                // read UserHelper.getInstance(context).userData
                userHelperGetInstanceContextUserData = te.app.aljoud.utils.session.UserHelper.getInstance(getRoot().getContext()).getUserData();


                if (userHelperGetInstanceContextUserData != null) {
                    // read UserHelper.getInstance(context).userData.id
                    userHelperGetInstanceContextUserDataId = userHelperGetInstanceContextUserData.getId();
                }
        }
        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (itemChatViewModel != null) {
                        // read itemChatViewModel.chatMediaAdapter
                        itemChatViewModelChatMediaAdapter = itemChatViewModel.getChatMediaAdapter();
                    }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (itemChatViewModel != null) {
                        // read itemChatViewModel.chat
                        itemChatViewModelChat = itemChatViewModel.getChat();
                    }


                    if (itemChatViewModelChat != null) {
                        // read itemChatViewModel.chat.sender
                        itemChatViewModelChatSender = itemChatViewModelChat.getSender();
                        // read itemChatViewModel.chat.message
                        itemChatViewModelChatMessage = itemChatViewModelChat.getMessage();
                        // read itemChatViewModel.chat.createdAt
                        itemChatViewModelChatCreatedAt = itemChatViewModelChat.getCreatedAt();
                        // read itemChatViewModel.chat.videoData
                        itemChatViewModelChatVideoData = itemChatViewModelChat.getVideoData();
                    }


                    if (itemChatViewModelChatSender != null) {
                        // read itemChatViewModel.chat.sender.id
                        itemChatViewModelChatSenderId = itemChatViewModelChatSender.getId();
                    }
                    if (itemChatViewModelChatVideoData != null) {
                        // read itemChatViewModel.chat.videoData.size()
                        itemChatViewModelChatVideoDataSize = itemChatViewModelChatVideoData.size();
                    }


                    // read itemChatViewModel.chat.sender.id == UserHelper.getInstance(context).userData.id
                    itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataId = (itemChatViewModelChatSenderId) == (userHelperGetInstanceContextUserDataId);
                    // read itemChatViewModel.chat.videoData.size() > 0
                    itemChatViewModelChatVideoDataSizeInt0 = (itemChatViewModelChatVideoDataSize) > (0);
                if((dirtyFlags & 0xbL) != 0) {
                    if(itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataId) {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0xbL) != 0) {
                    if(itemChatViewModelChatVideoDataSizeInt0) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read itemChatViewModel.chat.sender.id == UserHelper.getInstance(context).userData.id ? @android:drawable/right_chat : @android:drawable/left_chat
                    itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataIdItemMessageAndroidDrawableRightChatItemMessageAndroidDrawableLeftChat = ((itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataId) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(itemMessage.getContext(), R.drawable.right_chat)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(itemMessage.getContext(), R.drawable.left_chat)));
                    // read itemChatViewModel.chat.videoData.size() > 0 ? View.VISIBLE : View.GONE
                    itemChatViewModelChatVideoDataSizeInt0ViewVISIBLEViewGONE = ((itemChatViewModelChatVideoDataSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                if (userHelperGetInstanceContextUserData != null) {
                    // read UserHelper.getInstance(context).userData.image
                    userHelperGetInstanceContextUserDataImage = userHelperGetInstanceContextUserData.getImage();
                }
        }
        if ((dirtyFlags & 0x10L) != 0) {

                if (itemChatViewModelChat != null) {
                    // read itemChatViewModel.chat.receiver
                    itemChatViewModelChatReceiver = itemChatViewModelChat.getReceiver();
                }


                if (itemChatViewModelChatReceiver != null) {
                    // read itemChatViewModel.chat.receiver.image
                    itemChatViewModelChatReceiverImage = itemChatViewModelChatReceiver.getImage();
                }
        }
        if ((dirtyFlags & 0x400L) != 0) {

                if (itemChatViewModelChatSender != null) {
                    // read itemChatViewModel.chat.sender.name
                    itemChatViewModelChatSenderName = itemChatViewModelChatSender.getName();
                }
        }

        if ((dirtyFlags & 0xbL) != 0) {

                // read itemChatViewModel.chat.sender.id == UserHelper.getInstance(context).userData.id ? UserHelper.getInstance(context).userData.image : itemChatViewModel.chat.receiver.image
                itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataIdUserHelperGetInstanceContextUserDataImageItemChatViewModelChatReceiverImage = ((itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataId) ? (userHelperGetInstanceContextUserDataImage) : (itemChatViewModelChatReceiverImage));
                // read itemChatViewModel.chat.sender.id == UserHelper.getInstance(context).userData.id ? "" : itemChatViewModel.chat.sender.name
                itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataIdJavaLangStringItemChatViewModelChatSenderName = ((itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataId) ? ("") : (itemChatViewModelChatSenderName));
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.loadImage(this.driverImage, itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataIdUserHelperGetInstanceContextUserDataImageItemChatViewModelChatReceiverImage);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.itemMessage, itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataIdItemMessageAndroidDrawableRightChatItemMessageAndroidDrawableLeftChat);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.itemMessageTime, itemChatViewModelChatSenderIdUserHelperGetInstanceContextUserDataIdJavaLangStringItemChatViewModelChatSenderName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.message, itemChatViewModelChatMessage);
            this.rcFiles.setVisibility(itemChatViewModelChatVideoDataSizeInt0ViewVISIBLEViewGONE);
            te.app.aljoud.pages.chat.viewmodel.ItemChatViewModel.chatAdminDirection(this.rlItemChat, itemChatViewModelChatSenderId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.time, itemChatViewModelChatCreatedAt);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.getItemsV2Binding(this.rcFiles, itemChatViewModelChatMediaAdapter, "1", "2");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): itemChatViewModel
        flag 1 (0x2L): itemChatViewModel.chat
        flag 2 (0x3L): itemChatViewModel.chatMediaAdapter
        flag 3 (0x4L): null
        flag 4 (0x5L): itemChatViewModel.chat.sender.id == UserHelper.getInstance(context).userData.id ? UserHelper.getInstance(context).userData.image : itemChatViewModel.chat.receiver.image
        flag 5 (0x6L): itemChatViewModel.chat.sender.id == UserHelper.getInstance(context).userData.id ? UserHelper.getInstance(context).userData.image : itemChatViewModel.chat.receiver.image
        flag 6 (0x7L): itemChatViewModel.chat.sender.id == UserHelper.getInstance(context).userData.id ? @android:drawable/right_chat : @android:drawable/left_chat
        flag 7 (0x8L): itemChatViewModel.chat.sender.id == UserHelper.getInstance(context).userData.id ? @android:drawable/right_chat : @android:drawable/left_chat
        flag 8 (0x9L): itemChatViewModel.chat.videoData.size() > 0 ? View.VISIBLE : View.GONE
        flag 9 (0xaL): itemChatViewModel.chat.videoData.size() > 0 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): itemChatViewModel.chat.sender.id == UserHelper.getInstance(context).userData.id ? "" : itemChatViewModel.chat.sender.name
        flag 11 (0xcL): itemChatViewModel.chat.sender.id == UserHelper.getInstance(context).userData.id ? "" : itemChatViewModel.chat.sender.name
    flag mapping end*/
    //end
}