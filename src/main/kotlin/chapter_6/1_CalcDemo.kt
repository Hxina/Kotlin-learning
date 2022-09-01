package chapter_6

/**
 * @Author: Hxina
 * @Date: 2022/9/1 Thursday 09:07
 */
fun main() {
    println("Please input first number: ")
    val num1Str = readLine()        // 接收类型为 String
    println("Please input second number: ")
    val num2Str = readLine()
    try {
        val num1 = num1Str!!.toInt()    // !! 断言非空
        val num2 = num2Str!!.toInt()
        println("num1 + num2 = ${num1 + num2}")
    } catch (e: Exception) {
        println("Incorrect input data type.")
    }
}