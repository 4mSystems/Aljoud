package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCourseDetailsBindingImpl extends FragmentCourseDetailsBinding implements te.app.aljoud.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_info, 16);
        sViewsWithIds.put(R.id.br, 17);
        sViewsWithIds.put(R.id.tv_card_title, 18);
        sViewsWithIds.put(R.id.card_course_include, 19);
        sViewsWithIds.put(R.id.tv_card_course, 20);
        sViewsWithIds.put(R.id.tv_course_access, 21);
        sViewsWithIds.put(R.id.tv_course_discuss, 22);
        sViewsWithIds.put(R.id.tv_course_certificate, 23);
        sViewsWithIds.put(R.id.card_course_action, 24);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView15;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCourseDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private FragmentCourseDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[17]
            , (androidx.cardview.widget.CardView) bindings[24]
            , (androidx.cardview.widget.CardView) bindings[19]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[8]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[6]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[20]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[18]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[21]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[13]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[23]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[22]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[14]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[12]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[9]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[10]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[5]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.cardInstructor.setTag(null);
        this.icArrowRight.setTag(null);
        this.icInstructor.setTag(null);
        this.icUniversity.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView15 = (com.google.android.material.button.MaterialButton) bindings[15];
        this.mboundView15.setTag(null);
        this.offerItemDesc.setTag(null);
        this.tvCourseArticle.setTag(null);
        this.tvCourseQuiz.setTag(null);
        this.tvCourseTime.setTag(null);
        this.tvInstractorName.setTag(null);
        this.tvInstractorProfession.setTag(null);
        this.tvNewPrice.setTag(null);
        this.tvOldPrice.setTag(null);
        this.tvSpecial.setTag(null);
        this.tvSubjects.setTag(null);
        setRootTag(root);
        // listeners
        mCallback23 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
        mCallback24 = new te.app.aljoud.generated.callback.OnClickListener(this, 2);
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
        java.lang.String viewmodelCourseImage = null;
        java.lang.String viewmodelCourseCountVideosTimeConcatJavaLangStringConcatTvCourseTimeAndroidStringCourseTime = null;
        java.lang.String viewmodelCourseName = null;
        java.lang.String viewmodelCourseCountQuizzesConcatJavaLangString = null;
        java.lang.String viewmodelCourseDiscountConcatJavaLangStringConcatViewmodelCourseCurrencyCode = null;
        te.app.aljoud.pages.university.models.course.Course viewmodelCourse = null;
        java.lang.String viewmodelCourseDesc = null;
        java.lang.String viewmodelCourseCurrencyCode = null;
        java.lang.String stringValueOfViewmodelCourseRate = null;
        java.lang.String viewmodelCourseCountVideosTime = null;
        java.lang.String viewmodelCourseInstructorJobTitle = null;
        java.lang.String viewmodelCourseCountVideosTimeConcatJavaLangString = null;
        java.lang.String viewmodelCourseCountArticlesConcatJavaLangString = null;
        java.lang.String viewmodelCourseCountQuizzesConcatJavaLangStringConcatTvCourseQuizAndroidStringCourseQuiz = null;
        int viewmodelCourseRate = 0;
        java.lang.String viewmodelCourseInstructorImage = null;
        boolean viewmodelCourseInstructorJavaLangObjectNull = false;
        java.lang.String viewmodelCourseCountQuizzes = null;
        java.lang.String viewmodelCoursePrice = null;
        java.lang.String viewmodelCourseDiscountConcatJavaLangString = null;
        te.app.aljoud.pages.university.models.course.Currency viewmodelCourseCurrency = null;
        java.lang.String viewmodelCourseDiscount = null;
        java.lang.String viewmodelCourseCountArticlesConcatJavaLangStringConcatTvCourseArticleAndroidStringCourseArticle = null;
        java.lang.String viewmodelCourseInstructorName = null;
        int viewmodelCourseInstructorJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelCourseCountArticles = null;
        te.app.aljoud.pages.auth.models.UserData viewmodelCourseInstructor = null;
        te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.course
                    viewmodelCourse = viewmodel.getCourse();
                }


                if (viewmodelCourse != null) {
                    // read viewmodel.course.image
                    viewmodelCourseImage = viewmodelCourse.getImage();
                    // read viewmodel.course.name
                    viewmodelCourseName = viewmodelCourse.getName();
                    // read viewmodel.course.desc
                    viewmodelCourseDesc = viewmodelCourse.getDesc();
                    // read viewmodel.course.countVideosTime
                    viewmodelCourseCountVideosTime = viewmodelCourse.getCountVideosTime();
                    // read viewmodel.course.rate
                    viewmodelCourseRate = viewmodelCourse.getRate();
                    // read viewmodel.course.countQuizzes
                    viewmodelCourseCountQuizzes = viewmodelCourse.getCountQuizzes();
                    // read viewmodel.course.price
                    viewmodelCoursePrice = viewmodelCourse.getPrice();
                    // read viewmodel.course.currency
                    viewmodelCourseCurrency = viewmodelCourse.getCurrency();
                    // read viewmodel.course.discount
                    viewmodelCourseDiscount = viewmodelCourse.getDiscount();
                    // read viewmodel.course.countArticles
                    viewmodelCourseCountArticles = viewmodelCourse.getCountArticles();
                    // read viewmodel.course.instructor
                    viewmodelCourseInstructor = viewmodelCourse.getInstructor();
                }


                if (viewmodelCourseCountVideosTime != null) {
                    // read viewmodel.course.countVideosTime.concat(" ")
                    viewmodelCourseCountVideosTimeConcatJavaLangString = viewmodelCourseCountVideosTime.concat(" ");
                }
                // read String.valueOf(viewmodel.course.rate)
                stringValueOfViewmodelCourseRate = java.lang.String.valueOf(viewmodelCourseRate);
                // read viewmodel.course.instructor != null
                viewmodelCourseInstructorJavaLangObjectNull = (viewmodelCourseInstructor) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelCourseInstructorJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
                if (viewmodelCourseCountQuizzes != null) {
                    // read viewmodel.course.countQuizzes.concat(" ")
                    viewmodelCourseCountQuizzesConcatJavaLangString = viewmodelCourseCountQuizzes.concat(" ");
                }
                if (viewmodelCourseCurrency != null) {
                    // read viewmodel.course.currency.code
                    viewmodelCourseCurrencyCode = viewmodelCourseCurrency.getCode();
                }
                if (viewmodelCourseDiscount != null) {
                    // read viewmodel.course.discount.concat(" ")
                    viewmodelCourseDiscountConcatJavaLangString = viewmodelCourseDiscount.concat(" ");
                }
                if (viewmodelCourseCountArticles != null) {
                    // read viewmodel.course.countArticles.concat(" ")
                    viewmodelCourseCountArticlesConcatJavaLangString = viewmodelCourseCountArticles.concat(" ");
                }
                if (viewmodelCourseInstructor != null) {
                    // read viewmodel.course.instructor.jobTitle
                    viewmodelCourseInstructorJobTitle = viewmodelCourseInstructor.getJobTitle();
                    // read viewmodel.course.instructor.image
                    viewmodelCourseInstructorImage = viewmodelCourseInstructor.getImage();
                    // read viewmodel.course.instructor.name
                    viewmodelCourseInstructorName = viewmodelCourseInstructor.getName();
                }


                if (viewmodelCourseCountVideosTimeConcatJavaLangString != null) {
                    // read viewmodel.course.countVideosTime.concat(" ").concat(@android:string/course_time)
                    viewmodelCourseCountVideosTimeConcatJavaLangStringConcatTvCourseTimeAndroidStringCourseTime = viewmodelCourseCountVideosTimeConcatJavaLangString.concat(tvCourseTime.getResources().getString(R.string.course_time));
                }
                // read viewmodel.course.instructor != null ? View.VISIBLE : View.GONE
                viewmodelCourseInstructorJavaLangObjectNullViewVISIBLEViewGONE = ((viewmodelCourseInstructorJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if (viewmodelCourseCountQuizzesConcatJavaLangString != null) {
                    // read viewmodel.course.countQuizzes.concat(" ").concat(@android:string/course_quiz)
                    viewmodelCourseCountQuizzesConcatJavaLangStringConcatTvCourseQuizAndroidStringCourseQuiz = viewmodelCourseCountQuizzesConcatJavaLangString.concat(tvCourseQuiz.getResources().getString(R.string.course_quiz));
                }
                if (viewmodelCourseDiscountConcatJavaLangString != null) {
                    // read viewmodel.course.discount.concat(" ").concat(viewmodel.course.currency.code)
                    viewmodelCourseDiscountConcatJavaLangStringConcatViewmodelCourseCurrencyCode = viewmodelCourseDiscountConcatJavaLangString.concat(viewmodelCourseCurrencyCode);
                }
                if (viewmodelCourseCountArticlesConcatJavaLangString != null) {
                    // read viewmodel.course.countArticles.concat(" ").concat(@android:string/course_article)
                    viewmodelCourseCountArticlesConcatJavaLangStringConcatTvCourseArticleAndroidStringCourseArticle = viewmodelCourseCountArticlesConcatJavaLangString.concat(tvCourseArticle.getResources().getString(R.string.course_article));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.cardInstructor.setVisibility(viewmodelCourseInstructorJavaLangObjectNullViewVISIBLEViewGONE);
            te.app.aljoud.base.ApplicationBinding.loadFullImage(this.icInstructor, viewmodelCourseInstructorImage);
            te.app.aljoud.base.ApplicationBinding.loadFullImage(this.icUniversity, viewmodelCourseImage);
            te.app.aljoud.base.ApplicationBinding.setRate(this.offerItemDesc, stringValueOfViewmodelCourseRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCourseArticle, viewmodelCourseCountArticlesConcatJavaLangStringConcatTvCourseArticleAndroidStringCourseArticle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCourseQuiz, viewmodelCourseCountQuizzesConcatJavaLangStringConcatTvCourseQuizAndroidStringCourseQuiz);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCourseTime, viewmodelCourseCountVideosTimeConcatJavaLangStringConcatTvCourseTimeAndroidStringCourseTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvInstractorName, viewmodelCourseInstructorName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvInstractorProfession, viewmodelCourseInstructorJobTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvNewPrice, viewmodelCourseDiscountConcatJavaLangStringConcatViewmodelCourseCurrencyCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOldPrice, viewmodelCoursePrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSpecial, viewmodelCourseName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubjects, viewmodelCourseDesc);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.icArrowRight.setOnClickListener(mCallback23);
            this.mboundView15.setOnClickListener(mCallback24);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.aljoud.utils.Constants.INSTRUCTOR);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.aljoud.utils.Constants.COURSE_LESSONS);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.course
        flag 2 (0x3L): null
        flag 3 (0x4L): viewmodel.course.instructor != null ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewmodel.course.instructor != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}