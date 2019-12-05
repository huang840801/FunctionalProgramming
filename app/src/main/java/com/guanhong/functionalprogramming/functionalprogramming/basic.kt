package com.guanhong.functionalprogramming.functionalprogramming

var name1: String = "Hello"
var name2 = "world"

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun subtract(num1: Int, num2: Int) = num1 - num2

fun basicDemo() {

    add(3, 5)
    add(add(3, 6), 5)
}