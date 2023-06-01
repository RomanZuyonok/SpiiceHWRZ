package com.example.spiicehwrz.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.spiicehwrz.R
import com.example.spiicehwrz.databinding.FragmentStartBinding
import com.example.spiicehwrz.ui.onboarding.OnboardingFragment
import com.example.spiicehwrz.utilities.replaceFragment

class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.discoverButtonFragment.setOnClickListener {
            parentFragmentManager.replaceFragment(R.id.container, OnboardingFragment(),true)
        }
        binding.textView2Fragment.setOnClickListener {
            parentFragmentManager.replaceFragment(R.id.container, LogFragment(),true)
        }
    }

}