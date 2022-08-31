package chapter_2

/**
 * @Author: Hxina
 * @Date: 2022/8/31 Wednesday 20:02
 */
fun main() {
    val num1 = 2
    val num2 = 4
    println("a + b = ${plus(num1, num2)}")
    println("a - b = ${sub(num1, num2)}")
    println("a * b = ${multiply(num1, num2)}")
    println("a / b = ${divide(num1, num2)}")
}

fun plus(num1: Int, num2: Int): Int {
    return num1 + num2      // 6
}

fun sub(num1: Int, num2: Int): Int {
    return num1 - num2      // -2
}

fun multiply(num1: Int, num2: Int): Int {
    return num1 * num2      // 8
}

fun divide(num1: Int, num2: Int): Int {
    return (num1 / num2)    // 0
}