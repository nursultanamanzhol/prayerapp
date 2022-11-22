package com.example.prayer_app.viewModal

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModelFactory(): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ToDoListViewModel::class.java)){
            return ToDoListViewModel() as T
        }
        throw IllegalArgumentException ("UnknownViewModel")
    }
}