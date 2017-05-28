package com.rdas.kt

/**
 * Created by x148128 on 28/05/2017.
 */

class OuterClass {
    private val bar: Int = 10

    class NestedClass {
        fun foo() = 2
    }

    inner class NestedClass2 {
        fun foo() = bar
    }
}

fun main(args : Array<String>) {
    println("hello World")
    val demo = OuterClass.NestedClass().foo()
    val demo2 = OuterClass().NestedClass2().foo()
    println(demo)
    println(demo2)
}