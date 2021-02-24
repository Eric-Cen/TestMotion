package com.mcarving.testmotion

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.view.isVisible
import com.mcarving.testmotion.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickListeners()
    }

    private fun initClickListeners() {
        binding.btnTest.setOnClickListener { aa ->
            Log.d("MainActivity", "initClickListeners: ==> testing")
            topView.setBackgroundColor(Color.parseColor("#006699"))

            binding.btnRight.text = "right"
            binding.lindearlayout.isVisible = !binding.lindearlayout.isVisible

            binding.btnLeft.isVisible = !binding.btnLeft.isVisible
        }
    }
}