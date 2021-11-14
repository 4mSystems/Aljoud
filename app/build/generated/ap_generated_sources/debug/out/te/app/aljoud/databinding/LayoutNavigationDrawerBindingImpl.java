package te.app.aljoud.databinding;
import te.app.aljoud.R;
import te.app.aljoud.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutNavigationDrawerBindingImpl extends LayoutNavigationDrawerBinding implements te.app.aljoud.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.dl_main_navigation_menu, 11);
        sViewsWithIds.put(R.id.rl_navigation_drawer, 12);
        sViewsWithIds.put(R.id.ll_base_action_bar_container, 13);
        sViewsWithIds.put(R.id.fl_home_container, 14);
        sViewsWithIds.put(R.id.rl_navigation_drawer_header, 15);
        sViewsWithIds.put(R.id.vv_navigation_drawer_image, 16);
        sViewsWithIds.put(R.id.view_profile, 17);
        sViewsWithIds.put(R.id.view_agent, 18);
        sViewsWithIds.put(R.id.view_customer_service, 19);
        sViewsWithIds.put(R.id.view_terms, 20);
        sViewsWithIds.put(R.id.view_contact, 21);
        sViewsWithIds.put(R.id.view_support, 22);
        sViewsWithIds.put(R.id.view_share, 23);
        sViewsWithIds.put(R.id.grand_logo, 24);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView1;
    @NonNull
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView10;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutNavigationDrawerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private LayoutNavigationDrawerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[11]
            , (android.widget.FrameLayout) bindings[14]
            , (te.app.aljoud.customViews.tesDialog.TesImageDialog) bindings[24]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.RelativeLayout) bindings[12]
            , (android.widget.RelativeLayout) bindings[15]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[5]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[9]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[8]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[7]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[4]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[21]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[23]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[20]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[16]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[10];
        this.mboundView10.setTag(null);
        this.tvAgents.setTag(null);
        this.tvContact.setTag(null);
        this.tvCustomerService.setTag(null);
        this.tvLanguage.setTag(null);
        this.tvRate.setTag(null);
        this.tvShare.setTag(null);
        this.tvSupport.setTag(null);
        this.tvTerms.setTag(null);
        setRootTag(root);
        // listeners
        mCallback37 = new te.app.aljoud.generated.callback.OnClickListener(this, 10);
        mCallback35 = new te.app.aljoud.generated.callback.OnClickListener(this, 8);
        mCallback33 = new te.app.aljoud.generated.callback.OnClickListener(this, 6);
        mCallback29 = new te.app.aljoud.generated.callback.OnClickListener(this, 2);
        mCallback30 = new te.app.aljoud.generated.callback.OnClickListener(this, 3);
        mCallback28 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
        mCallback36 = new te.app.aljoud.generated.callback.OnClickListener(this, 9);
        mCallback34 = new te.app.aljoud.generated.callback.OnClickListener(this, 7);
        mCallback32 = new te.app.aljoud.generated.callback.OnClickListener(this, 5);
        mCallback31 = new te.app.aljoud.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.menuViewModel == variableId) {
            setMenuViewModel((te.app.aljoud.customViews.menu.MenuViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMenuViewModel(@Nullable te.app.aljoud.customViews.menu.MenuViewModel MenuViewModel) {
        updateRegistration(0, MenuViewModel);
        this.mMenuViewModel = MenuViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.menuViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMenuViewModel((te.app.aljoud.customViews.menu.MenuViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMenuViewModel(te.app.aljoud.customViews.menu.MenuViewModel MenuViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        te.app.aljoud.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback28);
            this.mboundView10.setOnClickListener(mCallback37);
            this.tvAgents.setOnClickListener(mCallback29);
            this.tvContact.setOnClickListener(mCallback32);
            this.tvCustomerService.setOnClickListener(mCallback30);
            this.tvLanguage.setOnClickListener(mCallback36);
            this.tvRate.setOnClickListener(mCallback35);
            this.tvShare.setOnClickListener(mCallback34);
            this.tvSupport.setOnClickListener(mCallback33);
            this.tvTerms.setOnClickListener(mCallback31);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 10: {
                // localize variables for thread safety
                // menuViewModel
                te.app.aljoud.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.DIALOG);
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // menuViewModel
                te.app.aljoud.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.RATE_APP);
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // menuViewModel
                te.app.aljoud.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.ABOUT);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // menuViewModel
                te.app.aljoud.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.AGENTS);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // menuViewModel
                te.app.aljoud.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.CUSTOMER_SERVICES);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // menuViewModel
                te.app.aljoud.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.CLIENTS);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // menuViewModel
                te.app.aljoud.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.LANGUAGE);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // menuViewModel
                te.app.aljoud.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.SHARE_BAR);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // menuViewModel
                te.app.aljoud.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.CONTACT);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // menuViewModel
                te.app.aljoud.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.TERMS);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): menuViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}