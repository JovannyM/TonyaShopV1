package com.example.tonyashop

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import android.view.WindowManager
import android.widget.Button
import android.widget.Spinner
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.navFrament) as NavHostFragment? ?: return
        navController = host.navController

        findViewById<Button>(R.id.button).setOnClickListener { view ->
            host.navController.navigate(R.id.shop);
        }

        findViewById<Button>(R.id.button2).setOnClickListener { view ->
            host.navController.navigate(R.id.item);
        }

        val pupovina = findViewById<Spinner>(R.id.spinner);
        pupovina[]
    }
}
