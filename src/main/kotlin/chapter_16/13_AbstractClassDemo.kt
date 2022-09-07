package chapter_16

/**
 * @Author: Hxina
 * @Date: 2022/9/7 Wednesday 13:03
 */

// abstract class 抽象类
// 要定义一个抽象类，需要在定义之前加上 abstract 关键字，
// 除了具体的函数实现，抽象类也可以包含抽象函数————只有定义，没有函数实现
abstract class Gun(val range: Int) {
    protected fun doSomething() {
        println("Gun...")
    }

    abstract fun pullTrigger(): String
}

class AK47(val price: Int) : Gun(range = 500) {
    override fun pullTrigger(): String {
        TODO("Not yet implemented")
    }
}