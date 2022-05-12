package com.com2us.smon.normal.freefull.google.kr.android.commo.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import com.com2us.smon.normal.freefull.google.kr.android.commo.R
import com.com2us.smon.normal.freefull.google.kr.android.commo.databinding.FragmentResultBinding
import com.com2us.smon.normal.freefull.google.kr.android.commo.databinding.FragmentSettingsBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class SettingsFragment : Fragment() {
    lateinit var binding: FragmentSettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setAnimEffect()
        setViewEffect()
        setImage()
        binding.cardViewISettings1
            .setCardBackgroundColor(ContextCompat.getColor(requireContext(),R.color.brown))
    }

    private fun setAnimEffect(){
        lifecycleScope.launch(Dispatchers.IO) {
            while (true){
                withContext(Dispatchers.Main) {
                    binding.cardViewISettings.alpha = 0.5F
                    delay(1000)
                    binding.cardViewISettings.alpha = 1f
                    delay(300)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        setClickEffectCard()
    }

    private fun setViewEffect(){
        binding.tvsettings.setText(R.string.settings1)
        binding.tvsettings.visibility = View.VISIBLE
        binding.tvSettings1.setText(R.string.settings2)
        binding.tvSettings1.visibility = View.VISIBLE
        binding.tvSettings2.setText(R.string.settings3)
        binding.tvSettings2.visibility = View.VISIBLE
        binding.tvSettings3.setText(R.string.settings4)
        binding.tvSettings3.visibility = View.VISIBLE
        binding.tvSettings4.setText(R.string.settings5)
        binding.tvSettings4.visibility = View.VISIBLE
        binding.tvSettings5.setText(R.string.settings6)
        binding.tvSettings4.visibility = View.VISIBLE
        binding.tvSettings6.setText(R.string.settings7)
        binding.tvSettings4.visibility = View.VISIBLE
    }

    private fun setImage(){
        binding.imSet1.setImageResource(R.drawable.set1)
        binding.imSet2.setImageResource(R.drawable.set2)
        binding.imSet3.setImageResource(R.drawable.set3)
    }

    private fun setClickEffectCard(){
        binding.cardViewISettings1.setOnClickListener {
            countAnimals = 2
            binding.cardViewISettings1
                .setCardBackgroundColor(ContextCompat.getColor(requireContext(),R.color.brown))
            binding.cardViewISettings2
                .setCardBackgroundColor(ContextCompat.getColor(requireContext(),R.color.white))
            binding.cardViewISettings3
                .setCardBackgroundColor(ContextCompat.getColor(requireContext(),R.color.white))
        }
        binding.cardViewISettings2.setOnClickListener {
            countAnimals = 3
            binding.cardViewISettings2
                .setCardBackgroundColor(ContextCompat.getColor(requireContext(),R.color.brown))
            binding.cardViewISettings1
                .setCardBackgroundColor(ContextCompat.getColor(requireContext(),R.color.white))
            binding.cardViewISettings3
                .setCardBackgroundColor(ContextCompat.getColor(requireContext(),R.color.white))
        }
        binding.cardViewISettings3.setOnClickListener {
            countAnimals = 5
            binding.cardViewISettings3
                .setCardBackgroundColor(ContextCompat.getColor(requireContext(),R.color.brown))
            binding.cardViewISettings1
                .setCardBackgroundColor(ContextCompat.getColor(requireContext(),R.color.white))
            binding.cardViewISettings2
                .setCardBackgroundColor(ContextCompat.getColor(requireContext(),R.color.white))
        }
    }

    companion object{
        var countAnimals = 2
    }
}