package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ExamResultDialogBindingImpl extends ExamResultDialogBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.title_result, 2);
        sViewsWithIds.put(R.id.sendFeedBack, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ExamResultDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ExamResultDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[1]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2]
            );
        this.grade.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((te.app.aljoud.pages.exams.viewModels.ExamsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable te.app.aljoud.pages.exams.viewModels.ExamsViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((te.app.aljoud.pages.exams.viewModels.ExamsViewModel) object, fieldId);
            case 1 :
                return onChangeViewModelScore((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(te.app.aljoud.pages.exams.viewModels.ExamsViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelScore(androidx.databinding.ObservableField<java.lang.Integer> ViewModelScore, int fieldId) {
        if (fieldId == BR._all) {
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
        java.lang.Integer viewModelScoreGet = null;
        java.lang.String stringValueOfViewModelScore = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelScoreGet = 0;
        te.app.aljoud.pages.exams.viewModels.ExamsViewModel viewModel = mViewModel;
        androidx.databinding.ObservableField<java.lang.Integer> viewModelScore = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.score
                    viewModelScore = viewModel.score;
                }
                updateRegistration(1, viewModelScore);


                if (viewModelScore != null) {
                    // read viewModel.score.get()
                    viewModelScoreGet = viewModelScore.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.score.get())
                androidxDatabindingViewDataBindingSafeUnboxViewModelScoreGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelScoreGet);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.score.get()))
                stringValueOfViewModelScore = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxViewModelScoreGet);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.grade, stringValueOfViewModelScore);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.score
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}