package te.app.aljoud.customViews.tesDialog;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.databinding.DataBindingUtil;

import te.app.aljoud.R;
import te.app.aljoud.databinding.LayoutTesBinding;


public class TesImageDialog extends androidx.appcompat.widget.AppCompatImageView {
    public Context context;

    public TesImageDialog(Context context, AttributeSet attrs) {
        super(context, attrs);
        setImage();
        this.context = context;
    }

    public void setImage() {


        this.setImageResource(R.drawable.tes);
        this.setOnClickListener(view -> {
            TesDialog grandDialog = new TesDialog(context);
            grandDialog.init();
        });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }


}

class TesDialog extends RelativeLayout {

    Context context;

    public TesDialog(Context context) {
        super(context);
        this.context = context;
    }

    public void init() {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        final LayoutTesBinding layoutGrandBinding = DataBindingUtil.inflate(layoutInflater, R.layout.layout_tes, null, true);
        View grand = layoutGrandBinding.getRoot();
        final AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.customDialog);
        AlertDialog dialog = builder.create();
        dialog.setView(grand);
        dialog.show();
        layoutGrandBinding.tvTesUrl.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + layoutGrandBinding.tvTesUrl.getText().toString()));
            context.startActivity(browserIntent);
        });
        layoutGrandBinding.rlGrandCall.setOnClickListener(v -> {
            Uri call = Uri.parse("tel:" + layoutGrandBinding.tvTesPhone.getText().toString());
            Intent surf = new Intent(Intent.ACTION_DIAL, call);
            context.startActivity(surf);
        });
        layoutGrandBinding.rlGrandWhats.setOnClickListener(v -> {
            try {

                Uri uri = Uri.parse("https://api.whatsapp.com/send?phone=201090624441&text=" + "");

                Intent sendIntent = new Intent(Intent.ACTION_VIEW, uri);

                context.startActivity(sendIntent);

            } catch (Exception e) {
                Log.e("exc", e.getMessage().toString());
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=com.whatsapp&hl=en"));
                context.startActivity(browserIntent);
            }
        });
        layoutGrandBinding.imgGrandClose.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }
}
