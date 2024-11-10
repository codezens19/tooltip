package com.example.tooltips

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.skydoves.balloon.ArrowOrientation
import com.skydoves.balloon.Balloon
import com.skydoves.balloon.BalloonAnimation
import com.skydoves.balloon.showAlignTop
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val balloon = Balloon.Builder(baseContext).apply {
            setWidthRatio(0.50f)
            setHeight(65)
            setArrowSize(10)
            setArrowOrientation(ArrowOrientation.BOTTOM)
            setArrowVisible(true)
            setArrowPosition(0.5f)
            setTextSize(15f)
            setCornerRadius(4f)
            setAlpha(0.9f)
            setTextColor(ContextCompat.getColor(baseContext, R.color.white))
            setBalloonAnimation(BalloonAnimation.FADE)
            setLifecycleOwner(this@MainActivity)
            setAutoDismissDuration(5_000L)
        }

        facebook.setOnClickListener {
            balloon.apply {
                setText("Facebook Login")
                setBackgroundColor(ContextCompat.getColor(baseContext, R.color.facebook))
            }
            it.showAlignTop(balloon.build())
        }

        twitter.setOnClickListener {
            balloon.apply {
                setText("Twitter Login")
                setBackgroundColor(ContextCompat.getColor(baseContext, R.color.twitter))
            }
            it.showAlignTop(balloon.build())
        }

        instagram.setOnClickListener {
            balloon.apply {
                setText("Instagram Login")
                setBackgroundColor(ContextCompat.getColor(baseContext, R.color.instagram))
            }
            it.showAlignTop(balloon.build())
        }

        google.setOnClickListener {
            balloon.apply {
                setText("Google Login")
                setBackgroundColor(ContextCompat.getColor(baseContext, R.color.google))
            }
            it.showAlignTop(balloon.build())
        }
    }
}