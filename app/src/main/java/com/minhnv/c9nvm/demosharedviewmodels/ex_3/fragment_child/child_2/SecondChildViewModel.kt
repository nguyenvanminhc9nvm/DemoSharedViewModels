package com.minhnv.c9nvm.demosharedviewmodels.ex_3.fragment_child.child_2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondChildViewModel : ViewModel() {
    private val _changeOfSecond: MutableLiveData<Int> = MutableLiveData(1)
    val changeOfSecond: LiveData<Int> get() = _changeOfSecond

    fun setRotate(isRotate: Int) {
        _changeOfSecond.value = isRotate
    }
}