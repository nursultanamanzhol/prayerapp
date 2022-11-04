package com.example.prayer_app.activities


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

import com.example.prayer_app.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        NavigationUI.setupWithNavController(bottomNavigationView, navController)


//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        val cont = findNavController(R.id.fragmentContainerView)
//        val navigationView = findNavController(R.id.fragmentContainerView)

//        val appBarConfiguration =
//            AppBarConfiguration(setOf(R.id.mainFragment, R.id.libraryActivity, R.id.settings))
//        setupActionBarWithNavController(navHostFragment, appBarConfiguration)
//
//        bottomNavigationView.setupWithNavController(navController)

    }
}