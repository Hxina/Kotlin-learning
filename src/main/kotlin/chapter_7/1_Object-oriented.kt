package chapter_7

/**
 * @Author: Hxina
 * @Date: 2022/9/1 Thursday 09:39
 */
fun main() {
    val rect = Rectangle(4, 5)
    println("Width: ${rect.width} Height: ${rect.height}")
}

class Rectangle(var width: Int, var height: Int)