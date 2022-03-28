package tiger.com.lp.dailydemo.kotlin.thread

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/3/14
 * @Description :
 */
class CoroutinesDemo3 {
}

fun main(array: Array<String>) {
    //runBlock()
    runDeferred()
}

fun runBlock() {
    kotlinx.coroutines.runBlocking {
        println("Coroutines started!")
        delay(1000L)
        println("Hello World!")
    }

    println("After launch!")
    Thread.sleep(2000L)
    println("Process end!")
}

fun runDeferred() {
    kotlinx.coroutines.runBlocking {
        val deferred: Deferred<String> = async {
            println("In async:${Thread.currentThread().name}")
            delay(1000L) // 模拟耗时操作
            println("In async after delay!")
            return@async "Task completed!"
        }

        // 不再调用 deferred.await()
        println("In async start delay!")
    }
}