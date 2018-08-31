package tiger.com.lp.dailydemo.kotlin

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2018/5/31
 * @Description :
 */
fun main(args: Array<String>) {    // 包级可见的函数，接受一个字符串数组作为参数
    println("Hello World!")         // 分号可以省略

    Greeter("Tiger!").greet()

    println(sum(4, 5))

    println(sum1(6, 2))

    vars(4,5,4,5,45,5,77,78,415,9)

    var sumLambda: (Int, Int) -> Int = {x, y -> x + y}

    println(sumLambda(8, 3))
}

fun sum(a : Int, b : Int): Int{
    return a + b
}

public fun sum1(a: Int, b: Int) = a + b

fun vars(vararg v:Int) {
    for (vt in v) {
        print(" " + vt)
    }
}

class Greeter(val name: String) {
    var a = "Tiger"
    val b : Int = 3
    var c = 3

    fun greet() {
        c += 1
        println("Hello, $name")
    }
}