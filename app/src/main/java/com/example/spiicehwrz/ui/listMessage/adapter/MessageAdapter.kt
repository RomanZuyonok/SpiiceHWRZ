package com.example.spiicehwrz.ui.listMessage.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.spiicehwrz.databinding.ItemMessageBinding
import com.example.spiicehwrz.model.MessageUser

class MessageAdapter : ListAdapter<MessageUser, MessageViewHolder>(
    object : DiffUtil.ItemCallback<MessageUser>() {
        override fun areItemsTheSame(oldItem: MessageUser, newItem: MessageUser): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: MessageUser, newItem: MessageUser): Boolean {
            return oldItem == newItem
        }
    }
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(
            ItemMessageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}