package tiger.com.lp.dailydemo.kotlin

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/9/10
 * @Description :
 */
sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left : Expr, val right: Expr) : Expr()
}

fun main(array: Array<String>) {
}

fun evel(e: Expr) : Int {
    when(e) {
        is Expr.Num -> 1
        is Expr.Sum -> 2
    }
    return 4
}

