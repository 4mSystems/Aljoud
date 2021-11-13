package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCourseDetailsBindingImpl extends FragmentCourseDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_info, 1);
        sViewsWithIds.put(R.id.tv_special, 2);
        sViewsWithIds.put(R.id.tv_subjects, 3);
        sViewsWithIds.put(R.id.ic_university, 4);
        sViewsWithIds.put(R.id.br, 5);
        sViewsWithIds.put(R.id.tv_old_price, 6);
        sViewsWithIds.put(R.id.tv_new_price, 7);
        sViewsWithIds.put(R.id.offer_item_desc, 8);
        sViewsWithIds.put(R.id.card_instructor, 9);
        sViewsWithIds.put(R.id.tv_card_title, 10);
        sViewsWithIds.put(R.id.ic_instructor, 11);
        sViewsWithIds.put(R.id.tv_instractor_name, 12);
        sViewsWithIds.put(R.id.tv_instractor_profession, 13);
        sViewsWithIds.put(R.id.ic_arrow_right, 14);
        sViewsWithIds.put(R.id.card_course_include, 15);
        sViewsWithIds.put(R.id.tv_card_course, 16);
        sViewsWithIds.put(R.id.tv_course_time, 17);
        sViewsWithIds.put(R.id.tv_course_article, 18);
        sViewsWithIds.put(R.id.tv_course_quiz, 19);
        sViewsWithIds.put(R.id.tv_course_access, 20);
        sViewsWithIds.put(R.id.tv_course_discuss, 21);
        sViewsWithIds.put(R.id.tv_course_certificate, 22);
        sViewsWithIds.put(R.id.card_course_action, 23);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCourseDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentCourseDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[23]
            , (androidx.cardview.widget.CardView) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[14]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[11]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[8]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[16]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[10]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[20]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[18]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[22]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[21]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[19]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[17]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[12]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[13]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[7]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
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
            setViewmodel((te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodel((te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel Viewmodel, int fieldId) {
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