package chapter_10

/**
 * @Author: Hxina
 * @Date: 2022/9/1 Thursday 17:10
 * @Desc: 密封类---sealed class
 */
fun main() {
    val son1: Son = Son.Son1
    val son2: Son = Son.Son2
    val son3: Son = Son.Son2
    val son4: Son = Son.Son3
    val son5: Son = Son.Son1
    val son6: Son = Son.Son2

    val list = listOf<Son>(son1, son2, son3, son4, son5, son6)
    for (i in list) {
        if (i is Son.Son2) {
            i.sayHello()
        }
    }
}

// 密封类
sealed class Son {
    fun sayHello() {
        println("Hello everyone!")
    }

    object Son1 : Son()
    object Son2 : Son()
    object Son3 : Son()
}