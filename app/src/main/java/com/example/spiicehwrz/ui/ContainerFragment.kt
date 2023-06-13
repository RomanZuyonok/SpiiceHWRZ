package com.example.spiicehwrz.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.spiicehwrz.R
import com.example.spiicehwrz.databinding.FragmentContainerBinding

class ContainerFragment : Fragment() {

    private lateinit var binding: FragmentContainerBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentContainerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.navView.setupWithNavController(findNavController())
//        when(binding.navView.selectedItemId){
//            R.id.navigation_home -> {}
//            R.id.navigation_search -> {}
//            R.id.navigation_add_note -> {}
//            R.id.navigation_profile -> {}
//        }
    }

}