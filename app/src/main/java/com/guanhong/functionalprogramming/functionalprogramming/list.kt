package com.guanhong.functionalprogramming.functionalprogramming

/**
 * List simplify
 */
fun listPractice() {

    val listLambda = { element: String -> Unit }
    val stringList = listOf("aaa", "bbb", "ccc")

    for (element in stringList) {
        println(element)
    }

    stringList.forEach(listLambda)

    stringList.forEach({ element: String ->

        println(element)
    })

    stringList.forEach() { element ->

        println(element)
    }

    stringList.forEach { element ->

        println(element)
    }

    stringList.forEach {

        println(it)
    }

    stringList.forEach(::println)


    fun test(input: ((Int, Int) -> String)) {

    }

    fun test1(input: Int,input1: Int): String {

        return  ""
    }

    test(::test1)
}

/**
 * CustomForEach
 */
fun <MyType> List<MyType>.CustomForEach(action: (MyType) -> Unit) {

    for (element in this) {
        println(element)
    }
}

/**
 * CustomForEachIndex
 */
fun <MyType> List<MyType>.CustomForEachIndex(action: (index: Int, MyType) -> Unit) {

    var index = 0
    for (element in this) {
        action(index, element)
        index++
    }
}
