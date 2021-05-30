package com.example.fitness_abode.LoginScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import com.example.fitness_abode.R
import com.example.fitness_abode.databinding.ActivityLoginBinding
import com.example.fitness_abode.guest.GuestMainActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.IgnoreExtraProperties


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        supportActionBar?.hide()
        binding.btnRegLogin.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }
        binding.btnLogin.setOnClickListener {
            if(checkLogin()) {

            }
            else {
                Toast.makeText(this,"Invalid email or password",Toast.LENGTH_LONG).show()
                binding.emailLog.text = null
                binding.passLog.text = null
            }
        }
        binding.guest.setOnClickListener {
            startActivity(Intent(this,GuestMainActivity::class.java))
        }
    }

    private fun checkLogin(): Boolean {
        return true
    }
}