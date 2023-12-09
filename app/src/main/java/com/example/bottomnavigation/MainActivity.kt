package com.example.bottomnavigasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.bottomnavigation.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bottomNavigationView = findViewById(R.id.bottom_navigasi)
        bottomNavigationView.setOnNavigationItemSelectedListener {item ->
            var selectedFragment: Fragment? = null

            when (item.itemId) {
                R.id.beranda -> selectedFragment = HomeFragment()
                R.id.event -> selectedFragment = JadwalFragment()
                R.id.profil -> selectedFragment = ProfileFragment()
                R.id.setting -> selectedFragment = PengaturanFragment()
            }

            if (selectedFragment != null) {
                val fragmentManager: FragmentManager = supportFragmentManager
                fragmentManager.beginTransaction()
                    .replace(R.id.framelayout, selectedFragment)
                    .commit()
            }

            true
        }
    }
}