package com.example.studentcarrier

import android.util.Patterns
import androidx.lifecycle.MutableLiveData

data class LoginStudent(val emailAddress: String, val password: String) {

    public fun isEmailValid(): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(emailAddress.toString()).matches()
    }

    public fun isPassword(): Boolean {
        return password.toString().length > 7
    }
}