package te.app.aljoud.pages.courseDetails;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;

import javax.inject.Inject;

import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentLessonDetailsBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.courseDetails.viewModels.LessonDetailsViewModel;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.MovementHelper;


public class FragmentLessonDetails extends BaseFragment {
    @Inject
    LessonDetailsViewModel viewModel;
    FragmentLessonDetailsBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_lesson_details, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
        }
        MovementHelper.replaceLessonFragment(requireActivity(), new FragmentLessonVideos(viewModel.getPassingObject().getId()), "");
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);

        });
        binding.tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    MovementHelper.replaceLessonFragment(requireActivity(), new FragmentLessonVideos(viewModel.getPassingObject().getId()), "");

                } else if (tab.getPosition() == 1) {
                    MovementHelper.replaceLessonFragment(requireActivity(), new FragmentLessonQuizzes(viewModel.getPassingObject().getId()), "");

                } else {
                    MovementHelper.replaceLessonFragment(requireActivity(), new FragmentLessonArticles(viewModel.getPassingObject().getId()), "");

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
    }
}
