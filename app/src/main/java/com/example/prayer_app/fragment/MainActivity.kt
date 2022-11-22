package com.example.prayer_app.fragment


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.prayer_app.R
import com.example.prayer_app.databinding.ActivityMainBinding

import com.google.android.material.appbar.MaterialToolbar


//import com.example.prayer_app.R.layout.activity_main
import com.google.android.material.bottomnavigation.BottomNavigationView

public class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //    private Toolbar mToolbar;
    private lateinit var navController: NavController
    lateinit var topAppBar: MaterialToolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "الله"
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        NavigationUI.setupWithNavController(bottomNavigationView, navController)

//        setupActionBarWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.LogOut -> {
                finish()
            }

            R.id.help -> {
                Toast.makeText(this, "Log out", Toast.LENGTH_SHORT).show()
            }

            R.id.homm -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

        return super.onOptionsItemSelected(item)
    }

//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
//        navHostFragment.findNavController().run { toolbar.setupWithNavController( this, [AppBarConfiguration(graph))

//        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, MainFragment()).commit()


    ////Comment It is Button Back
    override fun onSupportNavigateUp(): Boolean {
        val controller = findNavController(R.id.fragmentContainerView)
        return controller.navigateUp() || super.onSupportNavigateUp()
    }
//    override

}