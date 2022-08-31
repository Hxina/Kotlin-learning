package chapter_4

/**
 * @Author: Hxina
 * @Date: 2022/8/31 Wednesday 21:17
 */
fun main() {
    val lists = listOf("Apple", "Grape", "Orange", "Pear")

    for (fruit in lists) {
        println(fruit)      // Apple Grape Orange Pear
    }

    for (fruit in lists.withIndex()) {
        println(fruit)
    }
//    IndexedValue(index=0, value=Apple)
//    IndexedValue(index=1, value=Grape)
//    IndexedValue(index=2, value=Orange)
//    IndexedValue(index=3, value=Pear)

    for ((number, fruit) in lists.withIndex()) {
        println("$number $fruit")
    }
//    0 Apple
//    1 Grape
//    2 Orange
//    3 Pear
}