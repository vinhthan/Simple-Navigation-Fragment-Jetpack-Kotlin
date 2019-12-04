package com.example.androidtriviastarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //them nut back tren thanh toolbar
        val navController = this.findNavController(R.id.fr1)

        NavigationUI.setupActionBarWithNavController(this, navController)

        //them navigation drawer
        NavigationUI.setupWithNavController(navView, navController)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.fr1)
        //return navController.navigateUp()//them nut back tren thanh toolbar
        return NavigationUI.navigateUp(navController, drawerLayout)//k co navigation drawer thi k can dong nay
    }
    //them nut back tren thanh toolbar

}
//<!--bat buoc phai co id fragment owr trong activity_main-->