package com.guanhong.functionalprogramming.functionalprogramming
//
///**
// * basic
// **/
//var name: String = ""
//
//name = "Huang"
//
//val name1: String = "Huang"
//
//fun getSum(num1: Int, num2: Int): Int {
//
//    return num1 + num2
//}
//
//getSum(4, 7)
//
//
///**
// * list
// **/
//val list = listOf("111", "222", "333")
//
//list.forEach {
//
//    println(it)
//}
//
//fun test(input: ((Int) -> String), input1: ((Int) -> String)) {
//
//    input.invoke(8)
//}
//
//fun test1(input: Int): String {
//
//    println(input)
//    return input.toString()
//}
//test(::test1, ::test1)
//
//
//list.forEach(::println)
//
///**
// * tricky
// **/
//fun ((Int) -> String).functionTypeExtension(input: ((Int) -> String)): ((Int) -> String) {
//
////    return input
////    return this
//
//    return {
//
//        ""
//    }
//}
//
///**
// * invoke
// **/
//val a1 = fun(input: Int): ((Int) -> String) {
//
//    return { "" }
//}
//
//val a2 = a1(0).invoke(8).stringExtension().invoke(5)
//
//fun String.stringExtension():((Int) -> String) = { "" }
//
//
///**
// * list practice
// **/
//fun <Type> List<Type>.myForEach(input: ((index: Int, Type) -> Unit)) {
//
//    var index = 0
//    for (element in this) {
//        input(index, element)
//
//        index ++
//
//        println("inside index $index = $element")
//
//    }
//}
//
//val list1 = listOf("a", "b", "c")
//
//list1.myForEach { index, element ->
//
//}
//
///**
// *
// * extension
// *      normal
// *      generic
// *
// * function type
// *      anonymous function
// *      lambda
// *      function parameter
// *      function return
// *      invoke
// *      last parameter is function type
// *      function type extension
// *      typealias
// *      forEach simplify
// *      forEachIndex practice
// *
// * infix
// *
// * inline
// **/
//
