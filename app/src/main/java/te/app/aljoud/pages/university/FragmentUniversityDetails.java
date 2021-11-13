package te.app.aljoud.pages.university;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import te.app.aljoud.BR;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentUniversityDetailsBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.home.models.HomeResponse;
import te.app.aljoud.pages.settings.AboutAppFragment;
import te.app.aljoud.pages.university.viewModel.UniversityViewModel;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.MovementHelper;


public class FragmentUniversityDetails extends BaseFragment {
    @Inject
    UniversityViewModel viewModel;
    FragmentUniversityDetailsBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_university_details, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.homeData();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.HOME.equals(((Mutable) o).message)) {
                viewModel.getCategoriesAdapter().update(((HomeResponse) mutable.object).getCategories());
                viewModel.notifyChange(BR.categoriesAdapter);
            } else if (Constants.ABOUT.equals(((Mutable) o).message)) {
                MovementHelper.startActivity(requireActivity(), AboutAppFragment.class.getName(), getResources().getString(R.string.about), null);
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
    }
}
