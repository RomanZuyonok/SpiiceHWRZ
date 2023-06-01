package com.example.spiicehwrz.ui.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.spiicehwrz.ui.onboarding.OnboardingStepFragment.Companion.getOnboardingStepFragment

class OnboardingAdapter(fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager) {

    private val listFragment =
        arrayListOf(
            getOnboardingStepFragment(StepOnBoarding.STEP_ONE),
            getOnboardingStepFragment(StepOnBoarding.STEP_TWO),
            getOnboardingStepFragment(StepOnBoarding.STEP_THREE),
            getOnboardingStepFragment(StepOnBoarding.STEP_FOUR),
            getOnboardingStepFragment(StepOnBoarding.STEP_FIVE)
        )

    override fun getCount() = listFragment.size

    override fun getItem(position: Int): Fragment = listFragment[position]


}