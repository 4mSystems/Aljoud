package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCourseLessonsBindingImpl extends FragmentCourseLessonsBinding implements te.app.aljoud.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_instructor, 11);
        sViewsWithIds.put(R.id.tv_policy_warning1, 12);
        sViewsWithIds.put(R.id.tv_instractor_profession, 13);
        sViewsWithIds.put(R.id.tv_account_qr, 14);
        sViewsWithIds.put(R.id.card_info, 15);
        sViewsWithIds.put(R.id.card_rate, 16);
        sViewsWithIds.put(R.id.tv_rate_course, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView10;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView6;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    private OnRatingBarChangeListenerImpl mViewmodelOnRateChangeAndroidWidgetRatingBarOnRatingBarChangeListener;
    // Inverse Binding Event Handlers

    public FragmentCourseLessonsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentCourseLessonsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[14]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[13]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[12]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[17]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[4]
            );
        this.icQr.setTag(null);
        this.icUniversity.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (com.google.android.material.button.MaterialButton) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView6 = (androidx.recyclerview.widget.RecyclerView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (com.google.android.material.button.MaterialButton) bindings[8];
        this.mboundView8.setTag(null);
        this.rate.setTag(null);
        this.rateContainer.setTag(null);
        this.tvCardTitle.setTag(null);
        this.tvSpecial.setTag(null);
        this.tvSubjects.setTag(null);
        setRootTag(root);
        // listeners
        mCallback21 = new te.app.aljoud.generated.callback.OnClickListener(this, 2);
        mCallback20 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
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
        boolean viewmodelLessonMainDataCourseDataJavaLangObjectNull = false;
        java.lang.String viewmodelLessonMainDataCourseDataDesc = null;
        java.lang.String tvCardTitleAndroidStringAccountNumberConcatJavaLangStringConcatStringValueOfUserHelperGetInstanceContextUserDataId = null;
        java.lang.String viewmodelLessonMainDataCourseDataImage = null;
        java.lang.String userHelperGetInstanceContextUserDataQrImage = null;
        int userHelperGetInstanceContextUserDataId = 0;
        te.app.aljoud.pages.university.models.course.Course viewmodelLessonMainDataCourseData = null;
        boolean userHelperGetInstanceContextUserDataJavaLangObjectNull = false;
        te.app.aljoud.pages.courseDetails.models.lessons.LessonMainData viewmodelLessonMainData = null;
        java.lang.String viewmodelLessonMainDataCourseDataName = null;
        java.lang.String stringValueOfUserHelperGetInstanceContextUserDataId = null;
        int userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE = 0;
        android.widget.RatingBar.OnRatingBarChangeListener viewmodelOnRateChangeAndroidWidgetRatingBarOnRatingBarChangeListener = null;
        int viewmodelLessonMainDataCourseDataJavaLangObjectNullViewVISIBLEViewGONE = 0;
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
                // read UserHelper.getInstance(context).userData != null
                userHelperGetInstanceContextUserDataJavaLangObjectNull = (userHelperGetInstanceContextUserData) != (null);
            if((dirtyFlags & 0x8L) != 0) {
                if(userHelperGetInstanceContextUserDataJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read String.valueOf(UserHelper.getInstance(context).userData.id)
                stringValueOfUserHelperGetInstanceContextUserDataId = java.lang.String.valueOf(userHelperGetInstanceContextUserDataId);
                // read UserHelper.getInstance(context).userData != null ? View.VISIBLE : View.GONE
                userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE = ((userHelperGetInstanceContextUserDataJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));


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


                    // read viewmodel.lessonMainData.courseData != null
                    viewmodelLessonMainDataCourseDataJavaLangObjectNull = (viewmodelLessonMainDataCourseData) != (null);
                if((dirtyFlags & 0xbL) != 0) {
                    if(viewmodelLessonMainDataCourseDataJavaLangObjectNull) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }
                    if (viewmodelLessonMainDataCourseData != null) {
                        // read viewmodel.lessonMainData.courseData.desc
                        viewmodelLessonMainDataCourseDataDesc = viewmodelLessonMainDataCourseData.getDesc();
                        // read viewmodel.lessonMainData.courseData.image
                        viewmodelLessonMainDataCourseDataImage = viewmodelLessonMainDataCourseData.getImage();
                        // read viewmodel.lessonMainData.courseData.name
                        viewmodelLessonMainDataCourseDataName = viewmodelLessonMainDataCourseData.getName();
                    }


                    // read viewmodel.lessonMainData.courseData != null ? View.VISIBLE : View.GONE
                    viewmodelLessonMainDataCourseDataJavaLangObjectNullViewVISIBLEViewGONE = ((viewmodelLessonMainDataCourseDataJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x9L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel::onRateChange
                        viewmodelOnRateChangeAndroidWidgetRatingBarOnRatingBarChangeListener = (((mViewmodelOnRateChangeAndroidWidgetRatingBarOnRatingBarChangeListener == null) ? (mViewmodelOnRateChangeAndroidWidgetRatingBarOnRatingBarChangeListener = new OnRatingBarChangeListenerImpl()) : mViewmodelOnRateChangeAndroidWidgetRatingBarOnRatingBarChangeListener).setValue(viewmodel));
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.loadImage(this.icQr, userHelperGetInstanceContextUserDataQrImage);
            this.mboundView10.setOnClickListener(mCallback21);
            this.mboundView8.setOnClickListener(mCallback20);
            this.rateContainer.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCardTitle, tvCardTitleAndroidStringAccountNumberConcatJavaLangStringConcatStringValueOfUserHelperGetInstanceContextUserDataId);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.loadFullImage(this.icUniversity, viewmodelLessonMainDataCourseDataImage);
            this.mboundView0.setVisibility(viewmodelLessonMainDataCourseDataJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSpecial, viewmodelLessonMainDataCourseDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubjects, viewmodelLessonMainDataCourseDataDesc);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.getItemsV2Binding(this.mboundView6, viewmodelLessonsAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.RatingBarBindingAdapter.setListeners(this.rate, (android.widget.RatingBar.OnRatingBarChangeListener)viewmodelOnRateChangeAndroidWidgetRatingBarOnRatingBarChangeListener, (androidx.databinding.InverseBindingListener)null);
        }
    }
    // Listener Stub Implementations
    public static class OnRatingBarChangeListenerImpl implements android.widget.RatingBar.OnRatingBarChangeListener{
        private te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel value;
        public OnRatingBarChangeListenerImpl setValue(te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onRatingChanged(android.widget.RatingBar arg0, float arg1, boolean arg2) {
            this.value.onRateChange(arg0, arg1, arg2); 
        }
    }
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.rateCourse();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {


                    viewmodel.toExam();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.lessonMainData
        flag 2 (0x3L): viewmodel.lessonsAdapter
        flag 3 (0x4L): null
        flag 4 (0x5L): UserHelper.getInstance(context).userData != null ? View.VISIBLE : View.GONE
        flag 5 (0x6L): UserHelper.getInstance(context).userData != null ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewmodel.lessonMainData.courseData != null ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewmodel.lessonMainData.courseData != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}