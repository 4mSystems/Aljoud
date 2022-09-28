package te.app.aljoud.customViews.actionbar;


import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.databinding.DataBindingUtil;

import te.app.aljoud.R;
import te.app.aljoud.databinding.LayoutActionBarBackBinding;
import te.app.aljoud.pages.cart.CartFragment;
import te.app.aljoud.pages.conversations.ConversationsFragment;
import te.app.aljoud.pages.settings.AboutAppFragment;
import te.app.aljoud.utils.helper.MovementHelper;
import te.app.aljoud.utils.session.LanguagesHelper;
import te.app.aljoud.utils.session.UserHelper;


public class BackActionBarView extends RelativeLayout {
    public LayoutActionBarBackBinding layoutActionBarBackBinding;
    Context context;

    public BackActionBarView(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public BackActionBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();

    }

    public BackActionBarView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        this.context = context;
        init();
    }

    private void init() {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        layoutActionBarBackBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_action_bar_back, this, true);
        if (LanguagesHelper.getCurrentLanguage().equals("ar")) {
            layoutActionBarBackBinding.imgActionBarCancel.setRotation(180);
        }
        setCartCount();
        setEvents();
    }

    private void setEvents() {
        layoutActionBarBackBinding.imgActionBarCancel.setOnClickListener(view -> ((Activity) getContext()).finish());
        layoutActionBarBackBinding.imgActionBarFilter.setOnClickListener(view -> MovementHelper.startActivity(context, ConversationsFragment.class.getName(), getResources().getString(R.string.inbox), null));

    }

    public void setTitle(String title) {
        layoutActionBarBackBinding.tvActionBarTitle.setText(title);
    }

    public void setCartCount() {
        layoutActionBarBackBinding.setCartCount(UserHelper.getInstance(context).getCartCount());
        layoutActionBarBackBinding.imgActionBarCart.setOnClickListener(view -> MovementHelper.startActivity(context, CartFragment.class.getName(), null, null));
    }
    public void cartEnabled(boolean enabled) {
        layoutActionBarBackBinding.imgActionBarCart.setEnabled(enabled);
        layoutActionBarBackBinding.cartCount.setEnabled(enabled);
    }
}
