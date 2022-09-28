package te.app.aljoud.pages.courseDetails;

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
import te.app.aljoud.databinding.FragmentLessonDetailsBinding;
import te.app.aljoud.databinding.FragmentLessonVideosBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.courseDetails.models.videos.VideosResponse;
import te.app.aljoud.pages.courseDetails.viewModels.LessonDetailsViewModel;
import te.app.aljoud.utils.Constants;


public class FragmentLessonVideos extends BaseFragment {
    @Inject
    LessonDetailsViewModel viewModel;
    FragmentLessonVideosBinding binding;
    int lessonId;

    public FragmentLessonVideos(int lessonId) {
        this.lessonId = lessonId;
    }

    public FragmentLessonVideos() {
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_lesson_videos, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.lessonVideos(lessonId, 1, true);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.LESSON_VIDEOS.equals(((Mutable) o).message)) {
                viewModel.setVideosMainData(((VideosResponse) mutable.object).getVideosMainData());
            }
        });
        binding.rcVideo.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (viewModel.getSearchProgressVisible() == View.GONE && !TextUtils.isEmpty(viewModel.getVideosMainData().getNextPageUrl())) {
                    if (linearLayoutManager != null && linearLayoutManager.findLastCompletelyVisibleItemPosition() == viewModel.getLessonVideosAdapter().getLessonsItemList().size() - 1) {
                        viewModel.setSearchProgressVisible(View.VISIBLE);
                        viewModel.lessonQuizzes(lessonId, (viewModel.getVideosMainData().getCurrentPage() + 1), false);
                    }
                }
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
    }
}
