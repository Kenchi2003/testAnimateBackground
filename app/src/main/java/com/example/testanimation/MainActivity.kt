package com.example.testanimation

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load the ImageView that will host the animation and
        // set its background to our AnimationDrawable XML resource.
        // Load the ImageView that will host the animation and
        // set its background to our AnimationDrawable XML resource.
        val img = findViewById<View>(R.id.imageView) as ImageView
        img.setBackgroundResource(R.drawable.animatebackground)

        // Get the background, which has been compiled to an AnimationDrawable object.

        // Get the background, which has been compiled to an AnimationDrawable object.
        val frameAnimation = img.background as AnimationDrawable

        // Start the animation (looped playback by default).

        // Start the animation (looped playback by default).
        frameAnimation.start()
    }
}