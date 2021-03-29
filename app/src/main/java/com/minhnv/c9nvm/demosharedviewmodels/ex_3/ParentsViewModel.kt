package com.minhnv.c9nvm.demosharedviewmodels.ex_3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ParentsViewModel : ViewModel() {
    private val _change: MutableLiveData<Int> = MutableLiveData(1)
    val change: LiveData<Int> get() = _change

    fun setRotate(isRotate: Int) {
        _change.value = isRotate
    }
}