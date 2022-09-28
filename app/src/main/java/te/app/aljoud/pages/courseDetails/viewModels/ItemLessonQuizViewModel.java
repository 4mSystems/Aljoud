package te.app.aljoud.pages.courseDetails.viewModels;

import androidx.databinding.Bindable;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.courseDetails.models.videos.VideoData;
import te.app.aljoud.utils.Constants;

public class ItemLessonQuizViewModel extends BaseViewModel {
    public VideoData quizData;

    public ItemLessonQuizViewModel(VideoData quizData) {
        this.quizData = quizData;
    }

    @Bindable
    public VideoData getQuizData() {
        return quizData;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.EXAMS);
    }

}
