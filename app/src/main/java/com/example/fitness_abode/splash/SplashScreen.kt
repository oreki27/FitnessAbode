package com.example.fitness_abode.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.fitness_abode.LoginScreen.LoginActivity
import com.example.fitness_abode.MainActivity
import com.example.fitness_abode.R
import com.example.fitness_abode.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  DataBindingUtil.setContentView(this,R.layout.activity_splash_screen)
        supportActionBar?.hide()


        Handler().postDelayed( {
            val intent = Intent(this@SplashScreen, LoginActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}