package te.app.aljoud.pages.university.viewModel;

import androidx.databinding.Bindable;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.home.models.CategoriesItem;
import te.app.aljoud.pages.university.models.course.Course;
import te.app.aljoud.utils.Constants;

public class ItemSectionCategoryViewModel extends BaseViewModel {
    public Course course;

    public ItemSectionCategoryViewModel(Course course) {
        this.course = course;
    }

    @Bindable
    public Course getCourse() {
        return course;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.SUB_CATEGORIES);
    }

}
