package com.example.fitness_abode.LoginScreen

import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.fitness_abode.R
import com.example.fitness_abode.classesAndUtilities.User
import com.example.fitness_abode.classesAndUtilities.isValidEmail
import com.example.fitness_abode.databinding.ActivityRegisterBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.coroutines.delay

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRegisterBinding
    private lateinit var database: DatabaseReference



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register)
        supportActionBar?.hide()

        binding.btnLogRegister.setOnClickListener {
            onBackPressed()
        }

        binding.btnRegister.setOnClickListener{
            if(checkRegister()) {
                var user: User = User(binding.nameReg.text.toString(), binding.emailReg.text.toString(), binding.passReg.text.toString())
//                binding.btnRegister.text = user.name
                database = FirebaseDatabase.getInstance().reference

                val key = user.name.toString()
                val it: List<String?> = mutableListOf(user.email.toString(), user.password.toString())
                val usersRef : DatabaseReference = database.child("Users")
                val users: Map<String, User> = HashMap()

                database.child("Users").push().key
                database.child("Users").child(user.name.toString()).setValue(it)

                Toast.makeText(this,"User Registered",Toast.LENGTH_LONG).show()
                Handler().postDelayed({
                    onBackPressed()
                }, 1000)
            }
            else {
                Toast.makeText(this,"Enter valid details",Toast.LENGTH_LONG).show()
                binding.nameReg.text = null
                binding.emailReg.text = null
                binding.passReg.text = null
            }
        }
    }

    private fun checkRegister(): Boolean {
        return !(binding.nameReg.text.isNullOrBlank()) && (isValidEmail(binding.emailReg.text)) && (binding.passReg.length() >= 8)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
    }
}