package te.app.aljoud.pages.offers.viewModel;

import androidx.databinding.Bindable;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.home.models.home.University;
import te.app.aljoud.pages.offers.models.OfferItem;
import te.app.aljoud.pages.university.adapters.LevelsAdapter;
import te.app.aljoud.utils.Constants;

public class ItemOfferViewModel extends BaseViewModel {
    public OfferItem offerItem;
    LevelsAdapter levelsAdapter;

    public ItemOfferViewModel(OfferItem offerItem) {
        this.offerItem = offerItem;
    }

    @Bindable
    public OfferItem getOfferItem() {
        return offerItem;
    }

    @Bindable
    public LevelsAdapter getLevelsAdapter() {
        return this.levelsAdapter == null ? this.levelsAdapter = new LevelsAdapter() : this.levelsAdapter;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.SUB_CATEGORIES);
    }

}
