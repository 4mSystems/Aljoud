package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMyCoursesBindingImpl extends FragmentMyCoursesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
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

    public FragmentMyCoursesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentMyCoursesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3];
        this.mboundView3.setTag(null);
        this.prCourse.setTag(null);
        this.rcCategories.setTag(null);
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
            setViewmodel((te.app.aljoud.pages.myCourses.viewModels.MyCoursesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable te.app.aljoud.pages.myCourses.viewModels.MyCoursesViewModel Viewmodel) {
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
                return onChangeViewmodel((te.app.aljoud.pages.myCourses.viewModels.MyCoursesViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodel(te.app.aljoud.pages.myCourses.viewModels.MyCoursesViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.courseAdapter) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.searchProgressVisible) {
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
        te.app.aljoud.pages.university.adapters.CourseAdapter viewmodelCourseAdapter = null;
        int viewmodelSearchProgressVisible = 0;
        int viewmodelCourseAdapterItemCount = 0;
        int viewmodelCourseAdapterItemCountInt0ViewGONEViewVISIBLE = 0;
        int viewmodelSearchProgressVisibleViewVISIBLEViewVISIBLEViewGONE = 0;
        boolean viewmodelCourseAdapterItemCountInt0 = false;
        boolean viewmodelSearchProgressVisibleViewVISIBLE = false;
        te.app.aljoud.pages.myCourses.viewModels.MyCoursesViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xbL) != 0) {

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
                if((dirtyFlags & 0xbL) != 0) {
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
            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.searchProgressVisible
                        viewmodelSearchProgressVisible = viewmodel.getSearchProgressVisible();
                    }


                    // read viewmodel.searchProgressVisible == View.VISIBLE
                    viewmodelSearchProgressVisibleViewVISIBLE = (viewmodelSearchProgressVisible) == (android.view.View.VISIBLE);
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewmodelSearchProgressVisibleViewVISIBLE) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewmodel.searchProgressVisible == View.VISIBLE ? View.VISIBLE : View.GONE
                    viewmodelSearchProgressVisibleViewVISIBLEViewVISIBLEViewGONE = ((viewmodelSearchProgressVisibleViewVISIBLE) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewmodelCourseAdapterItemCountInt0ViewGONEViewVISIBLE);
            te.app.aljoud.base.ApplicationBinding.getItemsV2Binding(this.rcCategories, viewmodelCourseAdapter, "1", "1");
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.prCourse.setVisibility(viewmodelSearchProgressVisibleViewVISIBLEViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): viewmodel.courseAdapter
        flag 2 (0x3L): viewmodel.searchProgressVisible
        flag 3 (0x4L): null
        flag 4 (0x5L): viewmodel.courseAdapter.itemCount > 0 ? View.GONE : View.VISIBLE
        flag 5 (0x6L): viewmodel.courseAdapter.itemCount > 0 ? View.GONE : View.VISIBLE
        flag 6 (0x7L): viewmodel.searchProgressVisible == View.VISIBLE ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewmodel.searchProgressVisible == View.VISIBLE ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}