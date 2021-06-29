package com.example.studentcarrier

import androidx.annotation.NonNull
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModeFactory : ViewModelProvider.Factory {

    @SuppressWarnings("unchecked")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
         if (modelClass.isAssignableFrom(SplashViewModel::class.java)) {
             return SplashViewModel() as T
        }
        else if(modelClass.isAssignableFrom(LoginViewModel::class.java)){

             return LoginViewModel()as T
        }
         else if(modelClass.isAssignableFrom(RegisterViewModel::class.java)){

             return RegisterViewModel()as T
         }else{
              throw IllegalArgumentException("ViewModel Not Found")
        }
    }

}