package com.example.afterlesson12.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UnitedViewModel : ViewModel() {
    private var name : MutableLiveData<String> = MutableLiveData<String>("")
    private var surname : MutableLiveData<String> = MutableLiveData<String>("")
    private var city : MutableLiveData<String> = MutableLiveData<String>("")

    fun updateName(fillingName: String) {
        name = MutableLiveData<String>(fillingName)
    }

    fun updateSurname(fillingSurname: String) {
        surname = MutableLiveData<String>(fillingSurname)
    }

    fun updateCity(fillingCity: String) {
        city = MutableLiveData<String>(fillingCity)
    }
    
}