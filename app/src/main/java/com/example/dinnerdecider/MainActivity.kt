package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "McDonalds", "Barros Pizza", "Pani Puri")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.decideButton).setOnClickListener {
//            println("You clicked me!")
            val random = Random
            val randomFood = random.nextInt(foodList.count());
            findViewById<TextView>(R.id.selectedFoodText).text = foodList[randomFood]

            findViewById<Button>(R.id.addFoodButton).setOnClickListener {
                val newFood = findViewById<TextView>(R.id.addFoodTxt).text.toString()
                foodList.add(newFood)
                findViewById<TextView>(R.id.addFoodTxt).text = ""
//            println(foodList)
            }
        }
    }
}