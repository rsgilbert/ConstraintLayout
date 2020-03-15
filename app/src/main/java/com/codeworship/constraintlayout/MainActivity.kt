package com.codeworship.constraintlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View) {
        view.apply {
            when (id) {
                R.id.box_one_text -> setBackgroundColor(Color.DKGRAY)
                R.id.box_two_text -> setBackgroundColor(Color.GRAY)
                R.id.box_three_text -> setBackgroundColor(Color.BLUE)
                R.id.box_four_text -> setBackgroundColor(Color.MAGENTA)
                R.id.box_five_text -> setBackgroundColor(Color.GREEN)
                // Boxes using custom colors for background
                R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
                R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
                R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)



                else -> setBackgroundColor(Color.LTGRAY)
            }
        }
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val redButton = findViewById<TextView>(R.id.red_button)
        val greenButton = findViewById<TextView>(R.id.green_button)
        val yellowButton = findViewById<TextView>(R.id.yellow_button)
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews : List<View> = listOf(
            boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText,
            rootConstraintLayout,redButton, greenButton, yellowButton
        )
        for (view in clickableViews) {
            view.setOnClickListener { makeColored(it) }
        }
    }
}
