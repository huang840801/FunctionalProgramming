package com.guanhong.functionalprogramming.functionalprogramming

/**
 *  1.must be a member function or extension function
 *
 *  2.must have a single value parameter
 *
 *  3.should not have varargs or parameter with default values
 */
infix fun LambdaPractice.andThenInfix(input: ((Int) -> String)): String {
    return input(0)
}

infix fun LambdaPractice.infixDemo(num: Int): LambdaPractice {

    return LambdaPractice()
}

fun infixDemo() {

    lambdaPractice.andThenInfix(addOneToString)

    lambdaPractice andThenInfix addOneToString

    lambdaPractice infixDemo 4 infixDemo 8
}

class LambdaPractice

private val lambdaPractice = LambdaPractice()
private val addOneToString = { a: Int -> (a + 1).toString() }
