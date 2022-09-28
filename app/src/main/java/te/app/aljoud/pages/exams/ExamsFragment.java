package te.app.aljoud.pages.exams;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.gson.Gson;

import javax.inject.Inject;

import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.ExamResultDialogBinding;
import te.app.aljoud.databinding.FragmentExamsBinding;
import te.app.aljoud.model.base.Mutable;
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
            } else if (Constants.EXAM_RESULTS.equals(((Mutable) o).message)) {
                showExamResults();
            }
        });
        viewModel.getAnswersAdapter().liveData.observeForever(answersItem -> {
            viewModel.updateNextQuestion(answersItem);
        });
    }

    private void showExamResults() {
        ExamResultDialogBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(requireActivity()), R.layout.exam_result_dialog, null, false);
        Dialog askDialog = new BottomSheetDialog(requireActivity(), R.style.AppBottomSheetDialogTheme);
        askDialog.setContentView(sortBinding.getRoot());
        sortBinding.setViewModel(viewModel);
        askDialog.setCancelable(false);
        sortBinding.sendFeedBack.setOnClickListener(view -> {
            askDialog.setCancelable(true);
            askDialog.dismiss();
            viewModel.goBack(requireActivity());
        });
        askDialog.show();
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
    }
}
