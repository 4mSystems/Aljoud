package te.app.aljoud.customViews.views;

import android.content.Context;

import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.AnimationUtils;

import te.app.aljoud.R;
import te.app.aljoud.base.MyApplication;

public class CustomEditText extends BaseEditText {
    private Validator validator;
    Context context = null;
    public interface Validator {
        boolean validate(String input);
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
        init();
    }

    public CustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    public CustomEditText(Context context) {
        super(context);
        this.context = context;
        init();
    }


    private void init() {
        Log.e("error","start");

//        addTextChangedListener(new TextWatcher() {
//
//            public void onTextChanged(CharSequence c, int start, int before, int count) {
//                Log.e("error","change");
//                if (Validate.isEmpty(c.toString())) {
//                    Log.e("error","empty");
//                    setError(CustomEditText.this,ResourceManager.getString(R.string.this_field_is_requried));
//                } else if (getInputType() == InputType.TYPE_CLASS_PHONE && !Validate.isPhone(c.toString())) {
//                    setError(CustomEditText.this,ResourceManager.getString(R.string.phone_not_valid));
//                } else if (getInputType() == InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS && !Validate.isMail(c.toString())) {
//                    setError(CustomEditText.this,ResourceManager.getString(R.string.email_not_valid));
//                } else if ((getInputType() == InputType.TYPE_TEXT_VARIATION_PASSWORD||getInputType() == InputType.TYPE_NUMBER_VARIATION_PASSWORD ||
//                        getInputType() == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD || getInputType() == InputType.TYPE_TEXT_VARIATION_WEB_PASSWORD)&& !Validate.isAvLen(c.toString(),6,25)) {
//                    setError(CustomEditText.this,ResourceManager.getString(R.string.both_password_are_not_same));
//                } else {
//                    setError(null);
//                }
//            }
//
//            public void beforeTextChanged(CharSequence c, int start, int count, int after) {
//            }
//
//            public void afterTextChanged(Editable c) {
//
//            }
//        });
    }



    @Override
    public void setError(CharSequence error) {
        super.setError(error);
        if(error != null && context != null) {
            startAnimation(AnimationUtils.loadAnimation(MyApplication.getInstance(), R.anim.shake_vibrate));
        }
    }
}
