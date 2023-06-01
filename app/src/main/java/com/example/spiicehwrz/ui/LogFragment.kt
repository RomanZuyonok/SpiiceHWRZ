package com.example.spiicehwrz.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.spiicehwrz.R
import com.example.spiicehwrz.databinding.FragmentLogBinding
import com.example.spiicehwrz.databinding.FragmentSignBinding
import com.example.spiicehwrz.utilities.replaceFragment

class LogFragment : Fragment() {

    private lateinit var binding: FragmentLogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      /*  binding.logTextView2.setOnClickListener{
            parentFragmentManager.replaceFragment(R.id.container, FragmentSignBinding(), true)
        }*/
    }
}