package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentUniversityDetailsBindingImpl extends FragmentUniversityDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_info, 7);
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

    public FragmentUniversityDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentUniversityDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[7]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[5]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[1]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.icUniversity.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView6 = (androidx.recyclerview.widget.RecyclerView) bindings[6];
        this.mboundView6.setTag(null);
        this.tvLessons.setTag(null);
        this.tvSpecial.setTag(null);
        this.tvStudents.setTag(null);
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
            setViewmodel((te.app.aljoud.pages.university.viewModel.UniversityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.aljoud.pages.university.viewModel.UniversityViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.aljoud.pages.university.viewModel.UniversityViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.aljoud.pages.university.viewModel.UniversityViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.universityData) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.collegesAdapter) {
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
        java.lang.String tvLessonsAndroidStringLessonsConcatJavaLangStringConcatStringValueOfViewmodelUniversityDataLessons = null;
        int viewmodelUniversityDataLessons = 0;
        te.app.aljoud.pages.university.models.UniversityData viewmodelUniversityData = null;
        java.lang.String tvSpecialAndroidStringSpecialConcatJavaLangStringConcatStringValueOfViewmodelUniversityDataSpiecialest = null;
        java.lang.String stringValueOfViewmodelUniversityDataStudents = null;
        te.app.aljoud.pages.university.adapters.UniversityCollegesAdapter viewmodelCollegesAdapter = null;
        java.lang.String tvStudentsAndroidStringStudentsConcatJavaLangStringConcatStringValueOfViewmodelUniversityDataStudents = null;
        int viewmodelUniversityDataStudents = 0;
        java.lang.String viewmodelUniversityDataImage = null;
        java.lang.String stringValueOfViewmodelUniversityDataCourses = null;
        int viewmodelUniversityDataCourses = 0;
        int viewmodelUniversityDataSpiecialest = 0;
        java.lang.String stringValueOfViewmodelUniversityDataSpiecialest = null;
        java.lang.String stringValueOfViewmodelUniversityDataLessons = null;
        te.app.aljoud.pages.university.viewModel.UniversityViewModel viewmodel = mViewmodel;
        java.lang.String tvSubjectsAndroidStringSubjectsConcatJavaLangStringConcatStringValueOfViewmodelUniversityDataCourses = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.universityData
                        viewmodelUniversityData = viewmodel.getUniversityData();
                    }


                    if (viewmodelUniversityData != null) {
                        // read viewmodel.universityData.lessons
                        viewmodelUniversityDataLessons = viewmodelUniversityData.getLessons();
                        // read viewmodel.universityData.students
                        viewmodelUniversityDataStudents = viewmodelUniversityData.getStudents();
                        // read viewmodel.universityData.image
                        viewmodelUniversityDataImage = viewmodelUniversityData.getImage();
                        // read viewmodel.universityData.courses
                        viewmodelUniversityDataCourses = viewmodelUniversityData.getCourses();
                        // read viewmodel.universityData.spiecialest
                        viewmodelUniversityDataSpiecialest = viewmodelUniversityData.getSpiecialest();
                    }


                    // read String.valueOf(viewmodel.universityData.lessons)
                    stringValueOfViewmodelUniversityDataLessons = java.lang.String.valueOf(viewmodelUniversityDataLessons);
                    // read String.valueOf(viewmodel.universityData.students)
                    stringValueOfViewmodelUniversityDataStudents = java.lang.String.valueOf(viewmodelUniversityDataStudents);
                    // read String.valueOf(viewmodel.universityData.courses)
                    stringValueOfViewmodelUniversityDataCourses = java.lang.String.valueOf(viewmodelUniversityDataCourses);
                    // read String.valueOf(viewmodel.universityData.spiecialest)
                    stringValueOfViewmodelUniversityDataSpiecialest = java.lang.String.valueOf(viewmodelUniversityDataSpiecialest);


                    // read @android:string/lessons.concat(" ").concat(String.valueOf(viewmodel.universityData.lessons))
                    tvLessonsAndroidStringLessonsConcatJavaLangStringConcatStringValueOfViewmodelUniversityDataLessons = tvLessons.getResources().getString(R.string.lessons).concat(" ").concat(stringValueOfViewmodelUniversityDataLessons);
                    // read @android:string/students.concat(" ").concat(String.valueOf(viewmodel.universityData.students))
                    tvStudentsAndroidStringStudentsConcatJavaLangStringConcatStringValueOfViewmodelUniversityDataStudents = tvStudents.getResources().getString(R.string.students).concat(" ").concat(stringValueOfViewmodelUniversityDataStudents);
                    // read @android:string/subjects.concat(" ").concat(String.valueOf(viewmodel.universityData.courses))
                    tvSubjectsAndroidStringSubjectsConcatJavaLangStringConcatStringValueOfViewmodelUniversityDataCourses = tvSubjects.getResources().getString(R.string.subjects).concat(" ").concat(stringValueOfViewmodelUniversityDataCourses);
                    // read @android:string/special.concat(" ").concat(String.valueOf(viewmodel.universityData.spiecialest))
                    tvSpecialAndroidStringSpecialConcatJavaLangStringConcatStringValueOfViewmodelUniversityDataSpiecialest = tvSpecial.getResources().getString(R.string.special).concat(" ").concat(stringValueOfViewmodelUniversityDataSpiecialest);
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.collegesAdapter
                        viewmodelCollegesAdapter = viewmodel.getCollegesAdapter();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.loadFullImage(this.icUniversity, viewmodelUniversityDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLessons, tvLessonsAndroidStringLessonsConcatJavaLangStringConcatStringValueOfViewmodelUniversityDataLessons);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSpecial, tvSpecialAndroidStringSpecialConcatJavaLangStringConcatStringValueOfViewmodelUniversityDataSpiecialest);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvStudents, tvStudentsAndroidStringStudentsConcatJavaLangStringConcatStringValueOfViewmodelUniversityDataStudents);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSubjects, tvSubjectsAndroidStringSubjectsConcatJavaLangStringConcatStringValueOfViewmodelUniversityDataCourses);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.getItemsV2Binding(this.mboundView6, viewmodelCollegesAdapter, "2", "1");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.universityData
        flag 2 (0x3L): viewmodel.collegesAdapter
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}