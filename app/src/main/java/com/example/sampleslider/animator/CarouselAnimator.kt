package com.example.sampleslider.animator

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.content.Context

class CarouselAnimator(private val context: Context) {
    companion object {
        private const val ANIMATION_DURATION = 2000
    }

    val slideIn: ObjectAnimator
        get() {
            val animator = ObjectAnimator.ofPropertyValuesHolder(
                Any(),
                translationX(getDisplayWidth(), 0),
                alpha(0f, 1f),
            )
            animator.duration = ANIMATION_DURATION.toLong()
            return animator
        }

    val slideOut: ObjectAnimator
        get() {
            val animator = ObjectAnimator.ofPropertyValuesHolder(
                Any(),
                translationX(0, (getDisplayWidth() * (-1))),
                alpha(1f, 0f),
            )
            animator.duration = ANIMATION_DURATION.toLong()
            return animator
        }

    private fun translationX(fromX: Int, toX: Int) = PropertyValuesHolder.ofFloat(
        "translationX",
        fromX.toFloat(),
        toX.toFloat(),
    )

    private fun alpha(from: Float, to: Float) = PropertyValuesHolder.ofFloat(
        "alpha",
        from,
        to,
    )

    private fun getDisplayWidth() = context.resources.displayMetrics.widthPixels
}
