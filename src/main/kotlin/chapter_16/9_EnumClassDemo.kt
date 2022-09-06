package chapter_16

/**
 * @Author: Hxina
 * @Date: 2022/9/6 Tuesday 13:13
 */
fun main() {
    println(Direction.EAST)     // EAST
    println(Direction.WEST.updateCoordinate(Coordinate(10, 20)))    // Coordinate(x=11, y=21)
}

// 枚举类 --- enum class
// 用来定义常量集合的一种特殊类
// 也可以定义函数
enum class Direction(
    private val coordinate: Coordinate
) {
    EAST(Coordinate(1, 0)), WEST(Coordinate(1, 1)), SOUTH(Coordinate(0, 1)), NORTH(Coordinate(0, 0));

    fun updateCoordinate(updateCoordinate: Coordinate): Coordinate = Coordinate(
        updateCoordinate.x + coordinate.x, updateCoordinate.y + coordinate.y
    )
}