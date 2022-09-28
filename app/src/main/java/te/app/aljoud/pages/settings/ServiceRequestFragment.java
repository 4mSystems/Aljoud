package te.app.aljoud.pages.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.PopupMenu;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import java.util.Objects;

import javax.inject.Inject;

import te.app.aljoud.BR;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.connection.FileObject;
import te.app.aljoud.databinding.FragmentContactsBinding;
import te.app.aljoud.databinding.FragmentServiceRequestBinding;
import te.app.aljoud.model.File;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.model.base.StatusMessage;
import te.app.aljoud.pages.settings.models.services.ServicesResponse;
import te.app.aljoud.pages.settings.viewModels.SettingsViewModel;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.PopUp.PopUpMenuHelper;
import te.app.aljoud.utils.helper.LauncherHelper;
import te.app.aljoud.utils.upload.FileOperations;

public class ServiceRequestFragment extends BaseFragment {

    FragmentServiceRequestBinding binding;
    @Inject
    SettingsViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_service_request, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        viewModel.getServices();
        setEvent();
        return binding.getRoot();
    }

    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            if (Constants.PICKED_SUCCESSFULLY.equals(((Mutable) o).message)) {
                if (viewModel.getFilesAdapter().getFiles().size() <= 4) {
                    LauncherHelper.launcherRequest = Constants.FILE_TYPE_IMAGE;
                    LauncherHelper.execute(LauncherHelper.storage);
                } else {
                    toastMessageError(getString(R.string.max_files));
                }
            } else if (Constants.CONTACT.equals(((Mutable) o).message)) {
                toastMessage(((StatusMessage) mutable.object).mMessage);
                viewModel.goBack(requireActivity());
            } else if (Constants.GET_SERVICES.equals(((Mutable) o).message)) {
                viewModel.setServiceItemList(((ServicesResponse) mutable.object).getData());
            } else if (Constants.SERVICES.equals(((Mutable) o).message)) {
                if (viewModel.getServiceItemList().size() > 0)
                    showService();
            }

        });
    }

    private void showService() {
        PopUpMenuHelper.showServicesPopUp(requireActivity(), binding.edService, viewModel.getServiceItemList()).setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                binding.edService.setText(viewModel.getServiceItemList().get(item.getItemId()).getName());
                viewModel.getAskRequest().setServiceId(String.valueOf(viewModel.getServiceItemList().get(item.getItemId()).getId()));
                return false;
            }
        });
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LauncherHelper.checkPermission(this, LauncherHelper.launcherRequest, (request, result) -> {
            if (result)
                pickImageDialogSelect(LauncherHelper.launcherRequest);
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.getRepository().setLiveData(viewModel.liveData);
    }

    @Override
    public void launchActivityResult(int request, int resultCode, Intent data) {
        super.launchActivityResult(request, resultCode, data);
        if (request == Constants.FILE_TYPE_IMAGE) {
            String mimeType = requireActivity().getContentResolver().getType(Objects.requireNonNull(data.getData()));
            FileObject fileObject = FileOperations.getFileObject(requireActivity(), data, "file[" + viewModel.getFileObjectList().size() + "]", Constants.FILE_TYPE_IMAGE);
            viewModel.getFilesAdapter().getFiles().add(new File(fileObject.getFilePath(), mimeType));
            viewModel.getFilesAdapter().notifyDataSetChanged();
            viewModel.notifyChange(BR.filesAdapter);
            viewModel.getFileObjectList().add(fileObject);
        }
    }
}
