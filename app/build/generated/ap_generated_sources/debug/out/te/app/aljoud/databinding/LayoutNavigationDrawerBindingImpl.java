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
        sViewsWithIds.put(R.id.dl_main_navigation_menu, 16);
        sViewsWithIds.put(R.id.rl_navigation_drawer, 17);
        sViewsWithIds.put(R.id.ll_base_action_bar_container, 18);
        sViewsWithIds.put(R.id.fl_home_container, 19);
        sViewsWithIds.put(R.id.rl_navigation_drawer_header, 20);
        sViewsWithIds.put(R.id.vv_navigation_drawer_image, 21);
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
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView15;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    @Nullable
    private final android.view.View.OnClickListener mCallback54;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutNavigationDrawerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private LayoutNavigationDrawerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[16]
            , (android.widget.FrameLayout) bindings[19]
            , (te.app.aljoud.customViews.tesDialog.TesImageDialog) bindings[24]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.RelativeLayout) bindings[17]
            , (android.widget.RelativeLayout) bindings[20]
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
            , (android.view.View) bindings[23]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[8]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[21]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView15 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[15];
        this.mboundView15.setTag(null);
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
        mCallback49 = new te.app.aljoud.generated.callback.OnClickListener(this, 4);
        mCallback47 = new te.app.aljoud.generated.callback.OnClickListener(this, 2);
        mCallback55 = new te.app.aljoud.generated.callback.OnClickListener(this, 10);
        mCallback52 = new te.app.aljoud.generated.callback.OnClickListener(this, 7);
        mCallback50 = new te.app.aljoud.generated.callback.OnClickListener(this, 5);
        mCallback48 = new te.app.aljoud.generated.callback.OnClickListener(this, 3);
        mCallback46 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
        mCallback54 = new te.app.aljoud.generated.callback.OnClickListener(this, 9);
        mCallback53 = new te.app.aljoud.generated.callback.OnClickListener(this, 8);
        mCallback51 = new te.app.aljoud.generated.callback.OnClickListener(this, 6);
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
        boolean userHelperGetInstanceContextUserDataJavaLangObjectNull = false;
        int userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x2L) != 0) {

                // read UserHelper.getInstance(context).userData
                userHelperGetInstanceContextUserData = te.app.aljoud.utils.session.UserHelper.getInstance(getRoot().getContext()).getUserData();


                // read UserHelper.getInstance(context).userData != null
                userHelperGetInstanceContextUserDataJavaLangObjectNull = (userHelperGetInstanceContextUserData) != (null);
            if((dirtyFlags & 0x2L) != 0) {
                if(userHelperGetInstanceContextUserDataJavaLangObjectNull) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read UserHelper.getInstance(context).userData != null ? View.VISIBLE : View.GONE
                userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE = ((userHelperGetInstanceContextUserDataJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback46);
            this.mboundView1.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.mboundView15.setOnClickListener(mCallback55);
            this.mboundView15.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.tvAgents.setOnClickListener(mCallback47);
            this.tvAgents.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.tvContact.setOnClickListener(mCallback50);
            this.tvContact.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.tvCustomerService.setOnClickListener(mCallback48);
            this.tvCustomerService.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.tvLanguage.setOnClickListener(mCallback54);
            this.tvRate.setOnClickListener(mCallback53);
            this.tvShare.setOnClickListener(mCallback52);
            this.tvSupport.setOnClickListener(mCallback51);
            this.tvTerms.setOnClickListener(mCallback49);
            this.tvTerms.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.viewAgent.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.viewContact.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.viewCustomerService.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.viewProfile.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.viewTerms.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): menuViewModel
        flag 1 (0x2L): null
        flag 2 (0x3L): UserHelper.getInstance(context).userData != null ? View.VISIBLE : View.GONE
        flag 3 (0x4L): UserHelper.getInstance(context).userData != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}