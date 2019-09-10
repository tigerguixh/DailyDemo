package tiger.com.lp.dailydemo.kotlin

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/8/27
 * @Description :
 */

fun main(array: Array<String>) {
    val correction = 6

    println(whenMethod(correction))

    //val map = hashMapOf<String, String>()
    val map = mapOf("hello" to "world")
    //map["tiger"] = "桂"
    println(map)

    for ((key, value) in map) {
        println("key $key, the value $value")
    }

    var list= arrayListOf("10")

    for ((index, value) in list.withIndex()) {
        println("The index $index and value $value")
    }
}

fun whenMethod(correction: Int) = when (correction) {
    changeValue(6) -> "Hello"
    else -> "Kotlin"
}

fun changeValue(value : Int) = if (value > 3) 3 else value