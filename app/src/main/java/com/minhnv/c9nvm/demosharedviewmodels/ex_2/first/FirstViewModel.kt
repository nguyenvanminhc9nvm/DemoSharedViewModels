package com.minhnv.c9nvm.demosharedviewmodels.ex_2.first

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstViewModel : ViewModel() {
    private val _change: MutableLiveData<Int> = MutableLiveData()
    val change: LiveData<Int> get() = _change

    fun setRotate(isRotate: Int) {
        _change.value = isRotate
    }
}