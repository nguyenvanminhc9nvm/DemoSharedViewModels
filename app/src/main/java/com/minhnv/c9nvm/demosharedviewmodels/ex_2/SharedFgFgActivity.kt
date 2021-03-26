package com.minhnv.c9nvm.demosharedviewmodels.ex_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.minhnv.c9nvm.demosharedviewmodels.R
import com.minhnv.c9nvm.demosharedviewmodels.ex_2.first.FirstFragment
import com.minhnv.c9nvm.demosharedviewmodels.ex_2.second.SecondFragment

class SharedFgFgActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_fg_fg)
        supportFragmentManager.beginTransaction().replace(R.id.containerFgFg, FirstFragment()).commit()
    }

    fun moveToSecond() {
        val secondFragment = SecondFragment()
        supportFragmentManager.beginTransaction()
            .addToBackStack(secondFragment.tag)
            .replace(R.id.containerFgFg, secondFragment).commit()
    }
}