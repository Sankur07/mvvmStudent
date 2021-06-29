package com.example.studentcarrier

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegisterViewModel : ViewModel() {

    public var name: String? = ""
    public var emailAddress: String? = ""
    public var password: String? = ""
    public var confirmPassword: String? = ""
    public var mutableLiveData = MutableLiveData<RegisterModel>()

    public fun getRegistrationDetail(): MutableLiveData<RegisterModel> {
        return mutableLiveData
    }

    public fun onClickRegister(view: View) {
        val registerInfo = RegisterModel(
            name.toString(),
            emailAddress.toString(),
            password.toString(),
            confirmPassword.toString()
        )
        mutableLiveData.postValue(registerInfo)
    }

    public fun moveLogin() {

    }
}