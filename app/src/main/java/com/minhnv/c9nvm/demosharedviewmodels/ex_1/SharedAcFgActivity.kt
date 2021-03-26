package com.minhnv.c9nvm.demosharedviewmodels.ex_1

import android.graphics.Color
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.minhnv.c9nvm.demosharedviewmodels.R
import com.minhnv.c9nvm.demosharedviewmodels.databinding.ActivitySharedAcFgBinding
import kotlin.random.Random


class SharedAcFgActivity : AppCompatActivity() {

    private val sharedAcFgViewModel: SharedAcFgViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySharedAcFgBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.containerRotate, SharedAcFgFragment())
            .commit()
        sharedAcFgViewModel.rotate.observe(this) {
            binding.tvDemo.text = "change to $it"
            binding.tvDemo.setBackgroundColor(Color.rgb(it, it * 10, it * 100))
        }
    }
}