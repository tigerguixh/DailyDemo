package tiger.com.lp.dailydemo.kotlin.smart

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/6/25
 * @Description :
 */
fun main(array: Array<String>) {
    var map = hashMapOf(1 to "")
    var list = listOf("11", "3", "33333333")
    var ff = list.joinToString(" @ ","`", "!")

    print(ff)

    jumpNum()
}
