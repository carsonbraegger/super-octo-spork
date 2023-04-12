package com.example.fooddiary.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "item")
data class Item(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "food") val food: String?,
    @ColumnInfo(name = "calorie") val calorie: String?

) {
}