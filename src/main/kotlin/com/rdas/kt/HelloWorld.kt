package com.rdas.kt

/**
 * Created by x148128 on 25/05/2017.
 */
val longString = """
    This is a GString type long string
    """
fun main(args : Array<String>) {
    val text = "Hello World with $longString"
    println("$text")
    loop()
}

fun loop () : Unit {
    val x = 10
    val oneMillion = 1

    for ( z in 1..x)
        println(z)

    val data = describe("1")
    data?.let {
        println("$data is not null")
    }
}

fun describe(obj: Any):String? =
        when (obj) {
            1 -> "one"
            "bla"-> null
            else -> "Unknown"
        }