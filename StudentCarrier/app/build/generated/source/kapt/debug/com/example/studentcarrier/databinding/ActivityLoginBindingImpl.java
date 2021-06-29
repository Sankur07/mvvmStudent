package com.example.studentcarrier.databinding;
import com.example.studentcarrier.R;
import com.example.studentcarrier.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding implements com.example.studentcarrier.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lblTitle, 5);
        sViewsWithIds.put(R.id.lblEmailAnswer, 6);
        sViewsWithIds.put(R.id.lblPasswordAnswer, 7);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener txtEmailAddressandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of LoginViewModell.EmailAddress
            //         is LoginViewModell.setEmailAddress((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtEmailAddress);
            // localize variables for thread safety
            // LoginViewModell
            com.example.studentcarrier.LoginViewModel loginViewModell = mLoginViewModell;
            // LoginViewModell != null
            boolean loginViewModellJavaLangObjectNull = false;
            // LoginViewModell.EmailAddress
            java.lang.String loginViewModellEmailAddress = null;



            loginViewModellJavaLangObjectNull = (loginViewModell) != (null);
            if (loginViewModellJavaLangObjectNull) {




                loginViewModell.setEmailAddress(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of LoginViewModell.Password
            //         is LoginViewModell.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtPassword);
            // localize variables for thread safety
            // LoginViewModell
            com.example.studentcarrier.LoginViewModel loginViewModell = mLoginViewModell;
            // LoginViewModell != null
            boolean loginViewModellJavaLangObjectNull = false;
            // LoginViewModell.Password
            java.lang.String loginViewModellPassword = null;



            loginViewModellJavaLangObjectNull = (loginViewModell) != (null);
            if (loginViewModellJavaLangObjectNull) {




                loginViewModell.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            );
        this.btnLogin.setTag(null);
        this.lblTagline.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.txtEmailAddress.setTag(null);
        this.txtPassword.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.studentcarrier.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.example.studentcarrier.generated.callback.OnClickListener(this, 2);
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
        if (BR.LoginViewModell == variableId) {
            setLoginViewModell((com.example.studentcarrier.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginViewModell(@Nullable com.example.studentcarrier.LoginViewModel LoginViewModell) {
        this.mLoginViewModell = LoginViewModell;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.LoginViewModell);
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
        com.example.studentcarrier.LoginViewModel loginViewModell = mLoginViewModell;
        java.lang.String loginViewModellPassword = null;
        java.lang.String loginViewModellEmailAddress = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (loginViewModell != null) {
                    // read LoginViewModell.Password
                    loginViewModellPassword = loginViewModell.getPassword();
                    // read LoginViewModell.EmailAddress
                    loginViewModellEmailAddress = loginViewModell.getEmailAddress();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.btnLogin.setOnClickListener(mCallback3);
            this.lblTagline.setOnClickListener(mCallback4);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtEmailAddress, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtEmailAddressandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtPasswordandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmailAddress, loginViewModellEmailAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPassword, loginViewModellPassword);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // LoginViewModell
                com.example.studentcarrier.LoginViewModel loginViewModell = mLoginViewModell;
                // LoginViewModell != null
                boolean loginViewModellJavaLangObjectNull = false;



                loginViewModellJavaLangObjectNull = (loginViewModell) != (null);
                if (loginViewModellJavaLangObjectNull) {



                    loginViewModell.onClick(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // LoginViewModell
                com.example.studentcarrier.LoginViewModel loginViewModell = mLoginViewModell;
                // LoginViewModell != null
                boolean loginViewModellJavaLangObjectNull = false;



                loginViewModellJavaLangObjectNull = (loginViewModell) != (null);
                if (loginViewModellJavaLangObjectNull) {


                    loginViewModell.newRegistration();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): LoginViewModell
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}