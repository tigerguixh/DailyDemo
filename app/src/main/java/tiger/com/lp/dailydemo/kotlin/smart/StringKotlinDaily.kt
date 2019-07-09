package tiger.com.lp.dailydemo.kotlin.smart

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/7/2
 * @Description :
 */
fun main(args : Array<String>) {
    var str = "12.365-6.a"
    println(str.split("\\.|-".toRegex()))
    println(str.substringBefore("-"))
    println(str.substringAfter("-"))
}