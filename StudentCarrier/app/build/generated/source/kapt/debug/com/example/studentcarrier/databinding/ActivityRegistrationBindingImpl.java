package com.example.studentcarrier.databinding;
import com.example.studentcarrier.R;
import com.example.studentcarrier.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRegistrationBindingImpl extends ActivityRegistrationBinding implements com.example.studentcarrier.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_logo, 7);
        sViewsWithIds.put(R.id.tv_subtitle, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerViewModel.emailAddress
            //         is registerViewModel.setEmailAddress((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etEmail);
            // localize variables for thread safety
            // registerViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // registerViewModel
            com.example.studentcarrier.RegisterViewModel registerViewModel = mRegisterViewModel;
            // registerViewModel.emailAddress
            java.lang.String registerViewModelEmailAddress = null;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {




                registerViewModel.setEmailAddress(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerViewModel.name
            //         is registerViewModel.setName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etName);
            // localize variables for thread safety
            // registerViewModel.name
            java.lang.String registerViewModelName = null;
            // registerViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // registerViewModel
            com.example.studentcarrier.RegisterViewModel registerViewModel = mRegisterViewModel;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {




                registerViewModel.setName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerViewModel.password
            //         is registerViewModel.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etPassword);
            // localize variables for thread safety
            // registerViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // registerViewModel
            com.example.studentcarrier.RegisterViewModel registerViewModel = mRegisterViewModel;
            // registerViewModel.password
            java.lang.String registerViewModelPassword = null;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {




                registerViewModel.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener etRepasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of registerViewModel.confirmPassword
            //         is registerViewModel.setConfirmPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etRepassword);
            // localize variables for thread safety
            // registerViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // registerViewModel
            com.example.studentcarrier.RegisterViewModel registerViewModel = mRegisterViewModel;
            // registerViewModel.confirmPassword
            java.lang.String registerViewModelConfirmPassword = null;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {




                registerViewModel.setConfirmPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityRegistrationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityRegistrationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[5]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            );
        this.btnRegister.setTag(null);
        this.etEmail.setTag(null);
        this.etName.setTag(null);
        this.etPassword.setTag(null);
        this.etRepassword.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.swipeLeft.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.studentcarrier.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.example.studentcarrier.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.registerViewModel == variableId) {
            setRegisterViewModel((com.example.studentcarrier.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRegisterViewModel(@Nullable com.example.studentcarrier.RegisterViewModel RegisterViewModel) {
        this.mRegisterViewModel = RegisterViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.registerViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String registerViewModelPassword = null;
        java.lang.String registerViewModelName = null;
        com.example.studentcarrier.RegisterViewModel registerViewModel = mRegisterViewModel;
        java.lang.String registerViewModelEmailAddress = null;
        java.lang.String registerViewModelConfirmPassword = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (registerViewModel != null) {
                    // read registerViewModel.password
                    registerViewModelPassword = registerViewModel.getPassword();
                    // read registerViewModel.name
                    registerViewModelName = registerViewModel.getName();
                    // read registerViewModel.emailAddress
                    registerViewModelEmailAddress = registerViewModel.getEmailAddress();
                    // read registerViewModel.confirmPassword
                    registerViewModelConfirmPassword = registerViewModel.getConfirmPassword();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnRegister.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etRepassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etRepasswordandroidTextAttrChanged);
            this.swipeLeft.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etEmail, registerViewModelEmailAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etName, registerViewModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPassword, registerViewModelPassword);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etRepassword, registerViewModelConfirmPassword);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // registerViewModel != null
                boolean registerViewModelJavaLangObjectNull = false;
                // registerViewModel
                com.example.studentcarrier.RegisterViewModel registerViewModel = mRegisterViewModel;



                registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
                if (registerViewModelJavaLangObjectNull) {



                    registerViewModel.onClickRegister(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // registerViewModel != null
                boolean registerViewModelJavaLangObjectNull = false;
                // registerViewModel
                com.example.studentcarrier.RegisterViewModel registerViewModel = mRegisterViewModel;



                registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
                if (registerViewModelJavaLangObjectNull) {


                    registerViewModel.moveLogin();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): registerViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}