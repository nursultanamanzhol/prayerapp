package com.example.prayer_app
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact(
    val firstName: String,
<<<<<<< HEAD
    val lastName: String,
=======
    val lassName: String,
>>>>>>> origin/nussultan_goOn
    val phoneNumber: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
