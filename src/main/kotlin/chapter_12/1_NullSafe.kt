package chapter_12

/**
 * @Author: Hxina
 * @Date: 2022/9/2 Friday 10:27
 */
fun main() {

//    var str = "null value"
//    str = null    // Error

    var str: String? = "null value"     // 可空
//    str = null
    str?.let {
        // 非空白字符串
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "null"
        }
    }
    println(str)

    println("***************")

//    val string1 = "Kotlin"
//    println(string1 ?: "kotlin_1")      // Kotlin

    var string1: String? = "Kotlin"
    string1 = null
    println(string1 ?: "kotlin_1")      // kotlin_1

    println("****************")

    // 配合 let 使用
    var string: String? = "Kotlin learning"
    string = null
    string = string?.let {
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "kotlin_learning"
        }
    }
    println(string)     // null

    println("******************")

    // !! 非空断言操作符，当变量值是null时，抛出空指针异常
    var str2 = "kotlin"
    println(str2!!.capitalize())    // Kotlin

    println("******************")

    // 链式调用
    str2 = str2?.capitalize()?.plus(" is great")!!

    // 空合并操作符 + let
    str2 = str2?.let { it.capitalize() } ?: "Kotlin is bad!"
    println(str2)   // Kotlin is great
}