package te.app.aljoud.pages.courseDetails;

import static te.app.aljoud.utils.filepicker.picker.FilePermissionsKt.checkPickPermission;
import static te.app.aljoud.utils.filepicker.picker.ImagePickerResultKt.getImagePickerResult;
import static te.app.aljoud.utils.filepicker.picker.ImagePickerResultKt.getMimeType;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;


import javax.inject.Inject;

import te.app.aljoud.BR;
import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.connection.FileObject;
import te.app.aljoud.databinding.AskLessonSheetBinding;
import te.app.aljoud.databinding.FragmentLessonDetailsBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.courseDetails.viewModels.LessonDetailsViewModel;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.MovementHelper;


public class FragmentLessonDetails extends BaseFragment {
    @Inject
    LessonDetailsViewModel viewModel;
    FragmentLessonDetailsBinding binding;
    BottomSheetDialog askDialog;

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
            if (Constants.ASK.equals(((Mutable) o).message)) {
                showAsk();
            } else if (Constants.PICKED_SUCCESSFULLY.equals(((Mutable) o).message)) {
                if (viewModel.getFilesAdapter().getFiles().size() <= 4) {
                    pickFile();
                } else {
                    toastMessageError(getString(R.string.max_files));
                }
            } else if (Constants.DIALOG.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
            }
        });

        viewModel.getFilesAdapter().liveData.observeForever(integer -> viewModel.getFileObjectList().remove(viewModel.getFilesAdapter().position));
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

    private void showAsk() {
        AskLessonSheetBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(requireActivity()), R.layout.ask_lesson_sheet, null, false);
        askDialog = new BottomSheetDialog(requireActivity(), R.style.AppBottomSheetDialogTheme);
        askDialog.setContentView(sortBinding.getRoot());
        sortBinding.setViewModel(viewModel);
        sortBinding.btAsk.setOnClickListener(view -> {
            askDialog.dismiss();
            viewModel.ask();
        });
        askDialog.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
    }

    private void pickFile() {
        if (checkPickPermission(requireActivity())) {
            getImagePickerResult(requireActivity(), bitmapPair -> {
                if (bitmapPair != null) {
                    java.io.File file = bitmapPair.getSecond();
                    FileObject fileObject = new FileObject("file[" + viewModel.getFileObjectList().size() + "]", file.getPath(), Constants.FILE_TYPE_IMAGE);
                    viewModel.getFilesAdapter().getFiles().add(new te.app.aljoud.model.File(fileObject.getFilePath(), getMimeType(file.getPath())));
                    viewModel.getFilesAdapter().notifyDataSetChanged();
                    viewModel.notifyChange(BR.filesAdapter);
                    viewModel.getFileObjectList().add(fileObject);
                } else
                    Log.e("pickFile", "pickFile: " + bitmapPair);
                return null;
            });
        }
    }
}
