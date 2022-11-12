package com.example.prayer_app.model

data class Version (val codeName: String, val version: String, val apiLevel: String, val description: String, var expandable : Boolean = false){
}