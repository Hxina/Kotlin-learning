package chapter_16

/**
 * @Author: Hxina
 * @Date: 2022/9/7 Wednesday 09:57
 */
fun main() {
    println(Driver(LicenseStatus.QUALIFIED).checkLicense())     // Yes
}

// 代数数据类型
// 可以用来表示一组子类型的闭集，枚举类就是一种简单的 ADT
enum class LicenseStatus {
    UNQUALIFIED,
    LEARNING,
    QUALIFIED;
}

class Driver(var status: LicenseStatus) {
    fun checkLicense(): String {
        return when (status) {
            LicenseStatus.UNQUALIFIED -> "No"
            LicenseStatus.LEARNING -> "Learning"
            LicenseStatus.QUALIFIED -> "Yes"
        }
    }
}