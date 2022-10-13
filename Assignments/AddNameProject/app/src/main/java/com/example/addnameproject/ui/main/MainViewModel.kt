package com.example.addnameproject.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
   private var names = ""


    fun setNames(value: String){

        this.names = value+" \n"+names

    }

    fun getNames(): String {
        return names

    }
}