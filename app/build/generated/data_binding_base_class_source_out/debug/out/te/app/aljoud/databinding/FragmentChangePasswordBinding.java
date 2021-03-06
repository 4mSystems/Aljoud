// Generated by data binding compiler. Do not edit!
package te.app.aljoud.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.aljoud.R;
import te.app.aljoud.customViews.views.CustomTextViewMedium;
import te.app.aljoud.customViews.views.CustomTextViewRegular;
import te.app.aljoud.pages.auth.changePassword.ChangePasswordViewModel;

public abstract class FragmentChangePasswordBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton appCompatButtonNext;

  @NonNull
  public final AppCompatImageView back;

  @NonNull
  public final AppCompatImageView icVerify;

  @NonNull
  public final TextInputLayout inputConfirmPassword;

  @NonNull
  public final TextInputLayout inputNewPassword;

  @NonNull
  public final TextInputLayout inputOldPassword;

  @NonNull
  public final CircularProgressIndicator progress;

  @NonNull
  public final CustomTextViewMedium tvChangeNewPassword;

  @NonNull
  public final CustomTextViewRegular tvLoginTitle1;

  @Bindable
  protected ChangePasswordViewModel mViewmodel;

  protected FragmentChangePasswordBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton appCompatButtonNext, AppCompatImageView back,
      AppCompatImageView icVerify, TextInputLayout inputConfirmPassword,
      TextInputLayout inputNewPassword, TextInputLayout inputOldPassword,
      CircularProgressIndicator progress, CustomTextViewMedium tvChangeNewPassword,
      CustomTextViewRegular tvLoginTitle1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appCompatButtonNext = appCompatButtonNext;
    this.back = back;
    this.icVerify = icVerify;
    this.inputConfirmPassword = inputConfirmPassword;
    this.inputNewPassword = inputNewPassword;
    this.inputOldPassword = inputOldPassword;
    this.progress = progress;
    this.tvChangeNewPassword = tvChangeNewPassword;
    this.tvLoginTitle1 = tvLoginTitle1;
  }

  public abstract void setViewmodel(@Nullable ChangePasswordViewModel viewmodel);

  @Nullable
  public ChangePasswordViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_change_password, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentChangePasswordBinding>inflateInternal(inflater, R.layout.fragment_change_password, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentChangePasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_change_password, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentChangePasswordBinding>inflateInternal(inflater, R.layout.fragment_change_password, null, false, component);
  }

  public static FragmentChangePasswordBinding bind(@NonNull View view) {
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
  public static FragmentChangePasswordBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentChangePasswordBinding)bind(component, view, R.layout.fragment_change_password);
  }
}
