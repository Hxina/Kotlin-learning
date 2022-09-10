package chapter_20

/**
 * @Author: Hxina
 * @Date: 2022/9/10 Saturday 11:22
 */
/**
 * 函数类别
 * 一个函数式应用通常由三大类函数构成：变换 transform、过滤 filter、合并 combine。
 * 每个函数都 针对集合数据类型 设计，目标是 产生一个最终结果。函数式编程用到的函数生来
 * 都是可组合的，也就是说，可以组合多个简单函数来构建复杂的计算行为。
 */

// 变换 transform
// 变换是函数是编程的第一大类函数，变换函数会 遍历集合内容，用一个以值参形式 传入的变换
// 器函数，变换每一个元素，然后返回包含已修改元素的集合给链上的其他函数。
// 最常用的两个变换函数是 map 和 flatmap
fun main() {
    mapDemo()
    flatMapDemo()
    filterDemo()
}

// map
// map 变换函数会遍历接收者集合，让变换器函数作用于集合里的各个元素，返回结果是包含已修改
// 元素的集合，会作为链上下一个函数的输入。
// map 返回的集合中的 元素个数 和输入集合 必须一样，不过，返回的新集合里的元素可以是 不同类型 的
fun mapDemo() {
    val mapList: List<String> = listOf("Kotlin1", "Java1", "Android1")
    val mapListLength: List<Int> = mapList.map { it.length }
    val mList: List<String> = mapList
        .map { m1 -> "[map] name: $m1" }
        .map { m2 -> "$m2 [map]" }
    val mListLength: List<Int> = mList.map { it.length }
    println(mapList)    // [Kotlin1, Java1, Android1]
    println(mapListLength)  // [7, 5, 8]
    println(mList)      // [[map] name: Kotlin1 [map], [map] name: Java1 [map], [map] name: Android1 [map]]me: Android1, m2 [map]]
    println(mListLength)    // [25, 23, 26]
}

// flatMap
// flatMap 函数操作一个集合的集合，将其中 多个集合中的元素合并 后返回一个包含所有元素的单一集合
fun flatMapDemo() {
    val flatMap: List<Int> = listOf(listOf(1, 2, 3), listOf(4, 5, 6)).flatMap { it }
    println(flatMap)    // [1, 2, 3, 4, 5, 6]
}

// filter
// 过滤是函数式编程的第二大类函数，过滤函数接受一个 predicate 函数，用它按给定条件检查接收者集合里
// 的元素并给出 true 或 false 的判定。若 predicate 函数返回 true ，受检查元素就会 添加 到过滤函数
// 返回的新集合里。若 predicate 函数返回 false，那么受检查元素就被 移出 新集合
// filter 过滤函数接受一个 predicate 函数，在 flatMap 遍历它的输入集合中的所有元素时，filter 函数
// 会让 predicate 函数按过滤条件，将符合条件的元素都放入它返回的新集合里。最后，flatMap 会把变换器函
// 数返回的子集合合并在一个新集合里。
fun filterDemo() {
    val filterList: List<String> = listOf("Kotlin", "Android", "Jetpack")
        .filter { it.contains("J") }
    println(filterList)     // [Jetpack]

    val items: List<List<String>> = listOf(
        listOf("Kotlin1", "Android1", "Jetpack_1"),
        listOf("Kotlin2", "Android_2", "Jetpack2"),
        listOf("Kotlin3", "Android3", "Jetpack3"),
    )

    val itemList: List<String> = items.flatMap { it.filter { it.contains("_") } }
    println(itemList)   // [Jetpack_1, Android_2]

    // 找素数
    // 除了1和它本身，不能被任何整数整除的数
    // 取模等于0，说明能够被整除，如果没有一个是等于0的，说明是素数
    val numbers: List<Int> = listOf(1, 7, 15, 24, 34, 43, 54, 64, 73, 81, 91, 103)
    val primes: List<Int> = numbers.filter { number ->
        (2 until number).map { number % it }
            .none { it == 0 }
    }
    println(primes)     // [1, 7, 43, 73, 103]
}
