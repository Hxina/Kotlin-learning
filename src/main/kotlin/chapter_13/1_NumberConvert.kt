package chapter_13

import kotlin.math.roundToInt

/**
 * @Author: Hxina
 * @Date: 2022/9/3 Saturday 10:07
 */
fun main() {
    // val number1: Int = "8.98".toInt()    // error
    val number1: Int? = "8.98".toIntOrNull()
    println(number1)    // null

    println(8.956765.toInt())       // 8
    // 四舍五入
    println(8.956765.roundToInt())  // 9
}