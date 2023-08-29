package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// import android.text.Editable
import android.view.View
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // important

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.buttonSayHello.setOnClickListener {
            val name = binding.editTextName.text.trim().toString()
            if (name == "") {
              binding.editTextName.error = "Skriv et navn"
              return@setOnClickListener
            } else
                binding.textviewMessage.text = "Hello $name!"
        }

    }
}