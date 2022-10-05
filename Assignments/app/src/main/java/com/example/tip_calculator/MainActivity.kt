package com.example.tip_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tip_calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun convertCurrency(view: View) {
        if (binding.billTotal.text.isNotEmpty()) {
            val billAmount = binding.billTotal.text.toString().toFloat()
            val tenPercent = billAmount * 0.1
            val fifteenPercent = billAmount * 0.15
            val twentyPercent = billAmount * 0.2


            binding.textView.text = ""
            binding.textView5.text = "The tips are as follows:"
            binding.textView2.text = "10% = $tenPercent"
            binding.textView3.text = "15% = $fifteenPercent"
            binding.textView4.text = "20% = $twentyPercent"

        } else {
            binding.textView.text = "Please enter a bill amount"
            binding.textView2.text = ""
            binding.textView3.text = ""
            binding.textView4.text = ""
            binding.textView5.text = ""
        }

    }
    }