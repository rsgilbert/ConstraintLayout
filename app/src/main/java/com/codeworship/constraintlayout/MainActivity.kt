package com.codeworship.constraintlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

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

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews : List<View> = listOf(
            boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText,
            rootConstraintLayout
        )
        for (view in clickableViews) {
            view.setOnClickListener { makeColored(it) }
        }
    }
}
