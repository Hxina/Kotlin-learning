package chapter_1

/**
 * @Author: Hxina
 * @Date: 2022/8/31 Wednesday 19:34
 * @Desc: 常见数据类型的取值范围
 */
fun main() {
    // Byte
    val maxByte: Byte = Byte.MAX_VALUE
    val minByte: Byte = Byte.MIN_VALUE
    println("Byte的最大值：$maxByte")    // 127
    println("Byte的最小值：$minByte")    // -128

    // Short
    val maxShort: Short = Short.MAX_VALUE
    val minShort: Short = Short.MIN_VALUE
    println("Short的最大值：$maxShort")    // 32767
    println("Short的最小值：$minShort")    // -32768

    // Int
    val maxInt: Int = Int.MAX_VALUE
    val minInt: Int = Int.MIN_VALUE
    println("Int的最大值：$maxInt")    // 2147483647
    println("Int的最小值：$minInt")    // -2147483648

    // Float
    val maxFloat: Float = Float.MAX_VALUE
    val minFloat: Float = Float.MIN_VALUE
    println("Float的最大值：$maxFloat")      // 3.4028235E38
    println("Float的最小值：$minFloat")      // 1.4E-45

    // Double
    val maxDouble: Double = Double.MAX_VALUE
    val minDouble: Double = Double.MIN_VALUE
    println("Double的最大值：$maxDouble")     // 1.7976931348623157E308
    println("Double的最小值：$minDouble")     // 4.9E-324

    // Long
    val maxLong: Long = Long.MAX_VALUE
    val minLong: Long = Long.MIN_VALUE
    println("Long的最大值：$maxLong")    // 9223372036854775807
    println("Long的最小值：$minLong")    // -9223372036854775808
}