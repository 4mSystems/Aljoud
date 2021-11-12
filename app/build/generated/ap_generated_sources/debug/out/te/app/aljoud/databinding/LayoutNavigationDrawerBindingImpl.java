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
        sViewsWithIds.put(R.id.dl_main_navigation_menu, 13);
        sViewsWithIds.put(R.id.rl_navigation_drawer, 14);
        sViewsWithIds.put(R.id.ll_base_action_bar_container, 15);
        sViewsWithIds.put(R.id.fl_home_container, 16);
        sViewsWithIds.put(R.id.rl_navigation_drawer_header, 17);
        sViewsWithIds.put(R.id.view_profile, 18);
        sViewsWithIds.put(R.id.view_agent, 19);
        sViewsWithIds.put(R.id.view_customer_service, 20);
        sViewsWithIds.put(R.id.view_contact, 21);
        sViewsWithIds.put(R.id.view_support, 22);
        sViewsWithIds.put(R.id.view_terms, 23);
        sViewsWithIds.put(R.id.view_share, 24);
        sViewsWithIds.put(R.id.grand_logo, 25);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView12;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutNavigationDrawerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private LayoutNavigationDrawerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[13]
            , (android.widget.FrameLayout) bindings[16]
            , (te.app.aljoud.customViews.tesDialog.TesImageDialog) bindings[25]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.RelativeLayout) bindings[14]
            , (android.widget.RelativeLayout) bindings[17]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[4]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[5]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[11]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[10]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[9]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[7]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[8]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[21]
            , (android.view.View) bindings[20]
            , (android.view.View) bindings[18]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[23]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView12 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[12];
        this.mboundView12.setTag(null);
        this.tvAgents.setTag(null);
        this.tvContact.setTag(null);
        this.tvCustomerService.setTag(null);
        this.tvLanguage.setTag(null);
        this.tvMembers.setTag(null);
        this.tvRate.setTag(null);
        this.tvShare.setTag(null);
        this.tvSupport.setTag(null);
        this.tvTerms.setTag(null);
        this.tvUserLogin.setTag(null);
        this.vvNavigationDrawerImage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new te.app.aljoud.generated.callback.OnClickListener(this, 9);
        mCallback13 = new te.app.aljoud.generated.callback.OnClickListener(this, 7);
        mCallback11 = new te.app.aljoud.generated.callback.OnClickListener(this, 5);
        mCallback8 = new te.app.aljoud.generated.callback.OnClickListener(this, 2);
        mCallback16 = new te.app.aljoud.generated.callback.OnClickListener(this, 10);
        mCallback14 = new te.app.aljoud.generated.callback.OnClickListener(this, 8);
        mCallback12 = new te.app.aljoud.generated.callback.OnClickListener(this, 6);
        mCallback10 = new te.app.aljoud.generated.callback.OnClickListener(this, 4);
        mCallback9 = new te.app.aljoud.generated.callback.OnClickListener(this, 3);
        mCallback7 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
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
        te.app.aljoud.pages.auth.models.UserData userHelperGetInstanceContextUserData = null;
        java.lang.String userHelperGetInstanceContextUserDataImage = null;
        java.lang.String userHelperGetInstanceContextUserDataName = null;

        if ((dirtyFlags & 0x2L) != 0) {

                // read UserHelper.getInstance(context).userData
                userHelperGetInstanceContextUserData = te.app.aljoud.utils.session.UserHelper.getInstance(getRoot().getContext()).getUserData();


                if (userHelperGetInstanceContextUserData != null) {
                    // read UserHelper.getInstance(context).userData.image
                    userHelperGetInstanceContextUserDataImage = userHelperGetInstanceContextUserData.getImage();
                    // read UserHelper.getInstance(context).userData.name
                    userHelperGetInstanceContextUserDataName = userHelperGetInstanceContextUserData.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView12.setOnClickListener(mCallback16);
            this.tvAgents.setOnClickListener(mCallback8);
            this.tvContact.setOnClickListener(mCallback10);
            this.tvCustomerService.setOnClickListener(mCallback9);
            this.tvLanguage.setOnClickListener(mCallback15);
            this.tvMembers.setOnClickListener(mCallback7);
            this.tvRate.setOnClickListener(mCallback14);
            this.tvShare.setOnClickListener(mCallback13);
            this.tvSupport.setOnClickListener(mCallback11);
            this.tvTerms.setOnClickListener(mCallback12);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserLogin, userHelperGetInstanceContextUserDataName);
            te.app.aljoud.base.ApplicationBinding.loadImage(this.vvNavigationDrawerImage, userHelperGetInstanceContextUserDataImage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.TERMS);
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




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.CONTACT);
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