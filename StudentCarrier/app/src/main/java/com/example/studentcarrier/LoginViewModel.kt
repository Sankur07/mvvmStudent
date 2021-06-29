package com.example.studentcarrier

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    public var emailAddress: String?=null
    public var password: String?=null
     var studentMutableLiveData: MutableLiveData<LoginStudent> = MutableLiveData<LoginStudent>()

    private val mutableLiveDataRegistration = MutableLiveData<LoginState>()
    val liveData: LiveData<LoginState>get() = mutableLiveDataRegistration

    public fun getStudent(): MutableLiveData<LoginStudent> {
        return studentMutableLiveData
    }

    public fun onClick(view: View): Unit {
        val loginStudent: LoginStudent = LoginStudent(emailAddress.toString(), password.toString())
        studentMutableLiveData.postValue(loginStudent)
    }

    public fun newRegistration():Unit{
        mutableLiveDataRegistration.postValue(LoginState.RegistrationActivity)
    }
}
sealed class LoginState {
    object RegistrationActivity : LoginState()
}