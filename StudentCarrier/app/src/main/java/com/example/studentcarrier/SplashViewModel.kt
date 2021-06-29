package com.example.studentcarrier

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {
    val liveData: LiveData<SplashState>
        get() = mutableLiveData
    private val mutableLiveData = MutableLiveData<SplashState>()
    private val activityScope = CoroutineScope(Dispatchers.Main)

    init {
        activityScope.launch {
            delay(3000)
            mutableLiveData.postValue(SplashState.LoginActivity)
        }
    }

}

sealed class SplashState {
    object LoginActivity : SplashState()
}