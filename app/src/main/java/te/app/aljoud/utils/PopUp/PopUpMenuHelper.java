package te.app.aljoud.utils.PopUp;

import android.content.Context;
import android.view.View;

import androidx.appcompat.widget.PopupMenu;

import java.util.List;

import te.app.aljoud.pages.settings.models.services.ServiceItem;

public class PopUpMenuHelper {


    public static PopupMenu showServicesPopUp(Context context, View view, List<ServiceItem> types) {
        PopupMenu typesPopUps;
        typesPopUps = new PopupMenu(context, view);
        for (int i = 0; i < types.size(); i++) {
            typesPopUps.getMenu().add(i, i, i, types.get(i).getName());
        }
        typesPopUps.show();
        return typesPopUps;
    }


}
