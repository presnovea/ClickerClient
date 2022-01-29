package com.emotionfactry.clickerclient

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class ClickerApplication: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}