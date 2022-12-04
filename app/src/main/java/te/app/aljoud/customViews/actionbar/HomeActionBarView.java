package te.app.aljoud.customViews.actionbar;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;

import te.app.aljoud.R;
import te.app.aljoud.activity.BaseActivity;
import te.app.aljoud.activity.MainActivity;
import te.app.aljoud.customViews.menu.NavigationDrawerView;
import te.app.aljoud.databinding.LayoutActionBarHomeBinding;
import te.app.aljoud.pages.cart.CartFragment;
import te.app.aljoud.pages.conversations.ConversationsFragment;
import te.app.aljoud.utils.helper.MovementHelper;
import te.app.aljoud.utils.session.UserHelper;

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
        setCartCount();
        setEvents();
    }

    private void setEvents() {
        ((MainActivity) context).cartCount.observeForever(integer -> setCartCount());
        layoutActionBarHomeBinding.imgHomeBarMenu.setOnClickListener(view -> connectDrawer(HomeActionBarView.this.drawerLayout, false));
        layoutActionBarHomeBinding.imgActionBarFilter.setOnClickListener(view -> MovementHelper.startActivity(context, ConversationsFragment.class.getName(), getResources().getString(R.string.inbox), null));
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

    public void setCartCount() {
        layoutActionBarHomeBinding.setCartCount(UserHelper.getInstance(context).getCartCount());
        layoutActionBarHomeBinding.imgActionBarCart.setOnClickListener(view -> MovementHelper.startActivity(context, CartFragment.class.getName(), null, null));
    }

    public void cartVisible(int visible) {
        layoutActionBarHomeBinding.imgActionBarCart.setVisibility(visible);
        layoutActionBarHomeBinding.cartCount.setVisibility(visible);
    }
}
