package te.app.aljoud.pages.chat.view;


import static te.app.aljoud.utils.filepicker.picker.FilePermissionsKt.checkPickPermission;
import static te.app.aljoud.utils.filepicker.picker.ImagePickerResultKt.getImagePickerResult;
import static te.app.aljoud.utils.filepicker.picker.ImagePickerResultKt.getMimeType;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
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

import te.app.aljoud.BR;
import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.connection.FileObject;
import te.app.aljoud.databinding.FragmentChatBinding;
import te.app.aljoud.databinding.ReplySheetBinding;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.chat.model.ChatResponse;
import te.app.aljoud.pages.chat.model.ChatSendResponse;
import te.app.aljoud.pages.chat.viewmodel.ChatViewModel;
import te.app.aljoud.utils.Constants;

public class ChatFragment extends BaseFragment {
    FragmentChatBinding binding;
    @Inject
    ChatViewModel viewModel;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chat, container, false);
        IApplicationComponent component = ((MyApplication) requireActivity().getApplicationContext()).getApplicationComponent();
        component.inject(this);
        binding.setViewmodel(viewModel);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String passingObject = bundle.getString(Constants.BUNDLE);
            viewModel.setPassingObject(new Gson().fromJson(passingObject, PassingObject.class));
            viewModel.chat();
        }
        setEvent();
        return binding.getRoot();
    }


    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
            Mutable mutable = (Mutable) o;
            handleActions(mutable);
            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
            if (mutable.message.equals(Constants.CHAT)) {
                viewModel.setChatMain(((ChatResponse) mutable.object).getChats());
                if (viewModel.getAdapter().getChatList().size() > 0)
                    new Handler().postDelayed(() -> binding.rcChat.smoothScrollToPosition(viewModel.getAdapter().getChatList().size() - 1), 200);
            } else if (mutable.message.equals(Constants.DIALOG)) {
                showReply();
            } else if (Constants.PICKED_SUCCESSFULLY.equals(((Mutable) o).message)) {
                if (viewModel.getFilesAdapter().getFiles().size() <= 4) {
                    pickFile();
                } else {
                    toastMessageError(getString(R.string.max_files));
                }
            } else if (((Mutable) o).message.equals(Constants.SEND_MESSAGE)) {
                ChatSendResponse chatSendResponse = (ChatSendResponse) ((Mutable) o).object;
                viewModel.getAdapter().getChatList().add(chatSendResponse.getData());
                binding.rcChat.scrollToPosition(viewModel.getAdapter().getItemCount() - 1);
                viewModel.getAdapter().notifyItemChanged(viewModel.getAdapter().getItemCount() - 1);
                viewModel.fileObjectList.clear();
                viewModel.getFilesAdapter().getFiles().clear();
                viewModel.request.setMessage("");
            }
        });
        viewModel.getFilesAdapter().liveData.observeForever(integer -> {
            viewModel.fileObjectList.remove(viewModel.getFilesAdapter().position);
        });
    }

    private void showReply() {
        viewModel.request.setCourseId(String.valueOf(viewModel.getPassingObject().getId()));
        ReplySheetBinding sortBinding = DataBindingUtil.inflate(LayoutInflater.from(requireActivity()), R.layout.reply_sheet, null, false);
        Dialog askDialog = new BottomSheetDialog(requireActivity(), R.style.AppBottomSheetDialogTheme);
        askDialog.setContentView(sortBinding.getRoot());
        sortBinding.setViewModel(viewModel);
        sortBinding.btAsk.setOnClickListener(view -> {
            if (!TextUtils.isEmpty(viewModel.request.getMessage())) {
                askDialog.dismiss();
                viewModel.sendMessage();
            }
        });
        askDialog.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        viewModel.repository.setLiveData(viewModel.liveData);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Constants.DATA_CHANGED = true;
    }


    private void pickFile() {
        if (checkPickPermission(requireActivity())) {
            getImagePickerResult(requireActivity(), bitmapPair -> {
                if (bitmapPair != null) {
                    java.io.File file = bitmapPair.getSecond();
                    FileObject fileObject = new FileObject("file[" + viewModel.fileObjectList.size() + "]", file.getPath(), Constants.FILE_TYPE_IMAGE);
                    viewModel.getFilesAdapter().getFiles().add(new te.app.aljoud.model.File(fileObject.getFilePath(), getMimeType(file.getPath())));
                    viewModel.getFilesAdapter().notifyDataSetChanged();
                    viewModel.notifyChange(BR.filesAdapter);
                    viewModel.fileObjectList.add(fileObject);
                } else
                    Log.e("pickFile", "pickFile: " + bitmapPair);
                return null;
            });
        }
    }
}
