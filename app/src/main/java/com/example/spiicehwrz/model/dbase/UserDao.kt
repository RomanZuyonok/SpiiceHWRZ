package com.example.spiicehwrz.model.dbase

import androidx.room.*
import com.example.spiicehwrz.model.User
import com.example.spiicehwrz.model.entity.UserEntity

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertUser(user : UserEntity)

    @Delete
    fun deleteUser(user : UserEntity)

//    @Query("SELECT email FROM users")
//    fun getUser(email : String) : User
}