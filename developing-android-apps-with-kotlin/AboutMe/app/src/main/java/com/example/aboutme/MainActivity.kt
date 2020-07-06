package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // Instance of MyName data class:
    private val myName: MyName = MyName("Rui Zhang")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main) // The content of this activity is showing in this layout
        // Convert it into binding objects:
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = myName

        // Call the button function:
//        findViewById<Button>(R.id.done_button).setOnClickListener {
//            addNickname(it) // "it" refers to the done button
//        }
        binding.doneButton.setOnClickListener {
            addNickname(it)
        }
    }

    // Function which makes the button do something after clicking:
    private fun addNickname(view: View) {

        // Use binding.apply to make the code more readable:
        binding.apply {
            // Convert to binding:
            //val editText = findViewById<EditText>(R.id.nick_name_edit)
            //val nicknameTextView = findViewById<TextView>(R.id.nickname_show)

            //nicknameTextView.text = editText.text
            ////editText.visibility = View.GONE
            //nicknameTextView.visibility = View.VISIBLE

            binding.nicknameShow.text = binding.nickNameEdit.text
            myName?.nickname = nickNameEdit.text.toString()
            // Use invalidateAll() to refresh the UI with new data:
            invalidateAll()
            binding.nicknameShow.visibility = View.VISIBLE
        }

        // Hide the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }


}