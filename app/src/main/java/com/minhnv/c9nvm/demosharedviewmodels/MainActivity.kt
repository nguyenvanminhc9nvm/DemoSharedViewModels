package com.minhnv.c9nvm.demosharedviewmodels

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.minhnv.c9nvm.demosharedviewmodels.databinding.ActivityMainBinding
import com.minhnv.c9nvm.demosharedviewmodels.ex_1.SharedAcFgActivity
import com.minhnv.c9nvm.demosharedviewmodels.ex_2.SharedFgFgActivity
import com.minhnv.c9nvm.demosharedviewmodels.ex_3.SharedParChildFgActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            startActivity(Intent(this, SharedAcFgActivity::class.java))
        }

        binding.button2.setOnClickListener {
            startActivity(Intent(this, SharedFgFgActivity::class.java))
        }

        binding.button3.setOnClickListener {
            startActivity(Intent(this, SharedParChildFgActivity::class.java))
        }
    }
}