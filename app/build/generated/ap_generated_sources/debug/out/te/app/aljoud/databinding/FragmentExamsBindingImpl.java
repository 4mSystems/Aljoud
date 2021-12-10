package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentExamsBindingImpl extends FragmentExamsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_score, 5);
        sViewsWithIds.put(R.id.br, 6);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentExamsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentExamsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.Barrier) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[5]
            , (te.app.aljoud.customViews.views.CustomTextViewRegular) bindings[1]
            );
        this.icQuiz.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (androidx.recyclerview.widget.RecyclerView) bindings[4];
        this.mboundView4.setTag(null);
        this.tvQuizText.setTag(null);
        this.tvScoreValue.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewmodel((te.app.aljoud.pages.exams.viewModels.ExamsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.aljoud.pages.exams.viewModels.ExamsViewModel Viewmodel) {
        updateRegistration(1, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelScore((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewmodel((te.app.aljoud.pages.exams.viewModels.ExamsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelScore(androidx.databinding.ObservableField<java.lang.Integer> ViewmodelScore, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.aljoud.pages.exams.viewModels.ExamsViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.examData) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.answersAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        te.app.aljoud.pages.exams.models.ExamData viewmodelExamData = null;
        java.lang.String viewmodelExamDataType = null;
        java.lang.Integer viewmodelScoreGet = null;
        java.lang.String stringValueOfViewmodelScore = null;
        boolean viewmodelExamDataTypeEqualsJavaLangStringText = false;
        int viewmodelExamDataTypeEqualsJavaLangStringImageViewVISIBLEViewINVISIBLE = 0;
        int androidxDatabindingViewDataBindingSafeUnboxViewmodelScoreGet = 0;
        int viewmodelExamDataTypeEqualsJavaLangStringTextViewVISIBLEViewINVISIBLE = 0;
        java.lang.String viewmodelExamDataName = null;
        te.app.aljoud.pages.exams.adapters.AnswersAdapter viewmodelAnswersAdapter = null;
        androidx.databinding.ObservableField<java.lang.Integer> viewmodelScore = null;
        boolean viewmodelExamDataTypeEqualsJavaLangStringImage = false;
        te.app.aljoud.pages.exams.viewModels.ExamsViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x16L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.examData
                        viewmodelExamData = viewmodel.getExamData();
                    }


                    if (viewmodelExamData != null) {
                        // read viewmodel.examData.type
                        viewmodelExamDataType = viewmodelExamData.getType();
                        // read viewmodel.examData.name
                        viewmodelExamDataName = viewmodelExamData.getName();
                    }


                    if (viewmodelExamDataType != null) {
                        // read viewmodel.examData.type.equals("text")
                        viewmodelExamDataTypeEqualsJavaLangStringText = viewmodelExamDataType.equals("text");
                        // read viewmodel.examData.type.equals("image")
                        viewmodelExamDataTypeEqualsJavaLangStringImage = viewmodelExamDataType.equals("image");
                    }
                if((dirtyFlags & 0x16L) != 0) {
                    if(viewmodelExamDataTypeEqualsJavaLangStringText) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }
                if((dirtyFlags & 0x16L) != 0) {
                    if(viewmodelExamDataTypeEqualsJavaLangStringImage) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read viewmodel.examData.type.equals("text") ? View.VISIBLE : View.INVISIBLE
                    viewmodelExamDataTypeEqualsJavaLangStringTextViewVISIBLEViewINVISIBLE = ((viewmodelExamDataTypeEqualsJavaLangStringText) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                    // read viewmodel.examData.type.equals("image") ? View.VISIBLE : View.INVISIBLE
                    viewmodelExamDataTypeEqualsJavaLangStringImageViewVISIBLEViewINVISIBLE = ((viewmodelExamDataTypeEqualsJavaLangStringImage) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.answersAdapter
                        viewmodelAnswersAdapter = viewmodel.getAnswersAdapter();
                    }
            }
            if ((dirtyFlags & 0x13L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.score
                        viewmodelScore = viewmodel.score;
                    }
                    updateRegistration(0, viewmodelScore);


                    if (viewmodelScore != null) {
                        // read viewmodel.score.get()
                        viewmodelScoreGet = viewmodelScore.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.score.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelScoreGet = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelScoreGet);


                    // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.score.get()))
                    stringValueOfViewmodelScore = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxViewmodelScoreGet);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            this.icQuiz.setVisibility(viewmodelExamDataTypeEqualsJavaLangStringImageViewVISIBLEViewINVISIBLE);
            te.app.aljoud.base.ApplicationBinding.loadFullImage(this.icQuiz, viewmodelExamDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvQuizText, viewmodelExamDataName);
            this.tvQuizText.setVisibility(viewmodelExamDataTypeEqualsJavaLangStringTextViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.getItemsV2Binding(this.mboundView4, viewmodelAnswersAdapter, "1", "1");
        }
        if ((dirtyFlags & 0x13L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvScoreValue, stringValueOfViewmodelScore);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.score
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): viewmodel.examData
        flag 3 (0x4L): viewmodel.answersAdapter
        flag 4 (0x5L): null
        flag 5 (0x6L): viewmodel.examData.type.equals("image") ? View.VISIBLE : View.INVISIBLE
        flag 6 (0x7L): viewmodel.examData.type.equals("image") ? View.VISIBLE : View.INVISIBLE
        flag 7 (0x8L): viewmodel.examData.type.equals("text") ? View.VISIBLE : View.INVISIBLE
        flag 8 (0x9L): viewmodel.examData.type.equals("text") ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}