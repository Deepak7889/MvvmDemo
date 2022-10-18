package com.example.notificationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding

class LiveData<T> : AppCompatActivity() {
private  lateinit var  binding: LiveData<Any?>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
    }
}