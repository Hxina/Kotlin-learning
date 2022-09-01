package chapter_6

import java.math.BigInteger

/**
 * @Author: Hxina
 * @Date: 2022/9/1 Thursday 09:16
 * @Desc: 递归
 */
fun main() {
    val number = 5
    println(factorial(number))

    // 大数，当数字范围超出 Long 所能表示的最大数时使用
    val numberBigInteger = BigInteger("50")
    println(factorialBigInteger(numberBigInteger))

    // 重复次数太多，栈溢出错误-StackOverflowError
    println(allAdd(100000))
}

fun factorial(num: Int): Int {
    return if (num == 1) {
        1
    } else {
        num * (factorial(num - 1))
    }
}

fun factorialBigInteger(num: BigInteger): BigInteger {
    return if (num == BigInteger.ONE) {
        BigInteger.ONE
    } else {
        num * (factorialBigInteger(num - BigInteger.ONE))
    }
}

fun allAdd(num: Int): Int {
    println("第${num}次运算")
    return if (num == 1) {
        1
    } else {
        num + allAdd(num - 1)
    }
}