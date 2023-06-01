package com.example.spiicehwrz.ui.listMessage.adapter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.spiicehwrz.model.MessageUser
import com.example.spiicehwrz.repositories.MessageRepository

class AllMessageViewModel : ViewModel() {

    val messageList = MutableLiveData<ArrayList<MessageUser>>()

    private val messageRepository = MessageRepository()

    fun getAllMessage(){
        messageList.value = messageRepository.getAllMessage()
    }

}