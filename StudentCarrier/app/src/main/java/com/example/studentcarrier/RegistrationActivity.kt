package com.example.studentcarrier

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.studentcarrier.databinding.ActivityRegistrationBinding
import java.util.*

class RegistrationActivity : AppCompatActivity() {
    lateinit var registerationViewModel:RegisterViewModel
    lateinit var registerationBinding:ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerationViewModel=ViewModelProvider(this,ViewModeFactory()).get(RegisterViewModel::class.java)
        registerationBinding=DataBindingUtil.setContentView(this,R.layout.activity_registration)
        registerationBinding.lifecycleOwner=this
        registerationBinding.registerViewModel=registerationViewModel
        registerationViewModel.getRegistrationDetail().observe(this, Observer {
            if (TextUtils.isEmpty(Objects.requireNonNull(it.name.toString()))) {
                registerationBinding.etName.error = "Enter student Name";
                registerationBinding.etName.requestFocus()
            }
           else if (TextUtils.isEmpty(Objects.requireNonNull(it.emailAddress.toString()))) {
                registerationBinding.etEmail.error = "Enter an E-Mail Address";
                registerationBinding.etEmail.requestFocus()
            } else if (!it.isValidEmail()) {
                registerationBinding.etEmail.error = "Enter a Valid E-mail Address";
                registerationBinding.etName.requestFocus()
            } else if (TextUtils.isEmpty(Objects.requireNonNull(it.password.toString()))) {
                registerationBinding.etPassword.error = "Enter a Password"
                registerationBinding.etPassword.requestFocus()
            }
            else if (!it.isValidPassword()) {
                registerationBinding.etPassword.error = "Enter at least 8 Digit password";
                registerationBinding.etPassword.requestFocus();
            }
            else if (TextUtils.isEmpty(Objects.requireNonNull(it.confirmPassword.toString()))) {
                registerationBinding.etRepassword.error = "Enter confirm Password"
                registerationBinding.etRepassword.requestFocus()
            }
            else if (!it.matchConfirm()) {
                registerationBinding.etRepassword.error = "Password and confirm Password should be same"
                registerationBinding.etRepassword.requestFocus()
            }
        })
    }
}