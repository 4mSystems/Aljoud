package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class InstractorSheetBindingImpl extends InstractorSheetBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_card_title, 5);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public InstractorSheetBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private InstractorSheetBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[5]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3]
            );
        this.icInstructor.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvInstractorDesc.setTag(null);
        this.tvInstractorName.setTag(null);
        this.tvInstractorProfession.setTag(null);
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
        if (BR.viewmodel == variableId) {
            setViewmodel((te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel Viewmodel) {
        updateRegistration(0, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
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
        else if (fieldId == BR.course) {
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
        java.lang.String viewmodelCourseInstructorBio = null;
        java.lang.String viewmodelCourseInstructorName = null;
        java.lang.String viewmodelCourseInstructorImage = null;
        java.lang.String viewmodelCourseInstructorJobTitle = null;
        te.app.aljoud.pages.auth.models.UserData viewmodelCourseInstructor = null;
        te.app.aljoud.pages.university.models.course.Course viewmodelCourse = null;
        te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.course
                    viewmodelCourse = viewmodel.getCourse();
                }


                if (viewmodelCourse != null) {
                    // read viewmodel.course.instructor
                    viewmodelCourseInstructor = viewmodelCourse.getInstructor();
                }


                if (viewmodelCourseInstructor != null) {
                    // read viewmodel.course.instructor.bio
                    viewmodelCourseInstructorBio = viewmodelCourseInstructor.getBio();
                    // read viewmodel.course.instructor.name
                    viewmodelCourseInstructorName = viewmodelCourseInstructor.getName();
                    // read viewmodel.course.instructor.image
                    viewmodelCourseInstructorImage = viewmodelCourseInstructor.getImage();
                    // read viewmodel.course.instructor.jobTitle
                    viewmodelCourseInstructorJobTitle = viewmodelCourseInstructor.getJobTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.loadFullImage(this.icInstructor, viewmodelCourseInstructorImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvInstractorDesc, viewmodelCourseInstructorBio);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvInstractorName, viewmodelCourseInstructorName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvInstractorProfession, viewmodelCourseInstructorJobTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.course
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}