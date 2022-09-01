package chapter_10

/**
 * @Author: Hxina
 * @Date: 2022/9/1 Thursday 17:06
 * @Desc: 枚举---enum
 */
fun main() {
    println(Number.Nine.name)   // Nine
    println(Number.Nine.ordinal)    // 8
    println(Number.Nine.declaringClass) // class chapter_10.Number

}

enum class Number {
    One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten
}