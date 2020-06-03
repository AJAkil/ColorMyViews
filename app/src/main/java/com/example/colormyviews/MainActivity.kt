package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.ColorLong
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                box_one_text, box_two_text, box_three_text, box_four_text, box_five_text,
                box_six_text, box_seven_text, box_eight_text,
                constrained_layout, red_button, green_button, yellow_button
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    // Todo add a randomize button

    // Todo might add sound functionality later

    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)


            // Boxes using the Android Color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_orange_dark)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_blue_light)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_purple)
            R.id.box_six_text -> view.setBackgroundResource(android.R.color.holo_blue_dark)
            R.id.box_seven_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_eight_text -> view.setBackgroundResource(android.R.color.holo_red_dark)

            // Boxes Using custom colors in the background
            R.id.red_button -> {
                box_three_text.setBackgroundResource(R.color.my_red)
                box_six_text.setBackgroundResource(android.R.color.holo_orange_dark)
            }
            R.id.green_button -> {
                box_five_text.setBackgroundResource(R.color.my_green)
                box_seven_text.setBackgroundResource(android.R.color.holo_purple)
            }

            R.id.yellow_button -> {
                box_four_text.setBackgroundResource(R.color.my_yellow)
                box_eight_text.setBackgroundResource(android.R.color.holo_blue_light)
            }
            R.id.box_two_text -> view.setBackgroundResource(R.color.box_two_custom)

            else -> view.setBackgroundResource(R.color.bg_color)
        }
    }
}