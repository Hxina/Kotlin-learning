package chapter_14

/**
 * @Author: Hxina
 * @Date: 2022/9/4 Sunday 21:49
 */
fun main() {
    val map: Map<String, Int> = mapOf("Kotlin" to 1, "Java" to 2, "Android" to 3)
    println(map["Kotlin"])      // 1
    println(map.getValue("Java"))   // 2
    println(map.getOrElse("Jetpack") { "Unknown" })     // Unknown
    println(map.getOrDefault("Android", 0))     // 3

    // forEach 遍历 Map
    map.forEach {
        print("${it.key} ---> ${it.value} ")    // Kotlin ---> 1 Java ---> 2 Android ---> 3
    }
    println()
    map.forEach { (key: String, value: Int) ->
        print("$key ---> $value ")   // Kotlin ---> 1 Java ---> 2 Android ---> 3
    }
    println()


    // MutableMap
    val mutableMap: MutableMap<String, Int> = mutableMapOf("Kotlin" to 10, "Java" to 20, "Android" to 30)
    mutableMap += "Jetpack" to 40
    // mutableMap.put("Jetpack", 41) 等价下式
    mutableMap["Jetpack"] = 41    // {Kotlin=10, Java=20, Android=30, Jetpack=41}
    mutableMap.getOrPut("Jetpack for Android") { 1 }    // {Kotlin=10, Java=20, Android=30, Jetpack=41, Jetpack for Android=1}
}