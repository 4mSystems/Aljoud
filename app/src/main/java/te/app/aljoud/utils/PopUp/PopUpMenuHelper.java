package te.app.aljoud.utils.PopUp;

import android.content.Context;
import android.view.View;

import androidx.appcompat.widget.PopupMenu;

import java.util.List;

public class PopUpMenuHelper {


    public static PopupMenu showSearchTypePopUp(Context context, View view, List<PopUp> types) {
        PopupMenu typesPopUps;
        typesPopUps = new PopupMenu(context, view);
        for (int i = 0; i < types.size(); i++) {
            typesPopUps.getMenu().add(i, i, i, types.get(i).getName());
        }
        typesPopUps.show();
        return typesPopUps;
    }


}
