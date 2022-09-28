package te.app.aljoud.pages.home.models.social;

public class SocialModel {
    private int icon;
    private String url;

    public SocialModel(int icon, String url) {
        this.icon = icon;
        this.url = url;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
