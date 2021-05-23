package com.example.fitness_abode.LoginScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import com.example.fitness_abode.R
import com.example.fitness_abode.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        supportActionBar?.hide()
        binding.btnRegLogin.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }
    }
}