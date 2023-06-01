package com.example.spiicehwrz.model.dbase

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.spiicehwrz.utilities.TypeConverter
import com.example.spiicehwrz.model.entity.MessageEntity
import com.example.spiicehwrz.model.entity.UserEntity

@Database(entities = [UserEntity::class, MessageEntity::class], version = 1)
@TypeConverters(TypeConverter::class)
abstract class AppDataBase : RoomDatabase() {

    abstract fun getUserDao() : UserDao

    abstract fun getMessageDao() : MessageDao
}