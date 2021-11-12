package te.app.aljoud.model.base;

import android.view.View;

public class Mutable {
    public String message;
    public int position;
    public Object object;
    public View v = null;

    public Mutable() {
        this.message = "";
    }

    public Mutable(String message) {
        this.message = message;
    }

    public Mutable(String message , Object object) {
        this.message = message;
        this.object = object;
    }

    public Mutable(String message, int position) {
        this.message = message;
        this.position = position;
    }


    public Mutable(String message, int position, View v) {
        this.message = message;
        this.position = position;
        this.v = v;
    }
}
