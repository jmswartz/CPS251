package com.example.addnameproject.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
   private var names: MutableLiveData<String> = MutableLiveData()
    private var namesList = ""





    fun setNames(value: String){


        names.setValue(value.toString()+" \n"+namesList)
        namesList=value.toString()+"\n"+namesList



    }

    fun getNames(): MutableLiveData<String> {
        return names

    }
}