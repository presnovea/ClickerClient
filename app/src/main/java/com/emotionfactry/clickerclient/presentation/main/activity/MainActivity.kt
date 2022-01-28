package com.emotionfactry.clickerclient.presentation.main.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emotionfactry.clickerclient.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}