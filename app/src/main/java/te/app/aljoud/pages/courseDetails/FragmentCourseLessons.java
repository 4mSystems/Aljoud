package te.app.aljoud.pages.courseDetails;

import android.os.Bundle;
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
import te.app.aljoud.databinding.FragmentCourseLessonsBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.courseDetails.models.lessons.CourseLessonsResponse;
import te.app.aljoud.pages.courseDetails.viewModels.CourseLessonsViewModel;
import te.app.aljoud.pages.exams.ExamsFragment;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.URLS;
import te.app.aljoud.utils.helper.MovementHelper;


public class FragmentCourseLessons extends BaseFragment {
    @Inject
    CourseLessonsViewModel viewModel;
    FragmentCourseLessonsBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_course_lessons, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.courseLessons();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.COURSE_LESSONS.equals(((Mutable) o).message)) {
                viewModel.setLessonMainData(((CourseLessonsResponse) mutable.object).getLessonMainData());
            } else if (Constants.RATE_APP.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
            } else if (Constants.EXAMS.equals(((Mutable) o).message)) {
                MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.getPassingObject().getId(), URLS.QUIZ_COURSE), null, ExamsFragment.class.getName(), null);
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
    }
}
