package te.app.aljoud.pages.exams;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import javax.inject.Inject;

import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentExamsBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.exams.models.AnswersItem;
import te.app.aljoud.pages.exams.models.ExamsResponse;
import te.app.aljoud.pages.exams.viewModels.ExamsViewModel;
import te.app.aljoud.utils.Constants;


public class ExamsFragment extends BaseFragment {
    @Inject
    ExamsViewModel viewModel;
    FragmentExamsBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_exams, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.exam();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.EXAMS.equals(((Mutable) o).message)) {
                viewModel.setExamDataList(((ExamsResponse) mutable.object).getExamDataList());
            }
        });
        viewModel.getAnswersAdapter().liveData.observeForever(answersItem -> {
            viewModel.updateNextQuestion(answersItem);
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
    }
}
