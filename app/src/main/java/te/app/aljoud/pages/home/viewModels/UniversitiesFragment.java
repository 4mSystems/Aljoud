package te.app.aljoud.pages.home.viewModels;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import javax.inject.Inject;

import te.app.aljoud.R;
import te.app.aljoud.activity.MainActivity;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentUniversitiesBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.cart.models.CartCountResponse;
import te.app.aljoud.pages.home.models.home.HomeResponse;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.session.UserHelper;


public class UniversitiesFragment extends BaseFragment {
    @Inject
    HomeViewModel viewModel;
    FragmentUniversitiesBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_universities, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.homeData(1, true);
        viewModel.getCartCount();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.HOME.equals(((Mutable) o).message)) {
                viewModel.setHomeMainData(((HomeResponse) mutable.object).getData());
            } else if (Constants.ADD_CART.equals(((Mutable) o).message)) {
                UserHelper.getInstance(requireActivity()).addCartCount(((CartCountResponse) mutable.object).getCartCountData().getCount());
                ((MainActivity) requireActivity()).getHomeActionBarView().setCartCount();
            }
        });
        binding.rcCourses.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (viewModel.getSearchProgressVisible() == View.GONE && !TextUtils.isEmpty(viewModel.getHomeMainData().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getUniversityAdapter().getUniversities().size() - 1) {
                        viewModel.setSearchProgressVisible(View.VISIBLE);
                        viewModel.homeData((viewModel.getHomeMainData().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
    }
}
