package tiger.com.lp.dailydemo.kotlin

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/5/24
 * @Description :
 */
open class Base(p : Int) {
    var per = p

    open fun make() {
        println("$per 我是超类.")
    }
}

class SuperDaily(p : Int, age : Int) : Base(p) {
    companion object {
        fun dosomething() {
            //make()
            println("这是一个静态方法。")
        }
    }
}

class SubClass : Base {
    constructor(p : Int) : super(p)

    final override fun make() {
        super.make()
    }
}

fun main(args : Array<String>) {
    var daily = SuperDaily(2019, 29)
    SuperDaily.dosomething()
    var a : Int = 1
    a = 2
    var b : Int = 3
    b = 4
}

open class Base1{
    open fun v() { }
}

class Sup1 : Base1() {

}

interface foo {
    val count : Int get() = 2
}

class fooImp : foo {
    override val count = super.count + 333
}

class fooI(override var count : Int = 4) : foo {

}