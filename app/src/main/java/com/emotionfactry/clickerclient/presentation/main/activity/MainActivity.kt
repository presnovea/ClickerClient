package com.emotionfactry.clickerclient.presentation.main.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emotionfactry.clickerclient.R
import com.emotionfactry.clickerclient.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}