package com.example.fooddiary

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.room.Room
import com.example.fooddiary.data.ItemRoomDatabase

lateinit var homeButton2: Button
lateinit var saveButton: Button
lateinit var nameFood: TextView
lateinit var calorieNum: TextView
class NewEntry : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_entry)
        homeButton2=findViewById(R.id.HomeButton2)
        saveButton=findViewById(R.id.save_action)
        nameFood = findViewById(R.id.food_name)
        calorieNum = findViewById(R.id.calorie)

        homeButton2.setOnClickListener{
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        saveButton.setOnClickListener{
            var name = nameFood.toString()
            var cal = calorieNum.toString()
            food_Diary().addToBase(name,cal)

        }



    }
}

