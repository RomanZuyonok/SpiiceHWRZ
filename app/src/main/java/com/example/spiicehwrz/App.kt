package com.example.spiicehwrz

import android.app.Application
import com.example.spiicehwrz.model.dbase.DataBase
import com.example.spiicehwrz.repositories.SharedPreferenceRepository

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        SharedPreferenceRepository.init(applicationContext)
        DataBase.initDataBase(applicationContext)
    }
}