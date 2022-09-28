package te.app.aljoud.pages.conversations;

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
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentConversationsBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.conversations.models.ConversationsResponse;
import te.app.aljoud.pages.conversations.viewModels.ConversationsViewModel;
import te.app.aljoud.utils.Constants;


public class ConversationsFragment extends BaseFragment {
    FragmentConversationsBinding binding;
    @Inject
    ConversationsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_conversations, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        Constants.DATA_CHANGED = false;
        viewModel.getConversations(1, true);
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (((Mutable) o).message.equals(Constants.CONVERSATIONS)) {
                if (((ConversationsResponse) mutable.object).getConversationsMain() != null)
                    viewModel.setConversationsMain(((ConversationsResponse) mutable.object).getConversationsMain());
            }
        });
        binding.rcChats.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (viewModel.getSearchProgressVisible() == View.GONE && !TextUtils.isEmpty(viewModel.getConversationsMain().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getConversationsAdapter().getConversationsDataList().size() - 1) {
                        viewModel.setSearchProgressVisible(View.VISIBLE);
                        viewModel.getConversations((viewModel.getConversationsMain().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
        if (Constants.DATA_CHANGED) {
            Constants.DATA_CHANGED = false;
            viewModel.getConversations(1, true);
        }
    }
}
