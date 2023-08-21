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
import com.google.gson.Gson;

import java.io.File;

import javax.inject.Inject;

import te.app.aljoud.BR;
import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.connection.FileObject;
import te.app.aljoud.databinding.AskSheetBinding;
import te.app.aljoud.databinding.FragmentCourseDetailsBinding;
import te.app.aljoud.databinding.InstractorSheetBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.auth.login.LoginFragment;
import te.app.aljoud.pages.courseDetails.models.CourseDetailsResponse;
import te.app.aljoud.pages.courseDetails.viewModels.CourseViewModel;
import te.app.aljoud.pages.fawaterkPayment.FawterkMethodFragment;
import te.app.aljoud.pages.request_to_buy.FragmentRequestToBuy;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.helper.MovementHelper;
import te.app.aljoud.utils.session.UserHelper;


public class FragmentCourseDetails extends BaseFragment {
    @Inject
    CourseViewModel viewModel;
    FragmentCourseDetailsBinding binding;
    BottomSheetDialog sheetDialog, askDialog;

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
            } else if (Constants.BUY_COURSE.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
            } else if (Constants.LOGIN.equals(((Mutable) o).message)) {
                MovementHelper.startActivity(requireActivity(), LoginFragment.class.getName(), null, null);
            } else if (Constants.REQUEST_TO_BUY.equals(((Mutable) o).message)) {
                MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.getCourse().getId()), getString(R.string.request_to_buy), FragmentRequestToBuy.class.getName(), null);
            } else if (Constants.DIALOG.equals(((Mutable) o).message)) {
                if (askDialog != null) {
                    toastMessage(((StatusMessage) mutable.object).mMessage);
                    askDialog.dismiss();
                }
                if (sheetDialog != null)
                    sheetDialog.dismiss();
            } else if (Constants.COURSE_LESSONS.equals(((Mutable) o).message)) {
                MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.getCourse().getId()), viewModel.getCourse().getName(), FragmentCourseLessons.class.getName(), null);
            } else if (Constants.PAYMENT_METHOD.equals(((Mutable) o).message)) {
                MovementHelper.startActivityWithBundle(requireActivity(), new PassingObject(viewModel.getCourse().getId(), Constants.COURSE_DETAILS), viewModel.getCourse().getName(), FawterkMethodFragment.class.getName(), null);
            } else if (Constants.ADD_CART.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                // increment cart by one
                int cartCount = Integer.parseInt(UserHelper.getInstance(requireActivity()).getCartCount()) + 1;
                UserHelper.getInstance(requireActivity()).addCartCount(String.valueOf(cartCount));
                baseActivity().cartCount.setValue(cartCount);
            } else if (Constants.PICKED_SUCCESSFULLY.equals(((Mutable) o).message)) {
                if (viewModel.getFilesAdapter().getFiles().size() <= 4) {
//                    LauncherHelper.launcherRequest = Constants.FILE_TYPE_IMAGE;
//                    LauncherHelper.execute(LauncherHelper.storage);
                    pickFile();
                } else {
                    toastMessageError(getString(R.string.max_files));
                }
            }
        });
        viewModel.getFilesAdapter().liveData.observeForever(integer -> {
            viewModel.getFileObjectList().remove(viewModel.getFilesAdapter().position);
        });
    }

    private void pickFile() {
        if (checkPickPermission(requireActivity())) {
            getImagePickerResult(requireActivity(), bitmapPair -> {
                if (bitmapPair != null) {
                    File file = bitmapPair.getSecond();
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

    private void showAsk() {
        viewModel.getAskRequest().setCourseId(String.valueOf(viewModel.getPassingObject().getId()));
        AskSheetBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(requireActivity()), R.layout.ask_sheet, null, false);
        askDialog = new BottomSheetDialog(requireActivity(), R.style.AppBottomSheetDialogTheme);
        askDialog.setContentView(sortBinding.getRoot());
        sortBinding.setViewModel(viewModel);
        askDialog.show();
    }

    private void showInstructorInfo() {
        InstractorSheetBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(requireActivity()), R.layout.instractor_sheet, null, false);
        sheetDialog = new BottomSheetDialog(requireActivity(), R.style.AppBottomSheetDialogTheme);
        sheetDialog.setContentView(sortBinding.getRoot());
        sortBinding.setViewmodel(viewModel);
        sheetDialog.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getHomeRepository().setLiveData(viewModel.liveData);
        viewModel.getCartRepository().setLiveData(viewModel.liveData);
    }

}
