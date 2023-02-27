package com.example.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sample.databinding.ActivityBannerBinding
import com.google.android.gms.ads.admanager.AdManagerAdRequest

class BannerActivity : AppCompatActivity() {
    private var _binding: ActivityBannerBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Binding not initialized")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityBannerBinding.inflate(layoutInflater)

        binding.finishButton.setOnClickListener {
            finish()
        }

        setContentView(binding.root)
        binding.adView.loadAd(AdManagerAdRequest.Builder().build())
    }

    override fun onDestroy() {
        binding.adView.destroy()
        _binding = null
        super.onDestroy()
    }
}
