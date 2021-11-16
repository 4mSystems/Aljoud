package te.app.aljoud.pages.courseDetails.viewModels;

import androidx.databinding.Bindable;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.courseDetails.models.videos.VideoData;
import te.app.aljoud.utils.Constants;

public class ItemLessonArticleViewModel extends BaseViewModel {
    public VideoData article;

    public ItemLessonArticleViewModel(VideoData article) {
        this.article = article;
    }

    @Bindable
    public VideoData getArticle() {
        return article;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.SUB_CATEGORIES);
    }

}
