package com.minhnv.c9nvm.demosharedviewmodels.ex_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.minhnv.c9nvm.demosharedviewmodels.R
import com.minhnv.c9nvm.demosharedviewmodels.ex_2.first.FirstFragment
import com.minhnv.c9nvm.demosharedviewmodels.ex_2.second.SecondFragment

class SharedFgFgActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_fg_fg)
        val firstFragment = FirstFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.containerFgFg, firstFragment, firstFragment.tag).commit()
    }

    fun moveToSecond() {
        val secondFragment = SecondFragment()
        supportFragmentManager.beginTransaction()
            .addToBackStack(secondFragment.tag)
            .replace(R.id.containerFgFg, secondFragment, secondFragment.tag).commit()
    }
}