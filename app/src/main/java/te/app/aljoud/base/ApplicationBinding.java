package te.app.aljoud.base;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import te.app.aljoud.R;
import te.app.aljoud.customViews.CustomDrawable;
import te.app.aljoud.utils.helper.AppHelper;
import te.app.aljoud.utils.images.PhotoFullPopupWindow;
import te.app.aljoud.utils.resources.ResourceManager;


public class ApplicationBinding {
    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView imageView, Object image) {
        if (image instanceof String && !TextUtils.isEmpty((String) image)) {
            Glide.with(imageView.getContext()).load((String) image).placeholder(R.drawable.logo).into(imageView);
        } else if (image instanceof Integer) {
            imageView.setImageResource((Integer) image);
        }
    }

    @BindingAdapter("imageFullUrl")
    public static void loadFullImage(ImageView imageView, Object image) {
        if (image instanceof String && !TextUtils.isEmpty((String) image)) {
            Glide.with(imageView.getContext()).load((String) image).placeholder(R.drawable.logo).into(imageView);
            imageView.setOnClickListener(view -> new PhotoFullPopupWindow(MyApplication.getInstance(), R.layout.popup_photo_full, imageView, (String) image, null));
        } else if (image instanceof Integer) {
            imageView.setImageResource((Integer) image);
        }
    }


    @BindingAdapter("color")
    public static void color(ImageView imageView, String color) {
        if (color != null && !color.equals("") && color.charAt(0) == '#') {
            imageView.setBackgroundColor(Color.parseColor(color));
        }
    }

    @BindingAdapter("background")
    public static void setBackGround(TextView textView, String colorCode) {
        int color = Color.parseColor(colorCode);
        CustomDrawable customDrawable = new CustomDrawable(color, color, color, 4, ResourceManager.getColor(R.color.colorPrimaryDark), 0);
        textView.setBackground(customDrawable);
    }

    @BindingAdapter({"app:adapter", "app:span", "app:orientation"})
    public static void getItemsV2Binding(RecyclerView recyclerView, RecyclerView.Adapter<?> itemsAdapter, String spanCount, String orientation) {
        if (orientation.equals("1"))
            AppHelper.initVerticalRV(recyclerView, recyclerView.getContext(), Integer.parseInt(spanCount));
        else
            AppHelper.initHorizontalRV(recyclerView, recyclerView.getContext(), Integer.parseInt(spanCount));
        recyclerView.setAdapter(itemsAdapter);
    }


    @BindingAdapter("rate")
    public static void setRate(final RatingBar ratingBar, String rate) {
        if (!TextUtils.isEmpty(rate))
            ratingBar.setRating(Float.parseFloat(rate));
    }

}
