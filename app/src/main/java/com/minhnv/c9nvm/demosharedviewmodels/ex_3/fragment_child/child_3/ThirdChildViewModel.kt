package com.minhnv.c9nvm.demosharedviewmodels.ex_3.fragment_child.child_3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ThirdChildViewModel : ViewModel() {
    private val _changeOfThird: MutableLiveData<Int> = MutableLiveData(1)
    val changeOfThird: LiveData<Int> get() = _changeOfThird

    fun setRotate(isRotate: Int) {
        _changeOfThird.value = isRotate
    }
}