package com.example.prayer_app.viewModal

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ZikirActivityViewModel: ViewModel() {
    //var countZ =0
    var countZ = MutableLiveData(0)

    fun updateCountZ(){
     //   ++countZ
        countZ.value = (countZ.value)?.plus(1)

    }

    fun restartCountZ(){
        //   ++countZ
        countZ.value = 0

    }
}