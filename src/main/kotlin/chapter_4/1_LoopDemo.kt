package chapter_4

/**
 * @Author: Hxina
 * @Date: 2022/8/31 Wednesday 21:07
 */
fun main() {
    val nums = 1..100   // [1, 100]

    for (num in nums) {
        println(num)    // 1 2 3 ... 100
    }

    var result = 0

    for (num in nums) {
        result += num
    }
    println("Result: $result")  // 5050

    val nums1 = 1 until 100   // [1, 100)
    for (num in nums1) {
        println(num)    // 1 2 3 ... 99
    }

    val nums2 = 1..20
    for (num in nums2 step 4) {
        println(num)    // 1 5 9 13 17
    }

    // Reversed
    val nums3 = (1..5).reversed()
    for (num in nums3) {
        println(num)    // 5 4 3 2 1
    }

    // Count
    val nums4 = 1..10
    println(nums4.count())  // 10
}