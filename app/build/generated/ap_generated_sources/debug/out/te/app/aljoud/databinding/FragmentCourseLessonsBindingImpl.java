package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCourseLessonsBindingImpl extends FragmentCourseLessonsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_instructor, 1);
        sViewsWithIds.put(R.id.tv_card_title, 2);
        sViewsWithIds.put(R.id.tv_policy_warning1, 3);
        sViewsWithIds.put(R.id.tv_instractor_profession, 4);
        sViewsWithIds.put(R.id.ic_qr, 5);
        sViewsWithIds.put(R.id.tv_account_qr, 6);
        sViewsWithIds.put(R.id.card_info, 7);
        sViewsWithIds.put(R.id.tv_special, 8);
        sViewsWithIds.put(R.id.tv_subjects, 9);
        sViewsWithIds.put(R.id.ic_university, 10);
        sViewsWithIds.put(R.id.rate_container, 11);
        sViewsWithIds.put(R.id.card_rate, 12);
        sViewsWithIds.put(R.id.tv_rate_course, 13);
        sViewsWithIds.put(R.id.rate, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCourseLessonsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentCourseLessonsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.cardview.widget.CardView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[12]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[10]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[14]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[6]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[4]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[3]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[13]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[8]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[9]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
            setViewmodel((te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel Viewmodel, int fieldId) {
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
        // batch finished
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