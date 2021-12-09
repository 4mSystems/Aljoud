package te.app.aljoud.pages.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.android.material.tabs.TabLayout;

import javax.inject.Inject;

import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentHomeBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.courseDetails.FragmentLessonArticles;
import te.app.aljoud.pages.courseDetails.FragmentLessonQuizzes;
import te.app.aljoud.pages.courseDetails.FragmentLessonVideos;
import te.app.aljoud.pages.home.models.home.HomeResponse;
import te.app.aljoud.pages.home.viewModels.HomeViewModel;
import te.app.aljoud.pages.home.viewModels.UniversitiesFragment;
import te.app.aljoud.pages.myCourses.MyCoursesFragment;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.MovementHelper;


public class HomeFragment extends BaseFragment {
    @Inject
    HomeViewModel viewModel;
    FragmentHomeBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        MovementHelper.replaceHomeFragment(requireActivity(), new UniversitiesFragment(), "");
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        binding.tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    MovementHelper.replaceHomeFragment(requireActivity(), new UniversitiesFragment(), "");
                } else if (tab.getPosition() == 1) {
                    MovementHelper.replaceHomeFragment(requireActivity(), new MyCoursesFragment(), "");

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
