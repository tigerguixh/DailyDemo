package tiger.com.lp.dailydemo.kotlin.smart

import tiger.com.lp.dailydemo.kotlin.funInvoke

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/5/31
 * @Description : Hello，World！
 */
fun main(args : Array<String>) {
    println("Hello, world!")

    println(max(3, 5))
    println(min(4, 7))

    strTemp()
}

fun max(a : Int, b : Int) : Int{
    return if (a > b) a else b
}

fun min(a : Int, b : Int) = if (a < b) a else b

fun strTemp() {
    val name = "tiger."
    println("Hello, $name")

    var person = Person("tiger")

    var  rectAngle = RectAngle(32, 34)

    println(rectAngle.age)

    //funInvoke()

}

class Person (private val name : String)

class RectAngle(private val height : Int, private val width : Int) {
    val isSquare : Boolean
    get() = height == width

    var age = 23
    get() = 66
}