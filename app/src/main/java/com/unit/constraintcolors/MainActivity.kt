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
import androidx.databinding.DataBindingUtil
import com.unit.constraintcolors.databinding.ActivityMainBinding
import com.unit.constraintcolors.ui.theme.ConstraintColorsTheme

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setListeners()
    }

    private fun setListeners(){
        val clickableViews : List<View> = listOf(binding.boxOne, binding.boxTwo, binding.boxThree, binding.boxFour, binding.boxFive, binding.redBtn, binding.greenBtn, binding.yellowBtn);

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
            R.id.red_btn -> binding.boxThree.setBackgroundResource(R.color.my_red)
            R.id.green_btn -> binding.boxFour.setBackgroundResource(R.color.my_green)
            R.id.yellow_btn -> binding.boxFive.setBackgroundResource(R.color.my_yellow)

        }
    }
}
