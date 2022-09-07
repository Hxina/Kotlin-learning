package chapter_16

/**
 * @Author: Hxina
 * @Date: 2022/9/7 Wednesday 10:45
 */

// 接口里提速默认属性的 getter 方法和函数实现
interface Movable {
    val maxSpeed: Int
        get() = (1..160).shuffled().last()
    var wheels: Int

    fun move(movable: Movable): String
}

class Car(
    _name: String,
    override var wheels: Int = 4
) : Movable {
    override var maxSpeed: Int
        get() = super.maxSpeed
        set(value) {}

    override fun move(movable: Movable): String {
        TODO("Not yet implemented")
    }
}