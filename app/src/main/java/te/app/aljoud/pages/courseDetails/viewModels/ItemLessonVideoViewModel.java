package te.app.aljoud.pages.courseDetails.viewModels;

import androidx.databinding.Bindable;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.courseDetails.models.videos.VideoData;
import te.app.aljoud.utils.Constants;

public class ItemLessonVideoViewModel extends BaseViewModel {
    public VideoData videoData;

    public ItemLessonVideoViewModel(VideoData videoData) {
        this.videoData = videoData;
    }

    @Bindable
    public VideoData getVideoData() {
        return videoData;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.SUB_CATEGORIES);
    }

}
