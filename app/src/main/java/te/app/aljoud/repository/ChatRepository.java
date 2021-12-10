package te.app.aljoud.repository;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import te.app.aljoud.connection.ConnectionHelper;
import te.app.aljoud.connection.FileObject;
import te.app.aljoud.model.base.Mutable;
import te.app.aljoud.pages.chat.model.ChatResponse;
import te.app.aljoud.pages.chat.model.ChatSendResponse;
import te.app.aljoud.pages.conversations.models.ConversationsResponse;
import te.app.aljoud.pages.courseDetails.models.AskRequest;
import te.app.aljoud.utils.Constants;
import te.app.aljoud.utils.URLS;
import io.reactivex.disposables.Disposable;

@Singleton
public class ChatRepository extends BaseRepository {

    @Inject
    ConnectionHelper connectionHelper;

    MutableLiveData<Mutable> liveData;

    @Inject
    public ChatRepository(ConnectionHelper connectionHelper) {
        this.connectionHelper = connectionHelper;
    }

    public void setLiveData(MutableLiveData<Mutable> liveData) {
        this.liveData = liveData;
        connectionHelper.liveData = liveData;
    }

    public Disposable getConversations(int page, boolean showProgress) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CONVERSATIONS + page, new Object(), ConversationsResponse.class,
                Constants.CONVERSATIONS, showProgress);
    }

    public Disposable getChat(int chatId) {
        return connectionHelper.requestApi(Constants.GET_REQUEST, URLS.CHAT + chatId, new Object(), ChatResponse.class,
                Constants.CHAT, true);
    }

    public Disposable sendChat(AskRequest request, List<FileObject> fileObjectList) {
        return connectionHelper.requestApi(URLS.SEND_MESSAGE, request, fileObjectList, ChatSendResponse.class,
                Constants.SEND_MESSAGE, true);
    }
}