package com.example.spiicehwrz.ui.addMessage

import androidx.lifecycle.ViewModel
import com.example.spiicehwrz.model.MessageUser
import com.example.spiicehwrz.repositories.MessageRepository

class AddMessageViewModel : ViewModel() {

    var messageSaved: (() -> Unit)? = null

    var showTitleError: (() -> Unit)? = null

    private val messageRepository = MessageRepository()

    fun addNewMessage(message : MessageUser){
        val isMessageSaved = messageRepository.addMessage(message)
        if(isMessageSaved){
            messageSaved?.invoke()
        }else{
            showTitleError?.invoke()
        }
    }
}