package com.example.spiicehwrz.ui.listMessage.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.spiicehwrz.databinding.ItemMessageBinding
import com.example.spiicehwrz.model.MessageUser

class MessageViewHolder(private val binding :ItemMessageBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(message : MessageUser){
        binding.run {
            title.text = "${message.title}"
            messageUser.text="${message.Message}"
            dateMessage.text= message.dateMessage.toString()
        }
    }
}