package tiger.com.lp.dailydemo.kotlin.anno

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/2/22
 * @Description :
 */

@Deprecated(
    message = "Use CalculatorV3 instead.",
    replaceWith = ReplaceWith("CalculatorV3"),
    level = DeprecationLevel.ERROR
)
class Calculator {
    // 错误逻辑
    fun add(a: Int, b: Int): Int = a - b
}

class CalculatorV3 {
    // 正确逻辑
    fun add(a: Int, b: Int): Int = a + b
}

fun main() {
    var ca = CalculatorV3()

    print(ca.add(5, 6))
}