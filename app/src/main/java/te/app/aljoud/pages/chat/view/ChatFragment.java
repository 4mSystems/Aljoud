package te.app.aljoud.pages.chat.view;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.google.gson.Gson;

import javax.inject.Inject;

import te.app.aljoud.PassingObject;
import te.app.aljoud.R;
import te.app.aljoud.base.BaseFragment;
import te.app.aljoud.base.IApplicationComponent;
import te.app.aljoud.base.MyApplication;
import te.app.aljoud.databinding.FragmentChatBinding;
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
        }
        setEvent();
        return binding.getRoot();
    }


    private void setEvent() {
        viewModel.liveData.observe(requireActivity(), (Observer<Object>) o -> {
//            Mutable mutable = (Mutable) o;
//            handleActions(mutable);
//            viewModel.setMessage(mutable.message.equals(Constants.HIDE_PROGRESS) ? mutable.message : "");
//            if (mutable.message.equals(Constants.CHAT)) {
//                viewModel.setConversationsMain(((ConversationsResponse) mutable.object).getConversationsMain());
//                if (viewModel.getAdapter().getChatList().size() > 0)
//                    new Handler().postDelayed(() -> binding.rcChat.smoothScrollToPosition(viewModel.getAdapter().getChatList().size() - 1), 200);
//            } else if (Constants.IMAGE.equals(mutable.message)) {
//                LauncherHelper.launcherRequest = Constants.FILE_TYPE_IMAGE;
//                LauncherHelper.execute(LauncherHelper.storage);
//            } else if (((Mutable) o).message.equals(Constants.SEND_MESSAGE)) {
//                ChatSendResponse chatSendResponse = (ChatSendResponse) ((Mutable) o).object;
//                ConversationsData chat = chatSendResponse.getData();
//                viewModel.getAdapter().getChatList().add(chat);
//                viewModel.fileObjectList.clear();
//                binding.sendChat.setText("");
//                binding.sendChat.setHint(getResources().getString(R.string.message_hint));
//                binding.rcChat.scrollToPosition(viewModel.getAdapter().getItemCount() - 1);
//                viewModel.getAdapter().notifyItemChanged(viewModel.getAdapter().getItemCount() - 1);
//            }
        });
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

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        LauncherHelper.checkPermission(this, LauncherHelper.launcherRequest, (request, result) -> {
//            if (result)
//                pickImageDialogSelect(LauncherHelper.launcherRequest);
//        });
    }

    public void showAlertDialogWithAutoDismiss(String msg) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
//        builder
//                .setMessage(msg)
//                .setCancelable(false)
//                .setNegativeButton(getString(R.string.no), (dialog, which) -> {
//                    viewModel.fileObjectList.clear();
//                    binding.sendChat.setText("");
//                    binding.sendChat.setHint(getResources().getString(R.string.message_hint));
//                    dialog.cancel();
//                })
//                .setPositiveButton(getString(R.string.send), (dialog, id) -> {
//                    viewModel.sendMessage();
//                    dialog.cancel();
//                });
//        final AlertDialog alertDialog = builder.create();
//        alertDialog.show();
    }

//    @Override
//    public void launchActivityResult(int request, int resultCode, Intent result) {
//        super.launchActivityResult(request, resultCode, result);
//        if (result != null) {
//            if (request == Constants.FILE_TYPE_IMAGE) {
//                FileObject fileObject = FileOperations.getFileObject(requireActivity(), result, Constants.IMAGE, Constants.FILE_TYPE_IMAGE);
//                viewModel.fileObjectList.add(fileObject);
//                showAlertDialogWithAutoDismiss(getString(R.string.chat_image_selected));
//            }
//
//        }
//    }
}
