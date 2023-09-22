package com.example.ayushstartuphub.Activity

import adapters.TabsAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ayushstartuphub.R
import com.example.ayushstartuphub.databinding.ActivityAyushDepartmentBinding
import com.example.ayushstartuphub.databinding.ActivityHomeBinding
import com.google.android.material.tabs.TabLayoutMediator

class AyushDepartmentActivity : AppCompatActivity() {
    private lateinit var binding:ActivityAyushDepartmentBinding
    var tabTitle= arrayOf("Startups","Investors","Mentors")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAyushDepartmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name=intent.getStringExtra("name")
        val image=intent.getIntExtra("image",R.drawable.homeopathy)
        binding.departmentName.setText(name)
        binding.itemImage.setImageResource(image)
        binding.fragmentHolder.adapter=TabsAdapter(supportFragmentManager, lifecycle)
        TabLayoutMediator(binding.topTabs,binding.fragmentHolder){
             tab,position->tab.text=tabTitle[position]
        }.attach()
    }
}