package com.stanfit.mpp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.stanfit.common.createPlatformName
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        textView.text = createPlatformName()
    }
}
