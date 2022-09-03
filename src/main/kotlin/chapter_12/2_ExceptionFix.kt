package chapter_12

import java.lang.Exception
import java.lang.IllegalArgumentException

/**
 * @Author: Hxina
 * @Date: 2022/9/3 Saturday 09:34
 */
fun main() {
    var number: Int? = null

    try {
        checkOperaion(number)
        number!!.plus(1)
    } catch (e: Exception) {
        println(e)      // chapter_12.UnskilledException: Improper operation
    }
}

fun checkOperaion(number: Int?) {
    number ?: throw UnskilledException()
}

// 自定义异常
class UnskilledException() : IllegalArgumentException("Improper operation ")