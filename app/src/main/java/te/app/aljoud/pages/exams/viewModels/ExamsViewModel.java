package te.app.aljoud.pages.exams.viewModels;


import android.util.Log;

import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import te.app.aljoud.BR;
import te.app.aljoud.base.BaseViewModel;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.exams.adapters.AnswersAdapter;
import te.app.aljoud.pages.exams.models.AnswersItem;
import te.app.aljoud.pages.exams.models.ExamData;
import te.app.aljoud.repository.HomeRepository;
import te.app.aljoud.utils.Constants;

public class ExamsViewModel extends BaseViewModel {

    public MutableLiveData<Mutable> liveData;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    HomeRepository homeRepository;
    AnswersAdapter answersAdapter;
    ExamData examData;
    List<ExamData> examDataList = new ArrayList<>();
    public ObservableField<Integer> score = new ObservableField<>();
    public int currentQuestions = 0;

    @Inject
    public ExamsViewModel(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
        this.liveData = new MutableLiveData<>();
        homeRepository.setLiveData(liveData);
        score.set(0);
    }

    public void exam() {
        compositeDisposable.add(homeRepository.exam(getPassingObject().getId(), getPassingObject().getObject()));
    }

    @Bindable
    public ExamData getExamData() {
        return this.examData == null ? this.examData = new ExamData() : this.examData;
    }

    @Bindable
    public void setExamData(ExamData examData) {
        getAnswersAdapter().update(examData.getAnswers());
        notifyChange(BR.answersAdapter);
        notifyChange(BR.examData);
        this.examData = examData;
    }

    public List<ExamData> getExamDataList() {
        return examDataList;
    }

    public void setExamDataList(List<ExamData> examDataList) {
        if (examDataList.size() > 0)
            setExamData(examDataList.get(0));
        this.examDataList = examDataList;
    }

    @Bindable
    public AnswersAdapter getAnswersAdapter() {
        return this.answersAdapter == null ? this.answersAdapter = new AnswersAdapter() : this.answersAdapter;
    }


    public HomeRepository getHomeRepository() {
        return homeRepository;
    }

    protected void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        unSubscribeFromObservable();
    }

    public void updateNextQuestion(AnswersItem answersItem) {
        currentQuestions++;
        if (answersItem.getCorrect().equals("1"))
            score.set(score.get() + 1);
        if (currentQuestions <= getExamDataList().size() - 1) {
            setExamData(getExamDataList().get(currentQuestions));
        }else
            liveData.setValue(new Mutable(Constants.EXAM_RESULTS));
    }
}
