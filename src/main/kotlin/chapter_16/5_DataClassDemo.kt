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