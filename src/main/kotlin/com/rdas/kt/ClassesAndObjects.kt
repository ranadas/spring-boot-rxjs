package com.rdas.kt

/**
 * Created by x148128 on 28/05/2017.
 */

fun main(args : Array<String>) {
    val e = Empty("rana das")
    println(e)

    val d : Derived = Derived(1)
    d.nv()
    d.v()

    d.extFun()

}
class Empty constructor(firstname:String) {
    init {
        println("woo hoo")
    }
}

open class Base (p:Int) {
    open fun v (){}
    final fun nv(){println("fucker")}
}

class Derived (p:Int): Base(p) {
    override fun v () {
        println("another fucker")
    }
}

fun Derived.extFun() = println("How cool is that")



