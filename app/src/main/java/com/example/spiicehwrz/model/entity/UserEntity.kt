package com.example.spiicehwrz.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo("email")
    val email: String,
    @ColumnInfo("firstname")
    val firstName: String,
    @ColumnInfo("lastname")
    val lastName: String
)
