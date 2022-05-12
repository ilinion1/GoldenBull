package com.com2us.smon.normal.freefull.google.kr.android.commo.presentation.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.com2us.smon.normal.freefull.google.kr.android.commo.R
import com.com2us.smon.normal.freefull.google.kr.android.commo.databinding.FragmentGameBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class GameFragment : Fragment() {
    lateinit var binding: FragmentGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGameBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onResume() {
        super.onResume()
        startGame()
    }
    private fun startGame(){
        duel()
        trio()
        allAnimals()
    }


    private fun duel(){
        if (SettingsFragment.countAnimals == 2){
            binding.cardViewIGame.setOnClickListener {
                val win = (1..4).random()
                Log.d("test3", "$win")
                if (win == 1 || win == 2 ){
                    runWolf(it, 300, true)
                    runPuma(it,350, false)
                } else {
                    runWolf(it, 350, false)
                    runPuma(it,300, true)
                }
            }
        }
    }

    private fun trio(){
        if (SettingsFragment.countAnimals == 3){
            binding.cardViewIGame.setOnClickListener {
                val win = (1..6).random()
                if (win == 1 || win == 2 ){
                    runWolf(it, 300, true)
                    runPuma(it,350, false)
                    runBull(it,370, false)
                } else if (win == 3 || win == 4 ){
                    runWolf(it, 370, false)
                    runBull(it, 350, false)
                    runPuma(it,300, true)
                } else {
                    runWolf(it, 370, false)
                    runBull(it, 300, true)
                    runPuma(it,350, false)
                }
            }
        }
    }

    private fun allAnimals(){
        if (SettingsFragment.countAnimals == 5){
            binding.cardViewIGame.setOnClickListener {
                val win = (1..10).random()
                when(win){
                    1,2 -> {
                        runWolf(it, 300, true)
                        runPuma(it,350, false)
                        runBull(it,370, false)
                        runEagle(it,360, false)
                        runElk(it,330, false)
                    }
                    3,4 -> {
                        runWolf(it, 350, false)
                        runBull(it, 360, false)
                        runEagle(it, 330, false)
                        runPuma(it,300, true)
                        runElk(it,370, false)
                    }
                    5,6 -> {
                        runWolf(it, 360, false)
                        runBull(it, 300, true)
                        runPuma(it,330, false)
                        runEagle(it, 370, false)
                        runElk(it,350, false)
                    }
                    7,8 -> {
                        runWolf(it, 370, false)
                        runPuma(it,330, false)
                        runBull(it,360, false)
                        runEagle(it, 300, true)
                        runElk(it,350, false)
                    }
                    else -> {
                        runWolf(it, 370, false)
                        runPuma(it,350, false)
                        runBull(it,360, false)
                        runEagle(it, 330, true)
                        runElk(it,300, false)
                    }
                }
            }
        }
    }


    private fun runWolf(view: View, delay: Long, win: Boolean){
        lifecycleScope.launch {
            setOnClickVisibility(view)
            binding.imWolf.visibility = View.VISIBLE
            delay(delay)
            binding.imWolf.visibility = View.INVISIBLE
            binding.imWolf1.visibility = View.VISIBLE
            delay(delay)
            binding.imWolf1.visibility = View.INVISIBLE
            binding.imWolf2.visibility = View.VISIBLE
            delay(delay)
            binding.imWolf2.visibility = View.INVISIBLE
            binding.imWolf3.visibility = View.VISIBLE
            delay(delay)
            binding.imWolf3.visibility = View.INVISIBLE
            binding.imWolf4.visibility = View.VISIBLE
            delay(delay)
            binding.imWolf4.visibility = View.INVISIBLE
            binding.imWolf5.visibility = View.VISIBLE
            delay(delay)
            binding.imWolf5.visibility = View.INVISIBLE
            binding.imWolf6.visibility = View.VISIBLE
            delay(delay)
            binding.imWolf6.visibility = View.INVISIBLE
            binding.imWolf7.visibility = View.VISIBLE
            delay(delay)
            binding.imWolf7.visibility = View.INVISIBLE
            if (win){
                binding.imWolf7.visibility = View.VISIBLE
                binding.cardViewResultGame.visibility = View.VISIBLE
                binding.tvResultGame.text = resources.getString(R.string.game_win, "Wolf")
                delay(1500)
                binding.imWolf7.visibility = View.INVISIBLE
                binding.cardViewResultGame.visibility = View.INVISIBLE
                binding.cardViewIGame.visibility = View.VISIBLE
                setWinResult(R.drawable.wolf)
            }
        }
    }

    private fun runPuma(view: View, delay: Long, win: Boolean){
        lifecycleScope.launch {
            setOnClickVisibility(view)
            binding.imPuma.visibility = View.VISIBLE
            delay(delay)
            binding.imPuma.visibility = View.INVISIBLE
            binding.imPuma1.visibility = View.VISIBLE
            delay(delay)
            binding.imPuma1.visibility = View.INVISIBLE
            binding.imPuma2.visibility = View.VISIBLE
            delay(delay)
            binding.imPuma2.visibility = View.INVISIBLE
            binding.imPuma3.visibility = View.VISIBLE
            delay(delay)
            binding.imPuma3.visibility = View.INVISIBLE
            binding.imPuma4.visibility = View.VISIBLE
            delay(delay)
            binding.imPuma4.visibility = View.INVISIBLE
            binding.imPuma5.visibility = View.VISIBLE
            delay(delay)
            binding.imPuma5.visibility = View.INVISIBLE
            binding.imPuma6.visibility = View.VISIBLE
            delay(delay)
            binding.imPuma6.visibility = View.INVISIBLE
            binding.imPuma7.visibility = View.VISIBLE
            delay(delay)
            binding.imPuma7.visibility = View.INVISIBLE
            if (win){
                binding.imPuma7.visibility = View.VISIBLE
                binding.cardViewResultGame.visibility = View.VISIBLE
                binding.tvResultGame.text = resources.getString(R.string.game_win, "Puma")
                delay(1500)
                binding.imPuma7.visibility = View.INVISIBLE
                binding.cardViewResultGame.visibility = View.INVISIBLE
                binding.cardViewIGame.visibility = View.VISIBLE
                setWinResult(R.drawable.puma)
            }
        }
    }

    private fun runBull(view: View, delay: Long, win: Boolean){
        lifecycleScope.launch {
            setOnClickVisibility(view)
            binding.imBull.visibility = View.VISIBLE
            delay(delay)
            binding.imBull.visibility = View.INVISIBLE
            binding.imBull1.visibility = View.VISIBLE
            delay(delay)
            binding.imBull1.visibility = View.INVISIBLE
            binding.imBull2.visibility = View.VISIBLE
            delay(delay)
            binding.imBull2.visibility = View.INVISIBLE
            binding.imBull3.visibility = View.VISIBLE
            delay(delay)
            binding.imBull3.visibility = View.INVISIBLE
            binding.imBull4.visibility = View.VISIBLE
            delay(delay)
            binding.imBull4.visibility = View.INVISIBLE
            binding.imBull5.visibility = View.VISIBLE
            delay(delay)
            binding.imBull5.visibility = View.INVISIBLE
            binding.imBull6.visibility = View.VISIBLE
            delay(delay)
            binding.imBull6.visibility = View.INVISIBLE
            binding.imBull7.visibility = View.VISIBLE
            delay(delay)
            binding.imBull7.visibility = View.INVISIBLE
            if (win){
                binding.imBull7.visibility = View.VISIBLE
                binding.cardViewResultGame.visibility = View.VISIBLE
                binding.tvResultGame.text = resources.getString(R.string.game_win, "Bull")
                delay(1500)
                binding.imBull7.visibility = View.INVISIBLE
                binding.cardViewResultGame.visibility = View.INVISIBLE
                binding.cardViewIGame.visibility = View.VISIBLE
                setWinResult(R.drawable.bull)
            }
        }
    }

    private fun runEagle(view: View, delay: Long, win: Boolean){
        lifecycleScope.launch {
            setOnClickVisibility(view)
            binding.imEagle.visibility = View.VISIBLE
            delay(delay)
            binding.imEagle.visibility = View.INVISIBLE
            binding.imEagle1.visibility = View.VISIBLE
            delay(delay)
            binding.imEagle1.visibility = View.INVISIBLE
            binding.imEagle2.visibility = View.VISIBLE
            delay(delay)
            binding.imEagle2.visibility = View.INVISIBLE
            binding.imEagle3.visibility = View.VISIBLE
            delay(delay)
            binding.imEagle3.visibility = View.INVISIBLE
            binding.imEagle4.visibility = View.VISIBLE
            delay(delay)
            binding.imEagle4.visibility = View.INVISIBLE
            binding.imEagle5.visibility = View.VISIBLE
            delay(delay)
            binding.imEagle5.visibility = View.INVISIBLE
            binding.imEagle6.visibility = View.VISIBLE
            delay(delay)
            binding.imEagle6.visibility = View.INVISIBLE
            binding.imEagle7.visibility = View.VISIBLE
            delay(delay)
            binding.imEagle7.visibility = View.INVISIBLE
            if (win){
                binding.imEagle7.visibility = View.VISIBLE
                binding.cardViewResultGame.visibility = View.VISIBLE
                binding.tvResultGame.text = resources.getString(R.string.game_win, "Eagle")
                delay(1500)
                binding.imEagle7.visibility = View.INVISIBLE
                binding.cardViewResultGame.visibility = View.INVISIBLE
                binding.cardViewIGame.visibility = View.VISIBLE
                setWinResult(R.drawable.eagle)
            }
        }
    }

    private fun runElk(view: View, delay: Long, win: Boolean){
        lifecycleScope.launch {
            setOnClickVisibility(view)
            binding.imElk.visibility = View.VISIBLE
            delay(delay)
            binding.imElk.visibility = View.INVISIBLE
            binding.imElk1.visibility = View.VISIBLE
            delay(delay)
            binding.imElk1.visibility = View.INVISIBLE
            binding.imElk2.visibility = View.VISIBLE
            delay(delay)
            binding.imElk2.visibility = View.INVISIBLE
            binding.imElk3.visibility = View.VISIBLE
            delay(delay)
            binding.imElk3.visibility = View.INVISIBLE
            binding.imElk4.visibility = View.VISIBLE
            delay(delay)
            binding.imElk4.visibility = View.INVISIBLE
            binding.imElk5.visibility = View.VISIBLE
            delay(delay)
            binding.imElk5.visibility = View.INVISIBLE
            binding.imElk6.visibility = View.VISIBLE
            delay(delay)
            binding.imElk6.visibility = View.INVISIBLE
            binding.imElk7.visibility = View.VISIBLE
            delay(delay)
            binding.imElk7.visibility = View.INVISIBLE
            if (win){
                binding.imElk7.visibility = View.VISIBLE
                binding.cardViewResultGame.visibility = View.VISIBLE
                binding.tvResultGame.text = resources.getString(R.string.game_win, "Elk")
                delay(1500)
                binding.imElk7.visibility = View.INVISIBLE
                binding.cardViewResultGame.visibility = View.INVISIBLE
                binding.cardViewIGame.visibility = View.VISIBLE
                setWinResult(R.drawable.elk)
            }
        }
    }


    private fun setWinResult(win: Int){
        if (ResultFragment.kingList.size == 2){
            ResultFragment.kingList.add(win)
        }
        if (ResultFragment.kingList.size == 1){
            ResultFragment.kingList.add(win)
        }
        if (ResultFragment.kingList.size == 0){
            ResultFragment.kingList.add(win)
        }
    }

    private suspend fun setOnClickVisibility(view: View){
        view.alpha = 0.5f
        delay(300)
        view.alpha = 1f
        delay(400)
        view.visibility = View.INVISIBLE
        binding.cardViewIGame.visibility = View.INVISIBLE
    }
}