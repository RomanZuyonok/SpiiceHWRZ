package com.example.spiicehwrz.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.spiicehwrz.R
import com.example.spiicehwrz.databinding.FragmentOneboardingBinding
import com.example.spiicehwrz.ui.SignFragment
import com.example.spiicehwrz.utilities.replaceFragment

class OnboardingFragment : Fragment() {

    private lateinit var binding: FragmentOneboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOneboardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewPager.adapter = OnboardingAdapter(parentFragmentManager)
        binding.circleIndicator.setViewPager(binding.viewPager)

        binding.openListFragment.setOnClickListener {
            parentFragmentManager.replaceFragment(R.id.container, SignFragment())
        }

    }
}