package com.bitcode.a30_12_24_communicationbetweenfragments

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bitcode.a30_12_24_communicationbetweenfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var fragmentFirst: FirstFragment
    private lateinit var fragmentSecond: SecondFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        fragmentFirst = supportFragmentManager.findFragmentById(R.id.fragmentFirst)
                as FirstFragment
        fragmentSecond = supportFragmentManager.findFragmentById(R.id.fragmentSecond)
                as SecondFragment
    }

    fun sendDataToSecondFragment(text : String){
        fragmentSecond.text2 = text
    }

    fun sendDataToFirstFragment(text : String){
        fragmentFirst.text1 = text
    }
}