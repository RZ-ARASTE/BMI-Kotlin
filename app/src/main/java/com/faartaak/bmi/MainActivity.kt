package com.faartaak.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.faartaak.bmi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    fun BTcal (view: View) {
        var Weight: Float=binding.NBWeight.text.toString().toFloat()
        var Hight: Float=binding.NbHight.text.toString().toFloat()
        var Bmi: Float= Weight / (Hight*Hight)
        when(Bmi){
            in 0.0000..0.0019 ->  binding.Bmitextview.text = "You need to eat"
            in 0.0019..0.0025  -> binding.Bmitextview.text = "You are OK!"
            else   ->  binding.Bmitextview.text = "You should eat less"
        }
    }

}

