package te.app.aljoud.pages.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import javax.inject.Inject;

import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.connection.FileObject;
import te.app.aljoud.databinding.FragmentProfileBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.auth.models.UsersResponse;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.session.UserHelper;
import te.app.aljoud.utils.upload.FileOperations;

public class ProfileFragment extends BaseFragment {
    FragmentProfileBinding binding;
    @Inject
    ProfileViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            switch (((Mutable) o).message) {
                case Constants.IMAGE:
                    pickImageDialogSelect(Constants.FILE_TYPE_IMAGE);
                    break;
                case Constants.UPDATE_PROFILE:
                    toastMessage(((UsersResponse) mutable.object).mMessage);
                    viewModel.goBack(requireActivity());
                    UserHelper.getInstance(requireActivity()).userLogin(((UsersResponse) ((Mutable) o).object).getUserData());
                    break;
                case Constants.NOT_MATCH_PASSWORD:
                    showError(getResources().getString(R.string.password_not_match));
                    break;

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }


    @Override
    public void launchActivityResult(int request, int resultCode, Intent result) {
        super.launchActivityResult(request, resultCode, result);
        if (result != null)
            if (request == Constants.FILE_TYPE_IMAGE) {
                FileObject fileObject = FileOperations.getFileObject(getActivity(), result, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
                viewModel.fileObject.add(fileObject);
                binding.imgRegister.setImageURI(null);
                binding.imgRegister.setImageURI(result.getData());
            }
    }
}
