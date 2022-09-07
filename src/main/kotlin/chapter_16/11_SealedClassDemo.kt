package chapter_16

/**
 * @Author: Hxina
 * @Date: 2022/9/7 Wednesday 10:08
 */
fun main() {
    val status: LicenseStatus2.Qualified = LicenseStatus2.Qualified("20220907")
    val driver = Driver2(status)
    println(driver.checkLicense())      // Yes, id: 20220907
}


// sealed 密封类
// 对于更复杂的 ADT，可以使用 Kotlin 的密封类来实现更复杂的定义，密封类可以用来定义一个类似于枚举类的 ADT，
// 密封类可以有若干个子类，要继承密封类，这些子类必须和它定义在同一个文件里
sealed class LicenseStatus2 {
    object Unqualified : LicenseStatus2()
    object Learning : LicenseStatus2()
    class Qualified(val licenseId: String) : LicenseStatus2()
}

class Driver2(var status: LicenseStatus2) {
    fun checkLicense(): String {
        return when (status) {
            is LicenseStatus2.Unqualified -> "No"
            is LicenseStatus2.Learning -> "Learning"
            is LicenseStatus2.Qualified -> "Yes, id: ${(this.status as LicenseStatus2.Qualified).licenseId}"
        }
    }
}
