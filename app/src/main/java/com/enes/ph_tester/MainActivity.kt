package com.enes.ph_tester

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.opencv.android.OpenCVLoader

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(!OpenCVLoader.initDebug()){
            Log.i("OpenCV", "Failed")
        }else{
            Log.i("OpenCV", "successfully built !")
            Log.i("OpenCV","tes")
            Log.i("o","t")
        }
    }
}
