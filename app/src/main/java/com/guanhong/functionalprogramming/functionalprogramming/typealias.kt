package com.guanhong.functionalprogramming.functionalprogramming

typealias myType = ((Int) -> Int)

fun ((Int) -> Int).demo(output: ((((Int) -> Int)) -> Int)): ((Int) -> Int) {

    return {
        output(this)
    }
}

fun myType.demo1(output: ((myType) -> Int)): myType {

    return {
        output(this)
    }
}