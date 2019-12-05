package com.guanhong.functionalprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.guanhong.functionalprogramming.functionalprogramming.setVisibility
import com.guanhong.functionalprogramming.functionalprogramming.show
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.show()
        textView.setVisibility(false)
    }
}