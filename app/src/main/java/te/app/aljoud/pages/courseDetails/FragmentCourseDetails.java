package te.app.aljoud.pages.courseDetails;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import te.app.aljoud.databinding.AskSheetBinding;
import te.app.aljoud.databinding.FragmentCourseDetailsBinding;
import te.app.aljoud.databinding.InstractorSheetBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.courseDetails.models.CourseDetailsResponse;
import te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.LauncherHelper;
import te.app.aljoud.utils.helper.MovementHelper;


public class FragmentCourseDetails extends BaseFragment {
    @Inject
    CourseViewModel viewModel;
    FragmentCourseDetailsBinding binding;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_course_details, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.courseDetails();
        }
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.COURSE_DETAILS.equals(((Mutable) o).message)) {
                viewModel.setCourse(((CourseDetailsResponse) mutable.object).getCourse());
            } else if (Constants.INSTRUCTOR.equals(((Mutable) o).message)) {
                showInstructorInfo();
            } else if (Constants.ASK.equals(((Mutable) o).message)) {
                showAsk();
            } else if (Constants.COURSE_LESSONS.equals(((Mutable) o).message)) {
                MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.getCourse().getId()), viewModel.getCourse().getName(), FragmentCourseLessons.class.getName(), null);
            } else if (Constants.PICKED_SUCCESSFULLY.equals(((Mutable) o).message)) {
                LauncherHelper.launcherRequest = Constants.FILE_TYPE_IMAGE;
                LauncherHelper.execute(LauncherHelper.storage);
            }
        });
    }

    private void showAsk() {
        viewModel.getAskRequest().setCourseId(String.valueOf(viewModel.getPassingObject().getId()));
        AskSheetBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(requireActivity()), R.layout.ask_sheet, null, false);
        BottomSheetDialog sheetDialog = new BottomSheetDialog(requireActivity(), R.style.AppBottomSheetDialogTheme);
        sheetDialog.setContentView(sortBinding.getRoot());
        sortBinding.setViewModel(viewModel);
        sheetDialog.show();
    }

    private void showInstructorInfo() {
        InstractorSheetBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(requireActivity()), R.layout.instractor_sheet, null, false);
        BottomSheetDialog sheetDialog = new BottomSheetDialog(requireActivity(), R.style.AppBottomSheetDialogTheme);
        sheetDialog.setContentView(sortBinding.getRoot());
        sortBinding.setViewmodel(viewModel);
        sheetDialog.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LauncherHelper.checkPermission(this, LauncherHelper.launcherRequest, (request, result) -> {
            Log.e("onCreate", "onCreate: " + result);
            if (result)
                pick();
        });
    }

    private void pick() {
//        PickerDialog pickerDialog= new PickerDialog();
//        pickerDialog.show();
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent data) {
        super.launchActivityResult(request, resultCode, data);
        if (request == Constants.FILE_TYPE_IMAGE) {
//            ArrayList<MediaFile> files = data.getParcelableArrayListExtra(FilePickerActivity.MEDIA_FILES);
//            FileObject fileObject = new FileObject(Constants.ATTACHMENT_TYPE, files.get(0).getPath(), Constants.FILE_TYPE_IMAGE);
//            fileObject.setUri(data.getData());
//            viewModel.getFileObjects().add(fileObject);
        }
    }
}
