package com.example.studentcarrier

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowInsetsController
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val SplashViewModel =
            ViewModelProvider(this, ViewModeFactory()).get(SplashViewModel::class.java)
        SplashViewModel.liveData.observe(this, Observer {
            when (it) {
                is SplashState.LoginActivity -> {
                    gotoLoginActivity();
                }
            }
        })
    }

    private fun gotoLoginActivity() {
        finish()
        startActivity(Intent(this@SplashActivity, LoginActivity::class.java))

    }
}