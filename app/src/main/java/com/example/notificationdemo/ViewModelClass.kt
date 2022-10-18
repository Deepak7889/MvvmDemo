package com.example.notificationdemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelClass(startingTitle: String, startingResult: Int):ViewModel() {
    private var title = MutableLiveData<String>()
    private var result = MutableLiveData<Int>()
    //for encapsulation we need to use LiveData
    val readTitle : MutableLiveData<String> get() = title
    val readResult : MutableLiveData<Int> get() = result

    init {
        title.value = startingTitle
        result.value = startingResult
    }

    fun setPlus(input:Int){
        result.value = (result.value)?.plus(input)
    }

    fun setMinus(input: Int){
        result.value = (result.value)?.minus(input)
    }

    fun setTimes(input: Int){
        result.value = (result.value)?.times(input)
    }

    fun setDivide(input: Int){
        result.value = (result.value)?.div(input)
    }
}