package chapter_16

/**
 * @Author: Hxina
 * @Date: 2022/9/6 Tuesday 13:06
 */
fun main() {
    val o1 = OperatorOverloading(1, 2)
    val o2 = OperatorOverloading(3, 4)
    println(o1 + o2)    // OperatorOverloading(x=4, y=6)
}

// 运算符重载
// 如果要将内置运算符应用在自定义类上，必须重写运算符函数
data class OperatorOverloading(
    var x: Int, var y: Int
) {
    operator fun plus(other: OperatorOverloading) = OperatorOverloading(x + other.x, y + other.y)
}