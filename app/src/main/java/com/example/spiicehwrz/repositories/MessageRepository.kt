package com.example.spiicehwrz.repositories

import com.example.spiicehwrz.model.MessageUser
import com.example.spiicehwrz.model.dbase.DataBase
import com.example.spiicehwrz.model.entity.MessageEntity

class MessageRepository {

    fun getAllMessage(): ArrayList<MessageUser> {
        return (DataBase.messageDao?.getAllMessage()?.map {
            MessageUser(
                it.title,
                it.Message,
                it.dateMessage
            )
        } as? ArrayList<MessageUser> ?: arrayListOf())
    }

    fun addMessage(message: MessageUser): Boolean {
        DataBase.messageDao?.insertMessage(
            MessageEntity(
                0,
                message.title,
                message.Message,
                message.dateMessage
            )
        )
        return true
    }

    fun getMessageByText(message: String): MessageUser? = DataBase.listMessage.find {
        it.Message == message
    }
}