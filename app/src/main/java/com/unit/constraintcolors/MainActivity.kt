package com.unit.constraintcolors

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.unit.constraintcolors.ui.theme.ConstraintColorsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners(){
        val clickableViews : List<View> = listOf(findViewById<TextView>(R.id.box_one), findViewById<TextView>(R.id.box_two), findViewById<TextView>(R.id.box_three), findViewById<TextView>(R.id.box_four), findViewById<TextView>(R.id.box_five), findViewById<Button>(R.id.red_btn), findViewById<Button>(R.id.green_btn), findViewById<Button>(R.id.yellow_btn));

        for(item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View){
        when(view.id){
            R.id.box_one -> view.setBackgroundResource(android.R.color.darker_gray)
            R.id.box_two -> view.setBackgroundResource(android.R.color.holo_blue_light)
            R.id.box_three -> view.setBackgroundResource(android.R.color.holo_orange_dark)
            R.id.box_four -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_five -> view.setBackgroundResource(android.R.color.holo_purple)
            R.id.red_btn -> findViewById<TextView>(R.id.box_three).setBackgroundResource(R.color.my_red)
            R.id.green_btn -> findViewById<TextView>(R.id.box_four).setBackgroundResource(R.color.my_green)
            R.id.yellow_btn -> findViewById<TextView>(R.id.box_five).setBackgroundResource(R.color.my_yellow)

        }
    }
}
