package com.minhnv.c9nvm.demosharedviewmodels.ex_1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedAcFgViewModel : ViewModel() {
    private val _rotate: MutableLiveData<Int> = MutableLiveData()
    val rotate: LiveData<Int> get() = _rotate

    fun setRotate(isRotate: Int) {
        _rotate.value = isRotate
    }
}