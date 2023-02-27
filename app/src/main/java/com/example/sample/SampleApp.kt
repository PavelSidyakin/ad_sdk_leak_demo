package com.example.sample

import android.app.Application
import com.google.android.gms.ads.MobileAds

class SampleApp: Application() {

    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this)
    }
}