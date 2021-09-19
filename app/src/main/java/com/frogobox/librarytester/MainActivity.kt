package com.frogobox.librarytester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frogobox.androidlibfirst.FirstLibrary
import com.frogobox.androidlibsecond.SecondLibrary

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // com.frogobox.androidlibfirst
        val first = FirstLibrary.TAG

        // com.frogobox.androidlibsecond
        val second = SecondLibrary.TAG

    }

}