package com.example.rickandmortyapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.rickandmortyapp.R
import com.example.rickandmortyapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        supportFragmentManager.beginTransaction().replace(R.id.container, principalFragment())
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()

    }

}