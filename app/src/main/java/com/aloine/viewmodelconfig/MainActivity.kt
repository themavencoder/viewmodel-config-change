package com.aloine.viewmodelconfig

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var model: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // model = MainActivityDataGenerator()
        model = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        val myRandomNumber = model.getNumber()
        textview_random_number.text = myRandomNumber
        Log.i(TAG, "Random Number set")


    }
    companion object {
        private val TAG: String? = MainActivity::class.simpleName

    }
}
