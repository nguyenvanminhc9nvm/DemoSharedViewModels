package com.minhnv.c9nvm.demosharedviewmodels.ex_3.fragment_child.child_1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstChildViewModel : ViewModel() {
    private val _changeOfFirst: MutableLiveData<Int> = MutableLiveData(1)
    val changeOfFirst: LiveData<Int> get() = _changeOfFirst

    fun setRotate(isRotate: Int) {
        _changeOfFirst.value = isRotate
    }
}