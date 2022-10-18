package com.example

import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.notificationdemo.ViewModelClass

class MainActivityViewModelFactory(private val startingTitle: String, private val startingResult: Int)
    : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ViewModelClass::class.java)){
            return ViewModelClass]
            (startingTitle, startingResult) as T
        }
        Log.d("TAG", "create: ")
        throw IllegalArgumentException("Type anything useful here as exception")
    }

}
