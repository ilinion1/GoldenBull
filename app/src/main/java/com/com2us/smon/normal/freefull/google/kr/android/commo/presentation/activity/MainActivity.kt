package com.com2us.smon.normal.freefull.google.kr.android.commo.presentation.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.com2us.smon.normal.freefull.google.kr.android.commo.R
import com.com2us.smon.normal.freefull.google.kr.android.commo.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Glide.with(this).load(R.drawable.biz_load).into(binding.imLoad)
        lifecycleScope.launch {
            delay(3500)
            startActivity(Intent(this@MainActivity, MenuActivity::class.java))
        }
    }
}