package com.guanhong.functionalprogramming.functionalprogramming

import android.view.View

fun View.show() {

    if (visibility != View.VISIBLE) {
        visibility = View.VISIBLE
    }
}

fun View.setVisibility(isShow: Boolean) {

    visibility = if (isShow) {
        View.VISIBLE
    } else {
        View.INVISIBLE
    }
}

fun <T> List<T>.listExtension() {

    for (element in this) {
        println(element)
    }
}

fun String.cut(cut: String): String {

    return this.replace(cut, "")
}

fun demo() {

    demoString.cut("e").cut("l")

    list.listExtension()
}

val list = listOf("")
val demoString = "Hello World"