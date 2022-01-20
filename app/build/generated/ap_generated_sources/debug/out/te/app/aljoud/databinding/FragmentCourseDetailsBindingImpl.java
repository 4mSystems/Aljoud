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
        sViewsWithIds.put(R.id.card_info, 18);
        sViewsWithIds.put(R.id.br, 19);
        sViewsWithIds.put(R.id.tv_card_title, 20);
        sViewsWithIds.put(R.id.card_course_include, 21);
        sViewsWithIds.put(R.id.tv_card_course, 22);
        sViewsWithIds.put(R.id.tv_course_access, 23);
        sViewsWithIds.put(R.id.tv_course_discuss, 24);
        sViewsWithIds.put(R.id.tv_course_certificate, 25);
        sViewsWithIds.put(R.id.card_course_action, 26);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView15;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView16;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView17;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCourseDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FragmentCourseDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[19]
            , (androidx.cardview.widget.CardView) bindings[26]
            , (androidx.cardview.widget.CardView) bindings[21]
            , (androidx.cardview.widget.CardView) bindings[18]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[8]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatRatingBar) bindings[6]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[22]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[20]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[23]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[13]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[25]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[24]
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
        this.mboundView16 = (com.google.android.material.button.MaterialButton) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (com.google.android.material.button.MaterialButton) bindings[17];
        this.mboundView17.setTag(null);
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
        mCallback30 = new te.app.aljoud.generated.callback.OnClickListener(this, 3);
        mCallback28 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
        mCallback31 = new te.app.aljoud.generated.callback.OnClickListener(this, 4);
        mCallback29 = new te.app.aljoud.generated.callback.OnClickListener(this, 2);
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
        boolean textUtilsIsEmptyViewmodelCoursePriceViewmodelCourseDiscountEqualsJavaLangString0BooleanFalse = false;
        boolean textUtilsIsEmptyViewmodelCourseDiscount = false;
        boolean viewmodelCourseNameJavaLangObjectNull = false;
        java.lang.String viewmodelCourseImage = null;
        java.lang.String viewmodelCourseCountVideosTimeConcatJavaLangStringConcatTvCourseTimeAndroidStringCourseTime = null;
        boolean viewmodelCourseMyCourse = false;
        boolean TextUtilsIsEmptyViewmodelCourseDiscount1 = false;
        java.lang.String viewmodelCourseName = null;
        java.lang.String viewmodelCourseCountQuizzesConcatJavaLangString = null;
        java.lang.String viewmodelCourseDiscountConcatJavaLangStringConcatViewmodelCourseCurrencyCode = null;
        boolean textUtilsIsEmptyViewmodelCoursePrice = false;
        te.app.aljoud.pages.university.models.course.Course viewmodelCourse = null;
        java.lang.String viewmodelCourseDesc = null;
        int viewmodelCourseNameJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelCourseCurrencyCode = null;
        java.lang.String stringValueOfViewmodelCourseRate = null;
        boolean TextUtilsIsEmptyViewmodelCoursePrice1 = false;
        java.lang.String viewmodelCourseCountVideosTime = null;
        java.lang.String viewmodelCourseInstructorJobTitle = null;
        java.lang.String viewmodelCourseCountVideosTimeConcatJavaLangString = null;
        java.lang.String viewmodelCourseCountArticlesConcatJavaLangString = null;
        java.lang.String viewmodelCourseCountQuizzesConcatJavaLangStringConcatTvCourseQuizAndroidStringCourseQuiz = null;
        int viewmodelCourseRate = 0;
        int textUtilsIsEmptyViewmodelCoursePriceViewmodelCourseDiscountEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelCourseInstructorImage = null;
        boolean viewmodelCourseInstructorJavaLangObjectNull = false;
        boolean viewmodelCourseDiscountEqualsJavaLangString0 = false;
        java.lang.String viewmodelCourseCountQuizzes = null;
        java.lang.String viewmodelCoursePrice = null;
        boolean textUtilsIsEmptyViewmodelCourseDiscountViewmodelCourseDiscountEqualsJavaLangString0BooleanFalse = false;
        java.lang.String viewmodelCourseDiscountConcatJavaLangString = null;
        te.app.aljoud.pages.university.models.course.Currency viewmodelCourseCurrency = null;
        java.lang.String viewmodelCourseDiscount = null;
        boolean ViewmodelCourseMyCourse1 = false;
        java.lang.String viewmodelCoursePriceConcatJavaLangString = null;
        java.lang.String viewmodelCourseCountArticlesConcatJavaLangStringConcatTvCourseArticleAndroidStringCourseArticle = null;
        java.lang.String viewmodelCourseInstructorName = null;
        int textUtilsIsEmptyViewmodelCourseDiscountViewmodelCourseDiscountEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelCoursePriceConcatJavaLangStringConcatViewmodelCourseCurrencyCode = null;
        int viewmodelCourseInstructorJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String viewmodelCourseCountArticles = null;
        int viewmodelCourseMyCourseViewVISIBLEViewGONE = 0;
        te.app.aljoud.pages.auth.models.UserData viewmodelCourseInstructor = null;
        te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel viewmodel = mViewmodel;
        boolean ViewmodelCourseDiscountEqualsJavaLangString01 = false;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.course
                    viewmodelCourse = viewmodel.getCourse();
                }


                if (viewmodelCourse != null) {
                    // read viewmodel.course.image
                    viewmodelCourseImage = viewmodelCourse.getImage();
                    // read viewmodel.course.myCourse
                    viewmodelCourseMyCourse = viewmodelCourse.isMyCourse();
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


                // read !viewmodel.course.myCourse
                ViewmodelCourseMyCourse1 = !viewmodelCourseMyCourse;
                // read viewmodel.course.name != null
                viewmodelCourseNameJavaLangObjectNull = (viewmodelCourseName) != (null);
                // read String.valueOf(viewmodel.course.rate)
                stringValueOfViewmodelCourseRate = java.lang.String.valueOf(viewmodelCourseRate);
                // read TextUtils.isEmpty(viewmodel.course.price)
                textUtilsIsEmptyViewmodelCoursePrice = android.text.TextUtils.isEmpty(viewmodelCoursePrice);
                // read TextUtils.isEmpty(viewmodel.course.discount)
                TextUtilsIsEmptyViewmodelCourseDiscount1 = android.text.TextUtils.isEmpty(viewmodelCourseDiscount);
                // read viewmodel.course.instructor != null
                viewmodelCourseInstructorJavaLangObjectNull = (viewmodelCourseInstructor) != (null);
            if((dirtyFlags & 0x7L) != 0) {
                if(ViewmodelCourseMyCourse1) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelCourseNameJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewmodelCourseInstructorJavaLangObjectNull) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
                if (viewmodelCourseCountVideosTime != null) {
                    // read viewmodel.course.countVideosTime.concat(" ")
                    viewmodelCourseCountVideosTimeConcatJavaLangString = viewmodelCourseCountVideosTime.concat(" ");
                }
                if (viewmodelCourseCountQuizzes != null) {
                    // read viewmodel.course.countQuizzes.concat(" ")
                    viewmodelCourseCountQuizzesConcatJavaLangString = viewmodelCourseCountQuizzes.concat(" ");
                }
                if (viewmodelCoursePrice != null) {
                    // read viewmodel.course.price.concat(" ")
                    viewmodelCoursePriceConcatJavaLangString = viewmodelCoursePrice.concat(" ");
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


                // read !viewmodel.course.myCourse ? View.VISIBLE : View.GONE
                viewmodelCourseMyCourseViewVISIBLEViewGONE = ((ViewmodelCourseMyCourse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewmodel.course.name != null ? View.VISIBLE : View.GONE
                viewmodelCourseNameJavaLangObjectNullViewVISIBLEViewGONE = ((viewmodelCourseNameJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read !TextUtils.isEmpty(viewmodel.course.price)
                TextUtilsIsEmptyViewmodelCoursePrice1 = !textUtilsIsEmptyViewmodelCoursePrice;
                // read !TextUtils.isEmpty(viewmodel.course.discount)
                textUtilsIsEmptyViewmodelCourseDiscount = !TextUtilsIsEmptyViewmodelCourseDiscount1;
                // read viewmodel.course.instructor != null ? View.VISIBLE : View.GONE
                viewmodelCourseInstructorJavaLangObjectNullViewVISIBLEViewGONE = ((viewmodelCourseInstructorJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            if((dirtyFlags & 0x7L) != 0) {
                if(TextUtilsIsEmptyViewmodelCoursePrice1) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(textUtilsIsEmptyViewmodelCourseDiscount) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
                if (viewmodelCourseCountVideosTimeConcatJavaLangString != null) {
                    // read viewmodel.course.countVideosTime.concat(" ").concat(@android:string/course_time)
                    viewmodelCourseCountVideosTimeConcatJavaLangStringConcatTvCourseTimeAndroidStringCourseTime = viewmodelCourseCountVideosTimeConcatJavaLangString.concat(tvCourseTime.getResources().getString(R.string.course_time));
                }
                if (viewmodelCourseCountQuizzesConcatJavaLangString != null) {
                    // read viewmodel.course.countQuizzes.concat(" ").concat(@android:string/course_quiz)
                    viewmodelCourseCountQuizzesConcatJavaLangStringConcatTvCourseQuizAndroidStringCourseQuiz = viewmodelCourseCountQuizzesConcatJavaLangString.concat(tvCourseQuiz.getResources().getString(R.string.course_quiz));
                }
                if (viewmodelCoursePriceConcatJavaLangString != null) {
                    // read viewmodel.course.price.concat(" ").concat(viewmodel.course.currency.code)
                    viewmodelCoursePriceConcatJavaLangStringConcatViewmodelCourseCurrencyCode = viewmodelCoursePriceConcatJavaLangString.concat(viewmodelCourseCurrencyCode);
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

        if ((dirtyFlags & 0x410L) != 0) {

                if (viewmodelCourseDiscount != null) {
                    // read viewmodel.course.discount.equals("0")
                    ViewmodelCourseDiscountEqualsJavaLangString01 = viewmodelCourseDiscount.equals("0");
                }


                // read !viewmodel.course.discount.equals("0")
                viewmodelCourseDiscountEqualsJavaLangString0 = !ViewmodelCourseDiscountEqualsJavaLangString01;
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read !TextUtils.isEmpty(viewmodel.course.price) ? !viewmodel.course.discount.equals("0") : false
                textUtilsIsEmptyViewmodelCoursePriceViewmodelCourseDiscountEqualsJavaLangString0BooleanFalse = ((TextUtilsIsEmptyViewmodelCoursePrice1) ? (viewmodelCourseDiscountEqualsJavaLangString0) : (false));
                // read !TextUtils.isEmpty(viewmodel.course.discount) ? !viewmodel.course.discount.equals("0") : false
                textUtilsIsEmptyViewmodelCourseDiscountViewmodelCourseDiscountEqualsJavaLangString0BooleanFalse = ((textUtilsIsEmptyViewmodelCourseDiscount) ? (viewmodelCourseDiscountEqualsJavaLangString0) : (false));
            if((dirtyFlags & 0x7L) != 0) {
                if(textUtilsIsEmptyViewmodelCoursePriceViewmodelCourseDiscountEqualsJavaLangString0BooleanFalse) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(textUtilsIsEmptyViewmodelCourseDiscountViewmodelCourseDiscountEqualsJavaLangString0BooleanFalse) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read !TextUtils.isEmpty(viewmodel.course.price) ? !viewmodel.course.discount.equals("0") : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelCoursePriceViewmodelCourseDiscountEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewmodelCoursePriceViewmodelCourseDiscountEqualsJavaLangString0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read !TextUtils.isEmpty(viewmodel.course.discount) ? !viewmodel.course.discount.equals("0") : false ? View.VISIBLE : View.GONE
                textUtilsIsEmptyViewmodelCourseDiscountViewmodelCourseDiscountEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE = ((textUtilsIsEmptyViewmodelCourseDiscountViewmodelCourseDiscountEqualsJavaLangString0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.cardInstructor.setVisibility(viewmodelCourseInstructorJavaLangObjectNullViewVISIBLEViewGONE);
            te.app.aljoud.base.ApplicationBinding.loadFullImage(this.icInstructor, viewmodelCourseInstructorImage);
            te.app.aljoud.base.ApplicationBinding.loadFullImage(this.icUniversity, viewmodelCourseImage);
            this.mboundView0.setVisibility(viewmodelCourseNameJavaLangObjectNullViewVISIBLEViewGONE);
            this.mboundView16.setVisibility(viewmodelCourseMyCourseViewVISIBLEViewGONE);
            te.app.aljoud.base.ApplicationBinding.setRate(this.offerItemDesc, stringValueOfViewmodelCourseRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCourseArticle, viewmodelCourseCountArticlesConcatJavaLangStringConcatTvCourseArticleAndroidStringCourseArticle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCourseQuiz, viewmodelCourseCountQuizzesConcatJavaLangStringConcatTvCourseQuizAndroidStringCourseQuiz);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCourseTime, viewmodelCourseCountVideosTimeConcatJavaLangStringConcatTvCourseTimeAndroidStringCourseTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvInstractorName, viewmodelCourseInstructorName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvInstractorProfession, viewmodelCourseInstructorJobTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvNewPrice, viewmodelCourseDiscountConcatJavaLangStringConcatViewmodelCourseCurrencyCode);
            this.tvNewPrice.setVisibility(textUtilsIsEmptyViewmodelCourseDiscountViewmodelCourseDiscountEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvOldPrice, viewmodelCoursePriceConcatJavaLangStringConcatViewmodelCourseCurrencyCode);
            this.tvOldPrice.setVisibility(textUtilsIsEmptyViewmodelCoursePriceViewmodelCourseDiscountEqualsJavaLangString0BooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSpecial, viewmodelCourseName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubjects, viewmodelCourseDesc);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.icArrowRight.setOnClickListener(mCallback28);
            this.mboundView15.setOnClickListener(mCallback29);
            this.mboundView16.setOnClickListener(mCallback30);
            this.mboundView17.setOnClickListener(mCallback31);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.aljoud.utils.Constants.PAYMENT_METHOD);
                }
                break;
            }
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
            case 4: {
                // localize variables for thread safety
                // viewmodel != null
                boolean viewmodelJavaLangObjectNull = false;
                // viewmodel
                te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel viewmodel = mViewmodel;



                viewmodelJavaLangObjectNull = (viewmodel) != (null);
                if (viewmodelJavaLangObjectNull) {




                    viewmodel.action(te.app.aljoud.utils.Constants.ASK);
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
        flag 3 (0x4L): !TextUtils.isEmpty(viewmodel.course.price) ? !viewmodel.course.discount.equals("0") : false
        flag 4 (0x5L): !TextUtils.isEmpty(viewmodel.course.price) ? !viewmodel.course.discount.equals("0") : false
        flag 5 (0x6L): viewmodel.course.name != null ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewmodel.course.name != null ? View.VISIBLE : View.GONE
        flag 7 (0x8L): !TextUtils.isEmpty(viewmodel.course.price) ? !viewmodel.course.discount.equals("0") : false ? View.VISIBLE : View.GONE
        flag 8 (0x9L): !TextUtils.isEmpty(viewmodel.course.price) ? !viewmodel.course.discount.equals("0") : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): !TextUtils.isEmpty(viewmodel.course.discount) ? !viewmodel.course.discount.equals("0") : false
        flag 10 (0xbL): !TextUtils.isEmpty(viewmodel.course.discount) ? !viewmodel.course.discount.equals("0") : false
        flag 11 (0xcL): !TextUtils.isEmpty(viewmodel.course.discount) ? !viewmodel.course.discount.equals("0") : false ? View.VISIBLE : View.GONE
        flag 12 (0xdL): !TextUtils.isEmpty(viewmodel.course.discount) ? !viewmodel.course.discount.equals("0") : false ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewmodel.course.instructor != null ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewmodel.course.instructor != null ? View.VISIBLE : View.GONE
        flag 15 (0x10L): !viewmodel.course.myCourse ? View.VISIBLE : View.GONE
        flag 16 (0x11L): !viewmodel.course.myCourse ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}