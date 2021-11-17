package com.marvel.mycpc4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val My_LOG="My_LOG"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (i in 'a'..'z')
            if (i.code %2==0)
                Log.d(My_LOG, i.toString())
    }

}

