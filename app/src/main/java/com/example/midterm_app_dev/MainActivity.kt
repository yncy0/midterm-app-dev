package com.example.midterm_app_dev

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = intent.getStringExtra("USERNAME")

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Set the initial fragment
        if (savedInstanceState == null) {
            val homeFragment = HomeFragment()
            val bundle = Bundle()
            bundle.putString("USERNAME", username)
            homeFragment.arguments = bundle
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, homeFragment)
                .commit()
        }

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.navigation_home -> {
                    val homeFragment = HomeFragment()
                    val bundle = Bundle()
                    bundle.putString("USERNAME", username)
                    homeFragment.arguments = bundle
                    selectedFragment = homeFragment
                }
                R.id.navigation_cart -> selectedFragment = CartFragment()
                R.id.navigation_orders -> selectedFragment = OrdersFragment()
            }

            if (selectedFragment != null) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, selectedFragment)
                    .commit()
            }

            true
        }
    }
}