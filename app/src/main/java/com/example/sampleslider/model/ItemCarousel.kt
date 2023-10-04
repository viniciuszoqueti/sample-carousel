package com.example.sampleslider.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.sampleslider.R

data class ItemCarousel(
    @StringRes
    val title: Int,
    @DrawableRes
    val image: Int,
)

val carouselList = listOf(
    ItemCarousel(title = R.string.title1, image = R.drawable.eye),
    ItemCarousel(title = R.string.title2, image = R.drawable.calendar),
    ItemCarousel(title = R.string.title3, image = R.drawable.camera),
)
