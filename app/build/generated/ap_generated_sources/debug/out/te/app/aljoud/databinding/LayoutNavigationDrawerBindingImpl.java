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
        sViewsWithIds.put(R.id.dl_main_navigation_menu, 17);
        sViewsWithIds.put(R.id.rl_navigation_drawer, 18);
        sViewsWithIds.put(R.id.ll_base_action_bar_container, 19);
        sViewsWithIds.put(R.id.fl_home_container, 20);
        sViewsWithIds.put(R.id.rl_navigation_drawer_header, 21);
        sViewsWithIds.put(R.id.vv_navigation_drawer_image, 22);
        sViewsWithIds.put(R.id.view_support, 23);
        sViewsWithIds.put(R.id.view_share, 24);
        sViewsWithIds.put(R.id.grand_logo, 25);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView1;
    @NonNull
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView15;
    @NonNull
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView16;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback59;
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    @Nullable
    private final android.view.View.OnClickListener mCallback65;
    @Nullable
    private final android.view.View.OnClickListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback64;
    @Nullable
    private final android.view.View.OnClickListener mCallback62;
    @Nullable
    private final android.view.View.OnClickListener mCallback60;
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    @Nullable
    private final android.view.View.OnClickListener mCallback63;
    @Nullable
    private final android.view.View.OnClickListener mCallback61;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutNavigationDrawerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private LayoutNavigationDrawerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[17]
            , (android.widget.FrameLayout) bindings[20]
            , (te.app.aljoud.customViews.tesDialog.TesImageDialog) bindings[25]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.RelativeLayout) bindings[18]
            , (android.widget.RelativeLayout) bindings[21]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[3]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[9]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[5]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[14]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[13]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[12]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[11]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[7]
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[10]
            , (android.view.View) bindings[6]
            , (android.view.View) bindings[2]
            , (android.view.View) bindings[24]
            , (android.view.View) bindings[23]
            , (android.view.View) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[22]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView15 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[16];
        this.mboundView16.setTag(null);
        this.tvAgents.setTag(null);
        this.tvContact.setTag(null);
        this.tvCustomerService.setTag(null);
        this.tvLanguage.setTag(null);
        this.tvRate.setTag(null);
        this.tvShare.setTag(null);
        this.tvSupport.setTag(null);
        this.tvTerms.setTag(null);
        this.viewAgent.setTag(null);
        this.viewContact.setTag(null);
        this.viewCustomerService.setTag(null);
        this.viewProfile.setTag(null);
        this.viewTerms.setTag(null);
        setRootTag(root);
        // listeners
        mCallback59 = new te.app.aljoud.generated.callback.OnClickListener(this, 5);
        mCallback57 = new te.app.aljoud.generated.callback.OnClickListener(this, 3);
        mCallback65 = new te.app.aljoud.generated.callback.OnClickListener(this, 11);
        mCallback55 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
        mCallback64 = new te.app.aljoud.generated.callback.OnClickListener(this, 10);
        mCallback62 = new te.app.aljoud.generated.callback.OnClickListener(this, 8);
        mCallback60 = new te.app.aljoud.generated.callback.OnClickListener(this, 6);
        mCallback58 = new te.app.aljoud.generated.callback.OnClickListener(this, 4);
        mCallback56 = new te.app.aljoud.generated.callback.OnClickListener(this, 2);
        mCallback63 = new te.app.aljoud.generated.callback.OnClickListener(this, 9);
        mCallback61 = new te.app.aljoud.generated.callback.OnClickListener(this, 7);
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
        int userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE = 0;
        boolean userHelperGetInstanceContextUserDataJavaLangObjectNull = false;
        int UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1 = 0;
        boolean UserHelperGetInstanceContextUserDataJavaLangObjectNull1 = false;

        if ((dirtyFlags & 0x2L) != 0) {

                // read UserHelper.getInstance(context).userData
                userHelperGetInstanceContextUserData = te.app.aljoud.utils.session.UserHelper.getInstance(getRoot().getContext()).getUserData();


                // read UserHelper.getInstance(context).userData != null
                userHelperGetInstanceContextUserDataJavaLangObjectNull = (userHelperGetInstanceContextUserData) != (null);
                // read UserHelper.getInstance(context).userData == null
                UserHelperGetInstanceContextUserDataJavaLangObjectNull1 = (userHelperGetInstanceContextUserData) == (null);
            if((dirtyFlags & 0x2L) != 0) {
                if(userHelperGetInstanceContextUserDataJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0x2L) != 0) {
                if(UserHelperGetInstanceContextUserDataJavaLangObjectNull1) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read UserHelper.getInstance(context).userData != null ? View.VISIBLE : View.GONE
                UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1 = ((userHelperGetInstanceContextUserDataJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read UserHelper.getInstance(context).userData == null ? View.VISIBLE : View.GONE
                userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE = ((UserHelperGetInstanceContextUserDataJavaLangObjectNull1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback55);
            this.mboundView1.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.mboundView15.setOnClickListener(mCallback64);
            this.mboundView15.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.mboundView16.setOnClickListener(mCallback65);
            this.mboundView16.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.tvAgents.setOnClickListener(mCallback56);
            this.tvAgents.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.tvContact.setOnClickListener(mCallback59);
            this.tvContact.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.tvCustomerService.setOnClickListener(mCallback57);
            this.tvCustomerService.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.tvLanguage.setOnClickListener(mCallback63);
            this.tvRate.setOnClickListener(mCallback62);
            this.tvShare.setOnClickListener(mCallback61);
            this.tvSupport.setOnClickListener(mCallback60);
            this.tvTerms.setOnClickListener(mCallback58);
            this.tvTerms.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.viewAgent.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.viewContact.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.viewCustomerService.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.viewProfile.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.viewTerms.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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
            case 3: {
                // localize variables for thread safety
                // menuViewModel
                te.app.aljoud.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.OFFERS);
                }
                break;
            }
            case 11: {
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
            case 1: {
                // localize variables for thread safety
                // menuViewModel
                te.app.aljoud.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.INBOX);
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




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.LOGIN);
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
            case 4: {
                // localize variables for thread safety
                // menuViewModel
                te.app.aljoud.customViews.menu.MenuViewModel menuViewModel = mMenuViewModel;
                // menuViewModel != null
                boolean menuViewModelJavaLangObjectNull = false;



                menuViewModelJavaLangObjectNull = (menuViewModel) != (null);
                if (menuViewModelJavaLangObjectNull) {




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.SERVICES);
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




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.MY_COURSES);
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): menuViewModel
        flag 1 (0x2L): null
        flag 2 (0x3L): UserHelper.getInstance(context).userData == null ? View.VISIBLE : View.GONE
        flag 3 (0x4L): UserHelper.getInstance(context).userData == null ? View.VISIBLE : View.GONE
        flag 4 (0x5L): UserHelper.getInstance(context).userData != null ? View.VISIBLE : View.GONE
        flag 5 (0x6L): UserHelper.getInstance(context).userData != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}