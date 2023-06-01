package com.example.spiicehwrz.ui.onboarding

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.drawable.toDrawable
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.spiicehwrz.R
import com.example.spiicehwrz.databinding.FragmentOneboardingStepBinding

private const val STEP_EXTRA = "stepExtra"

class OnboardingStepFragment : Fragment() {

    private lateinit var binding : FragmentOneboardingStepBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOneboardingStepBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val stepFragment = arguments?.getInt(STEP_EXTRA) ?: 1

        when(stepFragment){
            StepOnBoarding.STEP_ONE.step -> {
                binding.titleTextView.setText(R.string.step_one)
                binding.imageView.setImageResource(R.drawable.planet)
            }
            StepOnBoarding.STEP_TWO.step -> {
                binding.titleTextView.setText(R.string.step_two)
                binding.imageView.setImageResource(R.drawable.money)
            }
            StepOnBoarding.STEP_THREE.step -> {
                binding.titleTextView.setText(R.string.step_three)
                binding.imageView.setImageResource(R.drawable.chat)
            }
            StepOnBoarding.STEP_FOUR.step -> {
                binding.titleTextView.setText(R.string.step_four)
                binding.imageView.setImageResource(R.drawable.level_up)
            }
            StepOnBoarding.STEP_FIVE.step -> {
                binding.titleTextView.setText(R.string.step_five)
                binding.imageView.setImageResource(R.drawable.heart)
            }
        }
    }

    companion object {

        fun getOnboardingStepFragment(stepNumber: StepOnBoarding): OnboardingStepFragment {
            return OnboardingStepFragment().apply {
                arguments = bundleOf(STEP_EXTRA to stepNumber.step)
            }
        }
    }
}