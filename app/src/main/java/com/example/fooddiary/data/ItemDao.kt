package com.example.fooddiary.data

import androidx.room.*
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ItemDao {
    @Query("SELECT * FROM Item")
    fun getAll(): List<Item>



    @Query("SELECT * FROM Item WHERE food LIKE :first AND " +
            "calorie LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): Item

    @Insert
    fun insertAll(Item: Item)

    @Delete
    fun delete(Item: Item)
}