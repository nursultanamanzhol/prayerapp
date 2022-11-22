package com.example.prayer_app.viewModal

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.prayer_app.model.UserModel


class QuranActivityViewModel: ViewModel() {
    lateinit var  recyclerListData: MutableLiveData<ArrayList<UserModel>>
    init{
        recyclerListData = MutableLiveData()
    }
    fun getRecyclerLisctDataObser(): MutableLiveData<ArrayList<UserModel>>{
        return recyclerListData
    }

}


