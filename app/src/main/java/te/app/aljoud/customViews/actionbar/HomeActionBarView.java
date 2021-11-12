package te.app.aljoud.customViews.actionbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;

import te.app.aljoud.R;
import te.app.aljoud.customViews.menu.NavigationDrawerView;
import te.app.aljoud.databinding.LayoutActionBarHomeBinding;

public class HomeActionBarView extends RelativeLayout {
    public LayoutActionBarHomeBinding layoutActionBarHomeBinding;
    DrawerLayout drawerLayout;
     Context context;
    NavigationDrawerView navigationDrawerView;

    public HomeActionBarView(Context context) {
        super(context);
        this.context = context;
        init();
    }


    private void init() {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        layoutActionBarHomeBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_action_bar_home, this, true);
        setEvents();
    }

    private void setEvents() {
        layoutActionBarHomeBinding.imgHomeBarMenu.setOnClickListener(view -> connectDrawer(HomeActionBarView.this.drawerLayout, false));
    }


    public void connectDrawer(DrawerLayout drawerLayout, boolean firstConnect) {
        if (firstConnect) {
            this.drawerLayout = drawerLayout;
            return;
        } else {
            if (drawerLayout.isDrawerOpen(GravityCompat.END))
                drawerLayout.closeDrawer(GravityCompat.START);
            else
                drawerLayout.openDrawer(GravityCompat.START);
        }
    }

    public void setTitle(String string) {
//        layoutActionBarHomeBinding.tvHomeBarText.setText(string);
    }

    public void setNavigation(NavigationDrawerView navigationDrawerView) {
        this.navigationDrawerView = navigationDrawerView;
    }
//
//    public void notificationVisible(int visible) {
//        layoutActionBarHomeBinding.imgHomeBarMenuNotifications.setVisibility(visible);
//    }
}
