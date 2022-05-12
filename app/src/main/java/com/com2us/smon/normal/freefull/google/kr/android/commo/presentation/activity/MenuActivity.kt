package com.com2us.smon.normal.freefull.google.kr.android.commo.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.com2us.smon.normal.freefull.google.kr.android.commo.R
import com.com2us.smon.normal.freefull.google.kr.android.commo.databinding.ActivityMenuBinding
import com.com2us.smon.normal.freefull.google.kr.android.commo.presentation.adapter.MenuAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityMenuBinding
    lateinit var menuAdapter: MenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setView()
        setAdapter()
        setAlphaTab()
    }

    private fun setView() {
        binding.tv11.text = ""
        binding.tv22.text = ""
        binding.tv33.text = ""
        binding.tv44.text = ""
        binding.tv55.text = ""
        binding.tv11.visibility = View.VISIBLE
        binding.tv22.visibility = View.VISIBLE
        binding.tv33.visibility = View.VISIBLE
        binding.tv44.visibility = View.VISIBLE
        binding.tv55.visibility = View.VISIBLE
        binding.tv11.visibility = View.GONE
        binding.tv22.visibility = View.GONE
        binding.tv33.visibility = View.GONE
        binding.tv44.visibility = View.GONE
        binding.tv55.visibility = View.GONE
    }

    private fun setAdapter() {
        menuAdapter = MenuAdapter(this)
        binding.viewPagId.adapter = menuAdapter
        binding.tabLayoutId.tabIconTint = null
        TabLayoutMediator(binding.tabLayoutId, binding.viewPagId) { tab, pos ->
            when (pos) {
                0 -> {
                    tab.setIcon(R.drawable.ic_game)
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.icon_tint))
                    tab.icon?.alpha = 200
                }
                1 -> {
                    tab.setIcon(R.drawable.ic_result)
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.icon_tint))
                    tab.icon?.alpha = 120
                }
                2 -> {
                    tab.setIcon(R.drawable.ic_settings)
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.icon_tint))
                    tab.icon?.alpha = 120
                }
                3 -> {
                    tab.setIcon(R.drawable.ic_info)
                    tab.icon?.setTint(ContextCompat.getColor(this, R.color.icon_tint))
                    tab.icon?.alpha = 120
                }
            }
        }.attach()
    }

    private fun setAlphaTab(){
        binding.tabLayoutId.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.icon?.alpha = 200
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                tab?.icon?.alpha = 120
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }
}