package com.example.lifecycleawareness.ui.main

import android.icu.util.Calendar
import android.util.Log
import androidx.lifecycle.*
import com.example.lifecycleawareness.DemoObserver
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*

class MainViewModel : ViewModel() {
    companion object {
        private var names: MutableLiveData<String> = MutableLiveData("")

        fun setNames(value: String) {

            names.value = names.value  + value


        }



    }
    fun getNames(): MutableLiveData<String> {
        return names

    }
}