package chapter_5

/**
 * @Author: Hxina
 * @Date: 2022/8/31 Wednesday 21:30
 */
fun main() {
    println(plus(1, 2))     // 3

    val i = { num1: Int, num2: Int -> num1 + num2 }
    val result = i(1, 2)
    println(result)     // 3

    val j: (Int, Int) -> Int = { num1, num2 -> num1 + num2 }
    val result1 = j(1, 2)
    println(result1)    // 3
}

// 等价
//  fun plus(num1: Int, num2: Int): Int {
//      return num1 + num2
//  }
fun plus(num1: Int, num2: Int): Int = num1 + num2