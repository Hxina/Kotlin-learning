package chapter_10

/**
 * @Author: Hxina
 * @Date: 2022/9/1 Thursday 16:49
 * @Desc: 委托和代理---by
 */
fun main() {
    val son = BigHeadSon
    son.washing()

    val father = SmallHeadFather()
    father.washing()
}

interface IWashingBow {
    fun washing()
}

//class BigHeadSon : IWashingBow {
//    override fun washing() {
//        println("implement interface...BigHeadSon...")
//    }
//}

// 单例
object BigHeadSon : IWashingBow {
    override fun washing() {
        println("implement interface...BigHeadSon...")
    }
}

//class SmallHeadFather : IWashingBow {
//    override fun washing() {
//        println("implement interface...SmallHeadFather...")
//    }
//}

// 委托
class SmallHeadFather : IWashingBow by BigHeadSon {
    override fun washing() {
        println("\n****************")
        println("implement interface...SmallHeadFather...")
        BigHeadSon.washing()
        println("by BigHeadSon washing...")
        println("****************\n")
    }
}