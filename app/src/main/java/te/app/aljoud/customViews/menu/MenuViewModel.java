package te.app.aljoud.customViews.menu;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.utils.Constants;

public class MenuViewModel extends BaseViewModel {

    public void buttonAction(String action) {
        if (!action.equals(Constants.ERROR_TOAST)) {
            getLiveData().setValue(action);
        } else
            getLiveData().setValue(Constants.ERROR_TOAST);
    }
}
