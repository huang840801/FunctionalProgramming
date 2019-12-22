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

        val list1 = listOf("a", "b", "c")

        fun <Type> List<Type>.printAllElement(input: ((index: Int, Type) -> Unit)) {

            var index = 8
            for (element in this) {
                input(index, element)

                println("inside index $index = $element")
                index++
            }
        }

        list1.printAllElement { index, element ->

            println("outside index $index = $element")
        }
    }
}