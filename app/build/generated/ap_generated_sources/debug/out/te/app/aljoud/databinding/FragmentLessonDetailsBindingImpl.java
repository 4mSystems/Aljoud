package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLessonDetailsBindingImpl extends FragmentLessonDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_instructor, 3);
        sViewsWithIds.put(R.id.tv_policy_warning1, 4);
        sViewsWithIds.put(R.id.tv_instractor_profession, 5);
        sViewsWithIds.put(R.id.tv_account_qr, 6);
        sViewsWithIds.put(R.id.card_tabs, 7);
        sViewsWithIds.put(R.id.tabs, 8);
        sViewsWithIds.put(R.id.lesson_frame, 9);
        sViewsWithIds.put(R.id.rate_container, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLessonDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentLessonDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[3]
            , (com.google.android.material.card.MaterialCardView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (android.widget.FrameLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (com.google.android.material.tabs.TabLayout) bindings[8]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[5]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[4]
            );
        this.icQr.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCardTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewmodel((te.app.aljoud.pages.courseDetails.viewModels.LessonDetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.aljoud.pages.courseDetails.viewModels.LessonDetailsViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((te.app.aljoud.pages.courseDetails.viewModels.LessonDetailsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.aljoud.pages.courseDetails.viewModels.LessonDetailsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String tvCardTitleAndroidStringAccountNumberConcatJavaLangStringConcatStringValueOfUserHelperGetInstanceContextUserDataId = null;
        java.lang.String stringValueOfUserHelperGetInstanceContextUserDataId = null;
        java.lang.String userHelperGetInstanceContextUserDataQrImage = null;
        int userHelperGetInstanceContextUserDataId = 0;

        if ((dirtyFlags & 0x2L) != 0) {

                // read UserHelper.getInstance(context).userData
                userHelperGetInstanceContextUserData = te.app.aljoud.utils.session.UserHelper.getInstance(getRoot().getContext()).getUserData();


                if (userHelperGetInstanceContextUserData != null) {
                    // read UserHelper.getInstance(context).userData.qr_image
                    userHelperGetInstanceContextUserDataQrImage = userHelperGetInstanceContextUserData.getQr_image();
                    // read UserHelper.getInstance(context).userData.id
                    userHelperGetInstanceContextUserDataId = userHelperGetInstanceContextUserData.getId();
                }


                // read String.valueOf(UserHelper.getInstance(context).userData.id)
                stringValueOfUserHelperGetInstanceContextUserDataId = java.lang.String.valueOf(userHelperGetInstanceContextUserDataId);


                // read @android:string/account_number.concat(" ").concat(String.valueOf(UserHelper.getInstance(context).userData.id))
                tvCardTitleAndroidStringAccountNumberConcatJavaLangStringConcatStringValueOfUserHelperGetInstanceContextUserDataId = tvCardTitle.getResources().getString(R.string.account_number).concat(" ").concat(stringValueOfUserHelperGetInstanceContextUserDataId);
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.loadImage(this.icQr, userHelperGetInstanceContextUserDataQrImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCardTitle, tvCardTitleAndroidStringAccountNumberConcatJavaLangStringConcatStringValueOfUserHelperGetInstanceContextUserDataId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}