package com.muharremtopakkaya.kotlinlearn


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        val navController = findNavController(R.id.nav_host_fragment)
        if (navController.currentDestination?.id == R.id.homeFragment) {
            // Eğer şu anki fragment HomeFragment ise, uygulamadan çık
            finish()
        } else {
            // Diğer durumlarda normal geri tuşu davranışını uygula
            super.onBackPressed()
        }
    }

}