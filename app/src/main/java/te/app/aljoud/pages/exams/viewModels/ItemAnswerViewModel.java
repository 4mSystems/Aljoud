package te.app.aljoud.pages.exams.viewModels;

import androidx.databinding.Bindable;

import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.pages.exams.models.AnswersItem;
import te.app.aljoud.pages.home.models.home.University;
import te.app.aljoud.utils.Constants;

public class ItemAnswerViewModel extends BaseViewModel {
    public AnswersItem answersItem;

    public ItemAnswerViewModel(AnswersItem answersItem) {
        this.answersItem = answersItem;
    }

    @Bindable
    public AnswersItem getAnswersItem() {
        return answersItem;
    }

    public void itemAction() {
        getLiveData().setValue(Constants.SUB_CATEGORIES);
    }

}
