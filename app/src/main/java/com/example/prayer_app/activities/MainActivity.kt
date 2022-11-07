package com.example.prayer_app.activities


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.prayer_app.R
import com.google.android.material.appbar.MaterialToolbar


//import com.example.prayer_app.R.layout.activity_main
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
//    private Toolbar mToolbar;
    private lateinit var navController: NavController
    lateinit var topAppBar : MaterialToolbar

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        mToolbar = findViewById<>()
//        val secondActbutton = findViewById<Button>(R.id.GetStart)
//        secondActbutton.setOnClickListener {
//            val Intent = Intent(this, HomeActivity::class.java)
//            startActivity(Intent)
//        }

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        NavigationUI.setupWithNavController(bottomNavigationView, navController)

//        setupActionBarWithNavController(navController)


//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
//        navHostFragment.findNavController().run { toolbar.setupWithNavController( this, [AppBarConfiguration(graph))

//        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, MainFragment()).commit()
    }

    ////Comment It is Button Back
    override fun onSupportNavigateUp(): Boolean {
        val controller = findNavController(R.id.fragmentContainerView)
        return controller.navigateUp() || super.onSupportNavigateUp()
    }
}