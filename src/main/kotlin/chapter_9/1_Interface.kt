package chapter_9

/**
 * @Author: Hxina
 * @Date: 2022/9/1 Thursday 16:49
 */
fun main() {
    val man1 = Man()
    man1.iMan()
    man1.eat()
}

interface IMan {
    fun iMan()
}

class Man : IMan, Human() {
    override fun iMan() {
        println("implement interface...IMan...")
    }

    override fun eat() {
        println("inheritance abstract class...Human...eat...")
    }
}

abstract class Human {
    abstract fun eat()
}