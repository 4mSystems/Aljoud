package te.app.aljoud.pages.home.viewModels;

import androidx.databinding.Bindable;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.home.models.home.University;
import te.app.aljoud.utils.Constants;

public class ItemUniversityViewModel extends BaseViewModel {
    public University university;

    public ItemUniversityViewModel(University university) {
        this.university = university;
    }

    @Bindable
    public University getUniversity() {
        return university;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.SUB_CATEGORIES);
    }

}
