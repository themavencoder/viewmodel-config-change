package com.aloine.viewmodelconfig

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var data: MainActivityDataGenerator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        data = MainActivityDataGenerator()
        val myRandomNumber = data.getNumber()
        textview_random_number.text = myRandomNumber
        Log.i(TAG, "Random Number set")


    }
    companion object {
        private val TAG: String? = MainActivity::class.simpleName

    }
}
