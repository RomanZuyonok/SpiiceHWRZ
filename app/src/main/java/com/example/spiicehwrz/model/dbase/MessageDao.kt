package com.example.spiicehwrz.model.dbase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.spiicehwrz.model.entity.MessageEntity

@Dao
interface MessageDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMessage(message : MessageEntity)

//    @Query("SELECT title FROM message")
//    fun getFindMessage(title : String) : List<MessageEntity>

    @Query("SELECT * FROM message")
    fun getAllMessage() : List<MessageEntity>
}