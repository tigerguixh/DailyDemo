package tiger.com.lp.dailydemo.kotlin

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/5/23
 * @Description :
 */
fun foo() {
    loop@ for (i in 1..100) {
        for (j in 1..10) {
            if (j == 2) break@loop
            println("j:$j")
        }
    }

    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // 非局部直接返回到 foo() 的调用者
        print(it)
    }
    println(" this point is unreachable")

    listOf(2, 3, 5, 6).forEach {
        if (it == 3) {
            return
        }
    }
}

fun main(args: Array<String>) {
    foo()
}