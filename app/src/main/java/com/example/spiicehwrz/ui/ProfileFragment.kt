package com.example.spiicehwrz.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.spiicehwrz.repositories.SharedPreferenceRepository
import com.example.spiicehwrz.databinding.FragmentProfileBinding
import com.example.spiicehwrz.repositories.MessageRepository

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.buttonDelProfile.setOnClickListener {
            SharedPreferenceRepository.clearUserPreferences()
            SharedPreferenceRepository.setIsFirstOpen(true)

        }

       binding.numberOfNotesTextView.setText("${MessageRepository().getCountNotes()} notes ")
    }
}