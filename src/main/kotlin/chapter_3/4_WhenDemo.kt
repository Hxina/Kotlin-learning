package chapter_3

/**
 * @Author: Hxina
 * @Date: 2022/8/31 Wednesday 20:59
 */
fun main() {
    grade(10)   // Perfect!
    grade(9)    // Good!
    grade(8)    // Bad!
    grade(7)    // 。。。。。。
}

fun grade(score: Int) {
    when (score) {
        10 -> println("Perfect!")
        9 -> println("Good!")
        8 -> println("Bad!")
        else -> println("。。。。。。")
    }
}