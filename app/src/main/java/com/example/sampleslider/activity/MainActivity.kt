package com.example.sampleslider.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sampleslider.R
import com.example.sampleslider.adapter.CarouselAdapter
import com.example.sampleslider.databinding.ActivityMainBinding
import com.example.sampleslider.model.carouselList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object {
        const val TIME_TO_FLIP = 2000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setupCarousel()
        setContentView(binding.root)
    }

    private fun setupCarousel() {
        binding.carousel.adapter = CarouselAdapter(carouselList)
        binding.carousel.flipInterval = TIME_TO_FLIP
        binding.carousel.startFlipping()
    }
}
