package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
            // Test on the listener: when button is clicked, show a message:
            //Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()

            // What we actually wanted to do is when the button is clicked, do sth to the dice.
            rollDice()
        }

        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        // Changing from text to image:
        //val resultText: TextView = findViewById(R.id.result_text)

        val randomInt = (1..6).random()
        // Decide the image resources for different random numbers (using when clause):
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // "findViewById" will be called every time the function gets called. It's fine for this
        // small app, but since it searches through the tree every time, it's expensive.
        //val diceImage: ImageView = findViewById(R.id.dice_image)
        // Assign drawable resources to the images
        diceImage.setImageResource(drawableResource)

        // Changing from text to image:
        //resultText.text = randomInt.toString()
    }
}