package chapter_5

import kotlin.math.PI

/**
 * @Author: Hxina
 * @Date: 2022/8/31 Wednesday 21:36
 */
fun main() {
    println(rectangleArea(3F, 4F))  // 12.0
    println(circleArea(4F))     // 25.132741228718345
}

fun rectangleArea(width: Float, height: Float): Float {
    return width * height
}

fun circleArea(radius: Float): Double {
    return (2 * PI * radius)
}