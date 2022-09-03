package chapter_11

/**
 * @Author: Hxina
 * @Date: 2022/9/2 Friday 09:26
 * @Desc: 匿名函数---lambda
 *//*
fun main() {
//    val total: Int = "Message".count()

    // anonymous function
//    val totalS: Int = "Message".count { letter ->
//        letter == 's'
//    }
//
//    println(total)
//    println(totalS)

    // 该变量的类型为一个匿名函数
    // 匿名函数会隐式或自动返回函数体最后一行语句的结果
//    val blessingFunction: () -> String = {
//        val holiday = "New Year"
//        "Happy $holiday"
//    }

//    val blessingFunction: (String) -> String = { str ->
//        val holiday = "New Year"
//        "$str $holiday"
//    }
    // 等价
//    val blessingFunction: (String) -> String = {
//        val holiday = "New Year"
//        "$it $holiday"
//    }

//    println(blessingFunction("Happy"))  // Happy New Year

//    val blessingFunction: (String, Int) -> String = { name, year ->
//        val holiday = "New Year"
//        "$name, Happy $holiday $year"
//    }

    val blessingFunction: (String, Int) -> String = { name: String, year: Int ->
        val holiday = "New Year"
        "$name, Happy $holiday $year"
    }

    println(blessingFunction("Kotlin", 2022))
}*/


//fun main() {
//    val getDiscountWords: (String, Int) -> String = { goodsName: String, hour: Int ->
//        val currentYear = 2027
//        "$currentYear, $goodsName, $hour"
//    }
//
//    showOnBoard("Kotlin", getDiscountWords)
//}
//
//// 具名函数
//fun showOnBoard(goodsName: String, getDiscountWords: (String, Int) -> String) {
//    // 随机
//    val hour: Int = (1..24).shuffled().last()
//    println(getDiscountWords(goodsName, hour))
//}

fun main() {
    showOnBoard("Kotlin") { goodsName: String, hour: Int ->
        val currentYear = 2027
        "$currentYear, $goodsName, $hour"
    }
}

// 具名函数
private fun showOnBoard(goodsName: String, getDiscountWords: (String, Int) -> String) {
    // 随机
    val hour: Int = (1..24).shuffled().last()
    println(getDiscountWords(goodsName, hour))
}