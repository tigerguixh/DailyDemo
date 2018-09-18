package tiger.com.lp.dailydemo.kotlin

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/9/17
 * @Description :
 */

fun main(args: Array<String>) {
    println(getStringLength("Kotlin"))
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }

    return null
}

fun forchList() {
    var items = listOf("Kotlin", "is", "very", "good")
    for (item in items) {
        print(item)
    }
}

fun forchListIndex() {
    var items = listOf("Kotlin", "is", "very", "good")
    for (index in items.indices) {
        println("item an $index is ${items[index]}")
    }
}

fun describe(obj: Any): String =
        when (obj) {
            1    -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

fun rang() {
    var x = 9
    var y = 10

    if (x in 1..y+1) {
        println("fits in rang")
    }
}

fun whens() {
    var items = listOf("Kotlin", "is", "very", "good")
    when{
        "is" in items -> println("Hello")
        "good" in items -> println(" World")
    }
}

fun fiter() {
    var items = listOf("Kotlin", "is", "very", "good")
    items.filter { it.contains("o") }
            .sortedBy { it }
            .map{it.toUpperCase()}
            .forEach { println(it) }
}

fun maps() {
    var map = mapOf("a" to "A")
    println(map["a"])
}