package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.graphics.toColor
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickBox()
        //clickButtons()
    }

    // This can be added to the existing function "clickBox()".
    /*
    private fun clickButtons() {
        val buttons = listOf(button_red, button_yellow, button_green)

        for (button in buttons) {
            button.setOnClickListener {
                when (it.id) {
                    R.id.button_red -> box_three_text.setBackgroundColor(Color.RED)
                    R.id.button_yellow -> box_four_text.setBackgroundColor(Color.YELLOW)
                    R.id.button_green -> box_five_text.setBackgroundColor(Color.GREEN)

                }
            }
        }
    }*/

    private fun clickBox() {
        // Create a list of box IDs so that we can iterate through them:
        // Note: don't have to specify the type of the collection, Kotlin will automatically
        //       change the type according to the types of elements you have in the list (try to
        //       add/delete "main_page" from the list and see how the type changes.
        val boxIdList = listOf(box_one_text, box_two_text, box_three_text,
            box_four_text, box_five_text, main_page, button_red, button_yellow, button_green)

        // Iterate through each box:
        for (box in boxIdList) {
            box.setOnClickListener{
                when (it.id) {
                    // Boxes using Color class colors for background
                    R.id.box_one_text -> it.setBackgroundColor(Color.DKGRAY)
                    R.id.box_two_text -> it.setBackgroundColor(Color.GRAY)

                    // Boxes using Android color resources for background
                    R.id.box_three_text -> it.setBackgroundResource(android.R.color.holo_green_light)
                    R.id.box_four_text -> it.setBackgroundResource(android.R.color.holo_green_dark)
                    R.id.box_five_text -> it.setBackgroundResource(android.R.color.holo_green_light)

                    // For buttons:
                    R.id.button_red -> box_three_text.setBackgroundColor(Color.RED)
                    R.id.button_yellow -> box_four_text.setBackgroundColor(Color.YELLOW)
                    R.id.button_green -> box_five_text.setBackgroundColor(Color.GREEN)

                    else -> it.setBackgroundColor(Color.LTGRAY)

                }
            }
        }
    }
}