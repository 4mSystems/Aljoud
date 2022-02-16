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
        sViewsWithIds.put(R.id.dl_main_navigation_menu, 21);
        sViewsWithIds.put(R.id.rl_navigation_drawer, 22);
        sViewsWithIds.put(R.id.ll_base_action_bar_container, 23);
        sViewsWithIds.put(R.id.fl_home_container, 24);
        sViewsWithIds.put(R.id.rl_navigation_drawer_header, 25);
        sViewsWithIds.put(R.id.vv_navigation_drawer_image, 26);
        sViewsWithIds.put(R.id.view_support, 27);
        sViewsWithIds.put(R.id.view_share, 28);
        sViewsWithIds.put(R.id.grand_logo, 29);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView1;
    @NonNull
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView18;
    @NonNull
    private final android.view.View mboundView19;
    @NonNull
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView2;
    @NonNull
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView20;
    @NonNull
    private final te.app.aljoud.customViews.views.CustomTextViewMedium mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback67;
    @Nullable
    private final android.view.View.OnClickListener mCallback74;
    @Nullable
    private final android.view.View.OnClickListener mCallback70;
    @Nullable
    private final android.view.View.OnClickListener mCallback68;
    @Nullable
    private final android.view.View.OnClickListener mCallback63;
    @Nullable
    private final android.view.View.OnClickListener mCallback71;
    @Nullable
    private final android.view.View.OnClickListener mCallback69;
    @Nullable
    private final android.view.View.OnClickListener mCallback65;
    @Nullable
    private final android.view.View.OnClickListener mCallback64;
    @Nullable
    private final android.view.View.OnClickListener mCallback72;
    @Nullable
    private final android.view.View.OnClickListener mCallback66;
    @Nullable
    private final android.view.View.OnClickListener mCallback73;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutNavigationDrawerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private LayoutNavigationDrawerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[21]
            , (android.widget.FrameLayout) bindings[24]
            , (te.app.aljoud.customViews.tesDialog.TesImageDialog) bindings[29]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.RelativeLayout) bindings[22]
            , (android.widget.RelativeLayout) bindings[25]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[6]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[12]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[8]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[17]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[16]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[15]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[14]
            , (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[10]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[9]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[3]
            , (android.view.View) bindings[28]
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[26]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView18 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView19 = (android.view.View) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView2 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView4 = (te.app.aljoud.customViews.views.CustomTextViewMedium) bindings[4];
        this.mboundView4.setTag(null);
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
        this.viewInbox.setTag(null);
        this.viewProfile.setTag(null);
        this.viewTerms.setTag(null);
        setRootTag(root);
        // listeners
        mCallback67 = new te.app.aljoud.generated.callback.OnClickListener(this, 5);
        mCallback74 = new te.app.aljoud.generated.callback.OnClickListener(this, 12);
        mCallback70 = new te.app.aljoud.generated.callback.OnClickListener(this, 8);
        mCallback68 = new te.app.aljoud.generated.callback.OnClickListener(this, 6);
        mCallback63 = new te.app.aljoud.generated.callback.OnClickListener(this, 1);
        mCallback71 = new te.app.aljoud.generated.callback.OnClickListener(this, 9);
        mCallback69 = new te.app.aljoud.generated.callback.OnClickListener(this, 7);
        mCallback65 = new te.app.aljoud.generated.callback.OnClickListener(this, 3);
        mCallback64 = new te.app.aljoud.generated.callback.OnClickListener(this, 2);
        mCallback72 = new te.app.aljoud.generated.callback.OnClickListener(this, 10);
        mCallback66 = new te.app.aljoud.generated.callback.OnClickListener(this, 4);
        mCallback73 = new te.app.aljoud.generated.callback.OnClickListener(this, 11);
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
        boolean userHelperGetInstanceContextUserDataJavaLangObjectNull = false;
        te.app.aljoud.pages.auth.models.UserData userHelperGetInstanceContextUserData = null;
        int userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE = 0;
        java.lang.String userHelperGetInstanceContextUserDataName = null;
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
                if (userHelperGetInstanceContextUserData != null) {
                    // read UserHelper.getInstance(context).userData.name
                    userHelperGetInstanceContextUserDataName = userHelperGetInstanceContextUserData.getName();
                }


                // read UserHelper.getInstance(context).userData != null ? View.VISIBLE : View.GONE
                UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1 = ((userHelperGetInstanceContextUserDataJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read UserHelper.getInstance(context).userData == null ? View.VISIBLE : View.GONE
                userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE = ((UserHelperGetInstanceContextUserDataJavaLangObjectNull1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, userHelperGetInstanceContextUserDataName);
            this.mboundView18.setOnClickListener(mCallback73);
            this.mboundView18.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.mboundView19.setVisibility(userHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.mboundView2.setOnClickListener(mCallback63);
            this.mboundView2.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.mboundView20.setOnClickListener(mCallback74);
            this.mboundView20.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.mboundView4.setOnClickListener(mCallback64);
            this.mboundView4.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.tvAgents.setOnClickListener(mCallback65);
            this.tvAgents.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.tvContact.setOnClickListener(mCallback68);
            this.tvContact.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.tvCustomerService.setOnClickListener(mCallback66);
            this.tvCustomerService.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.tvLanguage.setOnClickListener(mCallback72);
            this.tvRate.setOnClickListener(mCallback71);
            this.tvShare.setOnClickListener(mCallback70);
            this.tvSupport.setOnClickListener(mCallback69);
            this.tvTerms.setOnClickListener(mCallback67);
            this.tvTerms.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.viewAgent.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.viewContact.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.viewCustomerService.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
            this.viewInbox.setVisibility(UserHelperGetInstanceContextUserDataJavaLangObjectNullViewVISIBLEViewGONE1);
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




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.SERVICES);
                }
                break;
            }
            case 12: {
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




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.SHARE_BAR);
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




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.CONTACT);
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




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.UPDATE_PROFILE);
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




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.RATE_APP);
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




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.ABOUT);
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




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.MY_COURSES);
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




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.LANGUAGE);
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




                    menuViewModel.buttonAction(te.app.aljoud.utils.Constants.LOGIN);
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