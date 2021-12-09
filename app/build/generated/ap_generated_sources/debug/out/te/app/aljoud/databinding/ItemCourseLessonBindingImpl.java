package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCourseLessonBindingImpl extends ItemCourseLessonBinding implements te.app.aljoud.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cat_image, 3);
        sViewsWithIds.put(R.id.tv_count, 4);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCourseLessonBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemCourseLessonBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[1]
            );
        this.icStatus.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvTitle.setTag(null);
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
            setItemViewModel((te.app.aljoud.pages.courseDetails.viewModels.ItemLessonViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItemViewModel(@Nullable te.app.aljoud.pages.courseDetails.viewModels.ItemLessonViewModel ItemViewModel) {
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
                return onChangeItemViewModel((te.app.aljoud.pages.courseDetails.viewModels.ItemLessonViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItemViewModel(te.app.aljoud.pages.courseDetails.viewModels.ItemLessonViewModel ItemViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.lessonsItem) {
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
        int itemViewModelPosition = 0;
        te.app.aljoud.pages.courseDetails.viewModels.ItemLessonViewModel itemViewModel = mItemViewModel;
        te.app.aljoud.pages.courseDetails.models.lessons.LessonsItem itemViewModelLessonsItem = null;
        android.graphics.drawable.Drawable itemViewModelPositionInt0IcStatusAndroidDrawableIcFreeItemViewModelLessonsItemIsLockIcStatusAndroidDrawableIcLockIcStatusAndroidDrawableIcOpen = null;
        java.lang.String itemViewModelLessonsItemName = null;
        boolean itemViewModelLessonsItemIsLock = false;
        android.graphics.drawable.Drawable itemViewModelLessonsItemIsLockIcStatusAndroidDrawableIcLockIcStatusAndroidDrawableIcOpen = null;
        boolean itemViewModelPositionInt0 = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (itemViewModel != null) {
                    // read itemViewModel.position
                    itemViewModelPosition = itemViewModel.position;
                    // read itemViewModel.lessonsItem
                    itemViewModelLessonsItem = itemViewModel.getLessonsItem();
                }


                // read itemViewModel.position == 0
                itemViewModelPositionInt0 = (itemViewModelPosition) == (0);
            if((dirtyFlags & 0x7L) != 0) {
                if(itemViewModelPositionInt0) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
                if (itemViewModelLessonsItem != null) {
                    // read itemViewModel.lessonsItem.name
                    itemViewModelLessonsItemName = itemViewModelLessonsItem.getName();
                }
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                if (itemViewModelLessonsItem != null) {
                    // read itemViewModel.lessonsItem.isLock
                    itemViewModelLessonsItemIsLock = itemViewModelLessonsItem.isIsLock();
                }
            if((dirtyFlags & 0x8L) != 0) {
                if(itemViewModelLessonsItemIsLock) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read itemViewModel.lessonsItem.isLock ? @android:drawable/ic_lock : @android:drawable/ic_open
                itemViewModelLessonsItemIsLockIcStatusAndroidDrawableIcLockIcStatusAndroidDrawableIcOpen = ((itemViewModelLessonsItemIsLock) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(icStatus.getContext(), R.drawable.ic_lock)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(icStatus.getContext(), R.drawable.ic_open)));
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read itemViewModel.position == 0 ? @android:drawable/ic_free : itemViewModel.lessonsItem.isLock ? @android:drawable/ic_lock : @android:drawable/ic_open
                itemViewModelPositionInt0IcStatusAndroidDrawableIcFreeItemViewModelLessonsItemIsLockIcStatusAndroidDrawableIcLockIcStatusAndroidDrawableIcOpen = ((itemViewModelPositionInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(icStatus.getContext(), R.drawable.ic_free)) : (itemViewModelLessonsItemIsLockIcStatusAndroidDrawableIcLockIcStatusAndroidDrawableIcOpen));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.icStatus, itemViewModelPositionInt0IcStatusAndroidDrawableIcFreeItemViewModelLessonsItemIsLockIcStatusAndroidDrawableIcLockIcStatusAndroidDrawableIcOpen);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, itemViewModelLessonsItemName);
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
        te.app.aljoud.pages.courseDetails.viewModels.ItemLessonViewModel itemViewModel = mItemViewModel;
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
        flag 1 (0x2L): itemViewModel.lessonsItem
        flag 2 (0x3L): null
        flag 3 (0x4L): itemViewModel.position == 0 ? @android:drawable/ic_free : itemViewModel.lessonsItem.isLock ? @android:drawable/ic_lock : @android:drawable/ic_open
        flag 4 (0x5L): itemViewModel.position == 0 ? @android:drawable/ic_free : itemViewModel.lessonsItem.isLock ? @android:drawable/ic_lock : @android:drawable/ic_open
        flag 5 (0x6L): itemViewModel.lessonsItem.isLock ? @android:drawable/ic_lock : @android:drawable/ic_open
        flag 6 (0x7L): itemViewModel.lessonsItem.isLock ? @android:drawable/ic_lock : @android:drawable/ic_open
    flag mapping end*/
    //end
}