package te.app.aljoud.pages.university.viewModel;

import androidx.databinding.Bindable;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.home.models.CategoriesItem;
import te.app.aljoud.pages.university.models.SpecialistsItem;
import te.app.aljoud.utils.Constants;

public class ItemCollegesViewModel extends BaseViewModel {
    public SpecialistsItem specialistsItem;

    public ItemCollegesViewModel(SpecialistsItem specialistsItem) {
        this.specialistsItem = specialistsItem;
    }

    @Bindable
    public SpecialistsItem getSpecialistsItem() {
        return specialistsItem;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.SUB_CATEGORIES);
    }

}
