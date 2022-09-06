package chapter_16

/**
 * @Author: Hxina
 * @Date: 2022/9/6 Tuesday 12:56
 */
fun main() {
    val (x: Int, y: Int) = Destructuring(10, 20)
    println("$x, $y")   // 10, 20
}

// 解构声明
// 解构声明的后台实现就是声明 component1、component2 等若干个组件函数，让每个函数负责管理想要返回的一个属性数据，
// 若定义了一个数据类，它会自动为所有定义在主构造函数的属性添加对应的组件函数
class Destructuring(
    private val experience: Int, private val level: Int
) {
    operator fun component1() = experience
    operator fun component2() = level
}