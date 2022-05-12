package com.com2us.smon.normal.freefull.google.kr.android.commo.presentation.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.com2us.smon.normal.freefull.google.kr.android.commo.presentation.fragment.GameFragment
import com.com2us.smon.normal.freefull.google.kr.android.commo.presentation.fragment.InfoFragment
import com.com2us.smon.normal.freefull.google.kr.android.commo.presentation.fragment.ResultFragment
import com.com2us.smon.normal.freefull.google.kr.android.commo.presentation.fragment.SettingsFragment

class MenuAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> { GameFragment()}
            1 -> { ResultFragment()}
            2 -> { SettingsFragment()}
            else -> { InfoFragment()}
        }
    }
}