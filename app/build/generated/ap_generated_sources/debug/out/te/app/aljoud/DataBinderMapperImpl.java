package te.app.aljoud;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import te.app.aljoud.databinding.ActivityBaseBindingImpl;
import te.app.aljoud.databinding.ActivityMainBindingImpl;
import te.app.aljoud.databinding.ActivityMapAddressBindingImpl;
import te.app.aljoud.databinding.ExitLayoutBindingImpl;
import te.app.aljoud.databinding.FragmentAboutBindingImpl;
import te.app.aljoud.databinding.FragmentChangePasswordBindingImpl;
import te.app.aljoud.databinding.FragmentConfirmCodeBindingImpl;
import te.app.aljoud.databinding.FragmentContactsBindingImpl;
import te.app.aljoud.databinding.FragmentForgetPasswordBindingImpl;
import te.app.aljoud.databinding.FragmentHomeBindingImpl;
import te.app.aljoud.databinding.FragmentLoginBindingImpl;
import te.app.aljoud.databinding.FragmentRegisterBindingImpl;
import te.app.aljoud.databinding.FragmentSplashBindingImpl;
import te.app.aljoud.databinding.ItemHomeBindingImpl;
import te.app.aljoud.databinding.LayoutActionBarBackBindingImpl;
import te.app.aljoud.databinding.LayoutActionBarHomeBindingImpl;
import te.app.aljoud.databinding.LayoutNavigationDrawerBindingImpl;
import te.app.aljoud.databinding.LayoutTesBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBASE = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYMAPADDRESS = 3;

  private static final int LAYOUT_EXITLAYOUT = 4;

  private static final int LAYOUT_FRAGMENTABOUT = 5;

  private static final int LAYOUT_FRAGMENTCHANGEPASSWORD = 6;

  private static final int LAYOUT_FRAGMENTCONFIRMCODE = 7;

  private static final int LAYOUT_FRAGMENTCONTACTS = 8;

  private static final int LAYOUT_FRAGMENTFORGETPASSWORD = 9;

  private static final int LAYOUT_FRAGMENTHOME = 10;

  private static final int LAYOUT_FRAGMENTLOGIN = 11;

  private static final int LAYOUT_FRAGMENTREGISTER = 12;

  private static final int LAYOUT_FRAGMENTSPLASH = 13;

  private static final int LAYOUT_ITEMHOME = 14;

  private static final int LAYOUT_LAYOUTACTIONBARBACK = 15;

  private static final int LAYOUT_LAYOUTACTIONBARHOME = 16;

  private static final int LAYOUT_LAYOUTNAVIGATIONDRAWER = 17;

  private static final int LAYOUT_LAYOUTTES = 18;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(18);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.activity_map_address, LAYOUT_ACTIVITYMAPADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.exit_layout, LAYOUT_EXITLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_about, LAYOUT_FRAGMENTABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_change_password, LAYOUT_FRAGMENTCHANGEPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_confirm_code, LAYOUT_FRAGMENTCONFIRMCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_contacts, LAYOUT_FRAGMENTCONTACTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_forget_password, LAYOUT_FRAGMENTFORGETPASSWORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.item_home, LAYOUT_ITEMHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.layout_action_bar_back, LAYOUT_LAYOUTACTIONBARBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.layout_action_bar_home, LAYOUT_LAYOUTACTIONBARHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.layout_navigation_drawer, LAYOUT_LAYOUTNAVIGATIONDRAWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(te.app.aljoud.R.layout.layout_tes, LAYOUT_LAYOUTTES);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYBASE: {
          if ("layout/activity_base_0".equals(tag)) {
            return new ActivityBaseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_base is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAPADDRESS: {
          if ("layout/activity_map_address_0".equals(tag)) {
            return new ActivityMapAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_map_address is invalid. Received: " + tag);
        }
        case  LAYOUT_EXITLAYOUT: {
          if ("layout/exit_layout_0".equals(tag)) {
            return new ExitLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for exit_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTABOUT: {
          if ("layout/fragment_about_0".equals(tag)) {
            return new FragmentAboutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_about is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHANGEPASSWORD: {
          if ("layout/fragment_change_password_0".equals(tag)) {
            return new FragmentChangePasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_change_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONFIRMCODE: {
          if ("layout/fragment_confirm_code_0".equals(tag)) {
            return new FragmentConfirmCodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_confirm_code is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONTACTS: {
          if ("layout/fragment_contacts_0".equals(tag)) {
            return new FragmentContactsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_contacts is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFORGETPASSWORD: {
          if ("layout/fragment_forget_password_0".equals(tag)) {
            return new FragmentForgetPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_forget_password is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTER: {
          if ("layout/fragment_register_0".equals(tag)) {
            return new FragmentRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHOME: {
          if ("layout/item_home_0".equals(tag)) {
            return new ItemHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_home is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTACTIONBARBACK: {
          if ("layout/layout_action_bar_back_0".equals(tag)) {
            return new LayoutActionBarBackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_action_bar_back is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTACTIONBARHOME: {
          if ("layout/layout_action_bar_home_0".equals(tag)) {
            return new LayoutActionBarHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_action_bar_home is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTNAVIGATIONDRAWER: {
          if ("layout/layout_navigation_drawer_0".equals(tag)) {
            return new LayoutNavigationDrawerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_navigation_drawer is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTTES: {
          if ("layout/layout_tes_0".equals(tag)) {
            return new LayoutTesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_tes is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(13);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aboutMain");
      sKeys.put(2, "baseViewModel");
      sKeys.put(3, "categoriesAdapter");
      sKeys.put(4, "categoriesItem");
      sKeys.put(5, "itemViewModel");
      sKeys.put(6, "mapAddressViewModel");
      sKeys.put(7, "menuViewModel");
      sKeys.put(8, "message");
      sKeys.put(9, "passingObject");
      sKeys.put(10, "request");
      sKeys.put(11, "viewModel");
      sKeys.put(12, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(18);

    static {
      sKeys.put("layout/activity_base_0", te.app.aljoud.R.layout.activity_base);
      sKeys.put("layout/activity_main_0", te.app.aljoud.R.layout.activity_main);
      sKeys.put("layout/activity_map_address_0", te.app.aljoud.R.layout.activity_map_address);
      sKeys.put("layout/exit_layout_0", te.app.aljoud.R.layout.exit_layout);
      sKeys.put("layout/fragment_about_0", te.app.aljoud.R.layout.fragment_about);
      sKeys.put("layout/fragment_change_password_0", te.app.aljoud.R.layout.fragment_change_password);
      sKeys.put("layout/fragment_confirm_code_0", te.app.aljoud.R.layout.fragment_confirm_code);
      sKeys.put("layout/fragment_contacts_0", te.app.aljoud.R.layout.fragment_contacts);
      sKeys.put("layout/fragment_forget_password_0", te.app.aljoud.R.layout.fragment_forget_password);
      sKeys.put("layout/fragment_home_0", te.app.aljoud.R.layout.fragment_home);
      sKeys.put("layout/fragment_login_0", te.app.aljoud.R.layout.fragment_login);
      sKeys.put("layout/fragment_register_0", te.app.aljoud.R.layout.fragment_register);
      sKeys.put("layout/fragment_splash_0", te.app.aljoud.R.layout.fragment_splash);
      sKeys.put("layout/item_home_0", te.app.aljoud.R.layout.item_home);
      sKeys.put("layout/layout_action_bar_back_0", te.app.aljoud.R.layout.layout_action_bar_back);
      sKeys.put("layout/layout_action_bar_home_0", te.app.aljoud.R.layout.layout_action_bar_home);
      sKeys.put("layout/layout_navigation_drawer_0", te.app.aljoud.R.layout.layout_navigation_drawer);
      sKeys.put("layout/layout_tes_0", te.app.aljoud.R.layout.layout_tes);
    }
  }
}
