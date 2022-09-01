package chapter_8

/**
 * @Author: Hxina
 * @Date: 2022/9/1 Thursday 10:28
 */
fun main() {
    val son = Son()
    son.sonName()
    son.fatherName()
}

open class Father {
    private val name = "Mather"
    open fun fatherName() {
        println("Father's name: $name")
    }
}

class Son : Father() {
    private val name = "Son"
    fun sonName() {
        println("Son's name: $name")
    }

    override fun fatherName() {
        super.fatherName()
        println("Inheritance...")
    }
}