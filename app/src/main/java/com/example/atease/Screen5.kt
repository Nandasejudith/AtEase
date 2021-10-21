package com.example.atease


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atease.databinding.ActivityScreen5Binding


class Screen5 : AppCompatActivity() {
    lateinit var binding:ActivityScreen5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreen5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var name = binding.etName.text.toString()

        if (name.isEmpty()) {
            binding.etEmail.setError("Name Required")

       }

        var etPassword= binding.etPassword.text.toString()

        if (etPassword.isEmpty()) {
            binding.etPassword.setError("Password  is required")
        }

        binding.btnsignup.setOnClickListener {
            var intent = Intent(baseContext, signup::class.java)
            startActivity(intent)
        }
    }
}
