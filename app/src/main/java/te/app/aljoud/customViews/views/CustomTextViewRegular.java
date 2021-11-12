package te.app.aljoud.customViews.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;


/**
 * Created by mohamedatef on 1/8/19.
 */

public class CustomTextViewRegular extends AppCompatTextView {


    public CustomTextViewRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    public CustomTextViewRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }


    public CustomTextViewRegular(Context context) {
        super(context);

        init(context);

    }

    private void init(Context context) {

        if (!isInEditMode()) {
            Typeface font = null;
            font = Typeface.createFromAsset(getContext().getAssets(), "fonts/font_regular.otf");
            setTypeface(font);
        }

    }

}