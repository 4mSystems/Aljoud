package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCategorySectionsBindingImpl extends FragmentCategorySectionsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.pr_levels, 4);
        sViewsWithIds.put(R.id.pr_course, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCategorySectionsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentCategorySectionsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[5]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3];
        this.mboundView3.setTag(null);
        this.rcCategories.setTag(null);
        this.rcLevels.setTag(null);
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
        else if (fieldId == BR.levelsAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.courseAdapter) {
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
        te.app.aljoud.pages.university.adapters.LevelsAdapter viewmodelLevelsAdapter = null;
        te.app.aljoud.pages.university.adapters.CourseAdapter viewmodelCourseAdapter = null;
        int viewmodelCourseAdapterItemCount = 0;
        int viewmodelCourseAdapterItemCountInt0ViewGONEViewVISIBLE = 0;
        boolean viewmodelCourseAdapterItemCountInt0 = false;
        te.app.aljoud.pages.university.viewModel.UniversityViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.levelsAdapter
                        viewmodelLevelsAdapter = viewmodel.getLevelsAdapter();
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.courseAdapter
                        viewmodelCourseAdapter = viewmodel.getCourseAdapter();
                    }


                    if (viewmodelCourseAdapter != null) {
                        // read viewmodel.courseAdapter.itemCount
                        viewmodelCourseAdapterItemCount = viewmodelCourseAdapter.getItemCount();
                    }


                    // read viewmodel.courseAdapter.itemCount > 0
                    viewmodelCourseAdapterItemCountInt0 = (viewmodelCourseAdapterItemCount) > (0);
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewmodelCourseAdapterItemCountInt0) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewmodel.courseAdapter.itemCount > 0 ? View.GONE : View.VISIBLE
                    viewmodelCourseAdapterItemCountInt0ViewGONEViewVISIBLE = ((viewmodelCourseAdapterItemCountInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewmodelCourseAdapterItemCountInt0ViewGONEViewVISIBLE);
            te.app.aljoud.base.ApplicationBinding.getItemsV2Binding(this.rcCategories, viewmodelCourseAdapter, "1", "1");
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            te.app.aljoud.base.ApplicationBinding.getItemsV2Binding(this.rcLevels, viewmodelLevelsAdapter, "1", "2");
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.levelsAdapter
        flag 2 (0x3L): viewmodel.courseAdapter
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.courseAdapter.itemCount > 0 ? View.GONE : View.VISIBLE
        flag 5 (0x6L): viewmodel.courseAdapter.itemCount > 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}