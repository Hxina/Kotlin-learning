package chapter_14

/**
 * @Author: Hxina
 * @Date: 2022/9/4 Sunday 20:42
 */
fun main() {
    // List 集合
    // getOrElse 是一个 安全索引取值函数，它需要两个参数，一个是索引值，一个是能提供默认值的 lambda 表达式，
    // 若索引值不存在，可用来代替异常
    // getOrNull 是 kotlin 提供的另一个安全索引取值函数，它返回 null 结果，而不是抛出异常
    val list: List<String> = listOf("Kotlin", "Java", "Android")
    println(list)   // [Kotlin, Java, Android]
    println(list.getOrElse(3) { "Unknown getOrElse" })    // Unknown getOrElse
    println(list.getOrNull(2) ?: { "Unknown" })    // Android

    for (s in list) {
        print("$s ")  // Kotlin Java Android
    }
    println()
    list.forEach {
        print("$it ")   // Kotlin Java Android
    }
    println()
    list.forEachIndexed { index, item ->
        print("$index-->$item ")    // 0-->Kotlin 1-->Java 2-->Android
    }

    // MutableList --- 可变 List
    val mutableList: MutableList<String> = mutableListOf("Kotlin", "Java", "Android")
    mutableList.add(1, "Jetpack")   // 添加 Jetpack ---> [Kotlin, Jetpack, Java, Android]
    mutableList += "Jetpack"    // 添加 Jetpack ---> [Kotlin, Jetpack, Java, Android]
    mutableList.remove("Java")      // [Kotlin, Jetpack, Android]
    mutableList -= "Java"   // [Kotlin, Jetpack, Android]
    mutableList.removeIf { it.contains("Jet") }     // [Kotlin, Android]

    // List <---> MutableList
    list.toMutableList()
    mutableList.toList()
}