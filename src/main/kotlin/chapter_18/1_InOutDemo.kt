package chapter_18

/**
 * @Author: Hxina
 * @Date: 2022/9/8 Thursday 11:11
 */
// out --- 协变 -- 子类泛型对象可以直接赋值给父类泛型对象
// 如果泛型只将泛型类型作为函数的返回（输出），那么使用 out ，可以称之为生产类/接口，
// 因为它主要是用来生产（produce）指定的泛型对象。
interface Production<out T> {
    fun product(): T
}

// in --- 逆变 -- 父类泛型对象可以直接赋值给子类泛型对象
// 如果泛型只将泛型类型作为函数的入参（输入），那么使用 in，可以成为职位消费者类/接口，
// 因为它主要用来消费（consume）指定的泛型对象
interface Consumer<in T> {
    fun consume(item: T)
}

// variant --- 不变
// 如果泛型类既将泛型作为函数参数，又将泛型类型作为函数的输出，那么既不用 out 也不用 in
interface ProductionConsume<T> {
    fun product(): T
    fun consume(item: T)
}

open class Food
open class FastFood : Food()
class Burger : FastFood()

// 生产者
// 食品商店
class FoodStore : Production<Food> {
    override fun product(): Food {
        println("Produce food")
        return Food()
    }
}

// 快餐商店
class FastFoodStore : Production<FastFood> {
    override fun product(): FastFood {
        println("Produce fast food")
        return FastFood()
    }
}

// 汉堡商店
class BurgerStore : Production<Burger> {
    override fun product(): Burger {
        println("Produce burger")
        return Burger()
    }
}

// 消费者
class Everybody : Consumer<Food> {
    override fun consume(item: Food) {
        println("Everybody eat food")
    }
}

class ModernPeople : Consumer<Food> {
    override fun consume(item: Food) {
        println("ModernPeople eat fast food")
    }
}

class WestPeople : Consumer<Food> {
    override fun consume(item: Food) {
        println("WestPeople eat burger")
    }
}


fun main() {
    // 子类泛型对象可以直接赋值给父类泛型对象，用 out
    val production1: Production<Food> = FoodStore()
    production1.product()   // Produce food
    val production2: Production<Food> = FastFoodStore()
    production2.product()   // Produce fast food
    val production3: Production<Food> = BurgerStore()
    production3.product()   // Produce burger

    // 父类泛型对象可以直接赋值给子类泛型对象，用 in
    val consumer1: Consumer<Burger> = Everybody()
    consumer1.consume(Burger())     // Everybody eat food
    val consumer2: Consumer<Burger> = ModernPeople()
    consumer2.consume(Burger())     // ModernPeople eat fast food
    val consumer3: Consumer<Burger> = WestPeople()
    consumer3.consume(Burger())     // WestPeople eat burger
}