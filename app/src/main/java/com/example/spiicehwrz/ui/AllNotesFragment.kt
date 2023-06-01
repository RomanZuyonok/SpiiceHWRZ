package com.example.spiicehwrz.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spiicehwrz.databinding.FragmentAllNotesBinding
import com.example.spiicehwrz.model.MessageUser
import com.example.spiicehwrz.ui.listMessage.adapter.AllMessageViewModel
import com.example.spiicehwrz.ui.listMessage.adapter.MessageAdapter

class AllNotesFragment : Fragment() {

    private lateinit var binding: FragmentAllNotesBinding

    private val viewModel: AllMessageViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAllNotesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.run {
            messageList.observe(viewLifecycleOwner){
                setList(it)
            }
            getAllMessage()
        }
    }
    private fun setList(list: ArrayList<MessageUser>) {
        binding.notesRecyclerView.run {
            if (adapter == null) {
                adapter = MessageAdapter()
                layoutManager = LinearLayoutManager(requireContext())
            }
            (adapter as? MessageAdapter)?.submitList(list)
            adapter?.notifyDataSetChanged()
        }
    }

}