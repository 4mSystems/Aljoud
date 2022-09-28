package te.app.aljoud.pages.university.viewModel;

import androidx.databinding.Bindable;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.university.models.levels.LevelsData;
import te.app.aljoud.utils.Constants;

public class ItemLevelsViewModel extends BaseViewModel {
    public LevelsData levelsData;

    public ItemLevelsViewModel(LevelsData levelsData) {
        this.levelsData = levelsData;
    }

    @Bindable
    public LevelsData getLevelsData() {
        return levelsData;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.SUB_CATEGORIES);
    }

}
