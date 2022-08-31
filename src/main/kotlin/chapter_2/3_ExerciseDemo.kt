package chapter_2

/**
 * @Author: Hxina
 * @Date: 2022/8/31 Wednesday 20:15
 */
fun main() {
    val name: String = "String"
    println(sayHello(name))     // value's type is String

    val age1: Int = 20
    val age2: Int = 16
    println(checkAge(age1))      // true
    println(checkAge(age2))      // false

    println(saveLog(1))     // kotlin.Unit

    println(demo("Kotlin"))       // Hello Kotlin(6), I'm learning Kotlin.
    println(demo("Intellij IDEA"))    // Hello Intellij IDEA(13), I'm learning Kotlin.
}

fun sayHello(name: String): String {
    return "value's type is $name"
}

fun checkAge(age: Int): Boolean {
    // 等价于 if (age > 18) return true else return false
    return age > 18
}

fun saveLog(logLevel: Int): Unit {

}

fun demo(name: String): String {
    return "Hello $name(${name.length}), I'm learning Kotlin."
}