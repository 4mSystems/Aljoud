package te.app.aljoud.customViews.views;

import android.app.DatePickerDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Calendar;

import te.app.aljoud.R;
import te.app.aljoud.base.MyApplication;

public class DateEditText extends androidx.appcompat.widget.AppCompatEditText {
    DatePickerDialog datePickerDialog;

    public DateEditText(Context context) {
        super(context);
        init();
    }

    public DateEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DateEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        setOnClickListener(v -> showDateDialog());
    }

    private void showDateDialog() {
        if (datePickerDialog == null) {
            Calendar mcurrentTime = Calendar.getInstance();
            mcurrentTime.add(Calendar.YEAR, -100);

            int year = mcurrentTime.get(Calendar.YEAR);
            int month = mcurrentTime.get(Calendar.MONTH) + 1;
            datePickerDialog
                    = new DatePickerDialog(getContext(), (datePicker, i, i1, i2) -> {
                String selectedDate = i + "-" + (++i1) + "-" + i2;

                setText(selectedDate);
            }, year, month, 0);
            datePickerDialog.getDatePicker().setMinDate(mcurrentTime.getTimeInMillis());
        }
        datePickerDialog.show();
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(8, 0, 8, 0);
        Button button = datePickerDialog.getButton(DatePickerDialog.BUTTON_NEGATIVE);
        button.setBackgroundColor(MyApplication.getInstance().getResources().getColor(R.color.colorPrimaryDark, null));
        button.setTextColor(MyApplication.getInstance().getResources().getColor(R.color.white, null));
        button.setLayoutParams(params);

    }

    public DatePickerDialog getDatePickerDialog() {
        return datePickerDialog;
    }
}
