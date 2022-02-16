package te.app.aljoud.pages.offers.viewModel;

import androidx.databinding.Bindable;

import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.offers.models.OfferItem;
import te.app.aljoud.pages.university.adapters.CourseOffersAdapter;
import te.app.aljoud.utils.Constants;

public class ItemOfferViewModel extends BaseViewModel {
    public OfferItem offerItem;
    CourseOffersAdapter courseAdapter;

    public ItemOfferViewModel(OfferItem offerItem) {
        getCourseAdapter().update(offerItem.getCourses());
        notifyChange(BR.courseAdapter);
        this.offerItem = offerItem;
    }

    @Bindable
    public OfferItem getOfferItem() {
        return offerItem;
    }

    @Bindable
    public CourseOffersAdapter getCourseAdapter() {
        return this.courseAdapter == null ? this.courseAdapter = new CourseOffersAdapter() : this.courseAdapter;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.SUB_CATEGORIES);
    }

}
