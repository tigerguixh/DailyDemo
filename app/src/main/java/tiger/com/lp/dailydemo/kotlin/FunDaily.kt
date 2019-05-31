package tiger.com.lp.dailydemo.kotlin

import java.util.Arrays.asList

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/5/29
 * @Description :
 */
fun main(args : Array<String>) {
    read(1)
}

fun read(size : Int = 100) {
    var list = ArrayList<String>()
    list.add("I")
    list.add("am")
    list.add("tiger.")
    print(list)

    var ls = asList(1, 2, 3)

    funInvoke()
}

fun funInvoke() {
    val stringPlus: (String, String) -> String = String::plus
    val intPlus: Double.(Int) -> Double = Double::plus

    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))

    println(intPlus.invoke(1.0, 1))
    println(intPlus(1.0, 2))
    println(2.0.intPlus(3)) // 类扩展调用
    val sum: (Int, Int) -> Int = { x, y -> x + y }


    val words = "A long time ago in a galaxy far far away".split(" ")
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo(shortWords, 3)
    println(shortWords)
}

fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength}.filter { it.startsWith("a") }
    println(shortWords)
    this.filterTo(shortWords) {it.startsWith("a")}
    // throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    //shortWords -= articles
    var mark : String? = "ssss"

    var stu = Stu()
}

internal class Stu {
    var age = 1

    override fun toString(): String {
        return "age: $age"
    }
}
