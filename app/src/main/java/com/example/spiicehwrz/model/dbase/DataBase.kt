package com.example.spiicehwrz.model.dbase

import android.content.Context
import androidx.room.Room
import com.example.spiicehwrz.model.MessageUser
import com.example.spiicehwrz.model.User

object DataBase {

    var userDao: UserDao? = null

    var messageDao: MessageDao? = null

    private var dataBase: AppDataBase? = null

    fun initDataBase(context: Context) {
        dataBase = Room.databaseBuilder(context, AppDataBase::class.java, "data_base")
            .allowMainThreadQueries()
            .build()
        messageDao = dataBase?.getMessageDao()
        userDao = dataBase?.getUserDao()
    }

    val listMessage = arrayListOf<MessageUser>()

    val listUser = arrayListOf<User>()

}