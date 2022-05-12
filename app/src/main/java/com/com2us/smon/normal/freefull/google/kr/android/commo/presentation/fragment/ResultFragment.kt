package com.com2us.smon.normal.freefull.google.kr.android.commo.presentation.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.com2us.smon.normal.freefull.google.kr.android.commo.R
import com.com2us.smon.normal.freefull.google.kr.android.commo.databinding.FragmentInfoBinding
import com.com2us.smon.normal.freefull.google.kr.android.commo.databinding.FragmentResultBinding


class ResultFragment : Fragment() {
    lateinit var binding: FragmentResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResultBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvResult.setText(R.string.result1)
        binding.inResult.setImageResource(R.drawable.king)
    }


    override fun onResume() {
        super.onResume()
        if(kingList.size == 1){
            binding.imKing1.setImageResource(kingList[0])
            binding.imKing1.visibility = View.VISIBLE
        }
        if(kingList.size == 2){
            binding.imKing1.setImageResource(kingList[0])
            binding.imKing1.visibility = View.VISIBLE
            binding.imKing2.setImageResource(kingList[1])
            binding.imKing2.visibility = View.VISIBLE
        }
        if(kingList.size == 3){
            binding.imKing1.setImageResource(kingList[0])
            binding.imKing1.visibility = View.VISIBLE
            binding.imKing2.setImageResource(kingList[1])
            binding.imKing2.visibility = View.VISIBLE
            binding.imKing3.setImageResource(kingList[2])
            binding.imKing3.visibility = View.VISIBLE
        }
    }

    companion object{
        val kingList = arrayListOf<Int>()
    }
}