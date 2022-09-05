package chapter_15

/**
 * @Author: Hxina
 * @Date: 2022/9/5 Monday 15:53
 */
fun main() {

}

class InitTrap(_name: String) {
    /*    private val blood = 100

          init {
              val bloodBonus: Int = blood.times(4)
          }*/

    // 写在 init 下面报错
//    private val blood = 100


    // 空指针异常
    /*  val name: String
        private fun firstLetter() = name[0]
        // 交换位置即对
        init {
            println(firstLetter())
            name = "Kotlin"
        }*/


//    private val trapName: String = _name
//    val trapNames: String = initTrapName()
//    private fun initTrapName() = trapName
    val trapNames: String = initTrapName()
    private val trapName: String = _name
    private fun initTrapName() = trapName
}