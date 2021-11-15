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
        sViewsWithIds.put(R.id.card_instructor, 7);
        sViewsWithIds.put(R.id.tv_policy_warning1, 8);
        sViewsWithIds.put(R.id.tv_instractor_profession, 9);
        sViewsWithIds.put(R.id.tv_account_qr, 10);
        sViewsWithIds.put(R.id.card_info, 11);
        sViewsWithIds.put(R.id.rate_container, 12);
        sViewsWithIds.put(R.id.card_rate, 13);
        sViewsWithIds.put(R.id.tv_rate_course, 14);
        sViewsWithIds.put(R.id.rate, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCourseLessonsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentCourseLessonsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[15]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[10]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[9]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[8]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[14]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[4]
            );
        this.icQr.setTag(null);
        this.icUniversity.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView6 = (androidx.recyclerview.widget.RecyclerView) bindings[6];
        this.mboundView6.setTag(null);
        this.tvCardTitle.setTag(null);
        this.tvSpecial.setTag(null);
        this.tvSubjects.setTag(null);
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
        if (BR.viewmodel == variableId) {
            setViewmodel((te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel Viewmodel) {
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
        else if (fieldId == BR.lessonMainData) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.lessonsAdapter) {
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
        te.app.aljoud.pages.courseDetails.adapters.LessonsAdapter viewmodelLessonsAdapter = null;
        te.app.aljoud.pages.auth.models.UserData userHelperGetInstanceContextUserData = null;
        java.lang.String viewmodelLessonMainDataCourseDataDesc = null;
        java.lang.String tvCardTitleAndroidStringAccountNumberConcatJavaLangStringConcatStringValueOfUserHelperGetInstanceContextUserDataId = null;
        java.lang.String viewmodelLessonMainDataCourseDataImage = null;
        java.lang.String userHelperGetInstanceContextUserDataQrImage = null;
        int userHelperGetInstanceContextUserDataId = 0;
        te.app.aljoud.pages.university.models.course.Course viewmodelLessonMainDataCourseData = null;
        te.app.aljoud.pages.courseDetails.models.lessons.LessonMainData viewmodelLessonMainData = null;
        java.lang.String viewmodelLessonMainDataCourseDataName = null;
        java.lang.String stringValueOfUserHelperGetInstanceContextUserDataId = null;
        te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x8L) != 0) {

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
        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.lessonsAdapter
                        viewmodelLessonsAdapter = viewmodel.getLessonsAdapter();
                    }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.lessonMainData
                        viewmodelLessonMainData = viewmodel.getLessonMainData();
                    }


                    if (viewmodelLessonMainData != null) {
                        // read viewmodel.lessonMainData.courseData
                        viewmodelLessonMainDataCourseData = viewmodelLessonMainData.getCourseData();
                    }


                    if (viewmodelLessonMainDataCourseData != null) {
                        // read viewmodel.lessonMainData.courseData.desc
                        viewmodelLessonMainDataCourseDataDesc = viewmodelLessonMainDataCourseData.getDesc();
                        // read viewmodel.lessonMainData.courseData.image
                        viewmodelLessonMainDataCourseDataImage = viewmodelLessonMainDataCourseData.getImage();
                        // read viewmodel.lessonMainData.courseData.name
                        viewmodelLessonMainDataCourseDataName = viewmodelLessonMainDataCourseData.getName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.loadImage(this.icQr, userHelperGetInstanceContextUserDataQrImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCardTitle, tvCardTitleAndroidStringAccountNumberConcatJavaLangStringConcatStringValueOfUserHelperGetInstanceContextUserDataId);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.loadFullImage(this.icUniversity, viewmodelLessonMainDataCourseDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSpecial, viewmodelLessonMainDataCourseDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubjects, viewmodelLessonMainDataCourseDataDesc);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.getItemsV2Binding(this.mboundView6, viewmodelLessonsAdapter, "1", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.lessonMainData
        flag 2 (0x3L): viewmodel.lessonsAdapter
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}