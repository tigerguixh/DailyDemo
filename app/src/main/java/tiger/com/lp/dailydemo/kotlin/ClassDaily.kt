package tiger.com.lp.dailydemo.kotlin

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/5/23
 * @Description :
 */
class ClassDaily constructor(name: String) {
    val dddd = name.length

    init {
        println("$name")
    }

    constructor(name: String, age: Int) : this(name) {

    }

    fun make() {
        println("$dddd 给你们。")
    }
}

fun main(args: Array<String>) {
    var daliy = ClassDaily("Tiger")
    daliy.make()
}

