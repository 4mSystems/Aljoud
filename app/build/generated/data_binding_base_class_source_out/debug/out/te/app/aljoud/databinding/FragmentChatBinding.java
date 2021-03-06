// Generated by data binding compiler. Do not edit!
package te.app.aljoud.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.aljoud.R;
import te.app.aljoud.customViews.views.CustomTextViewMedium;
import te.app.aljoud.customViews.views.CustomTextViewRegular;
import te.app.aljoud.pages.chat.viewmodel.ChatViewModel;

public abstract class FragmentChatBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView attach;

  @NonNull
  public final CardView cardInfo;

  @NonNull
  public final AppCompatButton chatActions;

  @NonNull
  public final AppCompatImageView more;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final RecyclerView rcChat;

  @NonNull
  public final RecyclerView rcFiles;

  @NonNull
  public final TextInputEditText sendChat;

  @NonNull
  public final CustomTextViewRegular tvCreatedAt;

  @NonNull
  public final CustomTextViewRegular tvDesc;

  @NonNull
  public final CustomTextViewMedium tvFrom;

  @NonNull
  public final CustomTextViewMedium tvFromValue;

  @NonNull
  public final CustomTextViewMedium tvReplies;

  @NonNull
  public final CustomTextViewMedium tvTo;

  @NonNull
  public final CustomTextViewMedium tvToValue;

  @Bindable
  protected ChatViewModel mViewmodel;

  protected FragmentChatBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView attach, CardView cardInfo, AppCompatButton chatActions,
      AppCompatImageView more, ProgressBar progress, RecyclerView rcChat, RecyclerView rcFiles,
      TextInputEditText sendChat, CustomTextViewRegular tvCreatedAt, CustomTextViewRegular tvDesc,
      CustomTextViewMedium tvFrom, CustomTextViewMedium tvFromValue, CustomTextViewMedium tvReplies,
      CustomTextViewMedium tvTo, CustomTextViewMedium tvToValue) {
    super(_bindingComponent, _root, _localFieldCount);
    this.attach = attach;
    this.cardInfo = cardInfo;
    this.chatActions = chatActions;
    this.more = more;
    this.progress = progress;
    this.rcChat = rcChat;
    this.rcFiles = rcFiles;
    this.sendChat = sendChat;
    this.tvCreatedAt = tvCreatedAt;
    this.tvDesc = tvDesc;
    this.tvFrom = tvFrom;
    this.tvFromValue = tvFromValue;
    this.tvReplies = tvReplies;
    this.tvTo = tvTo;
    this.tvToValue = tvToValue;
  }

  public abstract void setViewmodel(@Nullable ChatViewModel viewmodel);

  @Nullable
  public ChatViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_chat, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentChatBinding>inflateInternal(inflater, R.layout.fragment_chat, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_chat, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentChatBinding>inflateInternal(inflater, R.layout.fragment_chat, null, false, component);
  }

  public static FragmentChatBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentChatBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentChatBinding)bind(component, view, R.layout.fragment_chat);
  }
}
