package te.app.aljoud.customViews.actionbar;

/**
 * Created by mohamedatef on 12/30/18.
 */


import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;

import te.app.aljoud.R;
import te.app.aljoud.databinding.LayoutActionBarBackBinding;


public class MenuActionBarView extends RelativeLayout {
    LayoutActionBarBackBinding layoutActionBarBackBinding;
    DrawerLayout drawerLayout;

    public MenuActionBarView(Context context) {
        super(context);
        init();
    }



    private void init() {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        layoutActionBarBackBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_action_bar_back, this, true);
    }


    public void connectDrawer(DrawerLayout drawerLayout){
        this.drawerLayout = drawerLayout;

        if (drawerLayout.isDrawerOpen(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else
            drawerLayout.openDrawer(GravityCompat.START);
    }


}
