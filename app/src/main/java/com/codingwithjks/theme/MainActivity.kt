package com.codingwithjks.theme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.switchmaterial.SwitchMaterial
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       Switch.setOnCheckedChangeListener { buttonView, isChecked ->
           if (isChecked)
           {
               AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
               text.text="Dark Theme"
           }
           else{
               AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
               text.text="Light Theme"
           }
       }

    }

}
