// Generated by data binding compiler. Do not edit!
package com.example.studentcarrier.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.studentcarrier.R;
import com.example.studentcarrier.RegisterViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRegistrationBinding extends ViewDataBinding {
  @NonNull
  public final Button btnRegister;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etName;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final EditText etRepassword;

  @NonNull
  public final TextView swipeLeft;

  @NonNull
  public final TextView tvLogo;

  @NonNull
  public final TextView tvSubtitle;

  @Bindable
  protected RegisterViewModel mRegisterViewModel;

  protected ActivityRegistrationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnRegister, EditText etEmail, EditText etName, EditText etPassword,
      EditText etRepassword, TextView swipeLeft, TextView tvLogo, TextView tvSubtitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnRegister = btnRegister;
    this.etEmail = etEmail;
    this.etName = etName;
    this.etPassword = etPassword;
    this.etRepassword = etRepassword;
    this.swipeLeft = swipeLeft;
    this.tvLogo = tvLogo;
    this.tvSubtitle = tvSubtitle;
  }

  public abstract void setRegisterViewModel(@Nullable RegisterViewModel registerViewModel);

  @Nullable
  public RegisterViewModel getRegisterViewModel() {
    return mRegisterViewModel;
  }

  @NonNull
  public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_registration, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRegistrationBinding>inflateInternal(inflater, R.layout.activity_registration, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_registration, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRegistrationBinding>inflateInternal(inflater, R.layout.activity_registration, null, false, component);
  }

  public static ActivityRegistrationBinding bind(@NonNull View view) {
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
  public static ActivityRegistrationBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityRegistrationBinding)bind(component, view, R.layout.activity_registration);
  }
}
