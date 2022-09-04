package chapter_14

/**
 * @Author: Hxina
 * @Date: 2022/9/4 Sunday 21:33
 */
fun main() {
    // Set 集合
    // 通过 setOf 创建 Set集合，使用 ElementAt 函数读取集合中的元素
    val set: Set<String> = setOf("Kotlin", "Java", "Android")
    println(set.elementAt(2))   // Android

    // MutableSet 可变 Set
    val mutableSet: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Android")
    mutableSet.add("Jetpack")   // [Kotlin, Java, Android, Jetpack]
    mutableSet += "Jetpack"     // [Kotlin, Java, Android, Jetpack]
    mutableSet.remove("Java")   //[Kotlin, Android, Jetpack]
    mutableSet -= "Java"   //[Kotlin, Android, Jetpack]

    // list ---> set ---> list ===> 去重
    val listTo: List<String> = listOf("Kotlin", "Android")
        .toSet()
        .toList()
    println(listTo)     // [Kotlin, Android]

    println(listOf("Kotlin", "Android").distinct())     // [Kotlin, Android]


}