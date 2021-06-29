package com.example.studentcarrier

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.studentcarrier.databinding.ActivityLoginBinding
import java.util.*

class LoginActivity : AppCompatActivity() {

    lateinit var loginViewModel: LoginViewModel
    lateinit var loginBinging: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginViewModel = ViewModelProvider(this, ViewModeFactory()).get(LoginViewModel::class.java)
        loginBinging = DataBindingUtil.setContentView(this, R.layout.activity_login)
        loginBinging.lifecycleOwner = this
        loginBinging.loginViewModell = loginViewModel
        loginViewModel.getStudent().observe(this, Observer {
            if (TextUtils.isEmpty(Objects.requireNonNull(it.emailAddress.toString()))) {
                loginBinging.txtEmailAddress.error = "Enter an E-Mail Address";
                loginBinging.txtEmailAddress.requestFocus()
            } else if (!it.isEmailValid()) {
                loginBinging.txtEmailAddress.error = "Enter a Valid E-mail Address";
                loginBinging.txtEmailAddress.requestFocus()
            } else if (TextUtils.isEmpty(Objects.requireNonNull(it.password.toString()))) {
                loginBinging.txtPassword.error = "Enter a Password"
                loginBinging.txtPassword.requestFocus()
            } else if (!it.isPassword()) {
                loginBinging.txtPassword.error = "Enter at least 8 Digit password";
                loginBinging.txtPassword.requestFocus();
            } else {
                loginBinging.lblEmailAnswer.text = loginViewModel.emailAddress.toString();
                loginBinging.lblPasswordAnswer.text = loginViewModel.password.toString();
            }
        })
        loginViewModel.liveData.observe(this, {
            gotoRegistrationActivity()
        })
    }
    private fun gotoRegistrationActivity() {
        startActivity(Intent(this@LoginActivity, RegistrationActivity::class.java))
    }
}