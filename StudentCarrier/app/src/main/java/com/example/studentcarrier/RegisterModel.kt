package com.example.studentcarrier

import android.util.Patterns

data class RegisterModel(
    val name: String,
    val emailAddress: String,
    val password: String,
    val confirmPassword: String
) {


    public fun isValidEmail(): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches()
    }

    public fun isValidPassword(): Boolean {
        return password.length > 7
    }

    public fun matchConfirm(): Boolean {
        return password.equals(confirmPassword)
    }
}