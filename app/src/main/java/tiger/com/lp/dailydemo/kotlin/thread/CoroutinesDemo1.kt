package tiger.com.lp.dailydemo.kotlin.thread

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2022/3/11
 * @Description :
 */
class CoroutinesDemo1 {
}

suspend fun main(array: Array<String>) {
    //threadFirst()

    //runBlocking()
    //funLaunch()

    funLaunchDelay();
}

fun threadFirst() {
    println(Thread.currentThread().name)
    thread {
        println(Thread.currentThread().name)
        Thread.sleep(1000)
    }
    Thread.sleep(1000L)
}

fun runBlocking() {
    println(Thread.currentThread().name)

    GlobalScope.launch {
        println(Thread.currentThread().name)
        delay(100L)
    }

    Thread.sleep(1000L)
}

suspend fun funLaunch() {
    repeat(1000000) {
        GlobalScope.launch {
            delay(10000)
        }
    }
    delay(100L)
}

suspend fun funLaunchDelay() {
    GlobalScope.launch {
        repeat(3) {
            delay(1000L)
            println("Print-1:${Thread.currentThread().name}")
        }
    }

    GlobalScope.launch {
        repeat(3) {
            delay(900L)
            println("Print-2:${Thread.currentThread().name}")
        }
    }
    delay(9000L)
}