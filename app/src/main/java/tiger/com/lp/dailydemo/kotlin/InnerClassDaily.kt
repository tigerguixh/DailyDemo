package tiger.com.lp.dailydemo.kotlin

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/5/28
 * @Description :
 */
class Outer{
    private val bar = 1
    class Nested {
        fun foo() = 2
    }

    inner class Inner{
        fun foo() = bar
    }
}

fun main(args : Array<String>) {
    var inner = Outer.Nested()
    println(inner.foo())

    var inn = Outer().Inner()
    println(inn.foo())
}