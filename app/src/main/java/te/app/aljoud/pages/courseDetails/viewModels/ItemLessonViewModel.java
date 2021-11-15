package te.app.aljoud.pages.courseDetails.viewModels;

import androidx.databinding.Bindable;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.courseDetails.models.lessons.LessonsItem;
import te.app.aljoud.pages.university.models.levels.LevelsData;
import te.app.aljoud.utils.Constants;

public class ItemLessonViewModel extends BaseViewModel {
    public LessonsItem lessonsItem;
    public int position;

    public ItemLessonViewModel(LessonsItem lessonsItem, int position) {
        this.position = position;

        this.lessonsItem = lessonsItem;
    }

    @Bindable
    public LessonsItem getLessonsItem() {
        return lessonsItem;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.SUB_CATEGORIES);
    }

}
