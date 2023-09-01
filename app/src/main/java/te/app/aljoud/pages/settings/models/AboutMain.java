package te.app.aljoud.pages.settings.models;

import androidx.annotation.Keep;

import com.google.gson.annotations.SerializedName;
@Keep
public class AboutMain {
    @SerializedName("about")
    private AboutData aboutData;
    @SerializedName("news")
    private News news;

    public AboutData getAboutData() {
        return aboutData;
    }

    public News getNews() {
        return news;
    }
}
