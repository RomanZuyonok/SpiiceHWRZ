package com.example.spiicehwrz.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "message")
data class MessageEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo("title")
    val title : String,
    @ColumnInfo("message")
    val Message : String,
    @ColumnInfo("date")
    val dateMessage : Date
)
