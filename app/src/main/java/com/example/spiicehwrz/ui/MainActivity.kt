package com.example.spiicehwrz.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spiicehwrz.R
import com.example.spiicehwrz.repositories.SharedPreferenceRepository
import com.example.spiicehwrz.utilities.replaceFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.replaceFragment(R.id.container, StartFragment())
      /*  if (SharedPreferenceRepository.isFirstOpen()) {
            SharedPreferenceRepository.setIsFirstOpen(false)
            supportFragmentManager.replaceFragment(R.id.container, LogFragment())
        } else {
            supportFragmentManager.replaceFragment(R.id.container, StartFragment())
        }*/
    }
}