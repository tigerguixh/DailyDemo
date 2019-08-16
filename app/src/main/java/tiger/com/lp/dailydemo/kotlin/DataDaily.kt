package tiger.com.lp.dailydemo.kotlin

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/5/28
 * @Description :
 */
data class Usersss(val name: String = "", val age: Int = 0)

fun main(args : Array<String>) {
    val jane = Usersss("Jane", 35)
    val (name, age) = jane
    println("$name, $age years of age") // 输出 "Jane, 35 years of age"
}