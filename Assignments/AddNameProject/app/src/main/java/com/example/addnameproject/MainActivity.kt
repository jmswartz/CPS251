package com.example.addnameproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.addnameproject.ui.main.MainFragment
import com.example.addnameproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

}
