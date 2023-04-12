package com.example.fooddiary

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.room.Room
import com.example.fooddiary.data.Item
import com.example.fooddiary.data.ItemDao
import com.example.fooddiary.data.ItemRoomDatabase


lateinit var homeButton: Button
class food_Diary() : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    val db = Room.databaseBuilder(
        applicationContext,
        ItemRoomDatabase::class.java, "Item"
    ).allowMainThreadQueries().build()
    val ItemDao = db.ItemDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_diary)
        homeButton = findViewById(R.id.HomeButton)
        homeButton.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)







            val dataEntry: List<Item> = ItemDao.getAll()
            val entries: TextView = findViewById(R.id.TextView2)

            entries.text = dataEntry.toString()
        }


    }
    fun addToBase(name: String, calorie: String) {
        ItemDao.insertAll(Item(0,name, calorie))

    }

}