package com.example.prayer_app

import androidx.lifecycle.ViewModel

class ZikirActivityViewModel: ViewModel() {
    var countZ =0

    fun updateCountZ(){
        ++countZ
    }
}