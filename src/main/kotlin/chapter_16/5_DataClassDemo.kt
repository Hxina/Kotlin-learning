package chapter_16

/**
 * @Author: Hxina
 * @Date: 2022/9/6 Tuesday 10:40
 */
fun main() {
    println(Coordinate(10, 20))     // Coordinate(x=10, y=20)

    // 解构
    val (x: Int, y: Int) = Coordinate(10, 20)
    println("$x, $y")   // 10, 20
}

data class Coordinate(
    var x: Int,
    var y: Int
)

// 使用数据类的条件
// 对于一些经常需要比较、复制或打印自身内容的类，数据类尤其适合
// 一个类要成为数据类，也符合的条件，如下三个方面
// 1. 数据类必须有至少带一个参数的主构造函数
// 2. 数据类主构造函数的战术必须是 val 或 var
// 3. 数据类不能使用 abstract、open、sealed 和 inner 修饰符