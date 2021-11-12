package te.app.aljoud.pages.home.viewModels;

import androidx.databinding.Bindable;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.home.models.CategoriesItem;
import te.app.aljoud.utils.Constants;

public class ItemCategoryViewModel extends BaseViewModel {
    public CategoriesItem categoriesItem;

    public ItemCategoryViewModel(CategoriesItem categoriesItem) {
        this.categoriesItem = categoriesItem;
    }

    @Bindable
    public CategoriesItem getCategoriesItem() {
        return categoriesItem;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.SUB_CATEGORIES);
    }

}
