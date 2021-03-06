// Generated by data binding compiler. Do not edit!
package te.app.aljoud.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.lang.Deprecated;
import java.lang.Object;
import te.app.aljoud.R;
import te.app.aljoud.pages.fawaterkPayment.viewModels.PaymentsViewModel;

public abstract class FragmentPaymentMethodsBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton next;

  @NonNull
  public final RecyclerView recMarket;

  @Bindable
  protected PaymentsViewModel mViewmodel;

  protected FragmentPaymentMethodsBinding(Object _bindingComponent, View _root,
      int _localFieldCount, MaterialButton next, RecyclerView recMarket) {
    super(_bindingComponent, _root, _localFieldCount);
    this.next = next;
    this.recMarket = recMarket;
  }

  public abstract void setViewmodel(@Nullable PaymentsViewModel viewmodel);

  @Nullable
  public PaymentsViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static FragmentPaymentMethodsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_payment_methods, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPaymentMethodsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentPaymentMethodsBinding>inflateInternal(inflater, R.layout.fragment_payment_methods, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPaymentMethodsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_payment_methods, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentPaymentMethodsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentPaymentMethodsBinding>inflateInternal(inflater, R.layout.fragment_payment_methods, null, false, component);
  }

  public static FragmentPaymentMethodsBinding bind(@NonNull View view) {
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
  public static FragmentPaymentMethodsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentPaymentMethodsBinding)bind(component, view, R.layout.fragment_payment_methods);
  }
}
