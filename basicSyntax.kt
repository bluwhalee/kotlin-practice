package my.demo

import kotlin.text.*

fun main(args: Array<String>) {
    println(args.contentToString())
}
fun main2(args: Array<String>) {
    println(args.contentToString())
}

print()
println()

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

open class Shape

class Rectangle(var height: Double, var length: Double): Shape() {
    var perimeter = (height + length) * 2
}
val helloWorld = object {
    val hello = "Hello"
    val world = "World"
    // object expressions extend Any, so `override` is required on `toString()`
    override fun toString() = "$hello $world"
}
//In Kotlin “ object “ keyword can be used to create singleton objects.

object TheObject {
    fun hello() = "hello"
    override fun toString() = "Hello, it's me, ${TheObject::class.simpleName}"
}

fun useSingletonObject() {
    println(TheObject.hello()) // => hello
    val someRef: Any = TheObject
    println(someRef) // => Hello, it's me, TheObject
}