package te.app.aljoud.pages.university;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import javax.inject.Inject;

import te.app.aljoud.BR;
import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentCategorySectionsBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.university.models.course.CourseResponse;
import te.app.aljoud.pages.university.models.levels.LevelsResponse;
import te.app.aljoud.pages.university.viewModel.UniversityViewModel;
import te.app.aljoud.utils.Constants;


public class FragmentCategorySections extends BaseFragment {
    @Inject
    UniversityViewModel viewModel;
    FragmentCategorySectionsBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_category_sections, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.levels();
            viewModel.levelCourses();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.LEVELS.equals(((Mutable) o).message)) {
                binding.prLevels.setVisibility(View.GONE);
                viewModel.getLevelsAdapter().update(((LevelsResponse) mutable.object).getData());
                viewModel.notifyChange(BR.levelsAdapter);
            } else if (Constants.LEVEL_COURSES.equals(((Mutable) o).message)) {
                binding.prCourse.setVisibility(View.GONE);
                viewModel.getCourseAdapter().update(((CourseResponse) mutable.object).getCourse());
                viewModel.notifyChange(BR.courseAdapter);
            }
        });
        viewModel.getLevelsAdapter().liveData.observeForever(integer -> {
            binding.prCourse.setVisibility(View.VISIBLE);
            viewModel.getCourseAdapter().getCourseList().clear();
            viewModel.levelCourses();
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
    }
}
