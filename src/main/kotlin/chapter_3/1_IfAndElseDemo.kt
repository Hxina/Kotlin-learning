package chapter_3

/**
 * @Author: Hxina
 * @Date: 2022/8/31 Wednesday 20:34
 */
fun main() {
    println(check(5))   // odd number
    println(check(4))   // even number
}

fun check(num: Int): String {
    return if (num % 2 == 0) "even number" else "odd number"
}