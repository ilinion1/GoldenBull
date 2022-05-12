package com.com2us.smon.normal.freefull.google.kr.android.commo.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.com2us.smon.normal.freefull.google.kr.android.commo.R
import com.com2us.smon.normal.freefull.google.kr.android.commo.databinding.FragmentGameBinding
import com.com2us.smon.normal.freefull.google.kr.android.commo.databinding.FragmentInfoBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class InfoFragment : Fragment() {
    lateinit var binding: FragmentInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setView()
        setAnimEffect()
    }

    private fun setView(){
        binding.tvInfo1.visibility = View.GONE
        binding.tvInfo2.visibility = View.GONE
        binding.tvInfo3.visibility = View.GONE
        binding.tvInfo4.visibility = View.GONE
        binding.tvInfo5.visibility = View.GONE
        binding.tvInfo6.visibility = View.GONE

        binding.tvInfo1.setText(R.string.info1)
        binding.tvInfo2.setText(R.string.info2)
        binding.tvInfo3.setText(R.string.info3)
        binding.tvInfo4.setText(R.string.info4)
        binding.tvInfo5.setText(R.string.info5)
        binding.tvInfo6.setText(R.string.info6)

        binding.tvInfo1.visibility = View.VISIBLE
        binding.tvInfo2.visibility = View.VISIBLE
        binding.tvInfo3.visibility = View.VISIBLE
        binding.tvInfo4.visibility = View.VISIBLE
        binding.tvInfo5.visibility = View.VISIBLE
        binding.tvInfo6.visibility = View.VISIBLE
    }

    private fun setAnimEffect(){
        lifecycleScope.launch(Dispatchers.IO) {
            while (true){
                withContext(Dispatchers.Main) {
                    binding.cardViewInfo.alpha = 0.5F
                    binding.cardView.alpha = 0.5F
                    delay(1000)
                    binding.cardViewInfo.alpha = 1f
                    binding.cardView.alpha = 1f
                    delay(300)
                }
            }
        }
    }

}