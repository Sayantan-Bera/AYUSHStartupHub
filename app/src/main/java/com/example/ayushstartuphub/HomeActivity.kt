package com.example.ayushstartuphub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.ayushstartuphub.Activity.Chatbot
import com.example.ayushstartuphub.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding:ActivityHomeBinding
    private var curPos:Int = 0
    private lateinit var navController:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottomNavigationView=binding.bottomNav
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
        navController = navHostFragment.navController
        bottomNavigationView.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            when (destination.id) {
                R.id.fragmentLogin -> curPos = 0
                R.id.fragmentLogin -> curPos = 1
            }
        }
        getListner(binding)
          }

    private fun getListner(binding: ActivityHomeBinding) {

        binding.botButton.setOnClickListener(View.OnClickListener { view ->
            val intent = Intent(this, Chatbot::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            startActivity(intent)
        })

    }

    override fun onBackPressed() {
//        super.onBackPressed()
        if(curPos==0){
            finish()
        }else{
            navController.navigate(R.id.fragmentLogin)
//         Toast.makeText(this,"curPos $curPos", Toast.LENGTH_LONG).show()
        }
    }
}