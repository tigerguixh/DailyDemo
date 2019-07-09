package tiger.com.lp.dailydemo.kotlin.smart

import java.lang.IllegalArgumentException

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/5/31
 * @Description :
 */
interface Expr

class Num(var value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun main(args: Array<String>) {
    println(evelWhen(Sum(Sum(Num(3), Num(4)), Num(5))))
}

fun eval(e: Expr): Int {
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }

    if (e is Num) {
        return e.value
    }

    throw IllegalArgumentException("Unknown expression")
}

fun evelMo(e: Expr) = if (e is Sum) eval(e.right) + eval(e.left) else if (e is Num) e.value
else throw IllegalArgumentException("Unknown expression")

fun evelWhen(e : Expr) =
        when(e) {
            is Sum -> eval(e.right) + eval(e.left)
            is Num -> e.value
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun jumpNum() {
    val oneToTen = 1 .. 10
}