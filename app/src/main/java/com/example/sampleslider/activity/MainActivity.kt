package com.example.sampleslider.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sampleslider.adapter.CarouselAdapter
import com.example.sampleslider.animator.CarouselAnimator
import com.example.sampleslider.databinding.ActivityMainBinding
import com.example.sampleslider.model.carouselList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object {
        private const val TIME_TO_FLIP = 3000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setupCarousel()
        setContentView(binding.root)
    }

    private fun setupCarousel() {
        val carouselAnimator = CarouselAnimator(this)
        binding.carousel.inAnimation = carouselAnimator.slideIn
        binding.carousel.outAnimation = carouselAnimator.slideOut
        binding.carousel.adapter = CarouselAdapter(carouselList)
        binding.carousel.flipInterval = TIME_TO_FLIP
        binding.carousel.startFlipping()
    }
}
